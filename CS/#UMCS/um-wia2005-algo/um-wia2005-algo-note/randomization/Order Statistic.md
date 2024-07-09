#probability
- An order statistic refers to the position of a particular value in a sorted sample. 
- Specifically, the $k$-th order statistic is the $k$-th smallest value in the sample.

### Definition
Given a sample of $n$ data points $X_1, X_2, \ldots, X_n$, the order statistics are the sorted values of this sample. When these values are sorted in ascending order, we denote them as $X_{(1)}, X_{(2)}, \ldots, X_{(n)}$, where:
- $X_{(1)}$ is the smallest value (the 1st order statistic).
- $X_{(2)}$ is the second smallest value (the 2nd order statistic).
- $\ldots$
- $X_{(n)}$ is the largest value (the $n$-th order statistic).

### Examples
#### 1. Simple Example with a Small Data Set

Consider a sample of 5 data points: $3, 1, 4, 1, 5$.

1. **Sort the data**: The sorted values are $1, 1, 3, 4, 5$.
2. **Order statistics**:
   - The 1st order statistic $X_{(1)}$ is 1.
   - The 2nd order statistic $X_{(2)}$ is 1.
   - The 3rd order statistic $X_{(3)}$ is 3.
   - The 4th order statistic $X_{(4)}$ is 4.
   - The 5th order statistic $X_{(5)}$ is 5.

#### 2. Median Example
The median of a sample is a specific order statistic. For an odd number of data points, the median is the $\left(\frac{n+1}{2}\right)$-th order statistic. For an even number of data points, the median is typically the average of the $\left(\frac{n}{2}\right)$-th and $\left(\frac{n}{2}+1\right)$-th order statistics.

**Example**: Consider the sample $7, 2, 5, 9, 1$.
1. **Sort the data**: The sorted values are $1, 2, 5, 7, 9$.
2. **Median**:
   - For 5 data points (odd number), the median is the 3rd order statistic, which is 5.

#### 3. Percentiles Example

Percentiles are also order statistics. The 25th percentile (first quartile) is the value below which 25% of the data falls, which corresponds to the $\left(0.25 \times (n+1)\right)$-th order statistic (for large $n$).

**Example**: Consider the sample $4, 8, 15, 16, 23, 42$.

1. **Sort the data**: The sorted values are $4, 8, 15, 16, 23, 42$.
2. **25th percentile**:
   - Calculate the position: $0.25 \times (6+1) = 1.75$.
   - Interpolate between the 1st and 2nd order statistics: $4 + 0.75 \times (8 - 4) = 4 + 3 = 7$.

### Application in Algorithms

Order statistics are crucial in various algorithms, such as:
- **Quickselect Algorithm**: This algorithm is used to find the $k$-th smallest element in an unordered list, with an average-case time complexity of $O(n)$.
- **Median of Medians**: An algorithm that guarantees finding the median in linear time $O(n)$, useful in deterministic selection algorithms.