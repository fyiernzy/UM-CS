- Secondary clustering occurs when the hash function and probing method result in the same probing sequence for keys that hash to the same initial index, leading to smaller clusters than [[Primary Clustering]] but still affecting performance. 
- This happens in hash tables using [[Quadratic Probing]] or [[Double Hashing]] when keys that hash to the same index end up following similar probing paths.

### Example of Quadratic Probing

#### 1. Inserting Initial Keys

- **Insert `10`**:
  - Hash value: $10 \mod 10 = 0$.
  - Slot `0` is empty, insert `10` at slot `0`.

**Hash Table State**:
```
Index:  0   1   2   3   4   5   6   7   8   9
       [10, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL]
```

- **Insert `20`**:
  - Hash value: $20 \mod 10 = 0$.
  - Slot `0` is occupied, probe to slot $(0 + 1^2) \mod 10 = 1$.
  - Slot `1` is empty, insert `20` at slot `1`.

**Hash Table State**:
```
Index:  0   1   2   3   4   5   6   7   8   9
       [10, 20, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL]
```

- **Insert `30`**:
  - Hash value: $30 \mod 10 = 0$.
  - Slot `0` is occupied, probe to slot $(0 + 1^2) \mod 10 = 1$.
  - Slot `1` is occupied, probe to slot $(0 + 2^2) \mod 10 = 4$.
  - Slot `4` is empty, insert `30` at slot `4`.

**Hash Table State**:
```
Index:  0   1   2   3   4   5   6   7   8   9
       [10, 20, NIL, NIL, 30, NIL, NIL, NIL, NIL, NIL]
```

- **Insert `31`**:
  - Hash value: $31 \mod 10 = 1$.
  - Slot `1` is occupied, probe to slot $(1 + 1^2) \mod 10 = 2$.
  - Slot `2` is empty, insert `31` at slot `2`.

**Hash Table State**:
```
Index:  0   1   2   3   4   5   6   7   8   9
       [10, 20, 31, NIL, 30, NIL, NIL, NIL, NIL, NIL]
```

### Observation

- **Clustering Around Slot 0**: Keys `10`, `20`, and `30` all hash to `0`, creating a small cluster at slots `0`, `1`, and `4`.
- **Separate Cluster**: Key `31` hashes to `1` and does not follow the same probing sequence as `10`, `20`, and `30`, avoiding primary clustering but still forming a small cluster around its initial index.

### Secondary Clustering Problem

Secondary clustering occurs because keys that hash to the same initial index (e.g., `10`, `20`, `30`) follow a similar quadratic probing sequence, leading to the formation of smaller clusters.