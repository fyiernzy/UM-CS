#dynamic-programming #algorithm 
# Introduction
There are three high-level problem-solving strategies:

1. **[[Divide and Conquer]]**: Breaks a problem into smaller, independent subproblems, solves each recursively, and combines their solutions.
   
2. **[[Greedy Algorithm]]**: Makes the locally optimal choice at each step, with the hope that it leads to a globally optimal solution.
   
3. **Dynamic Programming**: Solves subproblems, stores their solutions to avoid recomputation, and ensures a globally optimal solution by solving each subproblem optimally.

# Concept
To solve a problem using dynamic programming, the problem must have overlapping subproblems, meaning the same subproblems are solved multiple times (*subproblems share other subproblems.*)


![[Pasted image 20240528064050.png]]

Using the Fibonacci sequence as an example, the calculations of `fib(2)`, `fib(3)`, and larger Fibonacci numbers involve repeated calculations of smaller Fibonacci numbers, which can be expensive. For instance, `fib(3)` requires `fib(2)` and `fib(1)`, and `fib(2)` requires `fib(1)` and `fib(0)`. These overlapping subproblems result in redundant computations.

Dynamic programming avoids these redundant computations by storing the results of subproblems in a table and referring to this table before making any new calculations.

There are two types of dynamic programming:
1. Memoization (Top-Down approach)
2. Tabulation (Bottom-Up approach)

### Top-Down Approach (Memoization)
The top-down approach starts with the original problem and breaks it down into smaller subproblems recursively. Each subproblem's solution is stored (memoized) to avoid redundant calculations. 

> In this approach, we write the procedure recursively in a natural manner, but modify it to save the result of each subproblem (usually in an array or hash table).

- The procedure first checks whether it has previously solved the subproblem.
- If it has, it returns the saved value, avoiding further computation.
- If it has not, it computes the value in the usual manner and saves it for future use.
- This method leverages recursion and memoization to "remember" previously computed results.

### Bottom-Up Approach (Tabulation)
The bottom-up approach builds a table iteratively, starting from the smallest subproblems and solving them in order, ensuring all dependencies are resolved first.

- We create a table where the size depends on the number of subproblems.
- Subproblems are sorted by size and solved iteratively from the smallest to the largest.
- When solving a subproblem, all smaller subproblems it depends on have already been solved and stored.
- Each subproblem is solved only once, and its solution is saved in the table for future use.

### Example: Fibonacci Sequence
This is a Python code for implementing the Fibonacci sequence using recursion.
```python
def fib(n):
    if n == 0:
        return 0
    if n == 1:
        return 1
    return fib(n-1) + fib(n-2)
```

#### Top-Down (Memoization) Approach
```python
def fib(n):
    def f(n, memo):
        if n == 0:
            return 0
        if n == 1:
            return 1
        if memo[n] == 0:  # If there's no previously calculated result, calculate it
            memo[n] = f(n-1, memo) + f(n-2, memo)
        return memo[n]
    memo = [0] * (n + 1)
    return f(n, memo)

print(fib(6))
```

#### Bottom-Up (Tabulation) Approach
```python
def fib_dp(n):
    dp = [0, 1] + [0] * (n-1)
    for i in range(2, n+1):
        dp[i] = dp[i-1] + dp[i-2]
    return dp[n]
```

## Comparison
The Bottom-Up Approach (Tabulation) has a time complexity of $O(cN)$, where $c$ is the number of choices and $N$ is the constraint. This time complexity is called `pseudo-polynomial` because, in the worst-case scenario, where $c=n$, $N=n$, it becomes $O(n^2)$.

- **Bottom-Up Approach**
  - Iterative
  - Usually faster/ Better constant factors due to no overhead of recursive function calls
  - Does not risk `StackOverflowError` for large input sizes
    
- **Top-Down Approach**
  - Recursive
  - More intuitive for those familiar with recursion
  - Risks `StackOverflowError` for large input sizes

Asymptotically, both approaches guarantee the same time complexity, except in unusual circumstances where the top-down approach does not actually recurse to examine all possible subproblems.

## Examples of Dynamic Programming Problems
1. [[Fibonacci Numbers]]
2. [[Rod Cutting]]
3. [[0-1 Knapsack Problem]]

## References
---
1. [0/1 Knapsack problem | Dynamic Programming](https://www.youtube.com/watch?v=cJ21moQpofY)
2. [Bottom Up vs Top Down Dynamic Programming vs Recursion | Fibonacci Sequence](https://www.youtube.com/watch?v=M-NeO_9BU_A)
3. [Top-down vs Bottom-up Approach in Dynamic Programming](https://medium.com/enjoy-algorithm/top-down-vs-bottom-up-approach-in-dynamic-programming-53b917bfbe0)
4. [Pseudo-polynomial Algorithms](https://www.geeksforgeeks.org/pseudo-polynomial-in-algorithms/)
