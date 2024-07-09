### Beginner-Level JavaScript Coding Questions:

1. **Selection Methods:**
   Write a JavaScript code to select an element with the id `header` and log its content to the console.
```javascript
// Method 1
const header = document.querySelector("#header");

// Method 2
const header = document.getElementById("header");
```

2. **Changing Style:**
   Write a JavaScript code to change the font size of all `<h2>` elements to `24px`.
```javascript
// Method 1
const h2Elements = document.querySelectorAll("h2");
h2Elements.forEach((element) => {
	element.style.font = "24px";
})

// Method 2
const h2Elements = document.getElementsByTagName("h2");
h2Elements.forEach((element) => {
	element.style.font = "24px";
})
```

3. **Changing Class:**
   Write a JavaScript code to remove the class `hidden` from an element with the id `menu`.

```javascript
const menu = document.querySelector("#menu");
// const menu = document.getElementById("menu");
menu.classList.remove("hidden");
```

4. **Changing Content:**
   Write a JavaScript code to change the text content of a paragraph with the class `description` to "Welcome to our website!".

```javascript
const description = document.querySelector(".description");
// const description = document.getElementsByClassName("description")[0];
description.textContent = "Welcome to our website!";
```

5. **Changing Attributes:**
   Write a JavaScript code to change the `src` attribute of an image with the id `logo` to "new-logo.png".

```javascript
const logo = document.querySelector("#logo");
logo.setAttribute("src", "new-logo.png");
```

### Intermediate-Level JavaScript Coding Questions:

1. **Selection Methods:**
   Write a JavaScript code to select all elements with the class `item` and change their text color to red.

```javascript
const items = document.querySelectorAll(".item");
// const items = document.getElementsByClassName("item");
items.forEach((item) => {
	item.style.color = "red";
})
```

2. **Changing Style:**
   Write a JavaScript code to toggle the background color of a div with the id `container` between white and gray when a button is clicked.
```javascript
const container = document.querySelector("#container");
container.style.backgroundColor = "white";
container.addEventListener("click", () => {
	const isWhiteColor = this.style.backgroundColor === "white";
	this.style.backgroundColor = isWhiteColor ? "gray" : "white";
})
```

3. **Changing Class:**
   Write a JavaScript code to add the class `selected` to all list items inside a `<ul>` when any of them is clicked.

```javascript
const unorderedListItems = document.querySelectorAll("ul li");

const addSelectedClass = () => {
	unorderedListItems.forEach((item) => {
		item.classList.add("selected");
	})
}

unorderedListItems.forEach((item) => {
	item.addEventListener("click", addSelectedClass);
});
```

4. **Changing Content:**
   Write a JavaScript code to append a new list item with the text "New Item" to an unordered list with the id `list`.

```javascript
const list = document.getElementById("list");
const listItem = document.createElement("li");
listItem.textContent = "New Item";
list.appendChild(listItem);
```

5. **Changing Attributes:**
   Write a JavaScript code to disable all input fields within a form with the id `user-form`.

```javascript
const inputFields = document.querySelectorAll("#user-form input");
inputFields.forEach((field) => {
	field.disabled = true;
})
```

### Advanced-Level JavaScript Coding Questions:

1. **Selection Methods:**
   Write a JavaScript code to select all even-numbered list items inside an ordered list and change their background color to lightblue.

```javascript
const listItems = document.querySelectorAll("ol li");
for(var i = 1; i < listItems.length; i += 2) {
	listItems[i].style.backgroundColor = "lightblue";
}

// Method 2 (recommended)
const evenListItems = document.querySelectorAll("ol li:nth-child(even)");
evenListItems.forEach((item) => {
	item.style.backgroundColor = "lightblue";
})
```

2. **Changing Style:**
   Write a JavaScript code to create a function that changes the font style of a paragraph to italic and underlined when the mouse hovers over it and reverts it back when the mouse leaves.

```javascript
const paragraph = document.querySelector("#paragraph");
paragraph.addEventListener("mouseover", () => {
	paragraph.style.fontStyle = "italic";
	paragraph.style.textDecoration = "underline";
})

paragraph.addEventListener("mouseleft", () => {
	paragraph.style.fontStyle = "";
	paragraph.style.textDecoration = "";
})
```

3. **Changing Class:**
   Write a JavaScript code to create a function that toggles a class `active` on a navigation link when it is clicked, and removes the class from any other active link.
```javascript
const navLinks = document.querySelectorAll("a");
const removeOtherActiveLinks = (activeLink) => {
	navLinks.forEach((link) => {
		if(link !== activeLink) {
			link.classList.remove("selected");
		}
	})
}
navLinks.forEach((link) => {
	link.addEventListener("click", () => {
		if(!link.classList.contains("active")) {
			link.classList.add("active");
		}
		
		removeOtherActiveLinks(link)
	})
})
```

4. **Changing Content:**
   Write a JavaScript code to create a function that swaps the text content between two divs with the ids `div1` and `div2` when a button is clicked.

```javascript
const button = document.querySelector("#button");
const div1 = document.querySelector("#div1");
const div2 = document.querySelector("#div2");

button.addEventListener("click", () => {
	const temp = div1.textContent;
	div1.textContent = div2.textContent;
	div2.textContent = temp;
})
```

5. **Changing Attributes:**
   Write a JavaScript code to create a function that changes the `href` attribute of all anchor tags to `https://example.com` if they currently have a `href` attribute that starts with `http://`.

```javascript
const links = document.querySelectorAll("a");
links.forEach((link) => {
	const href = link.getAttribute("href");
	if(href.startsWith("http://")) {
		link.setAttribute("href", "https://example.com");
	}
})
```