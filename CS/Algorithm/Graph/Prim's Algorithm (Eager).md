![[Pasted image 20240616105606.png]]

As usual, Prim's algorithm starts at any node. We'll use node 0 as our starting node.
```bash
Iter 1 at N0, IPQ
------------------
2 --> (0, 2, 0)
5 --> (0, 5, 7)
3 --> (0, 3, 5)
1 --> (0, 1, 9)

visited = [0]
```
Prim's algorithm is a greedy algorithm and hence it works on Priority Queue, which always pull the node with smallest or largest value. In this case, Prim's algorithm visits node 2 and update the condition.

```bash
Iter 2 at N2, IPQ
------------------
** 2 --> (0, 2, 0)
5 --> (0, 5, 7) => (2, 5, 6)
3 --> (0, 3, 5)
1 --> (0, 1, 9)

visited = [0, 2]
```
As you can see, I have added `**` before 2 to indicate that node 2 is already visited. When visiting node 2, the Prim's algorithm will check all the edges at node 2, which are
- `(2, 0, 0)`
- `(2, 5, 6)`
However, since node 0 is already visited, hence the edge `(2, 0, 0)` won't be added into the Indexed Priority Queue (IPQ).

Then, for `(2, 5, 6)` which node 5 is no yet visited, Prim's algorithm will check if the cost `(2, 5, 6)` is smaller then `(0, 5, 7)`. If yes, then the Prim's algorithm will update it with the smallest value.

Since `(2, 5, 6)` has cost of 6, which is smaller than `(0,5,7)` which has cost of 7, hence its value is updated.

```bash
Iter 3 at N3, IPQ
------------------
** 2 --> (0, 2, 0)
5 --> (0, 5, 7) => (2, 5, 6) => (3, 5, 2)
** 3 --> (0, 3, 5)
1 --> (0, 1, 9) => (3, 1, -2)
6 --> (3, 6, 3)

visited = [0, 2, 3]
```
Since node 3 has the lowest value, it is chosen. The process goes as follow:
- For each iteration, IPQ polls the node with smallest value.
- Iterate through all the edges of the node.
	- If the edges pointed to a visited node, continue the iteration
	- If the edge pointed to a node that is no yet in the IPQ, put it
	- If the edge pointed to a node that is already in the IPQ, then compare their costs and put the lower cost one.

```bash
Iter 4 at N1, IPQ
------------------
** 2 --> (0, 2, 0)
5 --> (0, 5, 7) => (2, 5, 6) => (3, 5, 2)
** 3 --> (0, 3, 5)
** 1 --> (0, 1, 9) => (3, 1, -2)
6 --> (3, 6, 3)
4 --> (1, 4, 3)

visited = [0, 2, 3, 1]
```

```bash
Iter 5 at N5, IPQ
------------------
** 2 --> (0, 2, 0)
** 5 --> (0, 5, 7) => (2, 5, 6) => (3, 5, 2)
** 3 --> (0, 3, 5)
** 1 --> (0, 1, 9) => (3, 1, -2)
6 --> (3, 6, 3) => (5, 6, 1)
4 --> (1, 4, 3)

visited = [0, 2, 3, 1, 5]
```

```bash
Iter 6 at N6, IPQ
------------------
** 2 --> (0, 2, 0)
** 5 --> (0, 5, 7) => (2, 5, 6) => (3, 5, 2)
** 3 --> (0, 3, 5)
** 1 --> (0, 1, 9) => (3, 1, -2)
** 6 --> (3, 6, 3) => (5, 6, 1)
4 --> (1, 4, 3)

visited = [0, 2, 3, 1, 5, 6]
```

```bash
Iter 6 at N6, IPQ
------------------
** 2 --> (0, 2, 0)
** 5 --> (0, 5, 7) => (2, 5, 6) => (3, 5, 2)
** 3 --> (0, 3, 5)
** 1 --> (0, 1, 9) => (3, 1, -2)
** 6 --> (3, 6, 3) => (5, 6, 1)
** 4 --> (1, 4, 3)

visited = [0, 2, 3, 1, 5, 6, 4]
```

Total cost = 0 + 2 + 5 + (-2) + 1 + 3 = 9
https://www.youtube.com/watch?v=EFg3u_E6eHU&t=439s
https://www.youtube.com/watch?v=71UQH7Pr9kU
https://www.youtube.com/watch?v=cplfcGZmX7I
https://www.youtube.com/watch?v=jsmMtJpPnhU
https://www.youtube.com/watch?v=xq3ABa-px_g
https://www.youtube.com/watch?v=obWXjtg0L64