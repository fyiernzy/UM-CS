# Module 16-17

## Security Threats and Vulnerabilities

1. Types of threat

   - Information Theft

        - Break into computer to obtain confidential information
        - Information can be used or sold for various purpose

   - Data Loss/ Manipulation

        - Break into computer to destroy/ alter data records

   - Identity theft

        - A form of information theft where personal information is stolen for the purpose of taking over the identity of someone.
        - Using this information, a threat actor can obtain legal documents, apply for credit, and make unauthorized online purchases.

   - Disruption of Service

        - Preventing legitimate users from accessing services to which they are entitled. Examples include Denial of Service (DoS)

2. Type of Vulnerabilities

    - Technological Vulnerabilities

        | Vulnerability              | Description                                         |
        | -------------------------- | --------------------------------------------------- |
        | TCP/IP Protocol Weakness   | HTTP/ FTP/ ICMP/ SNMP/ SMTP are inherently insecure |
        | Operating System Weakness  | Each operating system has security problems         |
        | Network equipment weakness | Network equipment, such as routers and switches have security weaknesses |

    - Configuration Vulnerabilities

        | Vulnerability                              | Description                                                                                                                            |
        | ------------------------------------------ | -------------------------------------------------------------------------------------------------------------------------------------- |
        | Unsecured user account                     | User account information is transmitted insecurely                                                                                     |
        | Easily guessed passwords                   | -                                                                                                                                      |
        | Misconfigured internet services            | Turning on JavaScript in web browsers enables attacks by way of JavaScript controlled by threat actors when accessing untrusted sites. |
        | Unsecured default settings within products | -                                                                                                                                      |
        | Misconfigured network equipment            | -                                                                                                                                      |
        |                                            |                                                                                                                                        |

    - Policy Vulnerabilities

        | Vulnerability                         | Description                                                                             |
        | ------------------------------------- | --------------------------------------------------------------------------------------- |
        | Lack of written security policy       | A security policy cannot be consistently applied or enforced if it is not written down. |
        | Lack of authentication continuity     | The use of poorly chosen, easily cracked, or default passwords                          |
        | Logical access controls not applied   | Inadequate monitoring and auditing                                                      |
        | Disaster recovery plan is nonexistent | -                                                                                       |
        |                                       |                                                                                         |

3. Physical Security

    | Threat        | Description                                                                                                                         |
    | ------------- | ----------------------------------------------------------------------------------------------------------------------------------- |
    | Hardware      | Physical damage to hardwares                                                                                                        |
    | Environmental | Temperature/ Humidity extremes                                                                                                      |
    | Electrical    | Voltage spikes, insufficient supply voltage (brownouts), unconditioned power (noise), and total power loss                          |
    | Maintenance   | Poor handling of key electrical components (electrostatic discharge), lack of critical spare parts, poor cabling, and poor labeling |
    |               |                                                                                                                                     |

## Network Attack

1. Types of Malware

    - Viruses: Malware that inserts itself into other programs, spreads from one computer to another, and can cause various levels of damage.
    - Worms: Standalone software that replicates and spreads through system vulnerabilities, without the need for a host program or human assistance.
    - Trojan Horses: Malware disguised as legitimate software, which requires user interaction to be activated and can perform a range of harmful actions, from irritating the user to damaging the host.

    | Malware Type  | Replication | Host Dependency | Propagation Method                                              |
    | ------------- | ----------- | --------------- | --------------------------------------------------------------- |
    | Viruses       | Yes         | Yes             | Infected files, network, disks, file sharing, email attachments |
    | Worms         | Yes         | No              | System vulnerabilities, network                                 |
    | Trojan Horses | No          | No              | User interaction (opening attachments, downloading files)       |

2. Reconnaissance Attacks

    - Reconnaissance - preliminary surveying or research
    - Reconnaissance attacks - The discovery and mapping of systems, services, or vulnerabilities.

    | Method           | Explanation                           |
    | ---------------- | ------------------------------------- |
    | Internet Queries | Look for target's initial information |
    | Ping Sweeps      | Discover active IP addresses          |
    | Port Scans       | Discover active IP addresses          |

    - Internet tools such as `Google Search`, `nslookup` and `whois` is used to determine the IP address space assigned to a given corporation or entity

