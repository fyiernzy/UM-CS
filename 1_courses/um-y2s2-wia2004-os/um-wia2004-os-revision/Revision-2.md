# Chapter 2
1. Briefly explain four types of memory allocation schemes as well as their strengths and weaknesses.
	1. Single User Contiguous Scheme
		1. Only a single program can be loaded entirely into the memory and is given a single contiguous block as requested.
		2. *The program is loaded entirely into memory and is assigned a single contiguous block of memory as request. Only one program can reside in memory at a time.*
		3. Disadvantages
			1. Does not support multiprogramming
			2. Lead to significant memory waste
			3. Jobs larger than available memory cannot be executed
	2. Fixed Partition
		3. Divides memory into *fix-sized* blocks (partitions). Jobs are loaded into the partitions throughout their execution. *Each program is loaded into a partition and remains there thoughout their execution.* ~~Only a job can remain in a partition before its completion.~~
		4. It supports multiprogramming, but it causes internal fragmentation, wasting memory within partitions.
		5. Jobs larger than partitions cannot be executed.
		6. Larger jobs may experience longer turnaround time, waiting for a larger memory block to be available.
	3. Dynamic Partition
		1. Each job is allocated as much memory as requested.
		2. Initially, the memory is fully utilized by first few jobs.
		3. It eliminates internal fragmentation, but leading to external fragmentation between allocated memory block.
	4. Relocatable Dynamic Partition
		1. Similar to dynamic partition, each job is allocated as much memory as requested.
		2. When jobs finish, the memory manager performs compaction to consolidate free blocks into a single contiguous block to accommodate other jobs.
		3. It minimizes both internal and external fragmentation, but it requires computation and memory overhead for compaction.

2. How memory deallocation is performed in Fixed Partition and Dynamic Partition?
	1. In Fixed Partition, the memory manager marks the memory to be deallocated as 'free'. This can be done using a binary value, where '1' indicates busy ~~and~~ *while* '0' indicates free.
	2. In Dynamic Partition,
		1. If the deallocated memory is adjacent to a free block, the memory manager combines them, sums their size*s*, and adjust the starting address to the earlier block.
		2. If the deallocated memory is between two free blocks, the memory manager combines them, sum their size, and adjust the starting address to the earliest block. The deallocated block will then be marked as a null entry.
		3. If the deallocated memory is isolated from free blocks, the memory manager searches for a null entry. If a null entry is found, the memory manager adjusts the ~~block~~ size to the job size, updates the starting address to *the beginning memory location of terminating ~~job* job address~~ and marks the 'null entry' to 'free' to indicate its availability.   *adjust the status from a null entry to free, indicating a new memory block is available.*
3. Compare the Best Fit and the First Fit.
	1. Best Fit keeps the free/busy lists ordered by memory block size, from smallest to largest. First Fit keeps the free/busy list ordered by memory location, from low-order to high-order.
	2. Best Fit finds the smallest free block that is large enough to accommodate the job. First Fit finds the first free block that is large enough to accommodate the job.
	3. Best Fit uses memory spaces more efficiently and results in smaller internal fragmentation. First Fit uses memory spaces less efficiently and results in larger internal fragmentation.
4. Why compaction can lead to computation and memory overhead?
	~~1.  To adjust the starting address of every active program in the memory.
	2. ~~To maintain the intrinsic data value within each job~~
	3. Each program in memory must be relocated to ensure contiguity
	4. Every address and reference within each program must be adjusted to reflect the program's new memory location.
	5. All other values within the program must remain unchanged.
1. What are the similarities between Best Fit and First Fit?
	1. *Both maintain free/busy lists*
	2. *Both use loop to compare job sizes with memory blocks until a suitable block is found*
	3. *Both move the job to the READY queue if no suitable partition is found.*

