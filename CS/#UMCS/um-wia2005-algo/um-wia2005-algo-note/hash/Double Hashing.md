Double hashing offers one of the best methods available for open addressing because the permutations produced have many of the characteristics of randomly chosen permutations.

Double hashing uses a hash function of the form:
$$h(k, i) = (h_1(k) + i \cdot h_2(k)) \mod m$$
where both $h_1$ and $h_2$ are auxiliary hash functions.

Generally, $h_1$ and $h_2$ are selected from a set of universal hash functions; $h_1$ is selected to have a range of$\{0, |T|-1\}$ and $h_2$ to have a range of$\{1, |T|-1\}$.

### Example of Double Hashing

#### 1. Inserting Initial Keys

- **Insert `10`**:
  - Primary hash value: $h_1(10) = 10 \mod 10 = 0$.
  - Slot `0` is empty, insert `10` at slot `0`.

**Hash Table State**:
```
Index:  0  1  2  3  4  5  6  7  8  9
       [10, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL, NIL]
```

- **Insert `22`**:
  - Primary hash value: $h_1(22) = 22 \mod 10 = 2$.
  - Slot `2` is empty, insert `22` at slot `2`.

**Hash Table State**:
```
Index:  0  1  2  3  4  5  6  7  8  9
       [10, NIL, 22, NIL, NIL, NIL, NIL, NIL, NIL, NIL]
```

- **Insert `31`**:
  - Primary hash value: $h_1(31) = 31 \mod 10 = 1$.
  - Slot `1` is empty, insert `31` at slot `1`.

**Hash Table State**:
```
Index:  0  1  2  3  4  5  6  7  8  9
       [10, 31, 22, NIL, NIL, NIL, NIL, NIL, NIL, NIL]
```

- **Insert `44`**:
  - Primary hash value:$ h_1(44) = 44 \mod 10 = 4 $.
  - Slot `4` is empty, insert `44` at slot `4`.

**Hash Table State**:
```
Index:  0  1  2  3  4  5  6  7  8  9
       [10, 31, 22, NIL, 44, NIL, NIL, NIL, NIL, NIL]
```

#### Collision Handling in Double Hashing

Now let's handle a collision using double hashing:

- **Insert `55`**:
  - Primary hash value:$h_1(55) = 55 \mod 10 = 5$.
  - Slot `5` is empty, insert `55` at slot `5`.

**Hash Table State**:
```
Index:  0  1  2  3  4  5  6  7  8  9
       [10, 31, 22, NIL, 44, 55, NIL, NIL, NIL, NIL]
```

- **Insert `65`**:
  - Primary hash value: $h_1(65) = 65 \mod 10 = 5$.
  - Slot `5` is occupied, calculate secondary hash value: $h_2(65) = 1 + (65 \mod 9) = 1 + 2 = 3$.
  - First probe: $(h_1(65) + 1 \cdot h_2(65)) \mod 10 = (5 + 1 \cdot 3) \mod 10 = 8$.
  - Slot `8` is empty, insert `65` at slot `8`.

**Hash Table State**:
```
Index:  0  1  2  3  4  5  6  7  8  9
       [10, 31, 22, NIL, 44, 55, NIL, NIL, 65, NIL]
```

- **Insert `75`**:
  - Primary hash value: $h_1(75) = 75 \mod 10 = 5$.
  - Slot `5` is occupied, calculate secondary hash value: $h_2(75) = 1 + (75 \mod 9) = 1 + 3 = 4$.
  - First probe: $(h_1(75) + 1 \cdot h_2(75)) \mod 10 = (5 + 1 \cdot 4) \mod 10 = 9$.
  - Slot `9` is empty, insert `75` at slot `9`.

**Hash Table State**:
```
Index:  0  1  2  3  4  5  6  7  8  9
       [10, 31, 22, NIL, 44, 55, NIL, NIL, 65, 75]
```

### Observation

- **No [[Primary Clustering]]**: Unlike [[Linear Probing]], double hashing reduces clustering because it uses a secondary [[Hash Function]] to determine the step size. Keys that hash to the same initial index do not follow the same probing sequence, which helps distribute keys more evenly.
  
- **Reduced [[Secondary Clustering]]**: Double hashing further reduces clustering compared to [[Quadratic Probing]] because the step size depends on the key, making it less likely for different keys to follow the same probing sequence.
