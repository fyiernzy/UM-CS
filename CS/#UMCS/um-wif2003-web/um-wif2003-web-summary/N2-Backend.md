*Reference: Chapter 7*

# 1 - Introduction
---
## 1.1 - MERN Stack
| Tech       | Explanation                                                                                                  |
| ---------- | ------------------------------------------------------------------------------------------------------------ |
| MongoDB    | A scalable document-oriented NoSQL database known for rich queries and auto-sharding.                        |
| Express.js | A Node.js web application framework that simplifies handling HTTP logic.                                     |
| React.js   | A popular JavaScript library for building user interfaces, executable in the browser or on a Node.js server. |
| Node.js    | An event-driven JavaScript runtime for server-side and networking applications, built on Chrome's V8 engine. |

## 1.2 - Definitions
`npm`
- A JavaScript-based package manager hosting thousands of packages published by developers.
- A package is a folder containing a program described by a `package.json` file.
- Provides a command-line tool for installing and managing packages easily.
	- [Learn more about npm install](https://docs.npmjs.com/cli/v10/commands/npm-install/)

`package.json`
- Holds metadata about a project, including its name, version, dependencies, license information and configuration data.
- Provides information to `npm` to help identify the project and handle dependencies.
- Typically located in the project root
	- [Learn more about package.json](https://docs.npmjs.com/cli/v10/configuring-npm/package-json/)

**Middleware**
- Has access to the request object (`req`), the response object (`res`) and the next middleware function (`next`) in the application's request-response cycle.
- Can execute code, modify `req` and `res`, end the request-response cycle, or call the next middleware in the stack
	- [Learn more about writing middlewares](https://expressjs.com/en/guide/writing-middleware.html)

## 1.3 - Library vs Framework
### 1.3.1 - Definition
- **Library**
	- A library is a collection of functions, each of which can be used separately.
- **Framework**
	- A framework pre-packages common tasks that developers perform in every application, avoiding the need for basic groundwork when starting a new project.
	- Using frameworks may sacrifice some control since they make certain decisions for the developer, but they do not replace creativity.

| Lightweight Framework                                    | Heavyweight Framework                                    |
| -------------------------------------------------------- | -------------------------------------------------------- |
| Require less configuration *to make an application work* | Require more configuration *to make an application work* |
| Examples: Spring (Java), Express (Node.js)               | Examples: Rails (Ruby)                                   |

### 1.2.2 - Key Difference: Inversion of Control
> Hollywood Principle states that: *Don't call us, We'll call you*

- **Library**: We call a library, but a framework call us.
- **Framework**: A framework calls us. When using frameworks, the control flow is predetermined, and developers fill in predefined white spots.

# 2 - Node.js
---
- Node.js is a JavaScript runtime built on Chrome's V8 engine. 
	- V8 is Google's open-source, high-performance JavaScript engine.
	- Before Node.js, JavaScript could only run in a web browser. Node.js allows execution of JavaScript code outside the browser.
		- [Learn more about Node.js](https://nodejs.org/en)
		- [Node.js API documentation](https://nodejs.org/docs/latest/api/)

**Key Features**
- Free, open-source, and cross-platform.
- Allows developers to run JavaScript code server-side
- Uses an event-driven, non-blocking I/O model, making it lightweight and efficient

**Why Use Node.js for Backend?**
- Uses JavaScript, eliminating the need to learn a new language
- Popular and versatile for servers, web applications, command line tools and scripts.

**Best Practices**
- Use `node <js-file-name>` to run a Node.js file
- When sharing a Node project, do not copy `node_modules`. Run `npm install` instead; it's faster than copying.
- If using Git for version control, add `node_modules/` to the `.gitignore` file in both frontend/client and backend/server to prevent errors and long upload times.

# 3 - Express.js
---
**Definition**
1. Express is a minimal, flexible and unopinionated Node.js web application framework. 
2. It is lightweight and used to develop web application easily and quickly on the Node.js platform.
3. An Express application is essentially a series of middleware function calls.
4. *Express is a routing and middleware web framework with minimal functionality.

**Why Use Express?**
- Extensive tutorials available online
- Robust and active developer community
- Lightweight compared to other frameworks
- Fast, flexible, and minimalist.
- Allows developers to focus on writing code rather than setting up a web application.

**Features**
- Supports routings, template engine, and file uploading. 
- Suitable for developing SPAs and real-time applications.

[Learn more about Express.js](https://expressjs.com/)

|                    | ExpressJS                                                                                                                                       | NextJS                                                                                            |
| ------------------ | ----------------------------------------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------- |
| Server Usage       | Used for both server-side and client-side                                                                                                       | Used for server-side                                                                              |
| Plugin             | Supports event subscription and entities with the Express Gateway plugin                                                                        | Uses external tools like Webpack and Babel                                                        |
| Speed              | Faster due to minimal tools and functions.                                                                                                      | Fast because of static destinations.                                                              |
| Rendering Approach | Traditional and efficient                                                                                                                       | Complex and Slow                                                                                  |
| Learning Curve     | Straightforward syntax, easier to learn                                                                                                         | More complex to due to React-centric approach                                                     |
| Scalability        | Flexible and scalable with minimal configurations                                                                                               | Allows for scaling multiple pages                                                                 |
| Static generation  | Uses deferred static generation for faster build times and performance. *A page creation can be postponed until a request is raised by a user.* | Uses Incremental Static Regeneration to build or update pages without rebuilding the entire site. |

https://www.mirrorfly.com/blog/nextjs-vs-expressjs/

# 4 - HTTP Requests
---

| Methods | Explanation                                                                                                 |
| ------- | ----------------------------------------------------------------------------------------------------------- |
| GET     | Requests a representation of the specified resource. Should only retrieve data.                             |
| POST    | Submits an entity to the specified resource, often causing a change in state or side effects on the server. |
| PUT     | Replaces all current representations of the target resource with the request payload.                       |
| DELETE  | Deletes the specified resource.                                                                             |

[Learn more about HTTP methods](https://developer.mozilla.org/en-US/docs/Web/HTTP/Methods)

| GET                                                                                                                 | POST                                                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| An array of variables passed to the current script via the URL parameters.                                          | An array of variables passed to the current script via the HTTP POST method.                                                                         |
| GET requests can be cached.                                                                                         | POST requests cannot be cached.                                                                                                                      |
| Information sent is visible to everyone (all variables names and values are displayed in the URL)                   | Information sent is invisible to others (all names/values are embedded within the body of the HTTP request)                                          |
| It is possible to bookmark the page                                                                                 | It is not possible to bookmark the page.                                                                                                             |
| Has limits on the amount of information to send (about 2000 characters).                                            | Has no limits on the amount of information to send.                                                                                                  |
| Suitable for sending non-sensitive data. Should never be used for sending passwords or other sensitive information. | Suitable for sending sensitive and non-sensitive data. Support advanced functionality such as multi-part binary input for uploading files to server. |

# 5 - Coding Examples
---
**Basic Route**
```javascript
app.get("/", function(req, res) {
	res.send("Hello World!");
})
```
- The first parameter `"/"` is the root URL or path.
- The second parameter is the **callback function**, which takes two arguments: `req` (request) and `res` (response)
	- `req` contains all the information about the request that triggered this route.
	- `res` contains information about the response we will send.


**Starting the Server**
```javascript
app.listen(3000, function() {
	console.log('Server has started!');
})
```

**Handling Undefined Routes**
```javascript
app.get("*", function(req, res) {
	res.send("Page Not Found!");
})
```

- The `*` route matches any undefined route, useful for displaying an error message when users try to access a route that isn't defined.
- Note: Placing the `*` route at the beginning will cause it to catch all requests, preventing other routes from being accessed. 
  *If one of the callback functions is running, the HTTP request is handled and does not move on to other routes, similar to how `if-else` and `try-catch` work.*

**Defining Route Pattern**
Instead of defining a separate route for every page, use route parameters to create patterns:
```javascript
app.get("/r/soccers", (req, res) => {
	res.send("WELCOME TO SOCCERS!");
})

app.get("/r/musics", (req, res) => {
	res.send("WELCOME TO MUSICS!");
})

app.get("/r/movies", (req, res) => {
	res.send("WELCOME TO MOVIES!");
})
```

```javascript
app.get("/r/:topic", (req, res) => {
	const { topic } = req.params; // or req.params.topic
	res.send(`WELCOME TO ${topic.toUpperCase()}`)
})
```
- This pattern matches any topic and responds accordingly.

More examples:
```javascript
app.get("/r/soccer/comments/8dvncz/daily_discussion_20180421/",(req, res) => {}) 

app.get("r/:topic/comments/:id/:title/", (req, res) => {})
```


[Learn more about Express generator](https://expressjs.com/en/starter/generator.html)