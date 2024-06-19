We can use either the `division` or `multiplication` method for implementing the hash function.

Most hash functions assume that the universe of keys is the set of natural numbers. Thus, if the keys are not natural numbers, we need a way to interpret them as natural numbers. For example, we can interpret a character string as an integer expressed in suitable radix notation.

In what follows, we assume that the keys are natural numbers.

## Division Method
- In the division method for creating hash functions, we map a key $k$ into one of $m$ slots by taking the remainder of $k$ divided by $m$: 
  $$h(k) = k\mod m$$
  
- For example, if the hash table has a size $m = 12$ and the key is $k = 100$, then: 
  $$h(100) = 100 \mod 12 = 4$$

$m$ should not be a power of 2, because if $m = 2^p$, then $h(k)$ is just the $p$ lowest-order bits of $k$.

**Example:**

```python
p = 5
m = 2 ** p
for k in range(90, 100):
    print(k, bin(k)[2:], k % m, bin(k % m)[2:])
```

In this case, $p = 5$ and $m = 2^p = 32$. `bin` is a function to convert an integer to a binary string and `[2:]` is used to remove the `0b`. Running this code will produce the following output:

```bash
90 1011010 26 11010
91 1011011 27 11011
92 1011100 28 11100
93 1011101 29 11101
94 1011110 30 11110
95 1011111 31 11111
96 1100000 0 0
97 1100001 1 1
98 1100010 2 10
99 1100011 3 11
```

As you can see, 
- When $k = 90$ (binary: 1011010), the $p$ lowest-order bits (the least significant bits, which are the rightmost bits), are 11010. 
- This matches the remainder when $k \mod m = 26$ (binary: 11010). This is also true for the other values such as 91, 92, and so on. 
- Hence, we can say that $h(k)$ is the $p$ lowest-order bits of $k$ if $m = 2^p$.


**Impact of $m = 2^p$ on Hash Functions:**

- When $m = 2^p$, the hash function $h(k)$ can be performed using a bitmask operation, which isolates the $p$ least significant bits of $k$.
- Using only the $p$ lowest-order bits means the hash function is sensitive to the bit patterns in these positions. 
- If the input keys $k$ have a non-uniform distribution in these bits, the hash values will also be non-uniformly distributed. 
- This can lead to clustering of hash values, resulting in many keys being mapped to a small subset of possible hash values. 
- In other words, hash collisions will occur more frequently due to the lack of randomness in the hash function. 
- This can degrade the performance of hash table operations (insertion, search, and deletion) from $O(1)$ to $O(n)$ in the worst case.

Therefore, we should avoid $m = 2^p$. A prime number not too close to an exact power of 2 is often a good choice for $m$.

## Multiplication Method
The hash function implemented using the multiplication method is as follows:
$$h(k) = \lfloor m \cdot \text{frac}(k \cdot A) \rfloor$$
or
$$h(k) = \lfloor m \cdot [\text{frac}(k \cdot A) \mod 1] \rfloor$$

where 
$$\text{frac}(k \cdot A) = k \cdot A - \lfloor k \cdot A \rfloor$$

and $A \approx 0.618033988$ according to Knuth's suggestion.

**Steps:**
1. Multiply the key $k$ with a constant $A$, where $0 < A < 1$.
2. Extract the fractional part of $k \cdot A$ to get a number between 0 and 1.
3. Multiply the fractional part by $m$ and take the floor value.

At the end, it will output a discrete number between 0 and $m-1$ for finding the slot in the hash table. Essentially, $k \cdot A$ is used to determine a position from 0 to $m-1$.

**Advantages:**
The multiplication method can avoid hash function bias towards lower bits. However, hash collisions can still happen because $U$ is much larger than $m$.


## Designing a Good Hash Function

A good hash function should minimize collisions. <mark style="background: #FFB86CA6;">More formally, a good hash function satisfies (approximately) the assumption of simple uniform hashing: each key is equally likely to hash to any of the $m$ slots, independently of where any other key has hashed to.</mark>