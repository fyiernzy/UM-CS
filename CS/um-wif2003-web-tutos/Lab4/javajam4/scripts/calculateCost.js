const coffeeWithPrices = {
    "Brazil Cerrado": 42,
    "Vanguard Blend": 42,
    "Organic Marcala": 56,
    "Taster Pack Trio": 69,
  };
  
  while (true) {
    const message = "Enter Coffee Bean ID (1-4) (0 to stop):\n";
    const coffeeNames = Object.keys(coffeeWithPrices); // Convert coffee names into an array
    coffeeNames.forEach((coffee, index) => {
      message += `${index + 1}. ${coffee}: RM${coffeeWithPrices[coffee]} per pack\n`;
    });
  
    const choice = prompt(message);
  
    if (+choice === 0) {
      break;
    }
  
    if (choice < 1 || choice > coffeeNames.length) {
      alert("Coffee Bean ID must be between 1 and 4 or 0 to stop");
      continue;
    }

    const chosenCoffee = coffeeNames[choice - 1];
    const quantity = prompt("Enter number of pack of the coffee beans that you want to purchase:");
    const totalCost = quantity * coffeeWithPrices[chosenCoffee];
    alert(`Total cost for ${quantity} pack(s) of ${chosenCoffee} is RM${totalCost}`);
    break;
  }
  