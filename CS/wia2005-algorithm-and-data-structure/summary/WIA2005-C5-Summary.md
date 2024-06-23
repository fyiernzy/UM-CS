**Divide and Conquer** is a technique that involves three main steps:
1. **Divide**: Break down the problem into two or more smaller sub-problems of the same type
2. **Conquer**: Recursively solve each of these sub-problems
3. **Combine**: Merge the solutions of the sub-problems to form the solution to the original problem.

**Merge Sort**

**Randomized Quicksort**
- Running time is generally independent of input order due to random pivot selection
- No assumptions about input distribution are needed.
- Randomization reduces the likelihood of worst-case behavior.
- Worst case depends on random-number generator, not input order.

|                      | Recursive relation                                                                                                                                   |       Best Case        |      Average Case      |       Worst Case       |
| -------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- | :--------------------: | :--------------------: | :--------------------: |
| Merge Sort           | $T(n)=2T(n/2)+\Theta(n)$                                                                                                                             | $O(n\ \text{log}\ n)$  | $O(n\ \text{log}\ n)$  | $O(n\ \text{log}\  n)$ |
| Randomized Quicksort | Depends on splitting. <br>$T(n)=T(k)+T(n-k-1)+\Theta(n)$<br><br>Best case:<br>$T(n)=2T(n/2)+\Theta(n)$<br><br>Worst case:<br>$T(n)=T(n-1)+\Theta(n)$ | $O(n\ \text{log}\  n)$ | $O(n\ \text{log}\  n)$ |        $O(n^2)$        |

