#algorithm #greedy-algorithm #data-compression #priority-queue #tree
# Introduction
1. Huffman coding is an algorithm for lossless data compression. 
2. The idea is to assign variable-length codes to input characters instead of fixed-length codes. 
4. Frequently used characters have shorter codewords, and less frequently used characters have longer codewords.
5. This way, the total number of bits used to represent the data is minimized, achieving compression rates of 20% to 90%.

*A codeword is a binary string used to represent a character*

# Mechanism
Consider the following example:
![[Pasted image 20240527115629.png]]
The table shows a frequency table of characters `a` to `f` with their fixed-length and variable-length codewords. Let's analyze how it can effectively compress data.

Suppose we write character `a` as `000`, taking up 3 bits, and do the same for the rest. The total bits used will be:  $$(45 + 13 + 12 + 16 + 9 + 5) \cdot 3 \cdot 1000 = 100 \cdot 3 \cdot 1000 = 300,000 \text{ bits}$$
Using variable-length codewords, the total bits used will be: $$(45\cdot1+13\cdot3+12\cdot3+16\cdot3+9\cdot4+5\cdot4) \cdot 1000=224,000 \text{ bits}$$
This saves 25% of the storage:
$$\frac{224000}{300000} \cdot 100\% \approx 75\%$$



# Implementation
### Step 1: Create the Huffman Tree
1. Create a priority queue or min-heap and insert all characters with their frequencies.
2. While there is more than one node in the queue:
    - Extract the two nodes with the lowest frequency. ([[Greedy Algorithm]] here)
    - Create a new internal node with a frequency equal to the sum of the two nodes' frequencies.
    - Make the two extracted nodes the left and right children of the new node.
    - Insert the new node back into the priority queue.
3. The remaining node is the root of the Huffman tree.

```python
import heapq
from collections import Counter

class HuffmanNode:
    def __init__(self, freq, char=None, left=None, right=None):
        self.freq = freq
        self.char = char
        self.left = left
        self.right = right

    def __lt__(self, other):
        return self.freq < other.freq

def build_huffman_tree(frequency_table):
    heap = [HuffmanNode(freq, char) for char, freq in frequency_table.items()]
    heapq.heapify(heap)

    while len(heap) > 1:
        left = heapq.heappop(heap)
        right = heapq.heappop(heap)
        merged = HuffmanNode(left.freq + right.freq, left=left, right=right)
        heapq.heappush(heap, merged)

    return heap[0]
```

### Step 2: Generate Huffman Codes
1. Traverse the Huffman tree.
2. Assign a binary code to each character: 0 for the left branch and 1 for the right branch.

```python
def generate_huffman_codes(node, prefix="", codebook={}):
    if node:
        if node.char:
            codebook[node.char] = prefix
        generate_huffman_codes(node.left, prefix + "0", codebook)
        generate_huffman_codes(node.right, prefix + "1", codebook)
    return codebook
```

### Step 3: Encode the Data
1. Create a frequency table from the data.
2. Build the Huffman tree.
3. Generate Huffman codes.
4. Encode the data using the generated codes.

```python
def huffman_encoding(data):
    frequency_table = Counter(data)
    huffman_tree = build_huffman_tree(frequency_table)
    huffman_codes = generate_huffman_codes(huffman_tree)
    encoded_data = "".join(huffman_codes[char] for char in data)
    return encoded_data, huffman_tree
```

### Step 4: Decode the Data
1. Use the Huffman tree to decode the encoded data.

```python
def huffman_decoding(encoded_data, huffman_tree):
    decoded_data = []
    node = huffman_tree
    for bit in encoded_data:
        node = node.left if bit == "0" else node.right
        if node.char:
            decoded_data.append(node.char)
            node = huffman_tree
    return "".join(decoded_data)
```

### Example Usage
```python
data = "feeccbb"
encoded_data, huffman_tree = huffman_encoding(data)
print(f"Encoded data: {encoded_data}")
decoded_data = huffman_decoding(encoded_data, huffman_tree)
print(f"Decoded data: {decoded_data}")
```

Output:
```bash
Encoded data: 00111101011010
Decoded data: feeccbb
```

![[Pasted image 20240527120326.png]]
![[Pasted image 20240527120452.png]]
![[Pasted image 20240527134102.png]]
# Analysis
- **Time Complexity:**
    - Building the Huffman Tree: $O(n \log n)$, where $n$ is the number of unique characters (nodes) because each insertion and extraction from the priority queue takes $O(\log n)$ time.
    - Generating Codes: $O(n)$, since we traverse the tree to generate codes.
    - Overall Time Complexity: $O(n \log n)$

- **Auxiliary Space Complexity:**
    - The auxiliary space complexity is $O(n)$, mainly for storing the nodes in the priority queue and the Huffman tree.