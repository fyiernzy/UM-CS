# Question 1
**Explain what a graph is and discuss the two most common ways to represent a graph in computer science.**

A graph is a data structure consisting of a set of vertices $V$ and a set of edges $E$ that connect pairs of vertices.

The two most common ways to represent a graph in computer science are the adjacency matrix and the adjacency list.

**Adjacency Matrix:**

An adjacency matrix is a 2-dimensional matrix of size $|V| \times |V|$, where $|V|$ is the number of vertices. The cell at row $i$ and column $j$ represents the presence (or weight) of an edge from vertex $i$ to vertex $j$. For example:

```
     1  2  3
  ----------
1 | 0  1  0
2 | 1  0  1
3 | 1  0  0
```

In this matrix, a '1' indicates the presence of an edge, and a '0' indicates no edge. Here, vertex 1 is connected to vertex 2, vertex 2 is connected to vertices 1 and 3, and vertex 3 is connected to vertex 1. This represents a directed, cyclic graph.

**Adjacency List:**

An adjacency list uses an array of lists. The array has a size of $|V|$, where each index represents a vertex. Each entry in the array points to a list of adjacent vertices (neighbors). For example:

```
1 -> 2
2 -> 1 -> 3
3 -> 1
```

This adjacency list shows that vertex 1 is connected to vertex 2, vertex 2 is connected to vertices 1 and 3, and vertex 3 is connected to vertex 1. The space complexity of an adjacency list is $O(V + E)$, where $E$ is the number of edges.

In a free tree (a connected, acyclic graph), the size of an adjacency list will be $2V - 1$.

# Question 3
#### Depth-First Search (DFS)

1. **Maze and Puzzle Solving:**
   - **Example:** In a maze-solving application, DFS can be used to explore all possible paths from the start to the end point. It dives deep into one path before backtracking, which is effective for puzzles where all solutions need to be explored before finding the optimal one.

2. **Topological Sorting:**
   - **Example:** In scheduling tasks or resolving dependencies in software package installations, DFS helps perform topological sorting. It ensures that tasks are executed in the correct order, respecting dependencies.

3. **Connected Components:**
   - **Example:** In social network analysis, DFS can be used to find all connected components in an undirected graph. This helps in identifying isolated groups of people or clusters within the network.

#### Breadth-First Search (BFS)

1. **Shortest Path in Unweighted Graphs:**
   - **Example:** BFS is used in applications like GPS navigation systems to find the shortest path between two locations in an unweighted road network.

2. **Web Crawling:**
   - **Example:** In web search engines, BFS can be used for web crawling, where the algorithm systematically visits and indexes web pages starting from a given URL, ensuring that all reachable pages are visited level by level.

3. **Social Network Connections:**
   - **Example:** BFS can determine the degree of connection between individuals in a social network (e.g., finding the shortest path between two users on platforms like LinkedIn).

### Classical Algorithm Problems Solved Using DFS/BFS

1. **Cycle Detection:**
   - **Problem:** Detecting cycles in a graph to determine if there is a circular dependency.
   - **Solution:** Both DFS and BFS can be used to detect cycles. DFS is often preferred for its straightforward implementation in directed graphs.

2. **Finding Bridges and Articulation Points:**
   - **Problem:** Identifying critical connections (bridges) and nodes (articulation points) in a network that, if removed, would increase the number of connected components.
   - **Solution:** DFS is commonly used in algorithms to find bridges and articulation points.

3. **Bipartite Graph Checking:**
   - **Problem:** Checking if a graph is bipartite (i.e., its vertices can be divided into two disjoint sets such that no two vertices within the same set are adjacent).
   - **Solution:** BFS is typically used for bipartite checking by attempting to color the graph using two colors while ensuring no two adjacent vertices share the same color.

# Question 5
**Define topological sorting and explain its significance in directed acyclic graphs (DAGs). Provide several examples of a real-world scenario where topological sorting is useful.**

Topological sorting is an algorithm used to order the vertices of a Directed Acyclic Graph (DAG) such that for any directed edge $(v, u)$, vertex $v$ comes before vertex $u$ in the ordering.

It is significant in resolving dependencies between vertices and ensuring that their order is aligned correctly. This is crucial in scenarios where certain tasks must precede others.

**Real-World Examples:**

1. **Software Package Installation:**
   - Ensures that software packages are installed in the correct order based on their dependencies, preventing errors during installation.

2. **Course Prerequisites:**
   - Arranges the sequence of courses in a curriculum where certain courses must be completed before others, ensuring a logical learning progression.

3. **Project Management:**
   - Schedules tasks in a project where certain tasks depend on the completion of others, helping to manage project timelines effectively.

4. **Build Systems:**
   - In software development, topological sorting helps in determining the order in which source code files should be compiled, based on their dependencies.

5. **Job Scheduling:**
   - Allocates jobs in a multi-step process where certain jobs must be completed before others, optimizing workflow.

6. **Event Planning:**
   - Organizes events where specific preparations must be completed in a particular order, ensuring a smooth execution.

By using topological sorting, these processes can be managed efficiently, ensuring that all dependencies are respected and tasks are completed in the correct sequence.