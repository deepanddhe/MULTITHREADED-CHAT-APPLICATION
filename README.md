# MULTITHREADED-CHAT-APPLICATION
*COMPANY*: CODTECH IT SOLUTIONS

*NAME*: DEEPAN.M

*INTERN ID*: CTIS4395

*DOMAIN*: JAVA PROGRAMMING

*DURATION*: 8 WEEKS

*MENTOR*: NEELA SANTHOSH

##**Multithreaded Chat Application Using Java (VS Code)**

This project implements a multithreaded chat application using Java programming language and was developed using the Visual Studio Code (VS Code) editor. The main objective of this task is to demonstrate client-server communication, socket programming, and multithreading concepts in a real-time messaging system. The application allows multiple clients to connect to a central server and exchange messages simultaneously.

The system is divided into two main components: Server and Client. The server is responsible for accepting incoming client connections and managing communication between them. The client program connects to the server and allows users to send and receive messages in real time.

The server program uses ServerSocket to listen for incoming connections on a specific port (in this case, port 5000). When a client attempts to connect, the server accepts the request using the accept() method, which creates a new socket for communication with that client. For every new client connection, the server creates a separate thread using a ClientHandler class that extends the Thread class. This is the key feature that makes the application multithreaded.

Each ClientHandler thread is responsible for handling communication with a single client. It continuously listens for incoming messages from its client using BufferedReader. When a message is received, it is printed on the server console and then broadcast to all other connected clients. The broadcast functionality is implemented using a shared list of all active client handlers. This ensures that every client receives messages sent by any other client.

To ensure thread safety, the list of clients is managed using a synchronized collection. This prevents issues such as concurrent modification when multiple threads access the list simultaneously. When a client disconnects, the corresponding thread removes itself from the list and closes the socket connection.

On the client side, the program establishes a connection to the server using a Socket object. It takes input from the user through the console and sends messages to the server using PrintWriter. At the same time, a separate thread is created in the client program to continuously listen for messages from the server. This allows the client to send and receive messages simultaneously without blocking either operation.

The application was executed and tested using multiple terminal windows in VS Code. One terminal runs the server, while multiple other terminals run separate instances of the client program. This setup simulates multiple users chatting in real time. When a message is typed in one client, it is sent to the server and then broadcast to all connected clients, demonstrating the effectiveness of multithreading.

This chat application performs several important tasks, including handling multiple client connections concurrently, enabling real-time communication, and ensuring efficient message broadcasting. It also demonstrates the use of Java networking classes such as ServerSocket and Socket, along with I/O streams for data transmission.

The application can be used in various real-world scenarios such as messaging systems, collaborative tools, customer support chat platforms, and multiplayer game communication systems. It provides a foundational understanding of how real-time communication systems like chat applications work internally.

In conclusion, this project successfully demonstrates the implementation of a multithreaded chat application using Java. It highlights key programming concepts such as threading, synchronization, and network communication, making it a valuable learning experience for understanding distributed systems and real-time applications.




