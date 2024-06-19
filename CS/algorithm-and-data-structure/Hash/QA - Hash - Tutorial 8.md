![[Pasted image 20240526082409.png]]

# Tutorial
## Question 1

### Q1A

keys = {19, 26, 13, 47, 17}, $h(k) = k \mod 7$
- $k(19) = 19 \mod 7 = 5$
- $k(26) = 26 \mod 7 = 5$
- $k(13) = 13 \mod 7 = 6$
- $k(47) = 47 \mod 7 = 5$
- $k(17) = 17 \mod 7 = 5$

```bash
0  []
1  []
2  []
3  []
4  []
5  [] -> 19 -> 26 -> 47 -> 17
6  [] -> 13
```

### Q1B
Q1B
Q1B

## Question 2
**What is the significance of hash code distribution in hash tables? How does it impact the efficiency of hash table operations?**

If the hash code is distributed uniformly, meaning that the hash codes from $0, 1, \ldots, m-1$ have an equal chance of being chosen, then the insertion and searching times will be optimal, which is $O(1)$. This is because hash collisions will be minimized, and the time required to handle collisions will also be minimized.

However, if the hash code is distributed non-uniformly, clustering will occur, meaning that hash collisions will happen more frequently. If we are using chaining, the linked lists will become longer, resulting in insertion and searching times of $O(n)$. On the other hand, if we are using open addressing, the time taken to probe for an available slot will also increase, leading to degraded performance of up to $O(n)$ in the worst case.

## Question 3
**Explain the process of resizing a hash table. When and why is it necessary to resize a hash table?**

Resizing a hash table involves resizing the array used to store the key-value pairs and adjusting the modulus in the hash function to correspond to the new table size. **This process typically includes rehashing all the existing keys into the new table to ensure even distribution.**

1. **Determine New Size**: Typically, the new size is a prime number about double the current size to maintain efficient space utilization and minimize collisions.
2. **Create New Table**: Allocate a new array of the determined size.
3. **Rehash All Entries**: Iterate over the old table and insert each existing key-value pair into the new table using the new hash function.
4. **Update References**: Replace the old table with the new table and update the hash function parameters.

**When is it necessary?**
1. **Chaining**:
   - **When**: Resizing is necessary when the average length of the linked lists becomes too large, which can significantly degrade the performance of the hash table operations to $O(n)$.
     
   - **Why**: Resizing the hash table helps reduce hash collisions, thereby decreasing the length of the linked lists and restoring the average-case performance to $O(1)$.

 2. **Open Addressing**:
   - **When**: Resizing is necessary when the hash table runs out of available slots, meaning the load factor approaches 1.
     
   - **Why**: To store more key-value pairs, resizing is required. This helps maintain efficient insertion, deletion, and search operations by ensuring that the load factor remains below a certain threshold, typically around 0.7 to 0.8.

## Question 4
**What is the purpose of a load factor in a hash table? How does it affect the performance of hash table operations?**

The load factor in a hash table is a measure that reflects the average number of elements per slot in the table. It is calculated as the ratio of the number of elements $n$ to the number of slots $m$ in the hash table:
$\text{Load factor} = \frac{n}{m}$

**Purpose of the Load Factor**:
1. **Performance Indicator**: The load factor indicates how full the hash table is. It helps determine when the table is becoming too crowded, which can lead to increased collisions.
   
2. **Resizing Threshold**: Many hash table implementations use the load factor as a threshold to decide when to resize the table. When the load factor exceeds a certain value (typically around 0.7 to 0.8), the table is resized to maintain efficient operations.

**Impact on Performance**:

1. **Low Load Factor**:
   - When the load factor is low, there are fewer elements per slot, which minimizes collisions.
   - Search, insertion, and deletion operations remain efficient at $O(1)$.

2. **High Load Factor**:
   - As the load factor increases, the number of collisions also increases.
   - In a hash table with chaining, longer linked lists form, leading to $O(n)$ performance in the worst case.
   - In a hash table with open addressing, more probing is required to find an empty slot or the desired element, also leading to $O(n)$ performance in the worst case.

**Managing the Load Factor**
To maintain optimal performance, hash tables are typically resized when the load factor exceeds a certain threshold. Resizing involves creating a new hash table with more slots and rehashing all existing elements into the new table. This reduces the load factor and helps maintain efficient $O(1)$ operations for insertion, search, and deletion.

## Question 5
**Which collision resolution strategy (chaining, linear probing, quadratic probing, double hash) is more appropriate when the load factor of the hash table is high?**

Double hashing is more appropriate because it provides the highest rate of randomness in probing sequences, which helps minimize clustering. Here is an analysis of how each collision resolution strategy performs when the load factor is high:

1. **Chaining**:
   - **Performance**: When the load factor is high, chaining leads to longer linked lists in each slot. This degrades the performance of insertion and searching operations from$O(1)$ to$O(n)$.
     
   - **Issue**: Increased load factor leads to more frequent and longer chains, making operations less efficient.

2. **Linear Probing**:
   - **Performance**: Linear probing suffers from primary clustering, where consecutive occupied slots form long clusters. This results in longer probing sequences, degrading performance as the load factor increases.
     
   - **Issue**: Primary clustering causes new keys to cluster around existing keys, leading to $O(n)$ performance in the worst case.

3. **Quadratic Probing**:
   - **Performance**: Quadratic probing reduces primary clustering but still suffers from secondary clustering, where keys that hash to the same initial index follow similar probing sequences.
     
   - **Issue**: Secondary clustering can still cause performance degradation, though less severe than primary clustering, leading to$O(n)$ performance in the worst case.

4. **Double Hashing**:
   - **Performance**: Double hashing provides better distribution and higher randomness in probing sequences compared to linear and quadratic probing. This helps minimize clustering and maintains more uniform distribution even at higher load factors.
     
   - **Advantage**: The increased randomness in probing sequences significantly reduces the likelihood of clustering, making double hashing more resilient to high load factors and maintaining closer to$O(1)$ performance.

### Conclusion:

Double hashing is more suitable for handling high load factors in a hash table due to its ability to minimize clustering through higher randomness in probing sequences. This helps maintain efficient $O(1)$ operations for insertion, search, and deletion, even as the load factor increases.