**What is a RAM?**
- Read Access Memory is a type of computer memory that can be accessed randomly.
- It is volatile memory, meaning it loses its data when the power is turned off.
- It is used for storing data and machine code currently being used.


**What are the functions of RAM?**
1. **Stores Data Temporarily**. Holds data and instructions that the CPU needs while performing tasks.
2. **Enable Multitasking**. Allows the CPU to quickly access multiple applications and processes.
3. **Improves Performance**. Speeds up data access and processing, enhancing overall system performance.
4. **Buffers Data**: Temporarily holds data being transferred to and from storage devices.

## 2.1 - Early Memory Allocation Scheme
### 2.1.1 - Single User Contiguous Scheme
- **Mechanism**: 
	- The program is loaded entirely into memory, occupying a single contiguous block of memory space as requested.
	- Only one program can reside in memory at a time.
	- Programs larger than available memory cannot be executed.
- **Disadvantages**: 
	- Does not support multiprogramming.
	- Lead to significant memory wastage.

### 2.1.2 - Fixed Partition
- **Mechanism**:
	- Memory is divided into fixed-size blocks (partitions).
	- Each program is loaded into a partition and remains there throughout execution.
- **Advantages**:
	- Supports multiprogramming.
- **Disadvantages**:
	- Programs larger than a partition cannot be executed.
	- Larger programs may experience longer *waiting/ turnaround* time.
	- Programs smaller than a partition causes internal fragmentation, wasting memory within partitions.


### 2.1.3 - Dynamic Partition
- **Mechanism**:
	- Jobs are allocated only as much memory as requested.
	- Initially, memory is fully utilized by the first few jobs.
- Disadvantages:
	1. Jobs larger the available memory space are rejected.
	2. External fragmentation occurs, wasting memory between allocated spaces due to varying job sizes. ***OR***
		1. *When free memory is divided into small, non-contiguous blocks due to the allocation and deallocation of memory.* 

### 2.1.4 - Relocatable Dynamic Partition
- Mechanism:
	- Similar to dynamic partitioning, jobs are allocated memory based on requests.
	- When jobs finish, the memory manager performs compaction to consolidate free blocks into a single continuous block.
- Advantages:
	- Minimizes both internal and external fragmentation
- Disadvantages:
	- Compaction requires additional computation and memory overhead.
		- Each program in memory must be relocated to ensure contiguity.
		- Every address and reference within each program must be adjusted to reflect the program's new memory location.
		- All other values within the program must remain unchanged.

# 2.2 - Best Fit vs First Fit

| Best Fit                                                                                | First Fit                                                                                   |
| --------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------- |
| Keeps the `free/busy` lists ordered by block size, smallest to largest.                 | Keeps the `free/busy` list ordered by memory address, from low to high.                     |
| Finds the ***smallest free*** memory block that is large enough to accommodate the job. | Finds the ***first free*** memory memory block that is large enough to accommodate the job. |
| Uses memory space more efficiently by minimizing internal fragmentation.                | Uses memory spaces less efficiently due to varying internal fragmentation.                  |
| Slower, as it searches the entire list to find the best fit.                            | Faster, as it stops searching once a suitable block is found.                               |
- Both maintain two lists: the free list and the busy list.
- Both use loops to compare the job sizes with memory blocks until a suitable block is found.
- Both move the job to the WAITING queue if no suitable partition is found.

## 2.3 - Deallocation
### 2.3.1 - Fixed Partitions
- The memory manager will mark the memory block to be deallocated as 'free'
- This can be done using binary values where '0' indicates free while '1' indicates busy.

### 2.3.2 - Dynamic Partitions
- Case 1
	- If the deallocated memory block is adjacent to a free block, the memory manager combines them, sums their sizes, and updates the starting address to the earliest block.
- Case 2
	- If the deallocated memory block is between two free blocks, the memory manager combines all three, sums their sizes, and updates the starting address to the earliest block.
	- The deallocated memory block is then marked as a null entry.
- Case 3
	- If the deallocated memory block is isolated, the memory manager searches the list for a null entry.
	- If a null entry is found, the memory manager
		- Adjusts starting address to the beginning memory location of terminating job.
		- Adjust the size to the job size.
		- Adjust the status from a null entry to free, indicating a new memory block is available.







