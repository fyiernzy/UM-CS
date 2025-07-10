# 1. Control System
---

- Feedback is a mechanism where part of the output is returned as input to influence future actions.

- Positive Feedback Loop
	- A loop that reinforces the original input, increasing the system's response.
	- It aims to amplify deviations from the desired output, often leading to instability.

- Negative Feedback Loop
	- A loop that counteracts the original input, stabilizing the system.
	- It aims to reduce deviations from the desired output, promoting system stability.

| Open Loop Control System                                                                                                                                                      | Closed Loop Control System                                                                                                                            |
| ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Definition**<br>A control system that uses feedback to compare the actual output with the desired output and adjusts accordingly. the output influences the control action. | **Definition**<br>A control system that operates without feedback; the output does not affect the control action.                                     |
| Operates without feedback.                                                                                                                                                    | Operates using feedback. It continuously measures the output and compares it to a desired setpoint, making corrections as needed.                     |
| The output doesn't influence the control action.                                                                                                                              | The output influences the control action.                                                                                                             |
| Example: <br>Simple Toaster: It toasts for a set time, whether the bread is perfectly browned or burnt.                                                                       | Example:<br>Air Conditioner: Maintains a target temperature.                                                                                          |
| Pros:<br>Simpler to implement and maintain.                                                                                                                                   | Pros:<br>- More accurate as feedback allows the system to correct errors.<br>- More adaptive to disturbance and better at maintaining desired output. |
| Cons:<br>- Less adaptive to the environmental changes.<br>- Less accurate due to the absence of feedback.                                                                     | Cons:<br>- More complex and costly to design and implement.<br>- Less stable if not properly design.                                                  |

# 2. IoT World Forum Reference Model
---
IoT World Forum Reference Model is a seven-level IoT Reference Model introduced by the IoT World Forum that guides and accelerates IoT deployments. It consists of 7 layers:

- **Physical Devices and Controllers**
	- Includes endpoint devices and sensors that send and receive data.
	- Responsible for collecting data and capable of being queried and/or controlled over a network.

- **Connectivity**
	- Ensure reliable and timely data transmission between devices and networks.
	- It handles translation between protocols, network level security, switching and routing.

- **Edge Computing**
	- Performs data processing close to the network edge/ end devices for faster information processing and reduced latency.

- **Data Accumulation**
	- Stores data for later use.

- **Data Abstraction**
	- Standardizes multiple data formats and ensures a consistent view from various sources

- **Application**
	- Interprets data using software applications.
	- Applications may monitor, control, and provide reports based on the data analysis.

- **Collaboration & Processes**
	- Consumes and shares the application information, involving human and business processes.

**Explain Device-to-Gateway-to-Cloud-to-Application architecture.**
- Devices collect data or perform actions via sensors/actuators.
- Gateways bridge devices to the cloud, handling data collection and basic processing.
- The cloud stores, processes, and analyzes data.
- Applications allow users to interact with data and control devices.

**What are the differences between edge computing and fog computing?**
- Fog computing deploys nodes near IoT endpoints for real-time monitoring and control.
- Edge computing extends fog computing to the IoT endpoint itself.

**What are the pros and cons of distributed computing in IoT?**
- Pros: Faster processing, reduced latency, less network congestion, local data security.
- Cons: Increased complexity, potential inconsistency.


# 3. Network
---
## 3.1. Fog and Cloud Computing

![[image.png]]

Cloud Computing Model
- It provides on-demand access to a shared pool of configurable computing resources.
- Advantages:
	- Resources can be made available quickly with minimal management effort.
	- Reduces cost for equipment, energy, physical plant requirements, and personnel training needs.
- Important concepts
	- **Pay-as-you-go**:
		- "Only pay for the services you use."
		- It is a payment method for cloud computing that treats computing and storage expenses as a utility and charges based on usage.
	- **Cloud services**
		- IaaS (Infrastructure as a Service)
		- PaaS (Platform as a Service)
		- mPaas (Platform and mobile Platform as a Service)
		- SaaS (Software as a Service)
	- Advantages of cloud services:
		- It allows data accumulation and data processing be performed in the cloud instead of the IoT devices, extends the functionality of the IoT system.
		- Cloud service providers provide reliable security measure to keep data safe.
		- Cloud service providers ensure high availability and reliability, ensuring that data and resources are available to any devices in the system as long as the device has Internet connectivity.


