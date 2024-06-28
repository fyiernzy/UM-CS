# 1 - Libraries and Tools
---
## 1.1 - Frontend

1. [**Material UI (MUI)**](https://mui.com/material-ui/): Offers a rich set of pre-designed React components that implement Google's Material Design.
2. [**Bootstrap**](https://getbootstrap.com/): A front-end framework providing a wide range of pre-designed components and styles.
3. [**TailwindCSS**](https://tailwindcss.com/): A utility-first CSS framework offering a set of utility classes for creating unique designs.

## 1.2 - Backend
1. **Mongoose**: A JavaScript object-oriented programming library that creates a connection between MongoDB and Node.js
2. **`Nodemon`** automatically restarts the node application when file changes are detected.
3. [**JSON Web Token (JWT)**](https://jwt.io/) 
	1. An authentication method for creating data with optional signature and/or optional encryption
	2. The `jsonwebtoken` is used for creating and verifying JSON Web Tokens (JWTs) used for authentication
	3. JWT generates a token on the server and sends it to the client upon successful authentication. The token should be included in the subsequent requests to authenticate the user.
4. [**`Bcryptjs`**](https://www.npmjs.com/package/bcryptjs) 
	1. A library for hashing passwords.
	2. Bcrypt is used instead of MD5, SHA1, SHA2 and SHA3 because it is specifically designed for password hashing. It uses a variant of the Blowfish encryption algorithm's keying schedule and introduces a work factor to determine the hash function's expense.
	- **References**
		- https://en.wikipedia.org/wiki/Bcrypt
		- https://codahale.com/how-to-safely-store-a-password/
		- https://www.npmjs.com/package/bcryptjs
5. [**`Dotenv`**](https://www.npmjs.com/package/dotenv) 
	1. A zero-dependency module that loads environment variables from a `.env` file into `process.env`
	2. Allows developers to store configuration data in a .env file, which is typically not committed to version control, to separate sensitive information from codebase. 
	3. This file contains key-value pairs that represent the environment variables
6. **CORS**
	1. A middleware used to enable **Cross-Origin Resource Sharing (CORS)** for an Express.js application. 
	2. Allows or blocks web page access to resources on a different domain.
7. Cookie-parser
	1. A middleware that handles cookie-based sessions in incoming HTTP requests. 
	2. Extracts information from cookies that may be required for authentication or other purpose.
	3. [**Cookies**](https://www.npmjs.com/package/cookie): Pieces of data sent to the client-side with a request and stored by the web browser. They simplifies remembering user information, capturing browsing history, and storing session data.
	4. Responsibilities:
		1. Extracts and converts cookie data in the HTTP request into a usable format for the server. 
		2. Parses cookie data to extract individual values such as cookie name, value and expiration date.
8. [Body-parser](https://expressjs.com/en/resources/middleware/body-parser.html)
	1. Body-Parser is middleware in Express.js that parses incoming request bodies and makes the data available under `req.body`. 
	2. Express doesn't do this automatically, so you need Body-Parser or similar middleware.
```javascript
app.use(bodyParser.urlencoded( { extended:true } ));
```
- The `extended: true` option allows for more complex objects and arrays.

## 1.3 - Both
1. Node Package Manager (`npm`) is the default package manager for the JavaScript runtime environment. It allows developers to find, build and manage code packages.

# 2 - Database and Frameworks
---
1. **MongoDB** is a document-based NoSQL database storing data in key-value pairs similar to JSON objects.
2. **Node.js** allows developers to execute JS code outside a web browser for server-side scripting
3. **Express.js** is a fast and minimalist backend framework for building REST APIs with Node.js
4. **React** is a frontend JavaScript library that enable developers to build SPAs and component-based user interface (UI)

# 3 - Configuration
---
## 3.1 - `npm` Setup and Installation
```bash
npm init -y
npm install express mongoose cors bcryptjs cookie-parser nodemon jsonwebtoken mongoose dotenv
```
- `-y` set the default value for all information

## 3.2 - CORS
- Use the `cors()` express middleware to allow requests from other domains to access the resources on the server.
- The CORS headers can be specified using the function's optional configuration object parameter: ***origin, methods and credentials***.

```javascript
app.use(
	cors({
		origin: ["http://localhost:4000"],
		methods: ["GET", "POST", "PUT", "DELETE"],
		credentials: true,
	})
)
app.use(express.json());
```

# 4 - Appendix
---
![[Pasted image 20240627150043.png]]