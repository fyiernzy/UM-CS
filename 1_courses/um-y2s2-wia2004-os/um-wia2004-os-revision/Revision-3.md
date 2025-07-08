# Chapter 2
---
1. Briefly explain Single User Contiguous Scheme and Fixed Partition.
	1. Single User Contiguous Scheme
		1. The program is loaded entirely into the memory and is allocated a single contiguous block of memory as requested.
		2. Only one program can reside in the memory ~~throughout its execution.~~ at a time.
		3. It doesn't support multiprogramming. It wastes memory ~~spaces ~~significantly. Jobs larger than physical memory cannot be executed.
	2. Fixed Partition
		1. Memory is divided into fix-sized blocks (partitions).
		2. Each program is loaded into a partition and remains there throughout its execution. 
		3. Compared to Single User Contiguous Scheme, it supports multiprogramming.
		4. However, jobs larger than a partition cannot be execute. Larger jobs may experience longer waiting time and turnaround time. Jobs smaller than a partition lead to internal fragmentation, wasting memory within partitions.
2. Explain how memory deallocation is performed in Dynamic Partition when the deallocated memory is isolated from free blocks?
	1. If the deallocated memory is isolated from free blocks, the memory manager searches the list for a null entry. If a null entry is found, the memory manager
		1. Adjusts the size to the job size
		2. Adjust the starting address to the beginning *memory location* of the terminating job
		3. ~~Mark the entry as free, indicating that the block is available~~. Adjust the status from a null entry to free, indicating a new memory block is available.
3. Why compaction can lead to computation and memory overhead?
	1. All programs in the memory must be relocated to ensure contiguity
	2. Every address and reference within the program must be updated to reflect correct/ *new memory* locations.
	3. All the data and values within the program must remain unchanged.
4. What are the similarities between Best Fit and First Fit?
	1. Both keep free/busy lists.
	2. Both use loops and compare job size to the memory block size until a suitable memory block is found.
	3. Both move the job to the READY queue if no suitable memory block is found.

# Chapter 3
---
1. Explain the concept and importance of VM.
	1. VM uses hard disk spaces as an extension of main memory.
	2. VM runs the program as if it is loaded entirely to the main memory, while only necessary parts are loaded.
	3. Importance
		1. VM minimizes internal fragmentation and page faults by combining segmentation and paging.
		2. VM eliminates external fragmentation and avoids compactions.
		3. VM uses memory more efficiently by loading necessary parts of a program.
		4. VM facilitates sharing of code and data without conflicts.
		5. *Job execution is not restricted by physical memory size*
		6. *It supports unlimited multiprogramming*.
2. Briefly explain Paging, Demand Paging, Segmentation and Demand Paged/ Segmentation , as well as their strengths and weaknesses.

# Chapter 4
---
1. Defines CPU cycles and I/O cycles
2. Define Job Scheduler and Process Scheduler.
3. Define preemptive scheduling policy and describe 2 preemptive scheduling policies.
4. Compare SJN/SJF, SRT and RR.

