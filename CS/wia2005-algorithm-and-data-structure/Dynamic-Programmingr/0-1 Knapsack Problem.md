## Knapsack Problem

The knapsack problem involves selecting a subset of items, each with a weight and a value, to include in a collection such that the total weight is less than or equal to a given limit, and the total value is as large as possible.

Let's say there is a thief robbing a store. He can only carry a maximum weight of `W` into his knapsack. Let's say, `W = 8`. There are `n` items (`n = 4`) available in the store, and the weight of the `i-th` item is `wi` and its profit is `vi`, as given in the table below.

### Classes and Data Structure

```python
from typing import List

class Item:
    def __init__(self, id, value, weight):
        self.id = id
        self.value = value
        self.weight = weight
```

### Dynamic Programming (DP) Approach

![[Pasted image 20240528114622.png]]
```python
def dp(items: List[Item], capacity: int):
    n = len(items)
    dp_table = [[0] * (capacity + 1) for _ in range(n + 1)]

    # Solving sub-problems
    for i in range(1, n + 1):
        item = items[i - 1]
        for j in range(1, capacity + 1):
            if item.weight > j:
                dp_table[i][j] = dp_table[i - 1][j]
            else:
                dp_table[i][j] = max(dp_table[i - 1][j], item.value + dp_table[i - 1][j - item.weight])

    # Make selection
    selected_items = []
    i, j = n, capacity
    while i > 0 and j > 0:
        if dp_table[i][j] != dp_table[i - 1][j]:
            selected_items.append(items[i - 1])
            j -= items[i - 1].weight
        i -= 1

    return selected_items
```

### Naive Recursive Approach

```python
def recursion(items: List[Item], n: int, W: int):
    if n == 0 or W == 0:
        return 0

    # The current item is not included
    if items[n - 1].weight > W:
        return recursion(items, n - 1, W)

    # If the current item is included, then make a comparison
    return max(
        recursion(items, n - 1, W),
        items[n - 1].value + recursion(items, n - 1, W - items[n - 1].weight)
    )
```

### Memoized Recursive Approach

```python
def memo(items: List[Item], n: int, W: int):
    # Memoization table
    memo_table = [[-1] * (W + 1) for _ in range(n + 1)]

    def r(items: List[Item], n: int, W: int, memo_table: List[List[int]]):
        if n == 0 or W == 0:
            return 0
        if memo_table[n][W] != -1:
            return memo_table[n][W]
        if items[n - 1].weight > W:
            memo_table[n][W] = r(items, n - 1, W, memo_table)
        else:
            memo_table[n][W] = max(
                r(items, n - 1, W, memo_table),
                items[n - 1].value + r(items, n - 1, W - items[n - 1].weight, memo_table)
            )

        return memo_table[n][W]

    return r(items, n, W, memo_table)
```

### Main Function

The `main` function demonstrates the use of the above approaches by creating a list of `Item` objects and finding the maximum value obtainable from a knapsack with a given capacity using each method.

```python
def main():
    items = [
        Item(1, 60, 10),
        Item(2, 100, 20),
        Item(3, 120, 30)
    ]

    capacity = 50
    print("DP Selected items:", [item.id for item in dp(items, capacity)])
    print("Recursion max value:", recursion(items, len(items), capacity))
    print("Memoization max value:", memo(items, len(items), capacity))

if __name__ == '__main__':
    main()
```

---

### Conclusion

- **Naive Recursive Solution**: This approach solves the subproblems repeatedly, leading to exponential time complexity.
- **Dynamic Programming**: This approach uses additional memory to store the solutions of subproblems, leading to a polynomial-time solution.
- **Memoized Recursive Solution**: This approach enhances the recursive solution by storing previously computed results, improving efficiency.