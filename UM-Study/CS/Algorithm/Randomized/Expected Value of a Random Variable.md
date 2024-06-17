The expected value (or mean) of a [[Random Variable]] is a measure of the center of its distribution. It is the weighted average of all possible values that the random variable can take on, where the weights are the probabilities of those values.

For a discrete random variable $X$ with possible values $x_1, x_2, \ldots, x_n$ and corresponding probabilities $p_1, p_2, \ldots, p_n$, the expected value $E(X)$ is given by:
$$E(X) = \sum_{i=1}^{n} x_i p_i$$

For a continuous random variable, the expected value is calculated using an integral.

**Example:**
For the random variable $X$ representing the number of heads in three coin flips (assuming a fair coin), the expected value is calculated as follows:
$$E(X) = \sum_{k=0}^{3} k \cdot P(X=k)$$

Where $P(X=k)$ can be calculated using the binomial distribution:
$$P(X=k) = \binom{3}{k} \left( \frac{1}{2} \right)^3$$

So,
$$E(X) = 0 \cdot \frac{1}{8} + 1 \cdot \frac{3}{8} + 2 \cdot \frac{3}{8} + 3 \cdot \frac{1}{8} = 0 + \frac{3}{8} + \frac{6}{8} + \frac{3}{8} = 1.5$$
