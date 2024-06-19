(Continued from [[Open Addressing]]) 
Instead of being fixed in the order $0, 1, ..., m-1$(which requires $O(n)$search time), the sequence of positions probed depends upon the key being inserted.

Let’s say I have a string called $S$, $\text{hashCode}(S) = 256$, $m = 13$, hence $h(k) = 256 \mod 13 = 9$. 

In this case, we start finding at $\text{hashTable}[9]$. 

- If $\text{hashTable}[9]$is filled up, then we check $\text{hashTable}[9 + 1]$, i.e., $\text{hashTable}[10]$.
- If $\text{hashTable}[10]$is filled up, then we check $\text{hashTable}[10 + 1]$, i.e., $\text{hashTable}[11]$.

And we repeat the process. What if $\text{hashTable}[12]$is still filled up with a key? Then we need to start checking from $\text{hashTable}[0]$. How can we express this mathematically? We can write it as $\text{hashTable}[(12 + 1) \mod 13]$. The pattern follows as:

- $\text{hashTable}[(12 + 2) \mod 13] = \text{hashTable}[1]$
- $\text{hashTable}[(12 + 3) \mod 13] = \text{hashTable}[2]$

By this way, we can find the nearest empty slot for insertion, which is close to the value of $h(k)$. To generalize the situation, we can write it as:
$$h(k, i) = (h'(k) + i) \mod m, \text{ for } i = 0, 1, \ldots, m-1$$

This is known as linear probing, where $h'(k)$ is an auxiliary hash function, which is essentially the ordinary hash function we have learned before. Basically, we can consider $i$ as an arbitrary index, or displacement, to locate the exact entry of the hash table given a key $k$. Hence, all the slots can be filled up.

The permutation of $\langle h(k, 0), h(k, 1), h(k, 2) \rangle$ is called the probe sequence.

However, linear probing suffers from [[Primary Clustering]].