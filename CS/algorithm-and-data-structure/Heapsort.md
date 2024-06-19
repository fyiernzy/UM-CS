# Heap
A heap is a complete binary tree where the parent node is always larger than or equal to its child nodes (max-heap), or always smaller than or equal to its child nodes (min-heap).

Heapsort views an array as a heap. For an array $A$:
- $A[0]$ has $A[1]$ as its left child and $A[2]$ as its right child.
- $A[1]$ has $A[3]$ as its left child and $A[4]$ as its right child.

Index calculations:
- `left = 2 * parent + 1`
- `right = 2 * parent + 2`
- `parent = floor((child - 1) / 2)`

# Heapsort
1. Heapify
2. Build heap
3. Heapsort

## Heapify
- Check and swap the parent node with the child node if $parent > child$ (min-heap) or $parent < child$ (max-heap).
- Continue the check-swap process until a leaf node is reached or no swapping is necessary.

## Build Heap
- Start from the last non-leaf node and perform heapify.

## Heapsort
- Swap the root with the last heap element, then reduce the heap size by one.
- Repeat the process until the heap size is 1.

https://cs.stackexchange.com/questions/141748/how-is-the-reccurence-of-max-heapify-tn-t2n-3-theta1
https://stackoverflow.com/questions/9099110/worst-case-in-max-heapify-how-do-you-get-2n-3