The principle of linearity of expectation states that the expected value of the sum of random variables is equal to the sum of their expected values, regardless of whether the random variables are independent.

Mathematically, if $X_1, X_2, \ldots, X_n$ are random variables, then:
$$E\left(\sum_{i=1}^{n} X_i\right) = \sum_{i=1}^{n} E(X_i)$$

This principle holds true even if the random variables are not independent.

**Example:**
Suppose you are flipping a fair coin 10 times, and let $X_i$ be an indicator random variable that is 1 if the $i$-th coin flip is heads and 0 otherwise. The total number of heads $X$ is the sum of these indicator variables:
$X = X_1 + X_2 + \ldots + X_{10}$

Using the linearity of expectation:
$E(X) = E(X_1 + X_2 + \ldots + X_{10}) = E(X_1) + E(X_2) + \ldots + E(X_{10})$

Since each coin flip is fair:
$E(X_i) = 0.5$

Thus:
$E(X) = 10 \times 0.5 = 5$