# Chapter 3
1. Explain the concept and importance of virtual memory.
	1. Concept
		1. Virtual Memory uses hard disk spaces as an extension ~~to the physical memory~~ of main memory.
		2. ~~Virtual memory uses memory spaces more efficiently by loading necessary parts of a program~~
		3. Allows program to execute as if the entire program is in the main memory, even though only parts are loaded as needed.
	2. Importance
		1. Virtual Memory minimizes both internal and external fragmentation.
		2. ~~Programs not longer restricted by the physical memory size~~ Job execution is not limited to the size of physical memory.
		3. Virtual *uses* memory ~~spaces~~ more efficiently by loaded only necessary parts of a ~~program~~ job.
		4. *VM supports unlimited multiprogramming*
		5. Virtual memory allows the sharing of code *and data* without conflicts
		6. ~~Virtual Memory reduces page faults though segmentation.~~
2. Compare Virtual Memory with Paging and Virtual Memory with Segmentation.
	1. Paging divides jobs into fix-sized pages while segmentation divides jobs into variable-length segments with related functions.
	2. Paging eliminates external fragmentation while Segmentation allows external fragmentation.
	3. Paging allows internal fragmentation while Segmentation eliminates internal fragmentation.
	4. Paging calculates absolute addresses using page number and displacement while Segmentation calculates absolute addresses using segment number and displacement.
	5. Paging is managed by hardware using Page Map Table (PMT) while Segmentation is managed by software using Segment Map Table (SMT).
3. Briefly explain Demand Paging and Segmentation as well as their strengths and weaknesses.
	1. Demand Paging
		1. Paging divides jobs into fix-sized pages while Demand Paging loads only necessary pages of a program into page frames only, *instead of loading the entire program at once*.
		2. *Use page replacement policies such as LRU and FIFO when page faults occur.*
		3. Advantages:
			1. It allows programs larger than memory spaces to execute. OR *Support virtual memory, allowing jobs larger than physical memory to execute.*
			2. It uses memory spaces more efficiently as only necessary pages are loaded OR *by loading only necessary pages*
		4. Disadvantages
			1. It causes page faults, a situation where ~~necessary~~ *a needed* page~~s are~~ is not found, which slows down the execution and declining the system performance.
			2. *Managing pages, tracking their usage and handling page swaps increase system workload.*
	2. Segmentation
		1. Segmentation divides *incoming* jobs into variable-length segments ~~with~~ containing related functions.
		2. Segments are loaded into the memory like dynamic partition.
		3. Uses JT, SMT, MMT to track segments.
		4. Advantages:
			1. It eliminates internal fragmentation and reduces page faults as similar functions are grouped as segments.
		5. Disadvantages
			1. ~~It causes external fragmentation and requires compaction.~~
			2. Requires overhead to segment similar function within jobs.
			3. Causes external fragmentation, wasting memory between allocated memory blocks.
4. How does Paged/Segmented Memory scheme combines both Demand Paging and Segmentation?
	1. The scheme divides memory into page frames, jobs into segments, and segments into pages.
	2. *Then, loads only necessary pages of segments into page frames.*
	3. It uses Job Table (JT), Segment Map Table (SMT), Page Map Table (PMT) and Memory Map Table (MMT) to *track segments and pages*
	4. It minimizes both internal and external fragmentation. (*avoid compaction*)
	5. It reduces page faults by grouping related functions together.
	6. However, it requires overhead ~~as it needs to lookup two tables. ~~to manage SMT and PMT
	7. Slows down the process due to increased lookup time in SMT and PMT
	8. Though the issue can be mitigated using associative registers, *which contain segment and page numbers*.
		1. Associative registers are assigned to every jobs, storing their lookup information in SMT and PMT.
		2. When lookup is performed, the memory manager will search in both associative and SMT and PMT at the same time. *simultaneously*
		3. If target information is found in the associative registers, the searching in SMT and PMT, stopping earlier and reduces the search time.
		   *If the associative registers already contain the needed information, the search through table stop, and the system directly uses the data from associative registers for address translation.*
		4. If target information is not found in the associative registers, no time is wasted because searching in SMT and PMT has started.
		   *If the associative registers lack the information, ...*
5. Compare FIFO and LRU.
	1. FIFO is First-In, First Out while LRU is Least Recently Used.
	2. FIFO replaces oldest pages in the ~~queue~~ memory while LRU replaces least recently used pages, assuming it is less likely to be used soon.
	3. FIFO uses queue for implementation while LRU uses reference bits.
	4. Generally, FIFO results in more frequent page faults while LRU results in fewer page faults.
	5. FIFO is easy to implement while LRU is more complex to implement.

