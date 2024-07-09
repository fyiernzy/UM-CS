```html
<html>
<body>
<form method="GET" actoin="whatever.html">
	Select a country:
	<script>
		const countries = [
			{ 
				code: "AR",
				name: "Argentina",
				capital: "Buenos Aires"
			},
			{ 
				code: "AT",
				name: "Austria",
				capital: "Vienna"
			},
			{ 
				code: "BE",
				name: "Belgium",
				capital: "Brusseis"
			},
			{ 
				code: "CA",
				name: "Canada",
				capital: "Ottawa"
			}
		]
		const form = document.querySelector("form");
		const select = document.createElement("select");
		for(let i = 0; i < countries.length; i++) {
			const option = document.createElement("option");
			const country = countries[i];
			option.value = country.code;
			option.textContent = country.name;
			select.appendChild(option);
		}
		
		select.addEventListener("change", () => {
			const country = countries.find((country) => {
			country.code == select.value } );
			document.querySelector("div")
					.textContent = `capital is ${country.capital}`
		});
		
		form.appendChild(select);
	
	</script>
	<div></div>
</form>
</body>
</html>
```

# Question 3
---
```javascript
// Q3a
const there = document.getElementById("there");
there.style.color = "green";

// Q3b
const listItems = document.querySelectorAll("li");
listItems.forEach((item) => {
	console.log(item);
})

// Q3c
const specialAnchor = document.querySelector("a.special");
specialAnchor.addEventListener("mouseover", () => {
	alert("Book a tour");
})
```
