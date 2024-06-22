Quadratic probing uses a hash function of the form:
$$h(k, i) = (h'(k) + c_1 i + c_2 i^2) \mod m$$
where $h'(k)$ is an auxiliary hash function, and $c_1$ and $c_2$ are positive auxiliary constants, and $i = 0, 1, \ldots, m-1$.

However, quadratic probing still suffers from [[Secondary Clustering]].



