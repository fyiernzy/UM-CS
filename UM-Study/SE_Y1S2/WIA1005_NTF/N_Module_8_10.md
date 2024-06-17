# Review

CCNA V7-1
Module 8-10
Module 16-17
ITN Final Skills Exam
CCNA V7-2
Module 1-4 switching concept

Question
NAT/ IPv6
ARP Request (And its property and format)
LAN and WAN
Lookback test purpose
Packet forwarding (router and switch)
IPV4 IPV6 header field name and function
NVRAM
OSI layer and MAC address location
Metric value
AUX

## Study Revision

### IP

1. Four basic operation of internet protocol

    | Operation              | Explanation                                        |
    | ---------------------- | -------------------------------------------------- |
    | Addressing end devices | Configure end device with unique IP address        |
    | Encapsulation          | Encapsulate Protocol Data Unit, PDU with IP header |
    | Routing                | Path selection and packet forwarding               |
    | De-encapsulation       | -                                                  |
    |                        |                                                    |

2. Characteristics of IP

    | Characteristic    | Explanation                                              |
    | ----------------- | -------------------------------------------------------- |
    | Connectionless    |  No connection established before sending data packets    |
    | Best effort       | IP in unreliable since packet delivery is not guaranteed |
    | Media independent | Operation is independent of the medium |

3. Best effort

    - IP doesn't require additional fields in the header to maintain an established connection (lack of information)
    - Reduce IP overhead
    - Sender is unaware whether:

        - Destination devices are present and functional
        - Destination devices receive the packet
        - Destination devices are able to access the packet

4. Packet might arrive at destination corrupted, out of sequence, or not at all. IP provides no capability for packet retransmissions if errors occur. If out-of-order packets are delivered, or packets are missing, then applications using the data, or upper layer services, must resolve these issues.

5. MTU (Maximum Transmission Unit) refers to teh maximum size of the PDU that each medium can transport.

6. Fragmentation causes latency.

7. IPv6 packets cannot be fragmented by the router.

8. Fragmentation is the splitting up of an IP packet for a medium with smaller MTU.

9. The data link layer indicates to the network layer the MTU for the medium that is being used. The network layer uses that information to determine how large the packet can be when it is forwarded.

### IPV4

1. IPv4 header fields

    | Field                        | Explanation                                                              |
    | ---------------------------- | ------------------------------------------------------------------------ |
    | Version                      | 4-bit binary value set to 0100                                           |
    | Differentiated Services (DS) | 8-bit bin value used to determine the priority of each packet            |
    | Time To Live (TTL)           | 8-bit bin value used to limit the lifetime of a packet                   |
    | Protocol                     | 8-bit bin value used to identify the next level protocol                 |
    | Header Checksum              | Used to detect corruption                                                |
    | Source address               | 32-bit binary value which is always a unicast address                    |
    | Destination address          | 32-bit binary value which can be a unicast/ multicast/ broadcast address |
    |                              |                                                                          |

2. In DiffServ field

    - DSCP - Differentiated services code point (6 MSB)
    - ECN  - Explicit congestion notification   (2 LSB)

3. The Internet Header Length (IHL), Total Length, and Header Checksum fields are used to identify and validate the packet.

### IPv6

1. Three issues of IPv4

    | Issues                          | Explanation                                                                                                      |
    | ------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
    | IPv4 address depletion          | Limited number of unique IPv4 public address                                                                     |
    | Lack of end-to-end connectivity | (Due to NAT) The public IPv4 address is shared, therefore the IPv4 address on an internal network host is hidden |
    | Increased network complexity    | NAT creates additional network complexity, latency and makes troubleshooting more difficult                      |
    |                                 |                                                                                                                  |

2. NAT (Network Address Translation) provides a way for multiple devices to share a single public IPv4 address.

3. Improvement of IPv6

    | Improvement                 | Explanation                              |
    | --------------------------- | ---------------------------------------- |
    | Increased address space     | Based on 128-bit hierarchical addressing |
    | Improved packet handling    | Has simplified header                    |
    | Eliminates the need for NAT | Avoid NAT-induced problems               |
    |                             |                                          |

4. IPv6 header:

    | Field           | Explanation                                                                                |
    | --------------- | ------------------------------------------------------------------------------------------ |
    | Version         | (4-bit) Set to 0110 (6 in dec)                                                             |
    | Traffic class   | (8-bit) Similar to IPv4 DS                                                                 |
    | Flow label      | (20-bit) All packets with the same flow label receive the same type of handling by routers |
    | Payload length  | (16-bit) Length of the data portion/ payload                                               |
    | Next header     | (8-bit) Similar to Protocol in IPv4.                                                       |
    | Hop limit       | (8-bit) Similar to TTL, but refers to the hopping between routers                          |
    | Src/Dst address | 128-bit bin val                                                                            |
    |                 |                                                                                            |