# Chapter 4
1. Define Process, Thread, Processor, Process Control Block (PCB).
	1. A process is an active program that requires resources such as a CPU and registers to execute.
	2. A thread is the smallest execution unit within a process that can run independently and concurrently with other threads.
	3. A processor or Central Processing Unit (CPU) is a machine part that executes program instructions and performs calculation.
	4. A Process Control Block (PCB) is a data structure holding information about a process's identity, status, CPU usage, *memory allocation* and progress.
2. Compare CPU cycles and I/O cycles.
	1. CPU cycles ~~are executions~~ *involve operations* performed by *the* CPU, such as fetching, decoding and executing instructions.
	2. I/O cycles ~~are~~ involves interactions between ~~CPU~~ *the computer* and external devices, such as reading keyboard input and reading disks.
3. What is a Job Scheduler and a Process Scheduler? What are their roles?
	1. A Job Scheduler is a high-level scheduler that selects jobs ~~based on certain criteria~~ *from an incoming queue* and place them into the READY queue, aiming to optimize system resource usage.
	2. A Process Scheduler is a low-level scheduler that allocates CPU times to processes in the READY queue.
		1. Decides which process is assigned CPU time and how long they are assigned
		2. Handle *process* interruptions
		3. ~~Stores and loads processes between their PCB (Process Control Block) and memory.~~
		4. Manage transition of processes between different queues based on their state and requirement.
4. How to evaluate if a scheduling policy is good?
   A good scheduling policy should
	1. Maximizes throughput and CPU efficiency
	2. Minimizes waiting, turnaround and response time
	3. Ensure fairness for all jobs
1. What is a preemptive scheduling policy? Describe 2 preemptive scheduling policies.
	1. A preemptive scheduling policy preempts processes and executes other jobs first based on certain criteria, *aiming to reduce turnaround time and improve system performance*.
	2. It *stops the current process*, stores the information of the current process to its PCB and places it back in the READY queue to ...~~loads the PCB of other process.~~
	3. SRT (Shortest Remaining Time) preempts a job if an incoming job has shorter remaining time.
	   *preempts sth based on sth, exp...*
	4. Round Robin preempts a job if it has not finished within the predetermined time quantum.
2. Compare FCFS, SRT, SJN, Round Robin.
	1. FCFS (First In First Out) is a non-preemptive scheduling algorithm that schedules processes based on their arrival time. Processes that arrive earlier are executed first. It is suitable for batch system. However, it is not suitable for interactive system due to potential long waiting time. Also, it causes varying average turnaround time *depending on the job sequence*.
	2. SRT (Shortest Remaining Time) is the preemptive version of SJN which schedules processes based on their remaining time. ~~Processes that have shorter remaining time are executed first. Its disadvantages is that jobs with longer burst time may experience longer waiting time or cannot execute at all.~~
	   
	   - *If a new job in the READY queue requires less time to finish, the currently executing job is preempted, stored is its PCB, and placed back to the READY queue. The system loads the PCB of the next job into the CPU's registers to begin execution.*
	   - Requires additional overhead for monitoring jobs and context switching
	   - Context switching may diminish the advantages
	   - Jobs with longer remaining times may experience ..
	     
	3. SJN (Shortest Job Next) is a non-preemptive scheduling algorithm which schedules processes based on the burst time/ CPU cycles. It is suitable for batch system where *CPU time is known in advance and all jobs arrive at the same time*. ~~but not for interactive system. Similar to SRT, jobs with longer burst time could experience longer waiting time or cannot execute at all.~~
	4. Round Robin is a preemptive scheduling algorithm which assigns/allocates a predetermined time quantum to each job, *ensuring equal CPU distribution among all active processes*. **No job can monopolize the CPU**. If job has ~~lower~~ shorter CPU cycles than time quantum and it finishes, the resources is deallocated and allows next job to execute. If a job has higher CPU cycles than the time quantum and it doesn't finish within the time quantum, *it is preempted and moved to the end of the of the READY queue, with its state saved in its PCB*. ~~its information is saved to its PCB and it is placed to the READY queue.~~
