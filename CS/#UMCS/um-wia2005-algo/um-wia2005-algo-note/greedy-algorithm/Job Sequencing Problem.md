#algorithm #greedy-algorithm 
# Problem

Given a set of jobs where each job has a deadline and is associated with a profit if the job finishes within the deadline:

- Each job takes 1 unit of time.
- How to maximize the total profit if only one job can be scheduled at a time?

# Pseudocode

**SOLUTION**

1. Sort jobs in decreasing order of profit.
2. Initialize the result sequence with the first job in the sorted jobs.
3. For the rest of the jobs:
   - If the current job can fit into the result sequence without missing the deadline, add the current job to the list. Otherwise, ignore the current job (or start probing from `job.ddl` to locate the job on the deadline, allowing other jobs with shorter deadlines to be located).

# Implementation

```python
from typing import List, Tuple

class Job:
    def __init__(self, id, dur, ddl, profit):
        self.id = id
        self.dur = dur
        self.ddl = ddl
        self.profit = profit

def job_sequencing(jobs: List[Job]) -> Tuple[List[Job], int]:
    # Sort jobs by descending profit
    jobs.sort(key=lambda j: j.profit, reverse=True)

    # Find the maximum deadline to determine the size of the schedule
    max_deadline = max(job.ddl for job in jobs)
    # Create a schedule list initialized with None
    schedule = [None] * max_deadline

    total_profit = 0

    for job in jobs:
        # Find a free slot for this job (starting from the latest possible slot)
        for slot in range(min(job.ddl, max_deadline) - 1, -1, -1):
            if schedule[slot] is None:
                schedule[slot] = job
                total_profit += job.profit
                break

    selected_jobs = [job for job in schedule if job is not None]

    return selected_jobs, total_profit

def main():
    jobs = [
        Job(id="A", dur=1, ddl=2, profit=100),
        Job(id="B", dur=1, ddl=1, profit=20),
        Job(id="C", dur=1, ddl=2, profit=30),
        Job(id="D", dur=1, ddl=1, profit=25),
        Job(id="E", dur=1, ddl=3, profit=15)
    ]

    selected_jobs, total_profit = job_sequencing(jobs)
    print(f"Total profit: {total_profit}")
    for job in selected_jobs:
        print(f"Job {job.id}: deadline={job.ddl}, profit={job.profit}")

if __name__ == "__main__":
    main()
```

### Explanation:
- **Job Class:** Defines a job with `id`, `duration` (dur), `deadline` (ddl), and `profit`.
- **Job Sequencing Function:** 
  - Sorts the jobs in descending order of profit.
  - Finds the maximum deadline to determine the schedule size.
  - Creates a schedule list and iterates through the jobs to assign them to the latest possible slot before their deadline.
  - Returns the list of selected jobs and the total profit.
- **Main Function:** 
  - Defines a list of jobs.
  - Calls the job sequencing function.
  - Prints the total profit and details of selected jobs.