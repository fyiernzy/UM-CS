# Module 11-13

## The need for IPv6

Private addresses in combination with Network Address Translation (NAT) have been instrumental in slowing the depletion of IPv4 address space

NAT is problematic for many applications, creates latency, and has limitations that severely impede peer-to-peer communications.

IPV4 and IPv6 coexistence

- Dual stack allows IPv4 and IPv6 to coexist on the same network segment. Dual stack devices run both IPv4 and IPv6 protocol stacks simultaneously.
- Tunneling is a method of transporting an IPv6 packet over an IPv4 network by encapsulating IPv6 packet inside an IPv4 packet.
- Network Address Translation 64 (NAT64) allows IPv6-enabled devices to communicate with IPv4-enabled devices using a translation technique.

## IPv6 Address Types

1. Three broad catagories

    | Category  | Description                                                 |
    | --------- | ----------------------------------------------------------- |
    | Unicast   | Uniquely identifies an interface on an IPv6-enabled device. |
    | Multicast | Used to send a single IPv6 packet to multiple destinations. |
    | Anycast   | An IPv6 anycast address is any IPv6 unicast address that can be assigned to multiple devices. A packet sent to an anycast address is routed to the nearest device having that address. |

2. IPv6 all-nodes multicast address is similar to IPv4 broadcast address.

3. Similar to IPv4, a source IPv6 address must be a unicast address. The destination IPv6 address can be either a unicast or a multicast address.

4. The loopback address ::1 is used by a host to send a packet to itself and cannot be assigned to a physical interface.

5. An unspecified address :: cannot be assigned to an interface and is only be used as a source address.

6. Unique local addresses are used for local addressing within a site or between a limited number of sites. These addresses should not be routable in the global IPv6. Unique local addresses are in the range of FC00::/7 to FDFF::/7.

## GUA (Globally Unicast Address)

1. IPv6 global unicast addresses (GUAs) are globally unique and routable on the IPv6 internet. These addresses are equivalent to public IPv4 addresses.

2. GUA structure:

    | Field                 | Description                                                                                                                                                                  |
    | --------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
    | Global Routing Prefix | The prefix/ network portion of the address that is assigned by the provider, such as an ISP, to a customer or site.                                                          |
    | Subnet ID             | The Subnet ID is used by an organization to identify subnets within its site. The larger the subnet ID, the more subnets available.                                          |
    | Interface ID          | equivalent to the host portion of an IPv4 address. The term Interface ID is used because a single host may have multiple interfaces, each having one or more IPv6 addresses. |
    |                       |                                                                                                                                                                              |

3. For currently available Global Unicast Addresses (GUAs) in IPv6, the first hextet's first hexadecimal digit can only be 2 or 3. This limits the available range of values for this digit to 1/8th of the total IPv6 address space. The remaining 7/8th of the address space are reserved for other types of addresses, such as different forms of unicast and multicast addresses.

## LLA (Link-local Address)

1. LLA enables a device to communicate with other IPv6-enabled devices on the same link and only on that link (subnet).

2. It is not globally routable. Packets with a source or destination LLA cannot be routed beyond the link from which the packet originated.

3. The GUA is not a requirement. However, every IPv6-enabled network interface must have an LLA.

4. LLA can be obtained statically or dynamically using EUI.

## Dynamic Addressing for GUA

1. ICMPv6 Message
    | ICMPv6 Message            | Explanation                                                               |
    | ------------------------- | ------------------------------------------------------------------------- |
    | Router Solicitation (RS)  | Send to all IPv6 routers by hosts requesting addressing information       |
    | Router Advertisement (RA) | Send to all IPv6 nodes by routers to suggest devices to way to obtain GUA |
    |                           |                                                                           |

2. RA message includes:
    - Network prefix/ Prefix length
    - Default gateway address
    - DNS addresses and domain name

3. SLAAC
    - Stateless Address Auto-Configuration
    - SLAAC is a method that allows a device to create its own GUA without the services of DHCPv6 by using the information in the ICMPv6 RA messages

4. SLAAC and Stateless DHCPv6
    RA message suggests devices use the following:

    - SLAAC to create its own IPv6 GUA
    - The router LLA, which is the RA source IPv6 address, as the default gateway address
    - A stateless DHCPv6 server to obtain other information such as a DNS server address and a domain name

5. Stateful DHCPv6
    RA message suggests devices use the following:

    - The router LLA, which is the RA source IPv6 address, for the default gateway address.
    - A stateful DHCPv6 server to obtain a GUA, DNS server address, domain name and other necessary information.

6. Stateless refers the situation in which no central server, say, a stateful DHCPv6 server allocating GUAs and keeping a list of devices and their addresses.

7. The default gateway address can only be obtained dynamically from the RA message. The stateless or stateful DHCPv6 server does not provide the default gateway address.

8. A stateful DHCPv6 server allocates and maintains a list of which device receives which IPv6 address. DHCP for IPv4 is stateful.

