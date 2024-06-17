- Probabilistic analysis is a technique used to evaluate the performance of an algorithm by <mark style="background: #FFB86CA6;">considering the likelihood of various inputs and their corresponding outcomes.</mark> 
- Instead of analyzing the worst-case scenario, probabilistic analysis focuses on the expected behavior of an algorithm over all possible inputs, weighted by their probabilities.

**Example:**
Consider the `QuickSort` algorithm. While its worst-case time complexity is $O(n^2)$, probabilistic analysis shows that, on average, it runs in $O(n \log n)$ time. This average-case complexity is determined by considering all possible input permutations and their probabilities.




### Summary

- **Probabilistic Analysis:** A method to analyze the expected performance of an algorithm by considering all possible inputs and their probabilities.
- **Randomized Algorithm:** An algorithm that incorporates random decisions to improve performance, avoid worst-case scenarios, or simplify implementation.
- **Principle of Linearity of Expectation:** The expected value of the sum of random variables equals the sum of their expected values, regardless of their independence.

These concepts are fundamental in designing and analyzing efficient algorithms, particularly in cases where deterministic approaches might be less effective or harder to analyze.