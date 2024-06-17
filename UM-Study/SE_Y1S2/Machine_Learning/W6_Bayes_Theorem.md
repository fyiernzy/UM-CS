# Bayes Theorem

## Markov Model

The Markov property states that the *future state in a Markov Model depends only on the current state and is independent of the past states.*

To understand the Markov property in detail, we first need to familiarize ourselves with the concept of states. In the context of Markov Models, a state represents a possible outcome in a sample space. For instance, in weather forecasting, the states could be rainy, sunny, and cloudy. It is important to note that states can transition from one to another. For example, it can be rainy today but cloudy tomorrow, or it can remain rainy tomorrow. Each state has a corresponding transition probability, indicating the likelihood of transitioning to other states.

For instance, if today is a rainy day, the probability of it being cloudy tomorrow might be 0.4, the probability of it being sunny might be 0.5, and the probability of it remaining rainy might be 0.1. It is worth noting that the sum of all these probabilities should always be 1. This probability associated with the transition from one state to another is known as the transition probability.

We can represent the transitions between states using a state machine, which is essentially a directed graph. To capture the transition probabilities between each pair of states, we use an adjacency matrix referred to as the transition matrix.

## Hidden Markov Model (HMM)

However, sometimes we may not know the state directly. The sample space can be determined, but the exact state might not. In other words, we may not know the hidden state directly in a Markov Model. In the case of the Hidden Markov Model (HMM), the term "Hidden" refers to the unobserved or unknown states. It implies that the exact states themselves cannot be directly observed. However, we do have observations available to help us identify the hidden states. Observations are pieces of information that we can observe directly, which provide clues about the hidden states.

For instance, consider the example of Calvin, whose mood somehow reflects the weather to some extent. Let's assume that Calvin has a 0.7 probability of being happy during sunny weather, 0.2 probability of being happy during rainy weather, and 0.1 probability of being happy during cloudy weather. Similarly, he has a 0.6 probability of being sad during cloudy weather, 0.1 probability of being sad during sunny weather, and 0.3 probability of being sad during rainy weather. These probabilities, known as emission probabilities, represent the likelihood of observing a specific mood (emission) given a hidden state (weather).

To represent the emission probabilities, we can use an emission matrix, also known as the emission probabilities matrix or observation matrix. The emission matrix captures the probabilities of observing each possible emission (mood) for each hidden state (weather).
