#algorithm #graph 
# Introduction
- A graph $G = (V, E)$ consists of a set of vertices $V$ and a set of edges $E$, such that each edge in $E$ is a connection between a pair of vertices in $V$.
  
- $|V|$ indicates the number of vertices
  
- $|E|$ indicates the number of edges
  
- Neighbors are vertices adjacent to one another and joined by edges.
  
- An edge connecting vertices $u$ and $v$ is written as $(u, v)$. 
	- It is *incident* on vertices $u$ and $v$.
	- Each edge may have a cost or weight.
	  
- Connected components are the largest connected subgraphs of an undirected graph.

# Characteristics
- **Acyclic**: There are no loops or cycles.

- **Connected**: There is a path between any two vertices, with no isolated vertices or disconnected parts.
  
- **Undirected Graph**: Edges have no direction; connections are bidirectional.
  
- **No Simple Cycle**: A simple cycle is a path where a vertex is reachable from itself, with no repeated edges or vertices except the start/end vertex. Having no simple cycles means that the graph doesn't loop back on itself.

# Type of Graph
 - **Directed Acyclic Graph (DAG)**: A directed graph without cycles.
 - **Free Tree**: A tree is a type of graph that is connected and acyclic. A "free" tree is typically used to describe a tree that is not rooted, meaning it doesn't have a designated starting point or root.

# Types of Graphs 
- **Directed Acyclic Graph (DAG)**: A directed graph with no cycles.
- **Free Tree**: A connected, acyclic graph, typically not rooted *(free)*, meaning it has no designated starting point or root.

# Methods for representing graphs
![[Pasted image 20240529071308.png]]
![[Pasted image 20240529071359.png]]
![[Pasted image 20240529071406.png]]
![[Pasted image 20240529071424.png]]
# Implemetation
```python
class UnweightedDirectedGraph:
    def __init__(self):
        self.head = None
        self.tail = None
        self.size = 0

    class Vertex:
        def __init__(self, data):
            self.data = data
            self.next = None
            self.in_deg = 0
            self.out_deg = 0
            self.edge = None
            self.is_visited = False

        def __str__(self):
            return f"{self.data}"

        def __repr__(self):
            return f"{self.data}"

    class Edge:
        def __init__(self, dst):
            self.dst = dst
            self.next = None

    def add_vertex(self, data):
        new_vertex = self.Vertex(data)
        if self.head is None:
            self.head = new_vertex
        else:
            self.tail.next = new_vertex
        self.tail = new_vertex
        self.size += 1

    def _contains_vertex(self, data):
        v = self.head
        while v:
            if v.data == data:
                return True
            v = v.next
        return False

    def add_edge(self, u_data, v_data):
        u_vertex, v_vertex = self.head, self.head
        while u_vertex and u_vertex.data != u_data:
            u_vertex = u_vertex.next

        while v_vertex and v_vertex.data != v_data:
            v_vertex = v_vertex.next

        if u_vertex is None or v_vertex is None:
            return False

        new_edge = self.Edge(v_vertex)
        if u_vertex.edge is None:
            u_vertex.edge = new_edge
        else:
            last_edge = u_vertex.edge
            while last_edge.next:
                last_edge = last_edge.next
            last_edge.next = new_edge

        u_vertex.out_deg += 1
        v_vertex.in_deg += 1

    def adjacency_list(self):
        current_node = self.head
        while current_node:
            print(f'{current_node.data}', end='')
            next_edge = current_node.edge
            while next_edge:
                print(' -> ', end='')
                print(f'{next_edge.dst.data}', end='')
                next_edge = next_edge.next
            print()
            current_node = current_node.next

    def adjacency_matrix(self):
        matrix = [[0] * (self.size + 1) for _ in range(self.size + 1)]
        mapping = {}
        i = 1
        current_vertex = self.head
        while i <= self.size:
            matrix[i][0] = matrix[0][i] = current_vertex.data
            mapping[current_vertex.data] = i
            current_vertex = current_vertex.next
            i += 1

        current_vertex = self.head
        while current_vertex:
            current_edge = current_vertex.edge
            while current_edge:
                matrix[mapping[current_vertex.data]
                       ][mapping[current_edge.dst.data]] = 1
                current_edge = current_edge.next
            current_vertex = current_vertex.next

        for row in matrix:
            for e in row:
                if e == 0:
                    print('  ', end="")
                else:
                    print(f'{e} ', end="")
            print()
            # print(row)

    def reset_visits(self):
        current = self.head
        while current:
            current.is_visited = False
            current = current.next
```

## Example

```python
def initialize_graph(vertices, edges):
    graph = UnweightedDirectedGraph()
    for v in vertices:
        graph.add_vertex(v)
    for u, v in edges:
        graph.add_edge(u, v)
    return graph
    
GRAPH = initialize_graph(vertices=[i for i in range(1, 12)],
                         edges=[
    (1, 2), (1, 3), (2, 4), (2, 5), (3, 6),
    (4, 7), (5, 8), (6, 9), (7, 10), (8, 10),
    (9, 10), (10, 1), (2, 6), (3, 7), (4, 8),
    (5, 9), (6, 10), (7, 1), (8, 2), (9, 3),
    (1, 4), (3, 5), (4, 6), (5, 7), (6, 8),
    (7, 9), (8, 1), (9, 2), (10, 4)
])

GRAPH2 = initialize_graph(vertices=['A', 'B', 'C', 'D', 'E', 'F'],
                          edges=[
    ('A', 'C'), ('A', 'E'), ('B', 'C'), ('C', 'D'),
    ('C', 'F'), ('D', 'F'), ('E', 'F'), ('F', 'B')
])

GRAPH3 = initialize_graph(vertices=['A', 'B', 'C', 'E', 'F', 'G'],
                          edges=[
    ('A', 'B'), ('A', 'C'), ('B', 'G'), ('F', 'C'), 
    ('F', 'E'), ('G', 'E')
])
```

## Example Usage

```python
if __name__ == '__main__':
    # Display the adjacency list
    print("Adjacency List:")
    GRAPH.adjacency_list()

    # Display the adjacency matrix
    print("\nAdjacency Matrix:")
    GRAPH.adjacency_matrix()

    # Display the adjacency list of GRAPH2
    print("Adjacency List of GRAPH2:")
    GRAPH2.adjacency_list()

    # Display the adjacency matrix of GRAPH2
    print("\nAdjacency Matrix of GRAPH2:")
    GRAPH2.adjacency_matrix()
    
	# Display the adjacency list of GRAPH2
    print("Adjacency List of GRAPH3:")
    GRAPH3.adjacency_list()

    # Display the adjacency matrix of GRAPH2
    print("\nAdjacency Matrix of GRAPH3:")
    GRAPH3.adjacency_matrix()
```


# Algorithm
---
1. [[DFS]]
2. [[BFS]]
3. [[Topological Sort]]
