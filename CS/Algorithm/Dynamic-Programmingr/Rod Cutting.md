## Rod Cutting Problem

Examines the problem of cutting a rod into rods of smaller length in a way that maximizes their total value. Given a rod of length `n` inches and a table of prices `pi` for $i = 1, 2, 3, …, n$, determine the maximum revenue $r_n$ obtainable by cutting up the rod and selling the pieces. Note that if the price $p_n$ for a rod of length `n` is large enough, an optimal solution may require no cutting at all.

### Classes and Data Structure

```python
from typing import List

class Cut:
    def __init__(self, length, price):
        self.length = length
        self.price = price
```

### Dynamic Programming Approach
![[Pasted image 20240528114248.png]]
```python
def rod_cutting_dp(cuts: List[Cut], rod_length: int):
    num_cuts = len(cuts)
    dp_table = [[0] * (rod_length + 1) for _ in range(num_cuts + 1)]

    for i in range(1, num_cuts + 1):
        current_cut = cuts[i - 1]
        for j in range(rod_length + 1):
            if current_cut.length > j:
                dp_table[i][j] = dp_table[i - 1][j]
            else:
                dp_table[i][j] = max(
                    dp_table[i - 1][j],
                    current_cut.price + dp_table[i - 1][j - current_cut.length]
                )

    selected_cuts = []
    i, j = num_cuts, rod_length
    max_value = 0
    while i > 0 and j > 0:
        if dp_table[i][j] != dp_table[i - 1][j]:
            selected_cuts.append(cuts[i - 1])
            j -= cuts[i - 1].length
            max_value += cuts[i - 1].price
        i -= 1

    return selected_cuts, max_value
```

### Recursive Approach

```python
def rod_cutting_recursion(cuts: List[Cut], max_rod_length: int):
    def recursion(cuts: List[Cut], n: int, remaining_length: int):
        if n == 0 or remaining_length == 0:
            return 0
        if cuts[n - 1].length > remaining_length:
            return recursion(cuts, n - 1, remaining_length)
        return max(
            recursion(cuts, n - 1, remaining_length),
            cuts[n - 1].price + recursion(cuts, n - 1, remaining_length - cuts[n - 1].length)
        )

    return recursion(cuts, len(cuts), max_rod_length)
```

### Memoized Recursive Approach
![[Pasted image 20240528114237.png]]

```python
def rod_cutting_memo(cuts: List[Cut], max_rod_length: int):
    memo = [[-1] * (max_rod_length + 1) for _ in range(len(cuts) + 1)]

    def recursion(cuts: List[Cut], n: int, remaining_length: int, memo):
        if n == 0 or remaining_length == 0:
            return 0

        if memo[n][remaining_length] != -1:
            return memo[n][remaining_length]

        if cuts[n - 1].length > remaining_length:
            memo[n][remaining_length] = recursion(cuts, n - 1, remaining_length, memo)
        else:
            memo[n][remaining_length] = max(
                recursion(cuts, n - 1, remaining_length, memo),
                cuts[n - 1].price + recursion(cuts, n - 1, remaining_length - cuts[n - 1].length, memo)
            )

        return memo[n][remaining_length]

    return recursion(cuts, len(cuts), max_rod_length, memo)
```

### Main Function

```python
def main():
    cuts = [
        Cut(length=1, price=1), Cut(length=2, price=5),
        Cut(length=3, price=8), Cut(length=4, price=9),
        Cut(length=5, price=10), Cut(length=6, price=17),
        Cut(length=7, price=17), Cut(length=8, price=20),
        Cut(length=9, price=24), Cut(length=10, price=30),
    ]

    selected_cuts, max_value = rod_cutting_dp(cuts, 4)
    print(f"Maximum Value: {max_value}")
    print("Selected Cuts:")
    for cut in selected_cuts:
        print(f"Length: {cut.length}, Price: {cut.price}")

    print("Max recursion value = ", rod_cutting_recursion(cuts, 4))
    print("Max memo value = ", rod_cutting_memo(cuts, 4))

if __name__ == '__main__':
    main()
```

![[Pasted image 20240528114217.png]]![[Pasted image 20240528114643.png]]