[What is pay-as-you-go cloud computing (PAYG cloud computing)?\|Definition from TechTarget](https://www.techtarget.com/searchstorage/definition/pay-as-you-go-cloud-computing-PAYG-cloud-computing)

**Fog computing model**
- A distributed computing infrastructure where computing occurs at somewhere closed to the network edge.
- Edge devices run locally and make immediate decisions.
	- It reduces network traffic as raw data are not send over the network.
	- It enhances security as sensitive data are kept locally unless it is needed.
- Fog applications monitor and analyze real-time data from network-connected things and take necessary actions (M2M/ M2P).

## 3.2. Network Types

![](../../wic2008-lect-1752109540142.png)

- PAN (Personal Area Network)
	- A type of network that spans a few meters around an individual and is often used in IoT.
- LAN (Local Area Network)
	- A type of network infrastructure that spans a geographical area and is used to connect end devices
	- It is normally high-speed network under the control of a single administrative entity.
- WAN (Wide Area Network)
	- A type of network infrastructure that spans a wide geographical area and is used to connect WANs.
	- It is normally a low-speed network and may include portions from different Internet Service Providers (ISP).

| LAN                                          | WAN                                                        |
| -------------------------------------------- | ---------------------------------------------------------- |
| Local Area Network                           | Wide Area Network                                          |
| Spans a geographical area                    | Spans a large geographical area                            |
| Used to connect end devices                  | Used to connect different WANs.                            |
| Usually high-speed                           | Usually low-speed                                          |
| Controlled by a single administrative entity | May include portions from Internet Service Providers (ISP) |

| Term                 | Definition                                                                                                                                                           |
| -------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Network devices      | Devices that connect to each other through a network                                                                                                                 |
| End devices          | Either the source/ destination of a message transmitted over the network                                                                                             |
| Intermediary devices | Devices that connect the individual end devices to the network and can connect multiple individual networks to form an internetwork                                  |
| Network addresses    | Used to uniquely identify devices on a network                                                                                                                       |
| Network Protocols    | Devices must conform to common protocols to communicate.<br>Ethernet: Enable communications between local devices<br>IP: Enable communication between remote devices |
| Basic routing        | The process of directing a network packet to its destination                                                                                                         |


# 4. Security Measures
---

| Plane Type       | Functions                                                                                                                 | Security                                                               |
| ---------------- | ------------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------- |
| Control Plane    | Manages networking routing protocol and makes *forwarding decisions*.                                                     | Secure the network device, e.g. passwords and data encryption          |
| Data Plane       | Receive and forward data packets between devices                                                                          | Secure the data transmitted over the network devices                   |
| Management Plane | Managing and monitoring network operations. Allow for modifying configuration or updating software that runs on a device. | Secured by updating the software and firmware with the latest patches. |

-

Product/Device/Service(s)
- Disable UPnP on IoT devices (Universal Plug and Play, a set of network protocols that enable devices to discover and communicate with each other)
- Check for updates regularly
- Turn off unnecessary services/ Closed unused network ports
- Segment IoT devices to different networks/ VLAN
- Update all devices/ Fix vulnerabilities with the latest updates and patches
- Secure the physical location of IoT devices as much as possible.
- Ensure all devices support and use encryption and certification
- Servers, cloud endpoints, intermediary devices should alsobe secured and use strong encryption algorithms before communicating with IoT devices
- Data Storage
	-
	- Use self-encryption drives and flash memory that perform encryption and decryption by the hardware itself, independent of the OS.

User
- Encrypts the data transmitted to prevent interception and manipulation.
- Encrypt the data in storage to avoid data *tampering* ( modification) or theft.
- Authorization and Authentication
	- Change default passwords/usernames
	- Remove default accounts
	- Use strong password
	- Limit access to the authorized personnel or trusted sources only

- Others
	- Ensures that all new devices facilitate software updates and remove all hidden backdoors.
	- Buy from a reputable manufacturer

Vendor
-


- Data Storage
	- Background: IoT devices might store data locally and temporarily when there's no connection to the gateways or controllers.
- Data Transmission
	- Common attack:
		- trick devices into using sub-optimal security parameters under which the connection can be exploited



Question
- What's special about self-encryption drives and flash memory? How they can ensure data security?

# 5. Business
---
## Market Types

| Horizontal Market                                                                                | Vertical Market                                                                                                                  |
| ------------------------------------------------------------------------------------------------ | -------------------------------------------------------------------------------------------------------------------------------- |
| Meet common/similar needs for a wide range of industries, e.g. security, IT, financial services. | Offer goods/services to a set of customers with specialized needs, e.g. education, automotive, banking, healthcare, retail, etc. |

## Business Model Canvas

- Help organizations and entrepreneurs map, discuss, design and invent new business models
- A business models consists of customer segments, value propositions, channels, customer relationships, revenue stream, key resources, key activities, key partnerships and cost structure
	- Customer Interface: Customer Segments, Value Proposition, Channels, Customer Relationships
	- Infrastructure Management: Key resources, key activities, key partnership
	- Business finances: cost structure, revenue stream

# 6. Miscellaneous
---
An independent network is a standalone network dedicated to a specific type of device/ service, which is isolated from others.

A converged network is a network that incorporates multiple types of device/service(s) (e.g. data, voice, video, IoT traffic) alongside comprehensive security, analytics, and management capabilities.

Convergence: The process of connecting multiple types of device/service(s) into a unified infrastructure.

Machine-to-Machine (M2) allows interactions between different devices.

Big Data is data that is so vast and complex until it is difficult to store, process and analyze using traditional approaches.

It is characterized in three dimensions:
Volume: The amount of data being transported and stored
Velocity: The rate at which the data is generated
Variety: The type of data, which is rarely in a state that is perfectly ready for processing and analysis

Tools for handling Big Data:
Apache Hadoop: Uses Map-Reduce in distributed computing to process the big data in parallel and combine the result after each chunk has completed.
Cassandra: A distributed data base that supports sharding.
Kafka:
Webex Teams;