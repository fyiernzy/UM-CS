As examined in the previous chapter, we have learned that chaining can result in a time complexity of $O(n)$ where $n$ is the input size if $h(k)$ is not carefully chosen. So how can we tackle the problem? First, we need to understand why chaining can cause $O(n)$ time complexity:

1. It uses **linked lists** when hash collisions occur. Hence, when clustering (hash collisions on the same hash function) occurs, the linked list will become larger in size.
2. It relies merely on $k$ in the hash function, so $h(k)$ may not be uniformly distributed.

To tackle this problem, we can introduce open addressing. Open addressing has the following characteristics to avoid the problems in chaining:

1. All elements occupy the hash table itself.
2. Each table entry (slot) contains either exactly one element of the dynamic set or `NIL` (Nothing).
3. Open addressing searches through ([[Linear Probing]]) the table slots until a slot is available; otherwise, the [[Hash Table]] is said to be filled up. No further insertions can be made. Hence, the load factor, $\alpha$, can never exceed 1. As a result, no lists and no elements are stored outside the table.

