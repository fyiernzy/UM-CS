# Chapter 4

**Define Process, Thread, Processor, Process Control Block (PCB).**
- A **process** is an active program requiring resources such as CPU and memory to execute.
- A **thread** is the smallest unit of execution within a process, running independently and concurrently with other threads.
- A **processor** or Central Processing Unit (CPU) is a machine part that executes program instructions and performs calculations.
- **A Process Control Block (PCB)** is a data structure holding information about the process's identity, state, CPU usage, memory allocation and progress.

**Compare CPU cycles and I/O cycles**
- CPU cycles involve operations performed by the CPU, such as fetching, decoding and executing instructions.
- I/O cycles involve interactions between the computer and external devices, such as reading data from a keyboard, writing to a disk, and sending data to a printer.

**What is a Process Scheduler?**
- A process scheduler is a low-level scheduler that allocates CPU time to processes in the READY queue.
- Responsibility
	- Decides which processes receive CPU time and for how long
	- Handles process interruptions
	- Manage transition of processes between different queues based on their state and requirements.

**What is a Job Scheduler?**
A **Job Scheduler** is a high-level scheduler that selects jobs from an incoming queue and places them in a ready queue, aiming to optimize system resource usage.

**How to evaluate if a process scheduling policy is good?**
A good process scheduling policy should:
- Maximize throughput and CPU efficiency
- Minimize response time, waiting time, and turnaround time
- Ensure fairness for all jobs.

**What is a preemptive scheduling policy? Describe 2 preemptive scheduling policies.**
- A preemptive scheduling policy preempts processes and allows others to execute first based on certain criteria, aiming to reduce turnaround time and improve system performance. 
- It stops the current process, saves it to its Process Control Block (PCB) and places it back in the **READY** queue to run other jobs first.

Examples of preemptive scheduling policy include:
- Shortest Remaining Time (SRT)
	- Preempts processes based on their remaining time, executing the process with the shortest remaining time first.
- Round Robin
	- Preempts processes based on a time quantum, switching to the next process if the current one does not finish within the time quantum.


**Compare FCFS, SRT, SJN, Round Robin.**
**FCFS (First-Come, First-Serve)**
- Mechanism
	- FCFS is a non-preemptive scheduling algorithm that schedules jobs based on their arrival time. 
	- The process that arrives first is executed first.
- Advantages
	- Simple and suitable for batch systems
- Disadvantages
	- Not suitable for interactive systems due to potential long waiting times.
	- Causes varying average turnaround time depending on job sequence.

**Shortest Remaining Time (SRT)**
- Mechanism:
	- SRT is a preemptive version of SJN, scheduling jobs based on their remaining time. 
	- If a new job in the READY queue requires less time to finish, the currently executing job is preempted, stored in its PCB, and placed back in the READY queue.
	- The system loads the PCB of the next job into the CPU's registers to begin execution.
- Advantages
	- Can be faster than SJN.
- Disadvantage
	- Requires additional overhead for monitoring jobs and context switching.
	- Context switching may diminish the advantages.
	- Jobs with longer remaining times may experience longer turnaround times, and in the worst scenario, might not execute.

**SJN (Shortest Job Next) / SJF (Shortest Job First)**
- Mechanism:
	- SJN/SJF is a non-preemptive scheduling algorithm that schedules jobs by their burst times.
	- The process with shortest burst time executes first.
- Advantages
	- Optimal for batch environments where CPU time is known in advance and all jobs arrive at the same time.

**Round Robin**
- Mechanism
	- Round Robin is a preemptive scheduling algorithm that allocates a fixed, predetermined time quantum to each job, ensuring equal CPU distribution among all active processes. 
	- No job can monopolize the CPU.
	- If a job's CPU cycles is shorter than the quantum and it completes, all allocated resources are released, and the job is returned to the user.
	- If a job doesn't complete within the quantum, it's preempted and moved to the end of the READY queue, with its state saved in its PCB.

**How does time quantum affects the effectiveness of Round Robin?**
- A large time quantum essentially makes the algorithm behave like FCFS.
- A small quantum increases context switching, slowing down job execution and significantly raising overhead.


**What are the rules of thumbs of deciding an optimal quantum size?**
1. Long enough to let 80% of CPU cycles complete.
2. At lest 100 times longer than the time for a context switch.
