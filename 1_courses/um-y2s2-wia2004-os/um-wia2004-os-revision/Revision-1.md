# Chapter 5
 1. Define process, thread, deadlock and starvation
	 1. A process is an active program requiring resources such as a CPU and memory to execute.
	 2. A thread is the smallest unit of execution within a process that can run independently and concurrently with other threads.
	 3. <mark style="background: #FF5582A6;">Deadlock/ deadly embrace is a situation where multiple processes are unable to process because each is waiting indefinitely for resources held by the others.</mark>
	 4. <mark style="background: #FF5582A6;">***Starvation is a situation where a process waits indefinitely for resources that will never become available.***</mark>
	
1. <mark style="background: #FF5582A6;">What are the four conditions required for a deadlock to occur?</mark>
	1. Mutual Exclusion. A resource can only be held by a single process.
	2. Circular Wait. A chain of processes exist, where processes hold resources needed in the by the next process and wait for the resources held by the others.
	3. No preemption. Resources cannot be forcibly taken from the processes; they must be released voluntarily.
	4. Resource holding. Processes hold resources and wait for the resources held by the others.
	
2. <mark style="background: #FF5582A6;">**Describe six cases of deadlock?**</mark>
	1. File. Two or more processes hold file needed by the others and wait the others to release the file.
	2. Database. Two or more processes hold and lock the database while waiting for the others to unlock the database to access their data.
	3. Dedicated device allocation. Two or more processes hold the access to part of the devices and waits for the other to release theirs.
	4. Multiple device allocation. Two or more processes hold the access to devices and waits for the other to release theirs.
	5. Spooling. Spooling is a temporary storage, storing data before it is being processed. A deadlock can occur when multiple processes have filled up the spooling with incomplete data, but the device itself requires complete data to proceed.
	6. Disk sharing. Livelock can occur where multiple processes request to use the disk but none of them has actual control over the disk.
	
3. ***Explain how prevention work.***
	1. Prevention prevents deadlock by preventing one of the four factors that cause deadlock.
	2. Mutual exclusion cannot be eliminated to ensure exclusive use of the resources and thereby data integrity is maintained.
	3. Circular wait.
	4. No preemption can be avoided by allowing the OS to perform preemption.
	5. Resource holding can be avoided by.

5. ***Define safe state and unsafe state.***
	1. Safe state is a state where a safe sequence exists such that every processes in the ready queue can finally finish without a deadlock.
	2. Safe state is a state there there's no safe sequence and every processes cannot finish. A deadlock exists.
	
6. **What are the factors to be considered in victim selection?**
	1. CPU consume time. Jobs nearly complete usually won't be chosen as the victim.
	2. Job priority. Jobs with higher priority won't be chosen as the victim.
	
7. Describe the recovery algorithm to resolve a deadlock.
	1. Terminates all the running jobs. This approach costs significantly.
	2. Terminates only jobs involved in a deadlock. This approach costs less than the previous one.
	3. Terminates jobs involved in the deadlock one by one, and check for deadlock resolution after each to minimize the number of jobs affected.
	4. Prevent other jobs from entering and allows the current jobs to finish first.
	5. Preempt a non-deadlocked job to free it resources for the deadlocked jobs to finish first.
	6. Saves the state of a victim and hence the victim job can resume later rather than starts over,


# Correction-1
---
Define deadlock and starvation.
1. Define deadlock and starvation
	1. Deadlock or *deadly embrace* is a situation where multiple processes cannot proceed because each is waiting indefinitely for resources held by the others.
	2. Starvation is a situation where a process waits indefinitely for resources that will never become available, preventing it from executing.
2. What are the four conditions required for a deadlock to occur?
	1. Mutual exclusion. Only a single process can hold a resource at a time.
	2. ***Resource holding. Processes hold resources and waits for resources held by the others.***
	3. ***No preemption. Resources cannot be forcibly taken from a job before its completion; they must be released voluntarily.***
	4. Circular wait. A chain of processes exists where each process holds at least one resource needed by the next process and waits for resources held by others.
3. Describe six cases of deadlock?
   > simultaneously
   
	1. File request. Deadlocks can happen when multiple processes request and hold the ***file*** during their execution.
	2. Database. Deadlocks can happen when multiple processes ***request and lock*** the database during their execution. Locking, which ensures data integrity, can be applied to entire database, a table or a record. *sections or individual records*
	3. Dedicated device allocation. Deadlocks can happen when multiple processes request and hold a dedicated device during their execution.
	4. Multiple device allocation. Deadlocks can happen when multiple processes request and hold devices during their execution.
	5. Spooling. Spooling is a temporary storage for storing data that will be used (*and executed*) by devices later. Deadlock can happen when the spooling ( *system*) is filled with incomplete ~~data~~ *outputs* from multiple jobs, preventing ~~it to execute~~ (*the device from processing further*) because it requires complete data.
	6. Disk sharing. *A* Livelock can happen ~~when~~ where ~~two or more~~ processes are busy waiting for ~~the resources~~ a shared resource but never gains control of it, because they are *continuously* blocked by each other.
4. Explain how prevention work. 
	1. Prevention eliminates one of the four conditions necessary for a deadlock to occur.
	2. Mutual exclusion cannot be eliminated because some resources should be used exclusively.
	3. Resource holding can be avoided by ~~asking~~ *forcing* processes to request ~~for ~~all *required* resources ~~required~~ at the beginning.
	4. No preemption can be avoided by allowing the Operating System to perform preemption, that is, forcibly deallocates the resources from a job.
	5. Circular wait can be avoided by implementing a numbering system where resources should be requested in *a specific* order.
5. Define safe state and unsafe state.
	1. A safe state is a state where a safe sequence exists such that every process can finally finish without a deadlock.
	2. ~~An unsafe state is a state where there's no safe sequence and all process cannot finish. A deadlock occurs.~~ An unsafe state is a state where no safe sequence exists, risking deadlock and preventing all processes from completing.
6. What are the factors to be considered in victim selection?
	1. Job priority. Jobs with higher priority ~~usually will be~~ are usually spared.
	2. CPU time ~~consumption~~ consumed. Jobs near ~~their~~ completion typically ~~won't be chosen as the victim.~~ are usually not chosen as victims.
	3. Impact on other jobs. Consider how terminating a job would affect other running jobs.
7. Describe the recovery algorithm to resolve a deadlock.
	1. Terminate and restart all ~~the~~ active jobs. This has the highest operational cost.
	2. Terminates and restarts only the jobs involved in a deadlock. Lower operational cost than terminating all.
	3. Terminates and restarts job involved in a deadlock one at a time and check for deadlock resolution after each termination . This approach ~~aims to ~~minimizes the number of jobs affected.
	4. Use snapshots. Saves the process to its Process Control Block (PCB) and resumes it rather than restarts it. *Record the progress of terminated jobs*
	5. Preempts the non-deadlocked jobs and allocates their resources for deadlocked jobs to complete.
	   *Preempt resources from non-deadlocked jobs and allocate them to deadlocked processes.*
	6. Prevents new entries of jobs to allow non-deadlocked jobs to finish and release their resources, indirectly resolving the deadlock.