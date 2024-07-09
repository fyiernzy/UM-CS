
1. A **hash table** is a data structure that implements a dictionary. 
   
2. A **dictionary** is a data structure that stores data in key-value pairs. Its insertion, deletion, update and read operations take $O(1)$ time on average and $O(n)$ in the worst case.
   
3. A **hash collision** occurs when multiple keys are assigned identical hash values, i.e., $h(k_{1})=h(k_{2})$, where $k_{1}\neq k_{2}$.
   
4. **Chaining** addresses hash collisions by placing all keys with same hash value in the same slot into the a linked list.
	1. **Advantages**
		1. Easy to implement
		2. The hash table can never be full, as long as there's available memory.
		3. Performances does not heavily depend on the quality of the hash function.
	2. **Disadvantages**
		1. Can waste space due to the extra pointers used in the linked lists.
		2. Search time may degrade to $O(n)$ in the worst case when chains become long.
		3. Requires additional memory to store link pointers in the linked lists.
		   
5. **Load factor** $\alpha$ is the average number of elements stored in the hash table. It is defined as the ratio of number of elements stored in the hash table to the number of available slots. Mathematically, $$\alpha=\left(\frac{n}{m}\right)$$
   where $n$ is the number of elements and $m$ is the number of slots in the hash table.
   
6. **Hash Function with Division** has the following formula: $$h(k)=k\ \text{mod}\ m$$
   here $k$ is the key value and $m$ is the table size.
   
   $m$ should not be a power of 2, as $h(k)$ would then be just the $p$ lowest-order bits of $k$, increasing the likelihood of clustering when the input keys are non-uniformly distributed.
   
7. **Hash Function with Multiplication** has the following formula:$$h(k)=\lfloor m\cdot\left(k\cdot A\ \text{mod}\ 1\right)\rfloor$$where $A$ is a constant, typically suggested to be around 0.618 (following Knuth's suggestion).
   
8. **Open addressing** has following characteristics:
	- All elements occupy the hash table itself.
	- Each table entry (slot) contains either exactly one element of the dynamic set or NIL.
	- Open addressing probes the table for an available slot. Otherwise, the hash table is said to be filled up. 
	- When the table is filled up, 
		- No further insertions can be made. 
		- The load factor, $\alpha$, can never exceed 1. 
		- No lists and no elements are stored outside the table.
		  
9. **Linear Probing** uses the following hash function:
   $$h(k,i)=\left(h'(k)+i\right)\ \text{mod}\ m$$
   where $h'(k)$ is an auxiliary hash function and $i=0,1,\ldots,m-1$.
   
10. **Quadratic probing** uses the following hash function: $$h(k,i)=\left(h'(k)+c_{1} i+c_{2} i^{2}\right)\ \text{mod}\ m$$
    where $h'(k)$ is an auxiliary hash function, and $c_1$ and $c_2$ are positive auxiliary constants, and $i=0,1,\ldots,m-1$.
    
11. **Double Hashing** uses the following hash function
    $$h(k,i)=\left(h_{1}(k)+i\cdot h_{2}(k)\right)\ \text{mod}\ m$$
    where both $h_{1}(k)$ and $h_{2}(k)$ are auxiliary hash functions and $i=0,1,2,\ldots,m-1$.
    
12. **Clustering** occurs when the hash function and probing method result in the same probing sequence for keys that hash to the same initial index.

---
**Probing addresses** hash collisions by searching for an available slot in the table to place the key, avoiding chaining.

**Hash Delete**: Deleting a key by marking the slot as NIL might cause no key can be retrieved during probing because `HASH-SEARCH` stops when it encounters a `NIL` slot. To address the issue, mark the slot as `DELETED`, and modify the `HASH-INSERT` to treat `DELETED` as an empty slot.

**Assumption of simple uniform hashing** states that any given element is equally likely to hash into any of the $m$ slots, independently of where any other element has hashed to.

A **good hash function** satisfies, or approximately satisfies, the assumption of uniform hashing.

**Direct Addressing** accesses an arbitrary position in an array in $O(1)$ time by using direct indexing.

![open-hashing](@images/algo-open-hashing.png)

**Primary clustering** is a situation where hash collision occurs frequently on a specific hash value, causing probing takes more time gradually and finally resulting in $O(n)$ probing time.

**Secondary clustering** occurs when using double hashing or quadratic probing result in the same probing sequence for keys that hash to the same initial index.

# Tutorial
---
**What is the significance of hash code distribution in hash tables? How does it impact the efficiency of hash table operations?**

Uniformly distributed hash codes have an equal chance of being chose, allowing optimal insertion and search at $O(1)$ due to minimized hash collisions.

Non-uniformly distributed hash code causes clustering, leading to more frequent hash collisions. In chaining, this results in longer the linked lists; in open addressing, probing time increases. Both cases can result in worst-case $O(n)$ insertion and search times.

**Explain the process of resizing a hash table. When and why is it necessary to resize a hash table?**

Resizing a hash table involves adjusting array size, updating hash function parameters, and rehashing existing keys to ensure even distribution.

Steps:
- Determine new size, typically a prime number about double the current size.
- Create new table
- Rehash all entries from the old table into the new table using the updated hash function.
- Replace the old table with the new one and update the hash function parameters.

Resizing is done when load factor approaches 1, around 0.7 to 0.8, to prevents insertion and search time complexity from degrading to $O(n)$. In open addressing, it also allows for more key to be stored.

**What is the purpose of a load factor in a hash table? How does it affect the performance of hash table operations?**

The load factor is the ratio of number of elements $n$ to the number of slots $m$ in the hash table. It indicates how full the hash table is and is often used as a threshold for resizing.

A low load factor means fewer elements per slot, minimizing collisions and maintaining $O(1)$ performance for search, insertion and deletion.

A high load factor increases collisions, degrading performance to $O(n)$.

**Linear probing** suffers from primary clustering, where consecutive occupied slots form long clusters. This results in longer probing sequences, degrading performance as the load factor increases.

Quadratic probing reduces primary clustering but still suffers from secondary clustering, where keys that hash to the same initial index follow similar probing sequences.