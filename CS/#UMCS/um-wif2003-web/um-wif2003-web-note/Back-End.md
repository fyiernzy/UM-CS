### 1. Briefly define MongoDB, Express.js, React.js, and Node.js.
- **MongoDB**: A NoSQL database that stores data in JSON-like documents with flexible schemas.
- **Express.js**: A minimal and flexible Node.js web application framework providing a robust set of features for web and mobile applications.
- **React.js**: A JavaScript library for building user interfaces, primarily for single-page applications. It allows developers to create reusable UI components.
- **Node.js**: A JavaScript runtime built on Chrome's V8 engine that allows you to run JavaScript on the server side.

### 2. What is `npm`, and what are its functions?
- **npm (Node Package Manager)**: A package manager for JavaScript that allows you to install, share, and manage dependencies in your project. Functions include:
  - Installing packages.
  - Managing project dependencies.
  - Running scripts.

### 3. What is the role of `package.json` in a Node.js project?
- **`package.json`**: A file that contains metadata about the project and its dependencies, scripts, and configurations. It is essential for managing project dependencies and versions.

### 4. What is middleware, and what is its function in web development?
- **Middleware**: Functions that execute during the request-response cycle in a web application. They can modify the request and response objects, end the request-response cycle, and call the next middleware function.

### 5. Compare a library and a framework.
- **Library**: A collection of functions and utilities that you can call to perform specific tasks. It gives you more control over your application flow.
- **Framework**: A complete structure that provides a foundation and set of conventions for building applications. It often dictates the architecture and flow of the application.

### 6. Compare lightweight and heavyweight frameworks.
- **Lightweight Frameworks**: Minimalistic, offering only the core features needed for a project (e.g., Express.js). They allow more flexibility and customization.
- **Heavyweight Frameworks**: Feature-rich with extensive built-in functionalities (e.g., Spring). They offer a comprehensive solution but can be more complex and rigid.

### 7. Explain the concept of Inversion of Control.
- **Inversion of Control (IoC)**: A design principle where the control of objects or portions of a program is transferred to a container or framework. It helps in decoupling the execution of tasks from their implementation.

### 8. What are the key features of Node.js?
- **Non-blocking I/O**: Efficient handling of multiple requests simultaneously.
- **Event-driven architecture**: Uses an event loop for asynchronous operations.
- **Single-threaded**: Handles multiple connections in a single thread.
- **JavaScript runtime**: Allows server-side scripting using JavaScript.

### 9. What are the advantages of Node.js over Java, PHP, and Python?
- **Speed**: Non-blocking I/O and the V8 engine provide high performance.
- **Single Language**: JavaScript can be used for both front-end and back-end development.
- **Scalability**: Event-driven architecture makes it easy to handle concurrent requests.

### 10. Why is it not recommended to copy the `node_modules` directory?
- **Size**: `node_modules` can be very large and platform-dependent.
- **Reproducibility**: Better to use `package.json` and `package-lock.json` to install dependencies with `npm install`.

### 11. What is Express.js?
- **Express.js**: A minimal and flexible Node.js web application framework that provides a robust set of features for web and mobile applications.

### 12. What are the advantages of using Express.js?
- **Simplicity**: Minimalistic design makes it easy to learn and use.
- **Flexibility**: Middleware and plugins extend its functionality.
- **Performance**: Lightweight and efficient for handling HTTP requests.

### 13. Compare Express.js and Next.js.
- **Express.js**: A backend framework for building web applications and APIs.
- **Next.js**: A React framework with features like SSR, static site generation, and API routes, suitable for building full-stack applications.

### 14. Explain GET, POST, PUT, and DELETE HTTP requests.
- **GET**: Retrieve data from the server.
- **POST**: Submit data to be processed to the server.
- **PUT**: Update existing data on the server.
- **DELETE**: Remove data from the server.

### 15. Compare GET and POST methods.
- **GET**:
  - Retrieves data.
  - Parameters in URL.
  - Cacheable.
- **POST**:
  - Submits data.
  - Parameters in the body.
  - Not cacheable.

### 16. How can route patterns be used to make routing more modular in Express.js?
- **Route Patterns**: Define dynamic URL segments (e.g., `/user/:id`). Combine with routers to separate routes into modules for better organization.

### 17. What are other HTTP methods, and what are their functions?
- **HEAD**: Similar to GET but without the response body.
- **OPTIONS**: Describes the communication options for the target resource.
- **PATCH**: Partially updates a resource.

