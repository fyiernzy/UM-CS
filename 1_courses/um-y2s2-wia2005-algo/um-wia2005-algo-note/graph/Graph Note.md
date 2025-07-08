# [[Minimum Spanning Tree]]
**Kruskal's algorithm**
- Kruskal's algorithm involves finding all the edges of a graph, listing them in the form $\langle \text{from, to, cost} \rangle$, and then sorting these edges by cost. 
- Finding all edges takes $O(E)$ time, while sorting them takes $O(E\ \log\ E)$ using an efficient sorting algorithm.
- For dense graphs, manually identifying and sorting edges can be time-consuming due to the large number of edges.

**Prim's algorithm**
- Prim's algorithm, including both its lazy and eager versions, starts from a source vertex and adds all its adjacent edges to a priority queue. 
- It then repeatedly extracts the edge with the lowest cost from the queue, adds the corresponding vertex to the MST, and includes all edges of this vertex that connect to vertices not yet in the MST. This process continues until all vertices are included in the MST. 
- The eager version of Prim's algorithm uses the concept of relaxation, similar to what is done in shortest path algorithms. 
- *Relaxing an edge $(u, v)$ involves checking whether the known shortest path to $v$ can be improved by including $u$. If this is the case, the cost and the predecessor of $v$ are updated.*

# Single Source Shortest Path
---
Single Source Shortest Path (SSSP) algorithm finds the shortest paths from a selected source vertex to all other vertices in a graph.

![[Pasted image 20240617112018.png]]

## Dijkstra's algorithm
- Dijkstra's (pronounced "D-ijk-stra") algorithm efficiently finds the shortest path in graphs with non-negative edge weights. 
- The algorithm initializes the cost to reach all vertices as infinity (`inf`), except for the source vertex, which is set to zero.
- Starting from the source, the algorithm "relaxes" the neighboring vertices by updating their costs if a shorter path is found.
- Relaxation checks if the current known cost to a vertex $v$ ($v.\text{cost}$) is greater than the cost to reach an adjacent vertex $u$ plus the edge weight $w(u, v)$. 
- If $v.\text{cost} > u.\text{cost} + w(u, v)$, then $v.\text{cost}$ is updated to $u.\text{cost} + w(u, v)$. 
- This process is repeated for all vertices, typically using a priority queue to efficiently select the next vertex with the smallest tentative cost.

## Bellman-Ford Algorithm
The Bellman-Ford algorithm is more versatile and can handle graphs with ***negative edge weights*** and ***detect negative weight cycles***. It also uses the relaxation technique ($RELAX(u,v,w)$) but iterates through all edges of the graph multiple times.

The Bellman-Ford algorithm performs $|V| - 1$ iterations, where $|V|$ is the number of vertices in the graph. In each iteration, it relaxes all edges. This guarantees that the shortest path to each vertex is found, even in the presence of negative edge weights.

![[Pasted image 20240617111812.png]]

The reason for $|V| - 1$ iterations is that the longest possible path without cycles in a graph with $|V|$ vertices has at most $|V| - 1$ edges. Thus, by relaxing all edges $|V| - 1$ times, the algorithm ensures that the shortest path to each vertex is correctly computed.

If a vertex's cost can still be updated after $|V| - 1$ iterations, it indicates the presence of a negative weight cycle, as the cost should not change if all shortest paths have been correctly found.

![[Pasted image 20240617120706.png]]

Dijkstra's algorithm cannot handle graphs with negative edge weights because it assumes that once a vertex's shortest path is found, it does not need to be updated. Negative edge weights can invalidate this assumption, leading to incorrect results.

In this case, Dijkstra's algorithm will stop at `[0] - [2]`, but Bellman-Ford algorithm will still consider `[0] - [1] - [2]`, allowing the correct result.

## Key Differences

- **Dijkstra's Algorithm**:
  - Suitable for graphs with non-negative edge weights.
  - Uses a priority queue for efficient vertex selection.
  - Cannot handle negative edge weights.

- **Bellman-Ford Algorithm**:
  - Can handle graphs with negative edge weights and detect negative weight cycles.
  - Iterates $|V| - 1$ times through all edges.
  - More computationally intensive compared to Dijkstra's algorithm.

# All-pairs Shortest Path algorithm
---
As opposed to the Single Source Shortest Path algorithm which you only know the shortest from a selected source to any other vertex, running a All-Pairs Shortest Path algorithm will give you the shortest path from any chose vertex to any other vertex. Due to its comprehensiveness, its time complexity will usually be much higher than Single Source Shortest Path Algorithm.

