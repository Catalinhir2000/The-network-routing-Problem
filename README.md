The Network Routing Problem
A network contains various nodes, such as computers, routers, switches, etc. Nodes in the network have unique names and may have other common properties such as hardware (MAC) address, the location on a map, etc.
Some of them are identified using an IP-address. Some of them are able to store data, having a storage capacity, expressed in gigabytes (GB).
The time (measured in milliseconds) required for a network packet to go from one node to another is known.
Example: locations are: v1 (Computer A) v2 (Router A) v3 (Switch A) v4 (Switch B) v5 (Router B) v6 (Computer B).
From-To	Cost
v1--v2	10
v1--v3	50
v2--v3	20
v2--v4	20
v2--v5	20
v3--v4	10
v4--v5	30
v4--v6	10
v5--v6	20

Computers and routers are identified by IPs, while only computers are able to store data.

The main specifications of the application are:

Compulsory (1p)

Create an object-oriented model of the problem. You should have at least the following classes Network, Node, Computer, Router, Switch. The natural ordering of the nodes is given by their names.
Create the interfaces Identifiable and Storage. The classes above must implement these interfaces accordingly.
The Network class will contain a List of nodes.
Create and print all the nodes in the network (without the time costs).
Homework (2p)
Each node will contain a Map representing the time costs. Create and print the complete network in the example.
Create a default method in the interface Storage, that is able to return the storage capacity in other units of storage (megabyte, kilobyte, byte).
In the Network class, create a method to display the nodes that are identifiable, sorted by their addresses.
Implement an efficient agorithm to determine all the shortests times required for data packets to travel from an identifiable node to another.