### 18. Can a POST method be used to retrieve data from a server? Is it good practice? Explain.
- **Yes**, but not recommended. POST is for creating/updating resources. Using it for retrieval can confuse and violate REST principles.

### 19. Define client and server in the context of web development.
- **Client**: The user-facing part of a web application (e.g., browser).
- **Server**: The backend that processes requests, stores data, and serves responses.

### 20. What does "Full Stack" mean?
- **Full Stack**: Involves both front-end and back-end development, covering the entire technology stack of a web application.

### 21. Differentiate between server-side and client-side in web development.
- **Server-side**: Code executed on the server, handling business logic, database interactions, and serving content.
- **Client-side**: Code executed in the browser, handling user interface and interactions.

### 22. What is CORS, and why is it important? How can it be bypassed?
- **CORS (Cross-Origin Resource Sharing)**: A security feature that restricts web pages from making requests to a different domain. Bypassed using CORS headers or proxy servers.

### 23. Explain the difference between synchronous and asynchronous programming.
- **Synchronous**: Operations are executed sequentially, blocking subsequent operations until completion.
- **Asynchronous**: Operations are executed independently, allowing other tasks to proceed without waiting.

### 24. Compare `try-catch`, `async-await`, `then-catch`, and Promises in handling asynchronous requests.
- **try-catch**: Handles errors in synchronous code and `async-await` functions.
- **async-await**: Simplifies writing asynchronous code, making it look synchronous.
- **then-catch**: Handles promises, chaining asynchronous operations.
- **Promises**: Represents an eventual completion or failure of an asynchronous operation.

### 25. What is the Chrome V8 engine?
- **Chrome V8**: Google’s open-source JavaScript engine used in Chrome and Node.js for executing JavaScript code.

### 26. Define event-driven and non-blocking I/O.
- **Event-driven**: Actions are triggered by events (e.g., user actions, network responses).
- **Non-blocking I/O**: I/O operations do not block the execution thread, allowing other operations to continue.

### 27. Define routing, template engine, SPA, and real-time in web development.
- **Routing**: Mapping URLs to specific handlers in a web application.
- **Template Engine**: Renders HTML views by embedding data into templates (e.g., EJS, Handlebars).
- **SPA (Single Page Application)**: A web application that loads a single HTML page and dynamically updates content.
- **Real-time**: Instant data updates between server and client (e.g., WebSockets).

### 28. Why is there a limit on the amount of information sent via GET methods (about 2000 characters)?
- **Limit**: Browser and server limitations to ensure URL readability, performance, and compatibility.

### 29. Why can GET requests be cached while POST requests cannot?
- **GET**: Safe and idempotent, suitable for caching.
- **POST**: Non-idempotent, often changing server state, making it unsuitable for caching.

### 30. What is the request-response cycle in web development?
- **Request-Response Cycle**: Client sends a request to the server, server processes it and sends a response back to the client.

### 31. Define side effects in the context of POST requests and give examples.
- **Side Effects**: Changes in state or data as a result of POST requests (e.g., creating a new user, updating a record).

### 32. Define payload in the context of PUT requests.
- **Payload**: The data sent to the server in a PUT request to update a resource.

### 33. What is a multi-part input?
- **Multi-part Input**: A way to send multiple types of data (e.g., text, files) in a single HTTP request.

### 34. What is a callback function? Provide an example.
- **Callback Function**: A function passed as an argument to another function, to be executed later.
  ```javascript
  function fetchData(callback) {
    setTimeout(() => {
      callback('data');
    }, 1000);
  }
  fetchData(data => console.log(data));
  ```

### 35. How to read a version number?
- **Version Number**: Format is `major.minor.patch`.
  - **`~`**: Allows updates to the most recent patch version.
  - **`^`**: Allows updates to the most recent minor version.

### 36. What does `npm init` do? What does `--save` mean?
- **`npm init`**: Creates a `package.json` file to manage project dependencies.
- **`--save`**: Adds the installed package to the `dependencies` in `package.json`.

### 37. What is the difference between `package.json` and `package-lock.json`?
- **`package.json`**: Lists project metadata and dependencies.
- **`package-lock.json`**: Records the exact versions of dependencies installed, ensuring consistent installs.

### 38. What does the `-g` flag mean in `npm install -g express`?
- **`-g` (Global)**: Installs the package globally, making it available system-wide.