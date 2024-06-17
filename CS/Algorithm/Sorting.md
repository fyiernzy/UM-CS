
**Counting Sort**
- Counting sort is not an in-place algorithm. It initializes a new array and fills it using a helper array.
- It requires auxiliary space.
- Its time complexity is \(O(n + d)\), where \(n\) is the number of elements in the array and \(d\) is the range of elements.
- When filling the new array, the loop is set to `for i in range(len(arr) - 1, -1, -1)`, ensuring the last element is placed at the back, preserving the sequence when inserted. This makes it a stable sorting algorithm.
- It is not an adaptive algorithm because it scans through every element and counts them. (Adaptive algorithms can take advantage of a previously sorted array.)
- It is not an online sorting algorithm since it needs to count the frequency of all elements.

```python
for i in range(len(arr) - 1, -1, -1):
    index = count[arr[i] - min_val] - 1
    results[index] = arr[i]
```
You'll need to subtract 1 from the index because it's zero-based. Let's say your minimum value is 0 and has a count of 1; if the index or the count doesn't decrement by 1, it will be inserted into `arr[1]` and use another element's place.

**Insertion Sort**

```python
def insertion_sort(arr):
    for i in range(1, len(arr)):
        j = i - 1
        while j >= 0 and arr[j] > arr[j+1]:
            arr[j], arr[j+1] = arr[j+1], arr[j]
            j -= 1
```

```python
def insertion_sort(arr):
    for i in range(1, len(arr)):
        j = i - 1
        key = arr[j + 1]  # arr[i]
        while j >= 0 and arr[j] > arr[j+1]:
            arr[j + 1] = arr[j]
            j -= 1
        arr[j + 1] = key
```
For insertion sort, the condition needs to be set to `j >= 0` because you want to compare the first and second elements as well. You always choose the second element to insert into a suitable position in the first.

**Bucket Sort**
If not considering the normalization and denormalization cases, bucket sort initializes a 2D matrix with `len(arr)` arrays. Then, it assigns the value in the array to `buckets[val * len(arr)]`. It sorts the buckets accordingly and appends them.

If there's a need to normalize/denormalize data (given that not every element in the array is \((0, 1]\)), the normalization can be performed using the following formula:
\[ V = \frac{num - min}{max - min + 1} \]

**Lecture 3 Concepts:**
1. In-place/Not in-place
2. Online/Offline
3. Stable/Not stable
4. Adaptive/Non-adaptive

**Order Definitions:**
- Increasing order vs. Non-decreasing order
- Decreasing order vs. Non-increasing order

**Sorting Algorithms Covered:**
1. Bubble Sort
2. Counting Sort
3. Radix Sort
4. Bucket Sort
5. Shell Sort

**Summary:**

- **Counting Sort** initializes an array `count` with its size set to the range of elements in the array. It counts each element and places them in a new array `results`. The time complexity should be \(O(n + d)\), where \(n\) is the number of elements and \(d\) is the range of elements.
  - Total time used should be \(T(n) = d + d + n + n = 2(n + d)\)
    - \(d\) for initializing the array and calculating the cumulative sum
    - \(n\) for counting the elements and placing them into the array

- **Radix Sort** is a sorting algorithm that makes modifications based on counting sort. It compares the radix (or digit) of the numbers in elements and sorts them using counting sort. Since a digit can have at most 10 possible values \(\{0, 1, 2, \ldots, 9\}\), the `count` in counting sort will always be 10. Radix sort is a stable sorting algorithm (since counting sort is used), but it is not adaptive and is an offline algorithm. It is also not an in-place algorithm due to the use of `count` in counting sort.

- Both **Bucket Sort** and **Shell Sort** use insertion sort. Shell sort sorts based on a gap sequence. Instead of comparing adjacent elements, shell sort first compares elements that are far apart, with gaps of \(2^n\), where \(n = 1, 2, 3, \ldots\). For example, it will first compare the \(0^{th}\) element with the \(8^{th}\) element, then the \(1^{st}\) element with the \(9^{th}\) element, and so on. Bucket sort, on the other hand, separates the elements into buckets using `buckets[int(len(arr) * num)]`, initializing `len(arr)` buckets. It then sorts each bucket using insertion sort and combines them.

  - Even though both use insertion sort, shell sort is in-place while bucket sort is not, due to the use of buckets which results in a space complexity of \(O(n)\). However, both are adaptive (since insertion sort can iterate the array once in the best case), online algorithms (newly added elements are inserted into their optimal place), and stable.

  - Bucket sort is an offline algorithm because it needs to separate elements into buckets, requiring knowledge of all elements in advance. Shell sort is an online algorithm because it involves comparisons without needing prior knowledge of all elements.

- **Bucket Sort** time complexity is \(O(n)\):
  - \(n\) for initializing \(n\) buckets, iterating through elements to separate them into buckets, then sorting and combining them.

- **Shell Sort** time complexity is not fixed and depends on the gap sequence used.

Shell sort time complexity is not fixed, depends on the gap sequence.
![[Pasted image 20240607112158.png]]
