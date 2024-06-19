We might have heard of the Greedy Algorithm before since it's famous as a "high-level" problem-solving technique. It's easier to implement compared to Dynamic Programming or Divide and Conquer, which usually involve recursion and can cause `StackOverflowError`. 

So, what's a Greedy Algorithm? Let's explore the word "greedy" here. Greedy, defined in [Oxford Dictionary](https://www.oxfordlearnersdictionaries.com/definition/english/greedy), means *wanting more money, power, food, etc. than you really need*. 

Greedy Algorithm aims to make a series of choices, each of which looks the best at the moment, to achieve a goal. Or more formally, **it aims to find a locally optimal solution with the hope that this will lead to a globally optimal solution.** 

A greedy algorithm should exhibit two properties: the greedy-choice property and optimal substructure. (Definition in *Introduction to Algorithm, 3th Edition*)

> The first key ingredient is the ***greedy-choice property***: we can assemble a globally optimal solution by making locally optimal (greedy) choices. In other words, when we are considering which choice to make, we make the choice that looks best in the current problem, without considering results from subproblems. 

> A problem exhibits ***optimal substructure*** if an optimal solution to the problem contains within it optimal solutions to subproblems. 

You might sigh and think: Why do they sound so similar, and the description is just so bothersome? Let’s simplify them!

- The greedy-choice property means that making the best choice available at each step leads to the overall best solution.
- Optimal substructure means that solving a problem optimally involves solving its subproblems optimally.

Using a suitable analogy to illustrate the idea, we can tell that:
- Greedy-choice property: If I choose the best move in a game at each turn, I will win the game.
- Optimal substructure: If I break down my project into smaller tasks and complete each task in the best way possible, my entire project will be completed in the best way.

*If everything is the same, we don't need to think about what to take, right? If there are no constraints, why don't we just take all of them? Therefore, in any given problem, we need a value and constraints. Sometimes the value might be implicit, so we need to figure it out ourselves. We'll discover this in detail in a later chapter.*

*A Greedy Algorithm involves making a sequence of choices. If a problem allows us to make only one choice, then using a greedy algorithm is unnecessary. Instead, we can use a simple method: eliminate the invalid options and use the `max()` function in your favorite programming language to find the correct one.*

The concept and mechanism of the Greedy Algorithm are straightforward. First, we identify the available choices. Then, we determine their value and sort them. At each iteration, we pick the choice with the maximum value until the constraints are met. From an algorithmic perspective, this step is called "making the locally optimal choice.

We call it a locally optimal choice because each choice seems the best at the moment, but it might not lead to the most globally optimal solution. In other words, the Greedy Algorithm doesn't guarantee the best solution in every scenario.

Let's take a look on the following example with maximum weight of 50:

```python
class Item:
	def __init__(self, id, price, weight):
		self.id = id
		self.price = price
		self.weight = weight

items = [
	Item(id=1, price=60, weight=10),
	Item(id=2, price=100, weight=20),
	Item(id=3, price=120, weight=30),
]
```
In this case, how can we tell the value of each item? We can use the following formula: $$value = \frac{price}{weight}$$
to calculate its value. We want to make sure every weight we take has the highest value.

```python
values = []
for item in items:
	values.append(item.price / item.weight)
print(values) # [6, 5, 4]
```

In this scenario, using a greedy algorithm, I would pick item 1 and item 2 with a total price of 160 and weight of 30. But is it the best combination? No! We could pick item 2 and item 3 with a total price of 220 and weight of 50. Refer to the following diagram for a complete analysis:

![[Pasted image 20240527110857.png]]

So we can tell that in a [[0-1 Knapsack Problem]], the Greedy Algorithm doesn't guarantee to find the optimal solution. But it does in [[Fractional Knapsack Problem]]. 

![[Pasted image 20240527111231.png]]