In more formal langue, it is states that:
> For every pair of vertices $(u,v) \in G.V$, a shortest (least-weight) path from $u$ to $v$ is determined, where the weight of a path is the sum of the weights of its constituent edges. 

![[Pasted image 20240617114314.png]]
If you have understanded how a [[Dynamic Programming]] works, the Floyd-Warshall algorithm will be easier to comprehend. The key is to understand what does $d_{ij},\ d_{ik},\ d_{kj}$ means in this context.

```bash
[0] - [1] - [2] - [4]
	   |
	  [3]
```
- $i$ means "from".
- $k$ means "mid"
- $j$ means "to".

It has a concept that, for every and any two vertices, there are only two ways to connect them, either directly from $i$ to $j$, or with the help of $k$ such that $i \Rightarrow j \Rightarrow k$. Consider the graph, `[0]` can directly connect to `[1]`, but it cannot directly connect to `[2]`. However `[0]` can connect to `[2]` such that `[0] - [1] - [2]`.

Similar to [[0-1 Knapsack Problem]], we have to choose the optimal solution at each stage. So when there are more than one way to go from $v_i$ to $v_k$, we have to make decision, using the formula $min(d_{ij},\ d_{ik} + d_{kj})$.

It is worth noting that $d_{ij}$ doesn't necessary means $v_i$ is directly connected to $v_j$, but it refers to the current value in the cell.

Floyd-Warshall Algorithm has time complexity of $O(V^3)$. You might wonder: A DP table is only 2 dimensional, which should be only $O(V^2)$, where's the $V^3$? This is because we have three variables here: $i,\ j,\ k$. It is true that we'll need $V^2$ for updating the table, but we also need to use different vertex as the `mid`. Hence, we have to iterate through every $v \in V$. 

![[Pasted image 20240617115712.png]]

# All-Pairs Shortest Path Algorithm
---
As opposed to the Single Source Shortest Path algorithm, which only finds the shortest paths from a selected source to all other vertices, running an All-Pairs Shortest Path algorithm will determine the shortest path between every pair of vertices in the graph. Due to its comprehensiveness, its time complexity is usually much higher than that of a Single Source Shortest Path algorithm.

In more formal language, it states that:
> For every pair of vertices $(u,v) \in G.V$, the algorithm finds the shortest (least-weight) path from $u$ to $v$, where the weight of a path is the sum of the weights of its constituent edges.

![[Pasted image 20240617114314.png]]


If you understand dynamic programming, the Floyd-Warshall algorithm will be easier to comprehend. The key is to understand what $d_{ij}$, $d_{ik}$, and $d_{kj}$ mean in this context.

```bash
[0] - [1] - [2] - [4]
       |
      [3]
```
- $i$ means "from".
- $k$ means "through".
- $j$ means "to".

The concept is that for any two vertices, there are two ways to connect them: either directly from $i$ to $j$, or through an intermediate vertex $k$ such that $i \rightarrow k \rightarrow j$. For example, `[0]` can directly connect to `[1]`, but it cannot directly connect to `[2]`. However, `[0]` can connect to `[2]` through `[1]` as `[0] - [1] - [2]`.

Similar to the 0-1 Knapsack Problem, we choose the optimal solution at each stage. When there is more than one way to go from $v_i$ to $v_j$, we use the formula $\text{min}(d_{ij}, d_{ik} + d_{kj})$ to decide.

It is important to note that $d_{ij}$ doesn't necessarily mean $v_i$ is directly connected to $v_j$; it refers to the current shortest known path from $i$ to $j$.

The Floyd-Warshall Algorithm has a time complexity of $O(V^3)$. You might wonder: if the dynamic programming table is only 2-dimensional, shouldn't it be $O(V^2)$? The $O(V^3)$ complexity arises because we have three nested loops iterating over the vertices $i$, $j$, and $k$. ***We perform $V^2$ operations for each possible intermediate vertex $k$,*** resulting in a total time complexity of $O(V^3)$.

# Reference
---
1. [第九章：4 负权边和Bellman-Ford算法](https://www.youtube.com/watch?v=1yQ_QD6UAXI)
2. [Shortest Path Algorithms Explained (Dijkstra's & Bellman-Ford)](https://www.youtube.com/watch?v=j0OUwduDOS0&t=1s)
3. [Dijkstra's Algorithm: Another example](https://www.youtube.com/watch?v=5GT5hYzjNoo)