3. Access Attack

    - Unauthorized access and manipulation of data, system access, or user privileges.

    | Attack             | Explanation                                                                               |
    | ------------------ | ----------------------------------------------------------------------------------------- |
    | Password attack    | Brute-force/ Trojan horse/ Packet sniffers                                                |
    | Trust Exploitation | Uses unauthorized privileges to gain access to a system, possibly compromising the target |
    | Port Redirection   | Uses a compromised system as a base for attacks against other targets                     |
    | Man-in-the-middle  | The threat actor is positioned in between two legitimate entities in order to read or modify the data that passes between the two parties. |

4. Denial of Service Attacks (DoS)

    - The disabling or corruption of networks, systems, or services.

    - DDOS (Distributed DOS)

        - Multiple, coordinated sources
        - Zombie - Infected host
        - Botnet - A network of Zombies
        - The threat actor uses a command and control (CnC) program to instruct the botnet of zombies to carry out a DDoS attack.

## Network Attack Mitigations

1. Defense-in-Depth (Also known as Layered Approach)

    | Defense                                    | Explanation                                                                                                             |
    | ------------------------------------------ | ----------------------------------------------------------------------------------------------------------------------- |
    | VPN (Virtual Private Network)              | Provide secure encrypted tunnels                                                                                        |
    | ASA (Adaptive Security Appliance) Firewall | Ensure that internal traffic can go out and come back, but external traffic cannot initiate connections to inside hosts |
    | IPS (Intrusion Prevention System)          | Monitor incoming and outgoing traffic looking for malware, network attack signatures, etc. and stop it                  |
    | ESA (Email Security Appliance)             | Filters spam and suspicious emails                                                                                      |
    | WSA (Web Security Appliance)               | Filters known and suspicious internet malware sites                                                                     |
    | AAA Server                                 | Contains a secure database of who is authorized to access and manage network devices                                    |
    |                                            |                                                                                                                         |

2. Keep Backup

    - Protecting against data loss

    | Consideration | Description                                                                                  |
    | ------------- | -------------------------------------------------------------------------------------------- |
    | Frequency     | Perform partial backups frequently and regularly                                             |
    | Validation    | Validate backups to ensure data integrity and validate file restoration procedures           |
    | Storage       | Backup should be transported to an approved offsite storage location                         |
    | Security      | Backups should be protected using strong password. Password is required to restore the data. |
    |               |                                                                                              |

3. The most effective way to mitigate a worm attack is to download security updates from the operating system vendor and patch all vulnerable systems.

4. AAA (Used in accessing a network)

    | Terms        | Explanation                          |
    | ------------ | ------------------------------------ |
    | Authenticate | Who is permitted                     |
    | Authorize    | What action they can perform         |
    | Accounting   | Make a record of what they have done |

5. A firewall protects computers and networks by preventing undesirable traffic from entering internal networks. However, a firewall could allow outside users controlled access to specific services such as demilitarized zone (DMZ).

6. The DMZ enables a network administrator to apply specific policies for hosts connected to that network.

7. Types of Firewalls

    | Types                            | Explanation                                                                                                                                   |
    | -------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
    | Packet filtering                 | Prevents or allows access based on IP or MAC addresses                                                                                        |
    | Application filtering            | Prevents or allows access by specific application types based on port numbers                                                                 |
    | URL filtering                    | Prevents or allows access to websites based on specific URLs or keywords                                                                      |
    | Stateful packet inspection (SPI) | Incoming packets must be legitimate responses to requests from internal hosts. Unsolicited packets are blocked unless permitted specifically. |

8. SPI is able to recognize and filter out DoS.

