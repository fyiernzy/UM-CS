A hash table is a data structure that implements a dictionary.

A dictionary is a data structure that stores data in key-value pairs. Its insertion, deletion, update, and read operations take $O(1)$ time on average and $O(n)$ in the worst case.

To store a key-value pair, the dictionary uses a hash function to calculate the hash of the key, $h(k)$. Then, it stores $\text{Pair(key, value)}$ in $\text{Array}[h(k)]$. Therefore, a dictionary is a high-level use of an array with a more sophisticated approach to improve efficiency.

When trying to find an element in the dictionary, we calculate the hash of the input key and check if $\text{Array}[h(k)]$ contains any element. If it does, we return it; if not, we return `NIL`.

This is why we say that "a hash table generalizes the simpler notion of an ordinary array" (Lecture Note, pg. 7).