Since $U$ is large and $h(k)$ is much smaller than $U$, is it possible that we have two different keys, say $a$ and $b$, that have the same hash value? Yes! It is possible for two completely different keys to have the same hash value. We'll call this a collision.

> A collision is a situation where two or more keys have the same hash value.

Therefore, when we design a hash function, we aim to minimize the possibility of collisions. However, if a hash collision occurs, how can we handle it? There are two primary methods for dealing with collisions:
- Chaining
- Open Addressing