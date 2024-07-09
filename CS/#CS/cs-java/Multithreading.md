Multithreading is a feature allowing concurrent execution of two or more parts of a program for optimal CPU utilization.
A thread is the smallest execution unit within a process that can run independently and concurrently with other threads.
A process is an active activity that requires resources such as CPU and memory to execute.

What are the differences between concurrency and parallelism?

In Java, we can create threads through two approaches:
1. Extending the thread class
2. Implement the Runnable interface

What are the difference between these approaches? How to choose between these approaches? (Case study)

1. Extending Thread class prohibits us from extending other class as Java doesn't allow multiple inheritance. Using Runnable, however, allows us to inherit other class.
2. Thread class provides all basic functionalities including `yield`, `interrupt` , which are not provided by `Runnable` interface.
3. Using Runnable allows an object to be shared amongst multiple threads.

What are the difference between start() and run() in Thread class?

```java
class MyThread extends Thread {
	@Override
	public void run() {
		try {
			System.out.printf("Thread %s is running\n", Thread.currentThread().getId());
		} catch (Exception ex) { }
	}
}

public class Demo {
	public static void main(String[] args) {
		final int THREAD_NUM = 8;
		for(int i = 0; i < n; i++) {
			new MyThread().start();
		}
	}
}
```

Does `Thread` as class itself manage the currently running Thread? What are the common methods provided by `Thread` class?

# Lifecycle and State
---
6 states: New, Runnable, Blocked, Waiting, Timed Waiting, Terminated
![[JAVA-Thread-Lifecycle.png]]


- Simulate a deadlock using Thread.
- Simulate a deadlock and deadlock resolution (different methods).

- New - A thread is created and no yet started.
- Runnable - A thread that is ready to run. The thread scheduler responsible for assigning time for the thread to run.
- Block - A thread tries to acquire a lock which is currently hold by the others.
- Wait - A thread state when thread has called `wait()` or `join()`. It will move to Runnable when it is notified.
- Time Wait - A thread state when the thread calls a method with a time-out parameter. It lies in this state until the timeout is complete or a notification is received.
- Terminated
	- When a thread executes completely and exits normally.
	- When an exception occurs due to segmentation fault.
- 

What are the differences between `wait()` and `join()`?
What is segmentation fault?

```java
public static final Thread.State NEW
public static final Thread.State RUNNABLE
public static final Thread.State BLOCKED
public static final Thread.State WAITING
public static final Thread.State TIMED_WAITING
public static final Thread.State TERMINATED
```

Prove Round Robin is used for concurrency
Show all state of a Thread

Explain the code (in vscode)
Difference between wait and join

Thread priority
- JVM assigns the priority when creating the thread 
- Manually assigns the priority to a thread.

[**Priorities in threads**](https://www.geeksforgeeks.org/java-thread-priority-multithreading/) is a concept where each thread is having a priority which in *layman’s language* one can say every object is having priority here which is represented by numbers ranging from 1 to 10.

default = 5, min=1, max=10
NORM_PRIORITY = 

getName, setName, getPriority, setPriority

What are the concept of Runnable other than a Thread?

写一篇基本 Util debug function
用 Thread show state, deadlock, crud 问题, Round Robin (Mechanism)
让大家看这篇文章就能学到所有有关 Thread 的知识和 Theory(Prediction) 通过推理掌握知识


A multi-threaded program is a program containing two or more threads to run concurrently.

![[JAVA-Multithreading-JVM.png]]
- Main thread is created automatically by JVM (Java Virtual Machine) when the program starts.

Thread Scheduler in Java - Mechanism
- 如何分配时间？用什么机制?

`activeCount` - return number of active threads.

ThreadGroup
ThreadPool
Daemon()
interrupt, wait(), join()
isAlive(), is Interrupted(), interrupted()

setDefaultUncaughtExceptionHandler

what is daemon?
what is yield/ interrupted? How to use them?
Thread.enumerate, getContextClassLoader()
dumpStack()

In both the approaches, we override the run() function, but we start a thread by calling the start() function. So why don’t we directly call the overridden run() function? Why always the start function is called to execute a thread?

When a function is called, 
1. The arguments are evaluated (How does the evaluation is carried out)? Source code and mechanism?
2. A new stack frame is pushed into the call stack.
3. Parameters are initialized
4. Method body is executed
5. Value is returned and current stack frame is popped from the call stack.

The purpose of `start()` is to create a separate call stack for the thread. A separate call stack is created by it, and then `run()` is called by JVM.

What happens if calling run directly Visualize it.

Differences between parameters and arguments

- Calling `start()` method creates a new thread and `run()` method is executed within the thread. Now, the thread posses a new memory stack.
- However, calling `run()` method directly from `main` (or main thread) will no create a new thread (no memory stack is created). Thus, `run()` will be treated as normal method call on the current thread, no multithreading takes place.

(Illustrate it...)

How does `start()` create a new thread (memory stack)?
We cannot call the `start()` twich else it will threow an `illegalStateException` whereas `run()` method can be called multiple times.

![[JAVA-Multithreading-Diff_start_run.png]]The sleep() method is used to stop the execution of the current thread(whichever might be executing in the system) for a specific duration of the time and after that time duration gets over, the thread which is executing earlier starts to execute again.

- Method Whenever Thread.sleep() functions to execute, it always pauses the current thread execution.
- If any other thread interrupts when the thread is sleeping, then InterruptedException will be thrown.
- If the system is busy, then the actual time the thread will sleep will be more as compared to that passed while calling the sleep method and if the system has less load, then the actual sleep time of the thread will be close to that passed while calling sleep() method.