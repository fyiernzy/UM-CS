#algorithm #sort #topology #graph
# Introduction
A topological sort of a Directed Acyclic Graph (DAG) is a linear ordering of vertices such that for every directed edge $(u, v)$, vertex $u$ comes before $v$ in the ordering.

There are two types of implementations:
1. Depth First Search (DFS)
2. Kahn’s Algorithm

## DFS
Topological sort aims to place vertices with an `out_degree` of 0 at the end. DFS is suitable because it starts with vertices with `in_degree` of 0, meaning vertices with no predecessors, and explores all their neighbors until such vertices are found.

Here's a simple DFS implementation for topological sort:
```python
stack = []
def dfs(current_vertex):
    for neighbor in current_vertex.neighbors:
        dfs(neighbor)
    stack.append(current_vertex)

```

In this implementation, we append `neighbor` before `current_vertex` because `neighbor` depends on `current_vertex` in an acyclic graph.

However, this code has a critical flaw: it doesn't account for already visited vertices. Consider the following adjacency list:

```
[1] -> [2] -> [3]
[2] -> [3]
```

Both $V(1)$ and $V(2)$ are connected to $V(3)$. This would result in $V(3)$ being output twice, which is undesirable. Therefore, we must track if a vertex has been visited before.

```python
stack = []
visited = initialize_visited()
def dfs(current_vertex):
    for neighbor in current_vertex.neighbors:
        if not visited[neighbor]:
            dfs(neighbor)
    stack.append(current_vertex)
```

This is almost complete! Let's finalize the code with some additional details:

```python
def topology_sort_dfs(graph: UnweightedDirectedGraph):
    visited = {}

    vertex = graph.head
    while vertex:
        visited[vertex] = False
        vertex = vertex.next

    stack = []

    def helper(vertex, stack, visited):
        visited[vertex] = True
        edge = vertex.edge
        while edge:
            next_vertex = edge.dst
            if not visited[next_vertex]:
                helper(next_vertex, stack, visited)
            edge = edge.next
        stack.append(vertex)

    vertex = graph.head
    while vertex:
        if not visited[vertex]:
            helper(vertex, stack, visited)
        vertex = vertex.next

    if len(stack) != len(visited):
        return False

    return stack[::-1]
```

Here, I used `GRAPH3`, which I created earlier. The source code can be found in the [[Graph]] module. If you are using an adjacency list or adjacency matrix, some implementation details might need to be adjusted accordingly.

After defining our `dfs` method, we must traverse all nodes to ensure none are missed because there might be more than one vertex with an `in_degree` of 0. The current DFS algorithm cannot detect cycles, so further amendments are required.

## Kahn's Algorithm
Kahn's Algorithm uses a queue instead of a stack and iteration instead of recursion. It can detect cycles in a graph. While it uses more memory than DFS, it is faster and more scalable since it avoids the overhead of recursive function calls.

The core concept of Kahn's Algorithm is to traverse all vertices with an `in_degree` of 0 and decrement the `in_degree` of their neighbors. Only vertices with an `in_degree` of 0 are added to the final output. No vertex can have an `in_degree` less than 0.

Here is the core concept in informal pseudocode:
```python
in_degree = initialize_in_degree()
queue = initialize_queue()

topology_order = []
while queue:
    vertex = queue.popleft()
    topology_order.append(vertex)
    for neighbor in vertex.neighbors:
        in_degree[neighbor] -= 1
        if in_degree[neighbor] == 0:
            queue.append(neighbor)
```

### Cycle Detection
Kahn's Algorithm can detect cycles. Consider the following example:

```
[1] -> [2]
[2] -> [3]
[3] -> [4]
[4] -> [2]
```

Here, there's a cycle between vertices `[2], [3], [4]`. The `in_degree` table will be `{1: 0, 2: 2, 3: 1, 4: 1}`. Vertex `1` will be added to the queue and final output, decrementing `in_degree` of `2` to 1. The `in_degree` table will be `{1: 0, 2: 1, 3: 1, 4: 1}`. The queue is now empty because no vertices with `in_degree` of 0 remain. The `topology_order` is `[1]`, indicating a cycle.

If `len(topology_order) != len(in_degree)`, the graph is cyclic.

Final implementation:
```python
def topology_sort_iter(graph: UnweightedDirectedGraph):
    in_degree = {}
    queue = deque()

    vertex = graph.head
    if vertex is None:
        return []

    # Initialize in_degree
    while vertex:
        in_degree[vertex] = vertex.in_deg
        if vertex.in_deg == 0:
            queue.append(vertex)
        vertex = vertex.next

    result = []

    while queue:
        vertex = queue.popleft()
        result.append(vertex)

        edge = vertex.edge
        while edge:
            in_degree[edge.dst] -= 1
            if in_degree[edge.dst] == 0:
                queue.append(edge.dst)
            edge = edge.next

    if len(result) != len(in_degree):
        return False

    return result
```


# Reference
---
1. [6.13拓扑排序](https://www.youtube.com/watch?v=jel-7-EF8n0)
2. [Topological Sort | Kahn's Algorithm | Graph Theory](https://www.youtube.com/watch?v=cIBFEhD77b4)
3. [Topological Sorting](https://www.geeksforgeeks.org/topological-sorting/)
4. [Kahn’s algorithm for Topological Sorting](https://www.geeksforgeeks.org/topological-sorting-indegree-based-solution/)