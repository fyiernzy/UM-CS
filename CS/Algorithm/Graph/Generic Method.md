In the context of algorithms, a "generic method" is a high-level framework for solving a problem, adaptable to various specific instances. The term "generic" means the method is broadly applicable and not tied to a specific data type, structure, or problem instance.

A generic method in algorithms usually has the following characteristics:

1. **Abstraction**: The method abstracts away from specific instances, making it applicable to a wide range of problems.
2. **Parameterization**: It can take parameters to adapt to different instances or variations of the problem.
3. **Reusability**: Its general nature allows it to be reused across multiple applications, reducing the need for new algorithms.
4. **Framework for Specialization**: The method provides a framework that can be specialized or extended for specific requirements or optimizations.

### Examples of Generic Methods

1. **Sorting Algorithms**: Algorithms like [[QuickSort]] or [[MergeSort]] can be applied to any list or array of comparable elements.
   
2. **Graph Algorithms**: Algorithms like Dijkstra's or Prim's work on any weighted graph, regardless of the specific nature of the vertices and edges.
   
3. **Divide and Conquer**: This method involves dividing a problem into smaller subproblems, solving them independently, and combining their solutions. It is used in algorithms like [[MergeSort]], [[QuickSort]], and binary search.
   
4. **Dynamic Programming**: This method solves problems by breaking them into simpler subproblems and storing their results to avoid redundant computations. It is used in optimization problems like the knapsack problem, shortest path algorithms, and sequence alignment in bioinformatics.
   
5. **Greedy Algorithms**: This method builds solutions incrementally by making the best choice at each step. Prim's and Kruskal's algorithms for MSTs and Dijkstra's shortest path algorithm use a greedy approach.