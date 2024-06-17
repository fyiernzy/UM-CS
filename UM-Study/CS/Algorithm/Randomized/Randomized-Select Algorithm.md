#algorithm #quickselect #randomization

The RANDOMIZED-SELECT algorithm is used to find the $i$-th smallest element (also known as the $i$-th order statistic) in an unordered list. 

### RANDOMIZED-SELECT Algorithm

The algorithm is similar to the `Quickselect algorithm`, and it works as follows:

1. **Base Case**: If the list contains only one element, return that element.
2. **Partition**: Randomly select a pivot element from the list and partition the list into two sublists: elements less than the pivot and elements greater than the pivot.
3. **Recur**:
   - If the pivot is the $i$-th smallest element, return it.
   - Otherwise, recursively apply the algorithm to the appropriate sublist.

### Python Code Implementation

```python
import random

def partition(arr, low, high):
    pivot = arr[high]
    i = low - 1
    for j in range(low, high):
        if arr[j] <= pivot:
            i += 1
            arr[i], arr[j] = arr[j], arr[i]
    arr[i + 1], arr[high] = arr[high], arr[i + 1]
    return i + 1

def randomized_partition(arr, low, high):
    pivot_index = random.randint(low, high)
    arr[pivot_index], arr[high] = arr[high], arr[pivot_index]
    return partition(arr, low, high)

def randomized_select(arr, low, high, i):
    if low == high:
        return arr[low]
    
    pivot_index = randomized_partition(arr, low, high)
    k = pivot_index - low + 1  # Number of elements in the low side including pivot
    
    if i == k:  # The pivot value is the answer
        return arr[pivot_index]
    elif i < k:
        return randomized_select(arr, low, pivot_index - 1, i)
    else:
        return randomized_select(arr, pivot_index + 1, high, i - k)

# Example usage
arr = [3, 2, 9, 4, 7, 6, 5, 1, 8]
i = 4
result = randomized_select(arr, 0, len(arr) - 1, i)
print(f"The {i}-th smallest element is: {result}")
```

### Explanation

1. **Partition Function**:
   - `partition` rearranges the elements in the list so that all elements less than or equal to the pivot are on the left, and all elements greater than the pivot are on the right.

2. **Randomized Partition Function**:
   - `randomized_partition` selects a random pivot, swaps it with the last element, and then calls the partition function.

3. **Randomized Select Function**:
   - `randomized_select` recursively finds the $i$-th smallest element by partitioning the list and then narrowing down the search to the appropriate sublist based on the pivot position.