5. Next header indicates payload type and hence determine the appropriate upper-layer protocol.

6. IPv6 header consists of 40 octets with 8 header fields.

### Basic routing

1. Host forwarding decision:

    1. Loopback interface
    2. Local host
    3. Remote host

2. Default gateway is the network device that can route traffic to other networks. It has three features:

    1. It has **a local IP address** in the same address range as other hosts on the local network.
    2. It can accept data into the local network and forward data out of the local network.
    3. It routes traffic to other networks.

3. Router will consult its routing table to determine the best path (longest matching route entry/ lowest AD distance/ highest metric value) to forward the packet.

4. Routing tables stores:

    | Route                      | Explanation                                                                                                   |
    | -------------------------- | ------------------------------------------------------------------------------------------------------------- |
    | Directly-connected network | Configured with an IP address and is activated (Connected to a network)                                       |
    | Remote network             | Connected to others routers                                                                                   |
    | Default route              | Also known as Gateway of Last Resort. It is used when there is no better (longer) match in the routing table. |
    |                            |                                                                                                               |

5. Static routing

    - Manually configured
    - Need reconfiguration when the topology changes
    - Appropriate for small network/ few or no redundant links.

6. Dynamic routing

    - Automatically learned through the protocol
    - Discover remote networks
    - Maintain up-to-date routing information
    - Choose the best path to destination networks
    - Attempt to find a new best path if the current path is no longer available

7. Example of dynamic routing protocol

    - (O) OSPF - Open Shortest Path First
    - (E) EIGRP - Enhanced Interior Gateway Routing Protocol

### MAC and IP

1. Terminologies:

    | Term             | Explanation                                                                                                      |
    | ---------------- | ---------------------------------------------------------------------------------------------------------------- |
    | Physical address | Also known as MAC (Media Access Control) address, used for NIC to NIC communication on the same Ethernet network |
    | Logical address  | Also known as IP address, used to send the packet from src to dst                                                |
    |                  |                                                                                                                  |

2. The MAC address of local router interface (default gateway) will be the destination MACaddress when sending a frame to a remote network.

3. ARP (Address Resolution Protocol) (IPv4) and ND (Neighbor Discovery) (IPv6) are protocols used to determine the MAC address from a known destination device IP address.

### ARP (Address Resolution Protocol)

1. Two functions of ARP

    - Resolving IPv4 addresses to MAC addresses
    - Maintaining a table of IPv4 to MAC address mappings

2. ARP table/ ARP cache is stored temporarily in RAM memory

3. Working Principle:

    - If IPv4 address on the same network, search ARP table for it; else, search for default gateway address.
    - If no entry is found, sends an ARP request.

4. **ARP request/ reply** messages are encapsulated within an Ethernet frame without IPv4 header:

    | Field           | Explanation                                                           |
    | --------------- | --------------------------------------------------------------------- |
    | DST MAC Address | Broadcast/ Unicast address FF-FF-FF-FF-FF-FF                                   |
    | SRC MAC Address | Sender's MAC Address                                                  |
    | Type            | 0x806 - Inform receiving NIC to handle data portion using ARP process |
    |                 |                                                                       |

5. After the ARP reply is received, the device will add the IPv4/MAC address to its ARP table.

6. If no device responds to the ARP request, the packet is dropped because a frame cannot be created.

7. Entries in the ARP table are time stamped. If a device does not receive a frame from a particular device before the timestamp expires, the entry for this device is removed from the ARP table.

8. Static ARP table entries do not expire over time and must be manually removed.

9. ARP Issues

    - ARP broadcast

        - Performance reduction when a large number of device starts accessing network services at the same time
        - The impact will be minimized after necessary MAC addresses are learned

    - ARP spoofing/ ARP poisoning attack

        - Threat actor reply to an ARP request for an IPv4 address that belongs to another device with its own MAC address
        - Dynamic ARP inspection (DAI) is used to mitigate ARP spoofing

### Neighbor Discovery

1. ND provides address resolution, router discovery, and redirection services for IPv6 using ICMPv6.

