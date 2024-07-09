#hash
In chaining, we place all the elements that hash to the same slot into the same linked list. Each hash-table slot $T[j]$ contains a linked list of all the keys whose hash value is $j$. For example, if $h(k1) = h(k4)$ and $h(k5) = h(k7) = h(k2)$, they are stored in the same linked lists.

To implement this, let's consider a Java implementation:

```java
class HashTable<K, V> {
    static class Node<K, V> {
        int hashValue;
        K key;
        V value;
        Node<K, V> next;

        Node(int hashValue, K key, V value, Node<K, V> next) {
            this.hashValue = hashValue;
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    private Node<K, V>[] table;

    @SuppressWarnings("unchecked")
    public HashTable(int size) {
        table = new Node[size];
    }

    private int hash(K key) {
        return key.hashCode() % table.length;
    }

    public void put(K key, V value) {
        int hash = hash(key);
        Node<K, V> newNode = new Node<>(hash, key, value, null);
        if (table[hash] == null) {
            table[hash] = newNode;
        } else {
            Node<K, V> current = table[hash];
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public V get(K key) {
        int hash = hash(key);
        Node<K, V> current = table[hash];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(K key) {
        int hash = hash(key);
        Node<K, V> current = table[hash];
        Node<K, V> prev = null;
        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[hash] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }
}
```

In this implementation, if `Node(key2, val2)` has the same hash value as `Node(key1, val1)`, then we can link them using `Node(key1, val1).next = Node(key2, val2)`.

The linked list can be either singly or doubly linked; a doubly linked list makes deletion faster.

### Time Complexity and Load Factor

We often state that the time complexity of a hash table is $O(1)$. However, this depends on the `load factor`, $\alpha$. The load factor for a given table is defined as $\alpha = \frac{n}{m}$, where $n$ is the number of elements and $m$ is the number of slots. When $n > m$, $\alpha > 1$.

Assuming that any given element is equally likely to hash into any of the $m$ slots, independently of where any other element has hashed to, we have the assumption of simple uniform hashing.

The average-case performance of hashing depends on how well the hash function $h$ distributes the set of keys among the $m$ slots. The average running time for insert, search, and delete operations is $O(1 + \alpha)$.

### Worst-Case Behavior

The worst-case behavior of hashing with chaining occurs when all $n$ keys hash to the same slot, creating a list of length $n$. The worst-case time for searching is thus $O(n)$ plus the time to compute the hash function—no better than if we used a single linked list for all the elements.

