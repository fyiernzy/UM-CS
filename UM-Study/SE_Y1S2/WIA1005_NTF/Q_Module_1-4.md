# Module 1 - 4

CAM table
VLAN type and characteristic
FCS
TFTP
switch buffer
DTP
MDIX
DHCP
Layer3 switch
Routing type
VLAN tag field
Collision domain and broadcast domain

## Question

Sure! Here's the question transformed into an ordered bullet list with the answers indented:

1. Which two characteristics describe the native VLAN? (Choose two.)
   - The native VLAN provides a common identifier to both ends of a trunk.
   - The native VLAN traffic will be untagged across the trunk link.

2. If one end of an Ethernet connection is configured for full duplex and the other end of the connection is configured for half duplex, where would late collisions be observed?
   - On the half-duplex end of the connection

3. What type of VLAN should not carry voice and network management traffic?
   - Data VLAN

4. What is a characteristic of an IPv4 loopback interface on a Cisco IOS router?
   - It is a logical interface internal to the router.

5. Which statement is correct about Ethernet switch frame forwarding decisions?
   - Frame forwarding decisions are based on MAC address and port mappings in the CAM table.

6. Which impact does adding a Layer 2 switch have on a network?
   - An increase in the size of the broadcast domain

7. A high school uses VLAN15 for the laboratory network and VLAN30 for the faculty network. What is required to enable communication between these two VLANs while using the router-on-a-stick approach?
   - A switch with a port that is configured as a trunk is needed when connecting to the router.

8. What is the minimum Ethernet frame size that will not be discarded by the receiver as a runt frame?
   - 64 bytes

9. What must an administrator have in order to reset a lost password on a router?
   - Physical access to the router

10. How do switch buffers affect network performance?
    - They store frames received, thus preventing premature frame discarding when network congestion occurs.

11. A technician is configuring a new Cisco 2960 switch. What is the effect of issuing the BranchSw(config-if)# mdix auto command?
    - It automatically adjusts the port to allow device connections to use either a straight-through or a crossover cable.

12. Under which two occasions should an administrator disable DTP while managing a local area network? (Choose two.)
    - When connecting a Cisco switch to a non-Cisco switch
    - On links that should not be trunking

13. Which switch characteristic helps keep traffic local and alleviates network congestion?
    - High port density

14. Which solution would help a college alleviate network congestion due to collisions?
    - A high port density switch

15. Which characteristic describes store-and-forward switching?
    - Error-free fragments are forwarded, so switching occurs with lower latency.
    - Buffering is used to support different Ethernet speeds.

16. Which characteristic describes cut-through switching?
    - Frames are forwarded without any error checking.

17. A network contains multiple VLANs spanning multiple switches. What happens when a device in VLAN 20 sends a broadcast Ethernet frame?
    - Only devices in VLAN 20 see the frame

18. What is a characteristic of a routed port on a Layer 3 switch?
    - It is not assigned to a VLAN.

19. What type of VLAN is designed to have a delay of less than 150 ms across the network?
    - Voice VLAN

20. Port Fa0/11 on a switch is assigned to VLAN 30. If the command no switchport access vlan 30 is entered on the Fa0/11 interface, what will happen?
    - Port Fa0/11 will be returned to VLAN 1.

21. Which two statements are correct with respect to SVI inter-VLAN routing? (Choose two.)
    - Switching packets is faster with SVI.
    - There is no need for a connection to a router.

22. When routing a large number of VLANs, what are two disadvantages of using the router-on-a-stick inter-VLAN routing method rather than the multilayer switch inter-VLAN routing method? (Choose two.)
    - Multiple subinterfaces may impact the traffic flow speed.
    - A dedicated router is required.

23. What type of VLAN is configured specifically for network traffic such as SSH, Telnet, HTTPS, HTTP, and SNMP?
    - Management VLAN

24. What is the significant difference between a hub and a Layer 2 LAN switch?
    - A hub extends a collision domain, and a switch divides collision domains.

25. When configuring a router as part of a router-on-a-stick inter-VLAN routing topology, where should the IP address be assigned?
    - subinterface

26. While configuring inter-VLAN routing on a multilayer switch, a network administrator issues the no switchport command on an interface that is connected to another switch. What is the purpose of this command?
    - To create a routed port for a single network

27. How is traffic routed between multiple VLANs on a multilayer switch?
    - Traffic is routed via internal VLAN interfaces

28. What is required to perform router-on-a-stick inter-VLAN routing?
    - A router that is configured with multiple subinterfaces.