2. ICMPv6 ND uses five ICMPv6 messages to perform these services:

    Solicitation : the act of asking for or trying to obtain something from someone.

    - Address resolution (Devices/ Devices)
        - Neighbor Solicitation (NS) - Multicast
        - Neighbor Advertisement (NA)

    - Dynamic address allocation and stateless address auto-configuration (SLAAC) (Devices/ Routers)
        - Router Solicitation
        - Router Advertisement
    - Redirect Message

## Module Revision

### ARP related

1. **What property of ARP allows hosts on a LAN to send traffic to remote networks?**

   Local hosts learn the MAC address of the default gateway.

2. **What are two potential network problems that can result from ARP operation?**

    - On large networks with low bandwidth, multiple ARP broadcasts could cause data communication delays.
    - Network attackers could manipulate MAC address and IP address mappings in ARP messages with the intent of intercepting network traffic.

3. **What property of ARP causes a reply only to the source sending an ARP request?**

    The source MAC address appears in the header of the Ethernet frame.

4. **What is the aim of an ARP spoofing attack?**

   To associate IP addresses to the wrong MAC address

5. **What property of ARP causes the NICs receiving an ARP request to pass the data portion of the Ethernet frame to the ARP process?**

   The type field 0x806 appears in the header of the Ethernet frame.

6. **What property of ARP allows MAC addresses of frequently used servers to be fixed in the ARP table?**

   A static IP-to-MAC address entry can be entered manually into an ARP table.

7. **What property of ARP forces all Ethernet NICs to process an ARP request?**

   The destination MAC address FF-FF-FF-FF-FF-FF appears in the header of the Ethernet frame.

8. **Which statement describes the treatment of ARP requests on the local link?**

   They are received and processed by every device on the local network.

9. What property of ARP causes cached IP-to-MAC mappings to remain in memory longer?

    Entries in an ARP table are time-stamped and are purged after the timeout expires

### IPV4/ IPV6 encapsulation

1. What is one advantage that the IPv6 simplified header offers over IPv4?

    Efficient packet handling

2. Which term describes a field in the IPv4 packet header that contains a 4-bit binary value set to 0100?
  
    Version

3. When transporting data from real-time applications, such as streaming audio and video, which field in the IPv6 header can be used to inform the routers and switches to maintain the same path for the packets in the same conversation?

    Flow Label

### Others

1. A computer has to send a packet to a destination host in the same LAN. How will the packet be sent?

    The packet will be sent directly to the destination host.

2. How do hosts ensure that their packets are directed to the correct network destination?

    They have to keep their own local routing table that contains a route to the loopback interface, a local network route, and a remote default route.

3. Which parameter does the router use to choose the path to the destination when there are multiple routes available?

    The lower metric value that is associated with the destination network

4. Where are IPv4 address to Layer 2 Ethernet address mappings maintained on a host computer?
    ARP cache

5. Which statement describes a feature of the IP protocol?

    IP relies on upper layer services to handle situations of missing or out-of-order packets.

6. What happens when the transport input ssh command is entered on the switch vty lines?
    Communication between the switch and remote users is encrypted.

7. What are two services provided by the OSI network layer?

    - Encapsulating PDUs from the transport layer
    - Performing error detection

8. What is a basic characteristic of the IP protocol?

    Connectionless

9. The global configuration command ip default-gateway 172.16.100.1 is applied to a switch. What is the effect of this command?

    The switch can be remotely managed from a host on another network.

10. What are two functions of NVRAM?

    - To store the startup configuration file
    - To retain contents when power is removed

11. What are two services provided by the OSI network layer?

    - Routing packets toward the destination
    - Encapsulating PDUs from the transport layer

12. What information does the loopback test provide?

    The TCP/IP stack on the device is working correctly.

13. Refers to the table:

    | Method               | Explanation                               |
    | -------------------- | ----------------------------------------- |
    | SSH (Secure Shell)   | Remote access method that uses encryption |
    | Console              | Preferred out-of-band access method       |
    | AUX (Auxiliary Port) | Remote access via a dial-up connection    |
    | Telnet               | Unsecure remote access                    |
    |                      |                                           |

### Switch and Routing

1. A computer has to send a packet to a destination host in the same LAN. How will the packet be sent?

    The packet will be sent directly to the destination host.

2. What routing table entry has a next hop address associated with a destination network?

    Remote routes

3. A router receives a packet from the Gigabit 0/0 interface and determines that the packet needs to be forwarded out the Gigabit 0/1 interface. What will the router do next?

    Create a new Layer 2 Ethernet frame to be sent to the destination

4. Within a production network, what is the purpose of configuring a switch with a default gateway address?

    The default gateway address is used to forward packets originating from the switch to remote networks.