9. Strong password

    - Use a password length of >= 8 characters, preferably >= 10
    - Make passwords complex. (Mix of characters)
    - Avoid passwords based on easily identifiable pieces of information.
    - Deliberately misspell a password.
    - Change passwords often.
    - Do not write passwords down and leave them in obvious places.
    - Use passphrase. A passphrase is a sentence-like string of words used for authentication that is longer than a traditional password, easy to remember and difficult to crack.

## Build a Small Network

1. Quality of service (QoS) is a mechanism which is used to classify and prioritize traffic through the network. This enables network devices to minimize the latency for real-time applications such as voice and video.

2. Redundancy helps to eliminate single points of failure.

3. Redundancy can be accomplished by

    - installing duplicate equipment
    - supplying duplicate network links for critical areas

4. There are two forms of software programs or processes that provide access to the network: network applications and application layer services.

5. Protocol analyzers, such as Wireshark, evaluate and analyze network traffic based on its source, destination, and type. This helps understand the type and flow of traffic crossing the network, enabling efficient traffic management as the network grows.

6. Voice and video traffic have delay sensitive characteristics and must be given priority over other traffic types such as web, email, and file transfer traffic.

7. Factors to consider when designing a network include the cost of devices, speed, modularity and scalability, and ease of managing the network.

8. To scale a network, several elements are required:

    - Network documentation - physical and logical topology
    - Device Inventory - list of devices that use or make up the network
    - Budget - Itemized IT budget, including fiscal year equipment purchasing budget
    - Traffic analysis - protocols, applications, and services and their respective traffic requirements should be documented

9. Domain Name System (DNS) is used to translate a web address to an IP address. The address of the DNS server is provided via DHCP to host computers.​

10. Redundancy is not normally found in very small companies, but slightly larger small companies might use port density redundancy or have redundant Internet providers/links.

11. Modularity refers to the design principle of breaking down a network into smaller, independent modules or components

## Verify Connectivity

1. Ping/ Extended ping

    - Displays various round-trip time statistics.
    - Uses the Internet Control Message Protocol (ICMP) echo request (ICMP Type 8) and echo reply (ICMP Type 0) messages.
    - A standard ping uses the IP address of the interface closest to the destination network as the source of the ping.
    - Extended ping enables the user to create special type of pings by adjusting parameters related to the command operation.

2. Traceroute/ Extended traceroute

    - `Traceroute` provides a list of network hops during packet routing.
    - It helps identify the specific point where a problem may be located along the path.

3. Network commands produce output that contributes to the network baseline. This output can be timestamped, saved in an archive, and retrieved later for comparison.

4. `arp -a` shows the ARP table.

5. `ipconfig` shows the IP address information, while `ipconfig /all` shows more detailed results, including MAC address.

6. With `nslookup` a user can manually place DNS queries and analyze the DNS response. The `nslookup` command shows the output for a query for `www.cisco.com`.

7. An effective network baseline can be established by monitoring the traffic at regular intervals. This allows the administrator to take note when any deviance from the established norm occurs in the network.

## Basic Troubleshooting Approaches

1. Resolve the problem immediately if possible. If not, escalate the problem for approval.

2. To troubleshoot network issues, begin the process at the specific device experiencing problems. If all devices are affected, start troubleshooting at the device where all other devices are connected.

3. 6 steps to troubleshoot the problem:

    | Step | Description                                           | Note                                           |
    | ---- | ----------------------------------------------------- | ---------------------------------------------- |
    | 1    | Identify the problem                                  | Tools/ Conversation with user are both helpful |
    | 2    | Establish a Theory of Probable Causes                 | Often yields more than a few probable causes   |
    | 3    | Test the Theory to Determine Cause                    | -                                              |
    | 4    | Establish a Plan of Action and Implement the Solution | -                                              |
    | 5    | Verify Solution and Implement Preventive Measures     | -                                              |
    | 6    | Document Findings, Actions, and Outcomes              | -                                              |

## Additional notes

1. Redundancy is not normally found in very small companies, but slightly larger small companies might use port density redundancy or have redundant Internet providers/links.

2. In a small business with a large growth forecast, the primary influencing factor would be the ability of devices to support modularity.
