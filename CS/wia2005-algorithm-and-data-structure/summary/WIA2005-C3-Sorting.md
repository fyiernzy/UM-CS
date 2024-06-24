**Stable/ Non-stable**
- A stable algorithm preserves the relative order of elements with equal keys (values) after sorting.
- A non-stable algorithm does not preserve the relative order of elements with equal keys (values) after sorting.

**In-place/ Not in-place**
- An in-place algorithm does not require additional memory spaces for sorting.
- A not in-place algorithm requires additional memory spaces for sorting.

**Adaptive/ Non-adaptive**
- An adaptive algorithm takes advantages of pre-sorted input array.
- A non adaptive algorithm does not take advantages of pre-sorted input array.

**Online/ Offline**
- An online algorithm does not requires all input to be available at the beginning of sorting.
- An offline algorithm requires all input to be available at the beginning of  sorting.

> An online algorithm processes elements of the input as they arrive and can produce a sorted output incrementally.
> 
> An offline algorithm requires all input to be available before it starts the sorting process.

|               | Stable/ Non-stable                      | In-place/ Not in-place                | Adaptive/ Non-adaptive | Online/ Offline |
| ------------- | --------------------------------------- | ------------------------------------- | ---------------------- | --------------- |
| Bubble Sort   | Stable                                  | In-place                              | Adaptive               | Offline         |
| Counting Sort | Stable                                  | Not in-place                          | Non-adaptive           | Offline         |
| Radix Sort    | Stable                                  | Not in-place<br>*(Use counting sort)* | Non-adaptive           | Offline         |
| Bucket Sort   | Stable<br>*(If insertion sort is used)* | Not in-place                          | Non-adaptive           | Offline         |
| Shell Sort    | Non stable                              | In-place                              | Non-adaptive           | Offline         |

| Order          | In an ... order array, every element $k_n$ is ... its previous element $k_{n-1}$ |
| -------------- | -------------------------------------------------------------------------------- |
| Increasing     | larger than                                                                      |
| Non-decreasing | larger than or equal to                                                          |
| Decreasing     | smaller than                                                                     |
| Non-increasing | smaller than or equal to                                                         |

Bubble Sort
Shell Sort
Radix Sort
Counting Sort
Bucket Sort





