Direct addressing means that we have an address for a specific element, allowing us to perform CRUD (Create, Read, Update, and Delete) operations in $O(1)$ time. Let's imagine two scenarios:

- **Scenario 1**: 
	- You only know the street where your friend lives, but your friend is still sleeping, and the phone is muted, so you couldn't find him.
	- Without any additional clues, you can only knock on each door and check if they are your friend.
	- If there are 10 houses on the street and your friend lives in the last house, you have to check all 10 houses, resulting in $O(n)$ (linear time).
	  
- **Scenario 2**: You have the full address of your friend's house, so you can go directly to the last house on the street, which is much faster and without wasting any time.

In the world of algorithms, direct addressing makes it more effective to access an *arbitrary position* in an array in $O(1)$ time.


![[Pasted image 20240526075402.png]]


We can use an array for a direct-address table since an array uses $i$ for indexing, and $arr[i]$ stores the element, creating a key-value pair. In this context, we will call $arr[𝑖]$ a `slot` or `position`.

> *Direct addressing is a simple technique that works well when the universe U of keys is reasonably small.*


A direct-address table works well when your possible keys (using only integers here to simplify the model) are predictable and limited, say $S = \{ x \mid 1 \leq x \leq 9 \}$. We call these `possible keys` the `universe U` or `universal set`, which is defined as `all possible outputs in a given field`.

However, if the universe is large, say we have $10^5$ elements, then our direct-address table should have a size of $10^5$. If our universe $\rightarrow \infty$, then we can't implement it using a direct-address table (array) because our computer will run out of memory. So, storing a table $T$ of size $|U|$ may be impractical if the universe $U$ is large.

Furthermore, even if we can implement the direct-address table with a size of $10^5$, we might not fully utilize all the available slots. The set $K$ of keys actually stored may be so small relative to $U$ that most of the space allocated for $T$ would be wasted. For example, we might use $\{ x \mid 1 \leq x \leq 9 \}$ out of $\{ x \mid 1 \leq x \leq 10000 \}$, resulting in the waste of 9991 spaces.

Since algorithms aim to solve problems, let's tackle this one. We know that the main problem with direct addressing is that the universe might be too large. Therefore, we can think of a way to reduce the possible size of the universe. Since the universe in nature cannot be reduced in size, we can come up with a way to "reduce" its size by using the modulo operation.

Given $i = 5000$ and $\text{mod} = 13$, then $i \mod 13$ gives only $8$, which is much smaller. The function that uses the modulo operation to reduce the size is called a [[Hash Function]].

Formally, the hash function reduces the range of array indices and hence the size of the array. Instead of a size of $|U|$, the array can have size $m$. A hash function $h$ maps the universe $U$ of keys into the slots of a hash table $T[0 \ldots m-1]$:

$$
h : U \rightarrow \{0, 1, \ldots, m-1\}
$$

where the size $m$ of the hash table is typically much less than $|U|$. We say that an element with key $k$ hashes to slot $h(k)$; we also say that $h(k)$ is the hash value of key $k$.