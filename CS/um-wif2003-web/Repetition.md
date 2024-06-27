Node Package Manager (`npm`) is the default package manager for the JavaScript runtime environment. It allows developers to find, build and manage code packages.


Material UI (MUI) offers a rich set of pre-designed React components that implements Google's Material Design. https://mui.com/material-ui/

Bootstrap is a front-end framework that provides a wide range of pre-designed components and styles. https://getbootstrap.com/

Mongoose is a JS object-oriented programming library that creates a connection between MongoDB and Node.js

Nodemon automatically restarts the node application when there are file changes in the directory.

JSON Web Token (JWT) is an authentication way for creating data with optional signature and/or optional encryption

Bcryptjs is a library to hash passwords.

Dotenv is a zero-dependency module that loads environment variables from a `.ene` file into process.env

TailwindCSS is a ***utility-first*** CSS framework that offers a set of utility classes than can be combined to create unique design. https://tailwindcss.com/

MongoDB is a document-based NoSQL database, storing data in key-value pairs similar to the structure of JSON objects.
Node.js allows developers to execute JS code outside a web browser and server-side scripting
Express.js is a backend framework for building REST APIs with Node.js
React is a frontend JS library that enable developers to build SPAs and component-based user interface (UI)

https://expressjs.com/en/resources/middleware/body-parser.html
`req.body` is an object that will contain all the data from the request body but Express doesn't create the `req.body` for us.



```javascript
app.use(bodyParser.urlencoded( { extended:true } ));
```

JSON Web Token (JWT) generates a token on the server and sends it to the client upon successful authentication. The token should be included in the subsequent requests to authenticate the user.
https://jwt.io/

Why Bcrypt is used instead of MD5, SHA1, SHA2 and SHA3?
- They are general purpose hash functions.
- Instead, Bcrypt is a library specifically for hashing passwords. It uses a variant of the Blowfish encryption algorithm's keying schedule. It introduces a work factor, allowing developers to determine how expensive the hash function should be.
- https://en.wikipedia.org/wiki/Bcrypt
- https://codahale.com/how-to-safely-store-a-password/
- https://www.npmjs.com/package/bcryptjs

Cookie
- A cookie is a piece of data that is sent to the client-side with a request and is stored on the client-side by the Web Browser the user is currently using
- Cookies simplifies how websites can remember a user's information.
- Simplifies the capture of a user's browsing history
- Stores the user's sessions.

Cookie Parser
- A cookie parser is a middleware for handling HTTP cookies in Node.js
- It responsibilities include:
	- Extract and convert the cookie data in the HTTP request into usable format accessible by server side.
	- Parses cookie data to extract individual values such as cookie name, value, and expiration date.
https://www.npmjs.com/package/cookie

`npm init -y` -y set the default value for all information
```bash
npm install express mongoose cors bcryptjs cookie-parser nodemon jsonwebtoken mongoose dotenv
```
express is a fast and minimalist web framework for Node.js
mongoose is a JS object-oriented programming library that creates a connection between MongoDB and Node.js

nodemon automatically restarts the node application when there are file changes in the directory.

JWT is an authentication way for creating data with optional signature and/or optional encryption
It is a library for creating and verifying JSON Web Tokens (JWTs) used for authentication

bcryptjs is a library for hashing passwords.
cors is a middleware used to enable **Cross-Origin Resource Sharing (CORS)** for an Express.js application.
cors allows or blocks web page access to resources on a different domain

doteenv allows developers to store configuration data in a .env file, which is typically not committed to version control, to separate sensitive information from codebase. This file contains key-value pairs that represent the environment variables

cookie-parser is a middleware that handles cookie-based sessions in incoming HTtp requests. It extracts information from cookies that may be required for authentication or other purpose.

https://www.geeksforgeeks.org/create-database-using-mongodb-compass/
https://www.mongodb.com/cloud/atlas/register

Use the `cors()` express middleware to allow requests from other domains to access the resources on the server.
The CORS headers  can be specified using the function's optional configuration object parameter: ***origin, methods and credentials***.

```javascript
app.use(
	cors({
		origin: ["http://localhost:4000"],
		methods: ["GET", "POST", "PUT", "DELETE"],
		credentials: true,
	})
)
```

```javascript
app.use(express.json())
```

![[Pasted image 20240627150043.png]]