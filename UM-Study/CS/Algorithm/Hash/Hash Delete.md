
# Introduction
![[Pasted image 20240526114916.png]]

If you have the basic idea of linear probing, the pseudocode of `Hash-Insert` and `Hash-Search` should no longer bother you.

Even though `Hash-Insert` might seem straightforward to you, `Hash-Delete` can be a great challenge. 
1. When we delete a key from slot $i$, we cannot simply mark that slot as empty by storing `NIL` in it. 
2. If we did, we might be unable to retrieve any key $k$ during whose insertion we had probed slot $i$ and found it occupied. 
3. We can solve this problem by marking the slot, storing in it the special value `DELETED` instead of `NIL`.
4. We would then modify the procedure `HASH-INSERT` to treat such a slot as if it were empty so that we can insert a new key there.

### Examples
#### 1. Inserting Keys

- **Insert `10`**:
  - Hash value: $10 \mod 5 = 0$.
  - Slot `0` is empty, insert `10` at slot `0`.

- **Insert `15`**:
  - Hash value: $15 \mod 5 = 0$.
  - Slot `0` is occupied, probe to slot `1`.
  - Slot `1` is empty, insert `15` at slot `1`.

- **Insert `20`**:
  - Hash value: $20 \mod 5 = 0$.
  - Slot `0` is occupied, probe to slot `1`.
  - Slot `1` is occupied, probe to slot `2`.
  - Slot `2` is empty, insert `20` at slot `2`.

**Hash Table State**:
```
Index:  0  1  2  3  4
       [10, 15, 20, NIL, NIL]
```

#### 2. Deleting a Key

- **Delete `15`**:
  - Find `15` at slot `1` and mark it as `NIL`.

**Hash Table State**:
```
Index:  0  1  2  3  4
       [10, NIL, 20, NIL, NIL]
```

#### 3. Searching for a Key

- **Search for `20`**:
  - Hash value: $20 \mod 5 = 0$.
  - Slot `0` has `10`, not `20`. Probe to slot `1`.
  - Slot `1` is `NIL`, so stop searching.

**Result**:
```
Search for `20`: Not found
```

### Issue with Simple Deletion

In this example, the key `20` cannot be found because the search stops at the `NIL` slot at index `1`. This happens because `NIL` indicates that no further keys in this probing sequence need to be checked, even though `20` is actually at slot `2`.

### Solution: Marking as DELETED

To solve this problem, we use a special value `DELETED` instead of `NIL` for deleted slots. This way, the search process does not stop prematurely.

### Revised Example with DELETED

#### 2. Deleting a Key (Revised)

- **Delete `15`**:
  - Find `15` at slot `1` and mark it as `DELETED`.

**Hash Table State**:
```
Index:  0  1  2  3  4
       [10, DELETED, 20, NIL, NIL]
```

#### 3. Searching for a Key (Revised)

- **Search for `20`**:
  - Hash value: $20 \mod 5 = 0$.
  - Slot `0` has `10`, not `20`. Probe to slot `1`.
  - Slot `1` is `DELETED`, continue probing to slot `2`.
  - Slot `2` has `20`, found it.

**Result**:
```
Search for `20`: Found at slot 2
```

By marking deleted slots as `DELETED`, we ensure that the probing sequence continues correctly, allowing us to find the key `20` even after `15` has been deleted.
