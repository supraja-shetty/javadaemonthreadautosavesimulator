# Java Daemon Thread AutoSave Simulator

## Overview

This project demonstrates the concept of **Daemon Threads** in Java using a real-world Eclipse IDE AutoSave simulation.

The application creates:

* A User Thread (`Eclipse`)
* A Daemon Thread (`AutoSave`)

The AutoSave thread continuously performs background save operations while the Eclipse thread represents user activity. When the user closes Eclipse, the daemon thread automatically terminates.

---

## Concepts Covered

* Java Multithreading
* Thread Class
* Daemon Threads
* Background Processing
* Thread Lifecycle
* Thread Sleep
* Real-Time Timestamp Generation

---

## Project Scenario

Imagine working in an IDE such as Eclipse.

While the user is coding:

* Eclipse runs as the main thread.
* AutoSave runs in the background.
* Every few seconds, AutoSave saves the work automatically.
* When Eclipse closes, AutoSave also stops automatically because it is a daemon thread.

---

## Class Structure

```text
Daemon
│
├── Eclipse Thread
│
└── AutoSave Thread (Daemon)
```

---

## How It Works

### Step 1

Create the AutoSave thread.

```java
AutoSave a = new AutoSave();
```

### Step 2

Convert it into a daemon thread.

```java
a.setDaemon(true);
```

### Step 3

Start the AutoSave thread.

```java
a.start();
```

### Step 4

The AutoSave thread prints timestamps periodically.

```java
System.out.println("Autosave " + time);
```

### Step 5

When the Eclipse thread ends, the daemon thread automatically terminates.

---

## Sample Output

```text
Autosave 13-06-2026 10:15:01
Eclipse as started
Autosave 13-06-2026 10:15:04
Autosave 13-06-2026 10:15:07
User closed the eclipse
```

---

## Key Observation

The AutoSave thread runs forever using:

```java
for(;;)
```

However, because it is a daemon thread:

```java
a.setDaemon(true);
```

Java automatically stops it when all user threads have completed execution.

---

## Daemon vs User Thread

| Feature                  | User Thread           | Daemon Thread    |
| ------------------------ | --------------------- | ---------------- |
| Purpose                  | Main Application Work | Background Tasks |
| JVM Waits For Completion | Yes                   | No               |
| Example                  | Eclipse Thread        | AutoSave Thread  |
| Automatically Terminated | No                    | Yes              |

---

## Technologies Used

* Java
* Java Threads
* LocalDateTime API
* DateTimeFormatter API

---

## Learning Outcomes

After completing this project, you will understand:

* What daemon threads are
* How daemon threads work
* Difference between daemon and user threads
* Background task execution
* Thread scheduling basics
* Real-world daemon thread examples

---

## Real-World Examples of Daemon Threads

* IDE AutoSave
* Garbage Collector (GC)
* Background Synchronization
* Logging Services
* Monitoring Services
* Notification Services

---

## How to Run

### Compile

```bash
javac Daemon.java
```

### Execute

```bash
java Daemon
```

---

## Author

Supraja Shetty

---

## License

This project is open-source and intended for educational and learning purposes.
