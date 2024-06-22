#algorithm #greedy-algorithm 
# Problem
- Our first example is the problem of scheduling several competing activities that require exclusive use of a common resource, with the goal of selecting a maximum-size set of mutually compatible activities. 
  
- Suppose we have a set $S = \{a_1, a_2, \ldots, a_n\}$ of $n$ proposed activities that wish to use a resource, such as a lecture hall, which can serve only one activity at a time. 
  
- Each activity $a_i$ has a start time $s_i$ and a finish time $f_i$, where $0 \leq s_i < f_i \leq \infty$. 

- If selected, activity $a_i$ takes place during the half-open time interval $[s_i, f_i)$. 
  
- Activities $a_i$ and $a_j$ are compatible if the intervals $[s_i, f_i)$ and $[s_j, f_j)$ do not overlap. That is, $a_i$ and $a_j$ are compatible if $s_i \geq f_j$ or $s_j \geq f_i$. 
  
- In the activity-selection problem, we wish to select a maximum-size subset of mutually compatible activities. We assume that the activities are sorted in monotonically increasing order of finish time:
  $f_1 \leq f_2 \leq f_3 \leq \ldots \leq f_{n-1} \leq f_n.$


# Pseudocode
![[Pasted image 20240527124440.png]]

# Implementation
```python
from typing import List

class Activity:
    def __init__(self, id, st, et):
        self.id = id
        self.st = st
        self.et = et

def activity_selection(activities: List[Activity]):
    activities.sort(key=lambda a: a.et)
    approved = []
    approved.append(activities[0])
    for i in range(1, len(activities)):
        if activities[i].st >= approved[-1].et:
            approved.append(activities[i])
    return approved

def main():
    activities = [
        Activity(id=1, st=1, et=4),
        Activity(id=2, st=3, et=5),
        Activity(id=3, st=0, et=6),
        Activity(id=4, st=5, et=7),
        Activity(id=5, st=3, et=9),
        Activity(id=6, st=5, et=9),
        Activity(id=7, st=6, et=10),
        Activity(id=8, st=8, et=11),
        Activity(id=9, st=8, et=12),
        Activity(id=10, st=2, et=14),
        Activity(id=11, st=12, et=16),
    ]
    selected_activities = activity_selection(activities)
    for activity in selected_activities:
        print(
            f"Activity {activity.id}: start={activity.st}, end={activity.et}")
            
if __name__ == "__main__":
    main()
```
