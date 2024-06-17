# Chapter 2: Network Protocols and Networking Operating System

## Networking Models

When it comes to the networking layer, it may be easier to discuss it in a top-down approach, rather than focusing on the jargon separately. Two commonly used views in the networking layer are the OSI model and the TCP/IP model.

The OSI model, which stands for Open Systems Interconnection, consists of seven layers, namely Application, Presentation, Session, Transport, Network, Data Link, and Physical. On the other hand, the TCP/IP model, which stands for Transmission Control Protocol/Internet Protocol, consists of five layers, namely Application, Transport, Internet, Network, and Physical. In general, the TCP/IP model is used more frequently.

## Protocols

There are many types of end systems in the world, such as personal computers, laptops, and mobile phones. Different types of end systems run different processes or services. Even devices with the same type of system might run different processes. Therefore, to enable communication between these end systems, a general standard or protocol for controlling them is necessary.

To illustrate this, let's take an example from normal human communication. When we meet a new friend, we usually say "Hi," and they would likely reply with a "Hi" as well. It's less likely for someone to say something like "Today is a sunny day" in this scenario. This is because we have a "built-in" protocol that we have learned through a series of socialization processes.

For end systems to communicate across the Internet, the most commonly used protocol suite is TCP/IP. TCP/IP is not a specific protocol, but rather a collection of inter-related protocols that make up our Internet today. It is implemented throughout the TCP/IP model, including the application layer, transport layer, and other layers, to enable the transmission and reception of information over the Internet.

In general, **a protocol defines a common format and set of rules for exchanging messages between devices**. The requirement includes an identifies sender and receiver, common language and grammar, speed and timing of delivery, confirmation or acknowledgment requirements. A protocol will also perform message encoding and message decoding as well.

In human communication, when we initiate a conversation with someone we like, we may eagerly await their response. However, if we wait too long, we may lose interest and give up. This scenario also occurs in networking communication, which is known as `response timeout`. Hosts use network protocols to determine how long to wait for responses and what action to take if a response timeout occurs. Response timeout is one aspect of message timing, along with `flow control` and `access method`.

Flow control is necessary because switches, like humans, cannot process an overwhelming amount of information at once. If switches receive too much data simultaneously, it can cause a `Denial of Service (DoS) attack`. Flow control defines the amount of information that can be sent and the speed at which it can be delivered. Access method also determines when someone can send a message.

## Message Encoding and Message Decoding

Let's delve into the concept of message encoding and decoding. In simple terms, message encoding is the process of converting information into a format that is acceptable for transmission, while decoding reverses this process to interpret the information. But why do we need encoding and decoding in the first place?

Imagine you are filling out a form that requires personal information. Some people may only provide minimal information, such as their name and contact number, while others may give excessive details, such as their parents' names, their siblings, and their teacher's name. This lack of standardization in format can create chaos in data collection. It can also make it challenging for both humans and machines to process the information accurately. To prevent confusion, a standardized form or protocol is needed to ensure that all required information is collected consistently. The process of filling out the form is analogous to encoding, where the information is written in a standardized format so that end systems can successfully understand and process it. The process of reading the encoded information is known as decoding. 

To better understand this process, let's follow the story of a data analyst named Jane. Jane was tasked with analyzing a large dataset containing financial information. The data was provided to her in a .CSV file, which meant it was not yet in a format that was easily readable or usable for her analysis.

To begin the decoding process, Jane opened Microsoft Excel and used the import function to bring the .CSV file into the workbook. This allowed her to access the data and manipulate it as needed. With the data now in a readable format, Jane was able to easily find the sum of certain columns and calculate interest rates for specific accounts.

This process involves decoding the .CSV file, reading its contents, and formatting it to fit the .xlsx file format.

## Segmentation

When reading a textbook like *Computer System: A Programmer's Perspective*, it's unlikely that you would finish it in one day. Instead, you might create a plan to finish it over the course of a few months or even years, reading a little bit at a time. This is similar to how we approach teaching complex topics to young children. For example, if teaching a 5-year-old about linear algebra, you wouldn't start by solving complex problems involving matrices and planes. Instead, you might begin with interactive puzzles to pique their interest and make learning fun. By fostering an interest in the topic, you can gradually introduce more complex concepts and techniques.

This process of breaking down complex topics into smaller, more manageable parts is called "segmentation." The same concept applies to computer networking, where segmentation involves breaking down data into smaller, more manageable pieces to transmit over the network. This can increase the reliability of network communications and ensure that data is transmitted correctly.

To illustrate the importance of segmentation, let's consider a hypothetical example. Imagine that you need to send a large file over the internet, but the file is too big to send all at once. Without segmentation, you might try to send the entire file in one go, but the data could become corrupted or lost in transit. By segmenting the file into smaller pieces and transmitting them one at a time, you can increase the chances that the data will be transmitted successfully.

## Data Encapsulation

Sending smaller packets of data over a network allows for multiple conversations to be interleaved and transmitted simultaneously. Imagine that each packet of data is like an online parcel, which is sent to a central processing location for further handling. When you buy something online, the store sends the parcel to a central warehouse, where the parcel is processed and important information like the recipient's address, sender's name, and delivery instructions are added. This same process happens with data packets in a computer network. The process of interleaving the packets of different conversations together on the network is called multiplexing, while the process of adding important information to the packets is called encapsulation. By interleaving small packets of data from multiple conversations, the network can transmit multiple streams of data simultaneously, improving efficiency and reducing wait times.

Let's review the TCP/IP model, which consists of five layers: Application, Transport, Internet, Network, and Physical. Each layer of the protocol stack adds specific information to encapsulate the data packet. This encapsulation process occurs at every layer and produces a Protocol Data Unit (PDU), a data unit that takes a specific form at each layer. The protocol adds a header to the previous PDU, creating a new PDU that contains more information required for the message transmission. The de-encapsulation process removes one or more protocol headers as the data moves up the stack toward the end-user application.

| Layer       | PDU     |
| ----------- | ------- |
| Application | Data    |
| Transport   | Segment |
| Internet    | Packet  |
| Network     | Frame   |
| Physical    | Bits    |