## EUI-64 Process vs Randomly Generated

1. EUI (Extended Unique Identifier) inserts another 16 bits in the middle of the 48-bit MAC address of a client to create a 64-bit interface ID

2. Ethernet MAC addresses are usually represented in hexadecimal and are made up of two parts:

    | Field                                    | Description                                                                                |
    | ---------------------------------------- | ------------------------------------------------------------------------------------------ |
    | Organizationally Unique Identifier (OUI) | OUI is a 24-bit (6 hexadecimal digits) vendor code assigned by IEEE.                       |
    | Device Identifier                        | The device identifier is a unique 24-bit (6 hexadecimal digits) value within a common OUI. |
    |                                          |                                                                                            |

3. **An EUI-64 Interface ID** is represented in binary and is made up of three parts:

    - 24-bit OUI from the client MAC address, but the 7th bit (the Universally/Locally (U/L) bit) is reversed.
    - The inserted 16-bit value fffe (in hexadecimal).
    - 24-bit Device Identifier from the client MAC address.
    - Example: fc:99:47:75:c3:e0 -> fe:99:47:ff:fe:75:ce:e0

4. An easy way to identify that an address was probably created using EUI-64 is the fffe located in the middle of the interface ID.

5. Advantages of EUI-64:
    - Enables the use of Ethernet MAC address to determine the interface ID in IPv6 addressing.
    - Facilitates easy tracking of IPv6 addresses to end-devices using unique MAC addresses.

6. Disadvantages of EUI-64:
    - Raises privacy concerns due to potential traceability of the packets to physical computers. Hence, a randomly generated interface ID may be used instead.

7. DAD (Duplicate Address Detection) is similar to an ARP request. It uses NS and NA message (Neighbor Solicitation and Neighbor Advertisement) to ensure the uniqueness of any IPv6 unicast address. If there is no reply within certain period of time, then the address is unique.

8. Address resolution is used when a device on the LAN knows the IPv6 unicast address of a destination but does not know its Ethernet MAC address. To determine the MAC address for the destination, the device will send an NS message to the solicited node address.

## Dynamic Addressing for LLA

1. LLA is dynamically created using the fe80::/10 prefix and the interface ID using the EUI-64 process, or a randomly generated 64-bit number.

2. A drawback to using the dynamically assigned LLA is its long interface ID, which makes it challenging to identify and remember assigned addresses. To make it easier to recognize and remember these addresses on routers, it is common to statically configure IPv6 LLAs on routers.

## Multicast Address

1. IPv6 multicast addresses have the prefix ff00::/8.

2. Assigned multicast addresses are reserved multicast addresses for predefined groups of devices running a common protocol or service.

3. Two common IPv6 assigned multicast groups:
    - ff02::1 All-nodes multicast group
        - Joined by all IPv6-enabled devices
        - A packet sent to this group is received and processed by all IPv6 interfaces on the link or network.
        - Similar to broadcast address in IPv4
    - ff02::2 All-routers multicast group
        - Joined by all IPv6 routers
        - A packet sent to this group is received and processed by all IPv6 routers on the link or network.

4. Solicited-node multicast address
    - Similar to the all-nodes multicast address.
    - Advantages:
        - It is mapped to a special Ethernet multicast address.
        - This allows the Ethernet NIC to filter frames by examining the destination MAC address
        - Without involving the IPv6 process to determine if the device is the intended target of the IPv6 packet.

## Subnetting

1. Each subnet will have the same prefix length as the LANs. Although this may seem to “waste” addresses, address conservation is not a concern when using IPv6.

2. Each /64 subnet will provide more addresses than will ever be needed.

3. To determine the next available subnet, just count up in hexadecimal.

4. Fact
    - 16-bit subnet ID - Creates up to 65,536 subnets.
    - 64-bit interface ID - Supports up to 18 quintillion host IPv6 addresses per subnet (i.e., 18,000,000,000,000,000,000).

5. Borrowing bits from host portion is typically done for security reasons to create fewer hosts per subnet and not necessarily to create additional subnets.

## Question

Which IPv6/ IPv4 migration technique use native IPv6 connectivity?
Dual Stack. Tunneling and translation are for transitioning to native IPv6.

Given a /48 Global Routing Prefix and a /64 prefix, what is the subnet portion of the following address: 2001:db8:cafe:1111:2222:3333:4444:5555
1111

Given a /32 Global Routing Prefix and a /64 prefix, how many bits would be allocated for the Subnet ID?
32

What is the prefix associated with the IPv6 address 2001:DB8:D15:EA:CC44::1/64?
2001:DB8:D15:EA::/64

What type of address is automatically assigned to an interface when IPv6 is enabled on that interface?
link-local

What is the purpose of the command ping ::1?
It tests the internal configuration of an IPv6 host

What is indicated by a successful ping to the ::1 IPv6 address?
IP is properly installed on the host

What is the minimum configuration for a router interface that is enabled for IPv6?
To have a link-local IPv6 address
