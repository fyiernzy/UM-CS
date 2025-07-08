# 3.1 - Paging vs Segmentation
| Virtual Memory with Paging                                         | Virtual Memory with Segmentation                                      |
| ------------------------------------------------------------------ | --------------------------------------------------------------------- |
| Can result in internal fragmentation within page frames            | Eliminates internal fragmentation                                     |
| Eliminates external fragmentation                                  | Can result in external fragmentation                                  |
| Divides each program into equal, fixed-size pages                  | Divides each program into variable-sized segments.                    |
| Absolute address is calculated using page number and displacement. | Absolute address is calculated using segment number and displacement. |
| Managed by hardware through Page Map Table (PMT)                   | Managed by software through Segment Map Table (SMT)                   |
- **Paging** can lead to internal fragmentation since pages may not always fill the page frame completely.

# 3.2 - FIFO vs LRU
| FIFO                                                                | LRU                                                                                    |
| ------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| First-In, First-Out                                                 | Least Recently Used                                                                    |
| Replaces the oldest page in memory when memory is full.             | Replaces the least recently used page, assuming that they're unlikely to be used soon. |
| May lead to more frequent page faults, reducing system performance. | Typically results in fewer page faults, improving system performance.                  |
| Simple to implement                                                 | More complex to implement                                                              |
| No overhead required.                                               | Requires additional overhead to track page access history.                             |

# 3.3 - Memory Allocation Scheme
## 3.3.1 - Paged Allocation
- Mechanism
	- Divides incoming jobs into pages of equal size.
	- Sectors (disk sections), page frames (main memory sections) and pages are of same size.
	- Loads pages into page frames, which do not have to be contiguous.
	- Uses Job Table (JT), Page Map Table (PMT) and Memory Map Table (MMT) to track pages.
- Advantages
	- Minimizes internal fragmentation and eliminates external fragmentation
- Disadvantages
	- Page tracking increases the size and complexity of the OS.
	
### 3.3.2 - Demand Paging Allocation
- Mechanism
	- Load only parts of a program into memory as needed, instead of loading the entire program at once.
	- Uses page replacement policies such as Least Recently Used (LRU) and First-In, First Out (FIFO) when page faults occur.
- Advantages
	- Support virtual memory, allowing execution of jobs exceeding the physical memory size.
	- Uses memory more efficiently by loading only necessary pages.
- Disadvantages
	- Managing pages, tracking their usage and handling page swaps increase system workload.
	- Causes page faults *(a situation where a needed page is not in the memory)*, which slow down the process.

## 3.3.3 - Segmentation
- **Mechanism**
	- Divides incoming jobs into variable-sized segments containing related functions.
	- Segments are loaded into the memory spaces like dynamic partition.
	- Uses Job Table (JT), Segment Map Table (SMT),  and Memory Map Table (MMT) to track segments.
- **Advantages**
	- Eliminates internal fragmentation
	- Minimizes page faults by keeping related functions together. 
- **Disadvantages**
	- Requires additional overhead to segment similar functions within a job.
	- Causes external fragmentation, wasting memory between allocated memory blocks.

## 3.3.4 - Segmented/ Demand Paged Segmentation
- Mechanism
	- Combine the strengths of both Demand Paging and Segmentation.
	- Divides memory into page frames, jobs into segments, and segments into equally-sized pages.
	- Then, loads only necessary pages of segments into page frames.
	- Uses Job Table (JT), Segment Map Table (SMT), Page Map Table (PMT) and Memory Map Table (MMT) to track segments and pages.
- Advantages
	- Minimizes internal fragmentation.
	- Avoid external fragmentation and compaction.	- 
	- Reduces page faults, improving system performance.
- Disadvantages
	- Requires additional overhead to manage SMT and PMT.
	- Slow down the process due to increased lookup time in SMT and PMT.
	- However, this issue is mitigated using associative registers, which contain segment and page numbers.
		- When a page request is made, the system searches the SMT, PMT and associative registers simultaneously.
		- If associative registers already contain the needed information, the search through the tables stops, and the system directly uses the data from the associative registers for address translation.
		- If the associative registers lack the information, the search through SMT and PMT continues without losing time.


# 3.4 - Virtual Memory
 - **Concept**
	 - Virtual memory uses hard disk space as an extension of main memory.
	 - Allows programs to execute as if the entire program is in the main memory, even though only parts are loaded as needed.
 - **Advantages**
	 - Uses memory more efficiently by loading only necessary parts of a job.
	 - Job execution is no limited by the size of physical memory. 
	 - Eliminates external fragmentation and minimizes internal fragmentation by combining segmentation and paging.
	 - Facilitates sharing of code and data without conflicts.
	 - Support unlimited multiprogramming
	 - Reduces costs and storage requirements of main memory by loading shared programs and subroutines on demand.