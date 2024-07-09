*Reference: Chapter 8*

# Overview
---
- Embedded JavaScript (EJS) is a simple templating language that generates HTML markup with plain JavaScript. 
- JavaScript code and be embedded in an EJS file using simple template tags `<% %>`

# Why using EJS?
---
- Uses plain JavaScript and simple syntax.
- Fast development time
- Fast execution as EJS caches the intermedia JS functions.
- Easy debugging because errors are plain JavaScript exceptions.
- Large community of active users and ongoing development.

# Configuration
---
**Installation**
`npm install ejs --save`

**Setting Up EJS in Express**
```javascript
app.use(express.static("public"))
app.set("view engine", "ejs")

app.get("/", (req, res) => {
	res.render("posts"); // no need .ejs as extension
})
```

# Examples
---
## Basic Usage
HTML example: `love.ejs`
```html
<h1>You fell in love with: <%=thingVar %></h1>
```

Route example: `index.js`
```javascript
app.get("/fallinlovewith/:thing", function(req, res) {
	 var thing = req.params.thing;
	 res.render("love.ejs", { thingVar: thing});
})
```

## Conditional rendering
```ejs
<% if(thingVar.toLowerCase() === "javascript") {%> 
	<p>GOOD CHOICE! JAVASCRIPT IS THE BEST!</P>
<%} else { %>
	<p>Bad choice! You should have choose JavaScript!</p>
<% } %>
```

## List rendering
`index.js`
```javascript
app.get("/posts", function(req, res) {
	 var posts = [
		 { title: "Introduction to HTML", author: "Chiam" },
		 { title: "How to write elegant JavaScript", author: "Mary" },
		 { title: "Express Framework and EJS", author: "Ali" }
	 ]
	 res.render("posts.ejs", { postVar: posts });
});
```

`post.ejs`
```ejs
<h1>The Posts Page</h1>

<h2> Option 1: Using for loop </h2>
<% for(var i = 0; i < postsVar.length; i++) { %> 
	<li>
		<%= postsVar[i].title %> - 
		<strong><%= postsVar[i].author %></strong>
	</li>
<% } %>

<h2> Option 2: Using forEach method </h2>
<% postsVar.forEach(function(post) { %> 
	<li>
		<%= postsVar[i].title %> - 
		<strong><%= postsVar[i].author %></strong>
	</li>
<% }) %>
```


## Partials
Partials allow developers to define reusable parts of HTML

`views/partials/header.ejs`
```html
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>EJS Demo App</title>
		<link rel="stylesheet" href="/app.css">
	</head>
</html>
```

`views/partials/footer.ejs`
```html
		<p>Copyright 2024</p>
	</body>
<html>
```

Including partials:
```ejs
<%- include('partials/header.ejs') %>
<%- include('partials/footer.ejs') %>
```

## Handling Forms and POST Requests
`views/friends.ejs`
```ejs
<h1>Friends List Goes Here!</h1>
<% friends.forEach(function(friend){ %>
	<li><%= friend %></li>
<% }); %>

<form action="/addfriend" method="POST">
	<input type="text" name="newfriend" placeholder="name">
	<button>I made a new friend!</button>
</form>
```

`app.js`
```javascript
var friends = ["Tony", "Miranda", "Justin", "Pierre", "Lily"];

app.get("/friends", function(req, res) { 
	res.render("friends", {friends: friends});
});

// action="addfriend" method="POST"
app.post("/addfriend", function(req, res) {
	var newFriend = req.body.newfriend;
	friends.push(newFriend); // name="newfriend"
	res.redirect("/friends");
})
```

# Reference
---
1. https://ejs.co/
