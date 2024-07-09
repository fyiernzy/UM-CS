# Q1
### a) The Concept of Greedy Algorithm

- A greedy algorithm is a problem-solving approach that makes a series of choices, each of which looks the best at that moment. 
- It doesn't reconsider these choices even if they lead to a suboptimal solution. 
- Instead, it focuses on finding a quick and easy solution that is locally optimal with the hope that these local solutions will lead to a globally optimal solution. 
- Greedy algorithms are typically used in optimization problems where a sequence of decisions is required, and they aim to find the best overall solution by making the best choice at each step.

### b) Optimization

- Optimization refers to the process of making something as effective or functional as possible.
- In computational contexts, it usually means finding the best solution to a problem from a set of possible solutions. 
- This could involve maximizing or minimizing a particular objective, such as cost, profit, time, or efficiency.

### c) How Greedy Algorithms Resolve Optimization Problems

Greedy algorithms can be effective in solving certain optimization problems, particularly when the problem exhibits the "greedy choice property" and "optimal substructure":

- **Greedy Choice Property**: This means that a locally optimal choice made at each step leads to a globally optimal solution. <mark style="background: #FFB86CA6;">If choosing the best option available at each step always results in the best overall solution, then a greedy algorithm is suitable.</mark>
  
- **Optimal Substructure**: This implies that an optimal solution to the problem contains optimal solutions to its subproblems. In other words, the problem can be broken down into smaller, similar problems, and solving these smaller problems optimally leads to an optimal solution to the overall problem.

Greedy algorithms are straightforward and efficient because they reduce the problem-solving process to a series of simple decisions. However, they don't always guarantee the best solution for every optimization problem. They work well when the problem's structure ensures that making the best local choice at each step results in the best global outcome. Examples of problems where greedy algorithms are effective include:

- **Minimum Spanning Tree**: Finding the shortest path to connect all nodes in a graph.
- **Huffman Coding**: Creating the most efficient prefix-free code for data compression.
- **Activity Selection**: Selecting the maximum number of activities that don't overlap.

In summary, greedy algorithms resolve optimization problems by making a sequence of locally optimal choices with the expectation that these will lead to a globally optimal solution, provided the problem's structure supports this approach.

# Q4
1. **Start from the root node.**
2. **At each step, move to the child node with the largest value.**
3. **Continue this process until reaching a leaf node.**

This approach aims to maximize the sum at each level by always selecting the locally optimal choice (the largest value among the children nodes).

### Tree Structure

```
        5
      /   \
     6     7
    / \   / \
   2   8 4   3
  /       / \
 9       1   1
```

### Step-by-Step Application

1. **Start at the root node:** 5
2. **Children of 5:** 6, 7
   - Select the largest: 7
3. **Children of 7:** 4, 3
   - Select the largest: 4
4. **Children of 4:** 1, 1
   - Both are equal, select either: 1

### Path and Sum Calculation

- Path: 5 → 7 → 4 → 1
- Sum: 5 + 7 + 4 + 1 = 17

Thus, following the greedy algorithm, the largest sum we can obtain is **17**. The path taken is 5 → 7 → 4 → 1.