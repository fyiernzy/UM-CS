# 1. Chapter 4

## 1.1. Fog and Cloud Computing

| Cloud Computing Model                                                   | Fog Computing Model |
| ----------------------------------------------------------------------- | ------------------- |
| On-demand access to a shared pool of configurable computing resources.  |                     |
| Resources can be made available quickly with minimal management efforts |                     |
| FaaS ()                                                                 |                     |

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

## 1.2. Big Data

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

## 1.3. Security Measures in IoT

- Data Storage
	- Background: IoT devices might store data locally and temporarily when there's no connection to the gateways or controllers.
	- Measures:
		- Encrypt the data in storage to avoid data *tampering* ( modification) or theft.
		- Use self-encryption drives and flash memory that perform encryption and decryption by the hardware itself, independent of the OS.
- Data Transmission
	- Encrypt the data being transmitted to prevent interception, captured and manipulation.
	- However, modern encryption algorithm might require more processing power than what is avaialble in the IoT device.
	- Ensure that IoT devices runs the latest version of their firmware and protocols
	- Common attack:
		- trick devices into using sub-optimal security parameters under which the connection can be exploited
	- Servers, cloud endpoints, intermediary devices should alsobe secured and use strong encryption algorithms before communicating with IoT devices
Other measures
Change default passwords/usernames
Disable UPnP on IoT devices (Universal Plug and Play, a set of network protocols that enable devices to discover and communicate with each other)
Set a strong password for remote device management and limit the access to the authorized personnel.
Update all devices with the latest software updates and patches
Ensure all devices support and use encryption and certification
Secure the physical location of IoT devices as much as possible.



Question
- What's special about self-encryption drives and flash memory? How they can ensure data security?

## 1.4. The Role of the Network

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