### Memoized Recursive Approach

```python
def fib_memo(n):
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
```

### Dynamic Programming Approach

```python
def fib_dp(n):
    dp = [0, 1] + [0] * (n-1)

    for i in range(2, n+1):
        dp[i] = dp[i-1] + dp[i-2]

    return dp[n]
```

### Main Function to Test Both Approaches

```python
print(fib_memo(6))
print(fib_dp(6))
```

### Conclusion

- **Memoized Recursive Approach**: This approach uses a memoization table to store previously computed Fibonacci numbers to avoid redundant calculations, improving efficiency.
  
- **Dynamic Programming Approach**: This approach uses a bottom-up approach to build the Fibonacci sequence iteratively, storing each computed value in an array and returning the final result.