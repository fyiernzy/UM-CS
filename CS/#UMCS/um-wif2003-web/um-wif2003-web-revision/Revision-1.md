You are a professional full stack developer with deep knowledge in web development. You'll be given a list of question enclosed in triple quotation mark. You task is to answer these question in point from. Keep the answer short yet clear.
### N1 - React

1. **What is React, and what makes it unique?**
	1. React is a JavaScript library developed by Facebook for building user interfaces. 
	2. React allows developers to create reusable components and combine them into pages.
2. **How do you create a React application?**
	1. **Create React App (CRA)**: `npx create-react-app my-app`
	2. **Vite**:  `npm create vite@latest
	3. **Next.js**: `npx create-next-app myapp`

| Feature/Aspect        | Create React App (CRA)                           | Vite                                  | Next.js                                      |
|-----------------------|--------------------------------------------------|---------------------------------------|----------------------------------------------|
| **Purpose**           | Quick setup for React apps                       | Modern build tool and development server | React framework with SSR and static generation |
| **Initial Setup**     | Simple, opinionated                              | Simple, fast                          | Simple, opinionated                          |
| **Command to Create** | `npx create-react-app my-app`                    | `npm init vite@latest my-app`         | `npx create-next-app my-app`                 |
| **Build Speed**       | Moderate                                         | Fast                                  | Moderate                                     |
| **Development Speed** | Moderate                                         | Fast, optimized                       | Moderate                                     |
| **SSR Support**       | No                                               | No                                    | Yes                                          |
| **Static Site Generation** | No                                           | No                                    | Yes                                          |
| **Configuration**     | Minimal configuration needed                     | Minimal configuration needed          | Pre-configured with extensive options        |
| **Plugins/Extensions**| Limited, requires ejecting for deep customization| Flexible with plugin ecosystem        | Rich ecosystem with built-in features        |
| **Hot Module Replacement (HMR)** | Yes                                    | Yes, faster HMR                       | Yes                                          |
| **Routing**           | Manual (react-router)                            | Manual (react-router)                 | Built-in routing                             |
| **API Routes**        | No                                               | No                                    | Yes                                          |
| **Build Output**      | Optimized for production                         | Optimized for production              | Optimized for production, server-side or static |
| **TypeScript Support**| Yes (with template)                              | Yes                                   | Yes                                          |
| **Learning Curve**    | Low                                              | Low                                   | Moderate                                     |
| **Use Case**          | Simple to moderately complex SPA                 | High-performance development for SPA  | Complex applications with SSR and static needs|

- CRA is great for beginners and simple apps
- Vite offers speed and flexibility
- Next.js is ideal for more complex applications that benefit from SSR and static site generation.

3. **What is the virtual DOM, and how does it function in React?**
	4. A virtual DOM is an in-memory representation of the real DOM.
	5. React updates the virtual DOM and syncs it with the real DOM, updated only the changed elements and minimizes direct manipulations.
4. How does React build its virtual DOM, and why does it outperform the traditional DOM?
   
5. **Define the DOM (Document Object Model) and explain its function with examples.**
	1. **Definition**: 
		1. DOM is a programming interface for web documents representing the structure of HTML or XML.
	2. Function:
		1. **Structure Representation**
			1. Provides a structured representation of the document's content, allowing it to be manipulated programmatically.
			2. Models HTML and XML documents as a tree of nodes, where each node represents an element, attribute, text, or other components of the document. ![[Pasted image 20240630105543.png]]
		2. **Interaction**
			1. Allows scripts (such as JavaScript) to access and update the content, structure, and style of a document dynamically.
			2. Provides methods to traverse the tree, find elements, modify elements, and handle events.
		3. **Dynamic Content**
			1. Enables the creation of dynamic web pages by allowing developers to change the document's structure, content, and style without reloading the page.
			2. Essential for creating interactive web applications, such as single-page applications (SPAs).
		4. **Event Handling**:
			1. Provides a way to capture and handle events (e.g., clicks, input changes, mouse movements) through event listeners and handlers.
			2. Allows developers to create responsive and interactive user interfaces.
	3. Examples:
	   ```html
	   <html> <head> <title>Example Page</title> </head> <body> <h1>Hello, World!</h1> <p>This is an example.</p> </body> </html>
		```
	- The DOM for this document would represent the hierarchy of elements:
	
		- Root node: `<html>`
		- Child nodes: `<head>` and `<body>`
		- `<head>` has a child node `<title>`, containing the text "Example Page".
		- `<body>` has two child nodes: `<h1>` and `<p>`, each containing their respective text nodes.
	
1
### N2 - Backend

1. Briefly define MongoDB, Express.js, React.js, and Node.js.
2. What is `npm`, and what are its functions?
3. What is the role of `package.json` in a Node.js project?
4. What is middleware, and what is its function in web development?
5. Compare a library and a framework.
6. Compare lightweight and heavyweight frameworks.
7. Explain the concept of Inversion of Control.
8. What are the key features of Node.js?
9. What are the advantages of Node.js over Java, PHP, and Python?
10. Why is it not recommended to copy the `node_modules` directory?
11. What is Express.js?
12. What are the advantages of using Express.js?
13. Compare Express.js and Next.js.
14. Explain GET, POST, PUT, and DELETE HTTP requests.
15. Compare GET and POST methods.
16. How can route patterns be used to make routing more modular in Express.js?
17. What are other HTTP methods, and what are their functions?
18. Can a POST method be used to retrieve data from a server? Is it good practice? Explain.
19. Define client and server in the context of web development.
20. What does "Full Stack" mean?
21. Differentiate between server-side and client-side in web development.
22. What is CORS, and why is it important? How can it be bypassed?
23. Explain the difference between synchronous and asynchronous programming.
24. Compare `try-catch`, `async-await`, `then-catch`, and Promises in handling asynchronous requests.
25. What is the Chrome V8 engine?
26. Define event-driven and non-blocking I/O.
27. Define routing, template engine, SPA, and real-time in web development.
28. Why is there a limit on the amount of information sent via GET methods (about 2000 characters)?
29. Why can GET requests be cached while POST requests cannot?
30. What is the request-response cycle in web development?
31. Define side effects in the context of POST requests and give examples.
32. Define payload in the context of PUT requests.
33. What is a multi-part input?
34. What is a callback function? Provide an example.
35. How to read a version number? What do `~` and `^` mean in version specification?
36. What does `npm init` do? What does `--save` mean?
37. What is the difference between `package.json` and `package-lock.json`?
38. What does the `-g` flag mean in `npm install -g express`?

### N3 - EJS

1. Briefly describe EJS.
2. What are the advantages of using EJS to render HTML templates on the backend?
3. Show the code that allows Express to use `res.render()` without the `.ejs` extension.
4. Correct the following code snippet using the appropriate EJS tags: `<h1>You fell in love with: <thing-var></h1>`
5. Based on the corrected code in Question 4, complete the following Express route:
   ```javascript
   app.get("/fallinlovewith/:thing", (req, res) => {
       // Your code goes here
   })
   ```
6. Write conditional rendering in EJS based on the following condition: If `thingVar.toLowerCase()` equals `javascript`, output `GOOD CHOICE! JAVASCRIPT IS THE BEST!`; otherwise, output `Bad choice! You should choose JavaScript!`
7. Given the following array:
   ```javascript
   var posts = [
       { title: "Introduction to HTML", author: "Chiam" },
       { title: "How to write elegant JavaScript", author: "Mary" },
       { title: "Express Framework and EJS", author: "Ali" }
   ]
   ```
   Write the EJS code for rendering the list in `post.ejs`.
8. What is the function of partials in EJS?

### N4 - Database

1. What is a database?
2. Differentiate between PostgreSQL, MySQL, Redis, SQLite, and MongoDB.
3. What are the differences between SQL and NoSQL databases?
4. What is MongoDB?
5. Explain the relationship between databases, collections, and documents in NoSQL and their counterparts in SQL.
6. What are the advantages of using MongoDB?
7. What is BSON?
8. Briefly explain the CRUD operations in MongoDB.
9. Compare ODM and ORM.
10. What are the benefits of using ODM and ORM?
11. What does it mean to be database-agnostic? Provide 3 examples of ORM/ODM that are database-agnostic.
12. What are the ways to connect MongoDB to the MERN stack? Compare their pros and cons.
13. What is Mongoose?
14. How do you perform validation in Mongoose?
15. How do you build a query in Mongoose?
16. What are the business logic hooks in Mongoose?
17. What is a schema in MongoDB?
18. What are the permitted `SchemaTypes` in MongoDB?
19. What do Buffer and Mixed mean in `SchemaTypes`?
20. Write a code snippet to connect MongoDB to Express using Mongoose with proper error handling and print `The database is connected to Backend` upon successful connection.
21. What are the ways to connect MongoDB to Express using Mongoose, and what are their differences?
22. What are the `create` operations provided by MongoDB?
23. What are the `read` operations provided by MongoDB?
24. What does `db.collection.find()` return in MongoDB?
25. What is a view and a cursor in MongoDB, and what are their functions?
26. What are the `update` operations provided by MongoDB?
27. What are the `delete` operations provided by MongoDB?
28. What are the filters provided in Mongoose?
29. Write a schema for a Post model with the following fields: `userId` (refers to `_id` of a user), created time, updated time, content, number of likes (an array of `userId`), and comments (an embedded object with `userId` and content).
30. How to fine-tune a database query using Mongoose? Provide 3 possible ways with code examples.
31. What is a relational database?
32. What is auto-sharding in MongoDB?
33. Define casting properties in the context of MongoDB schemas.
34. Define clusters and nodes in the context of database architecture.
35. Define scalability in NoSQL databases.

### N5 - Appendix

1. Differentiate authentication and authorization.
2. What are NoSQL injection and SQL injection? Provide examples with code snippets.
3. What are the differences between input validation and input sanitization?
4. How do parameterized queries prevent SQL injection? Show the effect before and after using parameterized queries with explanations.
5. What libraries can be  used for input validation? Provide examples with code.
6. How can ODM/ORM be used for input sanitization, query construction, and data schema validation? Provide examples and explanations.
7. What is MFA, and how can it be used for authentication?
8. What is session hijacking, and what are its causes? How can it be prevented?
9. List and briefly describe methods for performing authentication and authorization.
10. How do you implement Role-Based Access Control (RBAC) in Node.js? Provide a code example.
11. What are eavesdropping and tampering, and how can these issues be addressed?
12. How do you use CORS for secure configuration?
13. What are X-Content-Type-Options and X-Frame-Options, and how do they prevent MIME-type sniffing and clickjacking?
14. What is MIME-type sniffing?
15. What is clickjacking?
16. What are MIME types?
17. What are cookies and secure cookies? What are their functions?
18. What does `HttpOnly` mean in cookie attributes?
19. What is cookie theft and session hijacking?
20. How do you manage sessions securely?
21. How do you automate dependency updates in Node.js?
22. Why are regular dependency updates necessary?
23. What is dependency locking, and why is it important? Explain the mechanism with a code example.
24. What is Content Security Policy (CSP), and what is its purpose?
25. How do you define a CSP policy?
26. What is a Nonce-based CSP, and how does it work?
27. How can CSP reporting enhance website security?
28. What are CSP meta tags?
29. List 15 common error status codes (4XX and 5XX).
30. Why is it important to use meaningful and correct status codes?
31. How do you centralize error handling, and why is it important?
32. List 5 ways to create user-friendly error messages.
33. What are Error Boundaries in React?
34. What is logging, and why is it important?
35. What is the difference between Winston and Bunyan for logging?
36. What are storage, rotation, and monitoring in log management?
37. What can centralized log management provide?
38. What log strategies can be applied to make code more robust?

### A2 - Tech Stack

1. What does "unopinionated" mean in the context of ShadCN?
2. List 5 front-end libraries that provide pre-designed React components or styles.
3. What is TailwindCSS, and what is its core concept? How does it differ from traditional CSS styling?
4. How can styling be applied in front-end development?
5. Define the MERN stack and explain how it differs from MEAN and PERN stacks.
6. What is the importance of using `nodemon` in development?
7. What is JWT (JSON Web Token)?
8. What is Bcrypt?
9. What is Dotenv?
10. What is `cookie-parser`, and why is it needed?
11. What is `body-parser`, and why is it needed?