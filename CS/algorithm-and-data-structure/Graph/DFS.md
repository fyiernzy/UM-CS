```python
from graph import UnweightedDirectedGraph, GRAPH2

def dfs_iter(graph: UnweightedDirectedGraph):
    graph.reset_visits()
    stack, visited = [], []
    stack.append(graph.head)
    graph.head.is_visited = True

    print_details(visited, stack)

    while stack:
        v = stack.pop()
        visited.append(v)
        e = v.edge
        while e:
            if not e.dst.is_visited:
                stack.append(e.dst)
                e.dst.is_visited = True
            e = e.next

        print_details(visited, stack)

def print_details(visited, stack):
    print("Visited:", [v.value for v in visited])
    print("Stack  :", [v.value for v in stack])
    print()

if __name__ == '__main__':
    dfs_iter(GRAPH2)
```