3. How does the size of a time quantum affect the effectiveness of Round Robin?
	1. Larger time quantum essentially makes the algorithm behave like FCFS.
	2. Smaller time quantum increases context switching, *slowing down job execution and* raising overhead significantly.
4. What are the rules of thumbs of deciding an optimal quantum size?
	1. It should *long enough* to allows 80% of CPU cycles to finish
	2. It should be at least 100 times longer than the time needed for context switching.

# Chapter 5
1. Define process, thread, deadlock and starvation
	1. A process is an active program that requires resources such as the CPU and registers to execute.
	2. A thread is the smallest execution unit within a process that can run independently and concurrently.
	3. Deadlock/ *deadly embrace* is a situation where multiple processes cannot proceed because each is waiting indefinitely for resources held by the others.
	4. Starvation is a situation where a process is waiting indefinitely for resources that will never become available, preventing it from executing.
2. What are the four conditions required for a deadlock to occur?
	1. Mutual exclusion. Only a single process can hold a resource at a time.
	2. Resource holding. Processes holds resources while waiting for resources held by the others.
	3. No preemption. Resources cannot be forcibly taken from a process before its completion; it must be released voluntarily.
	4. Circular Wait. A chain of processes exists where each process holds at least one resource needed by the next process and waits for resources held by the others.
3. Describe six cases of deadlock?
	1. File requests. Deadlocks can happen when multiple processes request and hold files simultaneously ***during their execution***.
	2. Database. Deadlocks can happen when multiple processes hold and lock the database simultaneously. Deadlock, which ensures data integrity, can be applied to the entire database, sections or individual records.
	3. Dedicated device allocation. Deadlocks can happen when multiple processes request and hold the dedicated device simultaneously.
	4. Multiple device allocation. Deadlocks can happen when multiple processes request and hold the dedicated device simultaneously.
	5. Spooling. Spooling is a temporary storage for storing data that will be used and executed by ~~other devices~~ a device. Deadlocks can happen when spooling *system* is filled by incomplete data from multiple jobs, preventing it from proceeding further because it requires complete data.
	6. Disk sharing. A livelock can happen when multiple processes busy waiting for ~~using the disk~~ a shared resource but never gains control of it, continuously getting blocked by each other.
4. Explain how prevention work.
   Prevention eliminates one of the four necessary conditions for a deadlock to occur.
	1. Mutual exclusion cannot be eliminated because some resources requires exclusive use.
	2. Resource holding can be prevented by forcing ~~all processes~~ jobs to request ~~for~~ all required resources at the start.
	3. No preemption can be prevented by allowing OS to forcibly deallocate resources from a running job.
	4. Circular wait can be prevented by implementing a numbering system where processes are required to request for resources in a specific order.
1. Define safe state and unsafe state.
	1. A safe state is a state where a safe sequence exists to allow all processes to complete without deadlock.
	2. An unsafe state is a state where no safe sequence exists ~~and causes~~ risking deadlock, preventing all processes to complete.
2. What are the factors to be considered in victim selection?
	1. Job priority. Jobs with higher priority are usually spared.
	2. CPU time consume. A job near its completion typically won't be chosen as victim. *Jobs near completion*
	3. Impact on other jobs. Consider how terminating a job could impact other active jobs.
3. Describe the recovery algorithm to resolve a deadlock.
	1. Terminates and restarts all active jobs. This approach has the highest operational cost.
	2. Terminates and restarts only jobs involved in a deadlock. Lower operational cost than terminating all jobs.
	3. Sequential terminations. Terminates deadlocked jobs one at a time, checking for deadlock resolution after each termination. It minimizes the affected jobs.
	4. Use of snapshots. Record the progress of preempted jobs and resume it instead of restarting it.
	5. Preempt non-deadlocked jobs and allocates their resources for deadlocked jobs to finish.
	6. Prevent new jobs from entering the system, allowing non-deadlocked jobs to finish and release their resources, indirectly resolve the deadlock