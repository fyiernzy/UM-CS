Sure, let's break down each of these concepts with definitions and examples to clarify them.

### System Boundary
**Definition:** The system boundary defines the limits of the system being developed or analyzed. It determines what is included in the system and what is not, effectively distinguishing the system from its environment.

**Example:** In an online banking system, the system boundary includes all the software components that handle user authentication, account management, transaction processing, and reporting. Hardware such as servers and databases that host and support the application are also within the system boundary. However, external systems such as the credit card processing network and user devices (like smartphones and computers) are outside the system boundary.

### System Context
**Definition:** The system context refers to the environment in which the system operates, including all external entities (people, systems, devices) that interact with the system. It provides an understanding of how the system fits into the larger environment and how it interacts with external entities.

**Example:** Continuing with the online banking system, the system context would include the bank customers (users), external payment gateways, regulatory bodies (like central banks), and third-party service providers (like credit rating agencies). The interactions might include user logins, transaction requests to payment gateways, and regulatory reporting.

### Context Boundary
**Definition:** The context boundary delineates the part of the environment that interacts with the system. It highlights the external entities that have direct or indirect interactions with the system and differentiates them from those that do not.

**Example:** In the online banking system, the context boundary includes the customers who access their accounts, the external payment systems for processing transactions, and the regulatory systems for compliance reporting. It does not include unrelated external entities such as other banks' internal systems or unrelated third-party service providers.

### Irrelevant Environment
**Definition:** The irrelevant environment consists of entities and factors that are outside the context boundary and do not interact with the system. These elements have no impact on the system's operation and are not considered in the system's design or analysis.

**Example:** For the online banking system, the irrelevant environment might include unrelated internet services (like social media platforms), other financial institutions' internal systems, and unrelated business entities. These entities do not interact with the online banking system and therefore are not considered in its analysis or design.

### Example Diagram
To visualize these concepts, let's use the example of the online banking system:

```
+-------------------------------------------------------+
|                     System Context                    |
|                                                       |
|   +-------------------+    +---------------------+    |
|   |   Bank Customer   |<--> |  Online Banking    |    |
|   |                   |     |  System (System    |    |
|   +-------------------+     |  Boundary)         |    |
|                             +---------------------+    |
|                                                       |
|   +-------------------+    +---------------------+    |
|   | Payment Gateway   |<--> |  Online Banking    |    |
|   |                   |     |  System            |    |
|   +-------------------+     +---------------------+    |
|                                                       |
|   +-------------------+    +---------------------+    |
|   |  Regulatory Body  |<--> |  Online Banking    |    |
|   |                   |     |  System            |    |
|   +-------------------+     +---------------------+    |
|                                                       |
+-------------------------------------------------------+
                         |
                         | (Irrelevant Environment)
                         v
         +--------------------------------------------+
         |        Social Media Platforms              |
         |      Other Banks' Internal Systems         |
         |     Unrelated Business Entities            |
         +--------------------------------------------+
```

In this diagram:
- The **System Boundary** is represented by the "Online Banking System."
- The **System Context** includes the "Bank Customer," "Payment Gateway," and "Regulatory Body," showing all external entities interacting with the system.
- The **Context Boundary** differentiates between the relevant environment (those interacting with the system) and the **Irrelevant Environment** (entities not interacting with the system, like social media platforms and unrelated business entities).