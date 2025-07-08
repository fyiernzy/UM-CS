**Define process, thread, deadlock and starvation.**
- **A process** is an active program requiring resources such as the CPU and registers to perform its function.
- **A thread** is the smallest unit of execution within a process, running independently and concurrently with other threads.
- **Deadlock** or *deadly embrace* is a situation where multiple processes cannot proceed because each is waiting indefinitely for resources held by the others.
- **Starvation** is a situation where a process waits indefinitely for resources that never become available, preventing it from executing.

**What are the four conditions required for a deadlock to occur?**
- **Mutual Exclusion**. Only one process can hold the resource at a time.
- **Resource holding**. Processes hold resources while waiting for resources held by others.
- **No preemption**. Resources cannot be forcibly taken from a process before its completion; they must be released voluntarily.
- **Circular wait**. A chain of processes exists where each process holds at least one resource needed by the next process and waits for resources held by others.

**Describe six cases of deadlock?**
> Deadlocks can happen when multiple processes/ jobs simultaneously `<action>` `<resource>` during their execution.

| cases                       | action           | resources          | Notes                                                                                                          |
| --------------------------- | ---------------- | ------------------ | -------------------------------------------------------------------------------------------------------------- |
| File requests               | request and hold | files              | -                                                                                                              |
| Databases                   | access and lock  | the database       | Locking, which ensures data integrity, can be applied to the entire database, sections, or individual records. |
| Dedicated device allocation | request and hold | a dedicated device | -                                                                                                              |
| Multiple device allocation  | request and hold | devices            | -                                                                                                              |

6. **Spooling**. Spooling is the temporary storage for storing data that will be used and executed by a device. Deadlock can happen if spooling system is filled with incomplete outputs from multiple jobs, preventing the device from processing further because it requires complete outputs.
7. **Disk sharing**. A livelock can occur where processes are busy waiting for a shared resource but never gains control of it, continuously getting blocked by each other.

**Explain how prevention works.**
**Prevention** eliminates one of the four necessary conditions for a deadlock to occur.
	1. **Mutual exclusion**. Cannot be eliminated because some resources must be used exclusively.
	2. **Resource holding**. Can be prevented by forcing jobs to request all required resources *(to run to its completion)* at the start.
	3. **No preemption**. Can be prevented by allowing the OS to forcibly deallocate resources from jobs.
	4. **Circular wait**. Can be prevented by prevents by using a numbering system where jobs request resources in a specific order.

**Define safe state and unsafe state.**
- A **safe state** is a state where a safe sequence exists that allows all processes to finish without deadlock.
- An **unsafe state** is a state where no safe sequence exists, risking deadlock and preventing all processes from completing.

**What are the factors to be considered in victim selection?**
1. **Priority of the job**. Higher priority jobs are typically spared.
2. **CPU time consumed**. Jobs near completion are usually not chosen as victims.
3. **Impact on other jobs**. Consider how terminating a job will affect other jobs in the system.

**Describe the recovery algorithm to resolve a deadlock.**
1. **Terminates and restarts all active jobs**. This has the highest operational cost.
2. **Terminates and restarts only deadlocked jobs.** Lower operational cost than terminating all jobs.
3. **Sequential termination**. Identify and terminate deadlocked jobs one at a time, checking for deadlock resolution after each termination to minimize affected jobs.
4. **Use of snapshots**. Record the progress of terminated jobs and resume them instead of restarting.
5. **Resource reallocation**. Preempt resources from non-deadlocked jobs and allocate them to deadlocked processes.
6. **Restrict new entries**. Prevent new jobs from entering the system to allow current non-deadlocked jobs to complete and free up resources, indirectly resolving the deadlock.