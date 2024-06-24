The $i$-th **order statistic** of a set of $n$ elements is the $i$-th smallest element.

A **random variable** is a variable that specifies the range of the probability distribution.

An **expected value** of a random variable, $E(X)$, is a measure of the center of its distribution. Given discrete random variable $X$ with values $x_{1},x_{2},\ldots,x_{n}$ and corresponding probabilities  $p_{1},p_{2},\ldots,p_{n}$, the expected value $E(X)$ is given by:

$$E(X)=\sum_{i=1}^{n} x_{i}p_{i}$$

An **indicator random variable (IRV)** is a type of random variable that takes the value 1 if a certain event occurs and 0 otherwise.

A **randomized algorithm** is an algorithm that uses random numbers at some point to make decision. This ensures the algorithm behaves well on average.

**Principle of Linearity of Expectation** states that the expected value of the sum of random variables equals the sum of their expected values, regardless of whether the random variables are independent. Mathematically, 
$$E\left(\sum_{i=1}^{n} x_{i}p_{i}\right)=\sum_{i=1}^{n} E\left(x_{i}p_{i}\right)$$




RANDOMIZED-SELECT
![[randomized-select-pseudocode.png]]

![[Pasted image 20240623102209.png]]
Given the array $[1, 2, 3, 4, 5, 6,7, 8]$,
- $k$ is a random number indicating the pivot. 
- $n$ is the total number of elements in the array

| $k$ | $k - 1$ | $n - k$ | $max(k-1,n-k)$ |
| --- | ------- | ------- | -------------- |
| 1   | 0       | 7       | 7              |
| 2   | 1       | 6       | 6              |
| 3   | 2       | 5       | 5              |
| 4   | 3       | 4       | 4              |
| 5   | 4       | 3       | 4              |
| 6   | 5       | 2       | 5              |
| 7   | 6       | 1       | 6              |
| 8   | 7       | 0       | 7              |

And,
$$\lceil\frac{n}{2}\rceil=\lceil\frac{8}{2}\rceil=4$$

Therefore, it is shown that $T(4), T(5),\ldots,T(7)$ appear twice.