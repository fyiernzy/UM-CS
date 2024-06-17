# Troubleshooting

1. Check the status and ip address of the interface
    - show interface
    - show ip interface
    - show ip interface brief

2. Show routing table
    - To check if static route is configured correctly
    - show ip route (_Verifies the Layer 3 routing information_)

3. To show information of directly connected network on the router
    - show cdp neighbor detail
    - show cdp neighbor

4. Test the connectivity of Layer 3 network (routing)
    - ping/ extended ping

5. To know where the problem occur
    - tracert (Windows)
    - traceroute (Cisco)

6. To show debug message
    - debug ip icmp
    - no debug ip icmp
    - undebug ip icmp
    - undebug all
    - terminal monitor

7. To check the ARP table
    - arp -a (end devices)
    - show arp (intermediary devices)

8. To check if DNS server working normally
    - nslookup
    - ipconfig /all

9. To check the network information in PC
    - ipconfig
    - ipconfig /all
    - ipconfig /displaydns

10. Others
    - show protocols
    - show version
    - show running-config

11. Dealing with IP addressing issue
    - show ip interface brief/ show ip interface
    - ipconfig

12. Dealing with default gateway issue
    - show ip route (Router)
    - ipconfig (PC)

## Explanation

| Command                   | Function                                                                                         |
| ------------------------- | ------------------------------------------------------------------------------------------------ |
| `traceroute`              | Identifies the point along the path where a Layer 3 problem can be found                         |
| `ipconfig /all`           | Displays IP addressing information and details regarding Layer 3 addressing of a Windows host    |
| `ipconfig /displaydns`    | Displays all cached DNS entries on a Windows computer system                                     |
| `arp -a`                  | Lists all devices currently in the ARP cache of the host, including IPv4 address and MAC address |
| `show running-config`     | Verifies the current configuration and settings                                                  |
| `show interfaces`         | Verifies the interface status and displays any error messages                                    |
| `show ip interface`       | Verifies the Layer 3 information of an interface                                                 |
| `show arp`                | Verifies the list of known hosts on the local Ethernet LANs                                      |
| `show ip route`           | Verifies the Layer 3 routing information                                                         |
| `show protocols`          | Verifies which protocols are operational                                                         |
| `show version`            | Verifies the memory, interfaces, and licenses of the device                                      |
| `ping`                    | Test Layer 3 connectivity between a source and destination IP address quickly                    |
| `show ip interface brief` | Provides a summary of the key information for all the network interfaces on a router.            |
|                           |                                                                                                  |

1. The ping command uses the Internet Control Message Protocol (ICMP) echo request (ICMP Type 8) and echo reply (ICMP Type 0) messages.

2. CDP provides the following information about each CDP neighbor device:
    | Field              | Explanation                                                                                |
    | ------------------ | ------------------------------------------------------------------------------------------ |
    | Device identifiers | The configured host name of a switch, router, or other network device                      |
    | Address list       | Up to one network layer address for each supported protocol                                |
    | Port identifier    | The name of the local and remote port, typically represented as an ASCII character string  |
    | Capabilities list  | Indicates the capabilities of a device, such as being a Layer 2 switch or a Layer 3 switch |
    | Platform           | Specifies the hardware platform of the device, such as a Cisco 1841 series router          |

3. CDP can provide useful network infrastructure information to threat actors. Hence, CDP should be enabled only on interfaces that are connecting to other infrastructure Cisco devices. CDP advertisements should be disabled on user-facing ports.
