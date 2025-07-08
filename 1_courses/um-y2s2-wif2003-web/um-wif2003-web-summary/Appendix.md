### N5 - Appendix

1. **Differentiate authentication and authorization.**
- **Authentication**: Verifying the identity of a user (e.g., login with username and password).
- **Authorization**: Determining what an authenticated user is allowed to do (e.g., access control).

2. **What are NoSQL injection and SQL injection? Provide examples with code snippets.**
- **NoSQL Injection**: Attacking a NoSQL database by injecting malicious queries.
 ```javascript
 const user = await db.collection('users').findOne({ username: username, password: password });
 ```
 If `username` is `{$ne: null}` and `password` is also `{$ne: null}`, it can bypass authentication.
- **SQL Injection**: Attacking a SQL database by injecting malicious SQL queries.
 ```sql
 SELECT * FROM users WHERE username = 'admin' AND password = '' OR '1'='1';
 ```

3. **What are the differences between input validation and input sanitization?**
- **Input Validation**: Ensures input meets certain criteria (e.g., length, type).
- **Input Sanitization**: Cleans input to remove harmful content (e.g., stripping HTML tags).

4. **How do parameterized queries prevent SQL injection? Show the effect before and after using parameterized queries with explanations.**
- **Before (Vulnerable to SQL Injection)**:
 ```javascript
 const query = `SELECT * FROM users WHERE username = '${username}' AND password = '${password}'`;
 db.execute(query);
 ```
- **After (Safe with Parameterized Queries)**:
 ```javascript
 const query = `SELECT * FROM users WHERE username = ? AND password = ?`;
 db.execute(query, [username, password]);
 ```
- **Explanation**: Parameterized queries separate SQL code from data, preventing malicious input from being executed as SQL.

5. **What libraries can be used for input validation? Provide examples with code.**
- **Joi**:
 ```javascript
 const Joi = require('joi');
 const schema = Joi.object({ username: Joi.string().required(), password: Joi.string().required() });
 const { error, value } = schema.validate({ username, password });
 ```
- **Validator**:
 ```javascript
 const validator = require('validator');
 if (validator.isEmail(email)) { /* valid email */ }
 ```

6. **How can ODM/ORM be used for input sanitization, query construction, and data schema validation? Provide examples and explanations.**
- **Mongoose (ODM for MongoDB)**:
 ```javascript
 const userSchema = new mongoose.Schema({ username: String, email: String });
 userSchema.path('email').validate(email => validator.isEmail(email), 'Invalid email');
 ```
- **Sequelize (ORM for SQL)**:
 ```javascript
 const User = sequelize.define('User', { username: Sequelize.STRING, email: Sequelize.STRING });
 User.addHook('beforeValidate', (user) => { if (!validator.isEmail(user.email)) throw new Error('Invalid email'); });
 ```

7. **What is MFA, and how can it be used for authentication?**
- **MFA (Multi-Factor Authentication)**: Uses multiple verification methods (e.g., password, SMS code, biometrics) to enhance security.

8. **What is session hijacking, and what are its causes? How can it be prevented?**
- **Session Hijacking**: Stealing a user’s session ID to impersonate them.
- **Causes**: Weak session management, insecure communication.
- **Prevention**: Use HTTPS, secure cookies, session expiration, and regeneration.

9. **List and briefly describe methods for performing authentication and authorization.**
- **Basic Authentication**: User credentials sent with each request.
- **Token-Based Authentication**: Uses tokens (e.g., JWT) to authenticate.
- **OAuth**: Authorization framework for granting access.
- **OpenID Connect**: Identity layer on top of OAuth for authentication.

10. **How do you implement Role-Based Access Control (RBAC) in Node.js? Provide a code example.**
```javascript
const roles = { admin: ['read', 'write'], user: ['read'] };

function checkRole(role, action) {
  return (req, res, next) => {
	if (!roles[role].includes(action)) {
	  return res.status(403).send('Forbidden');
	}
	next();
  };
}

app.get('/data', checkRole('user', 'read'), (req, res) => { res.send('Data'); });
```

11. **What are eavesdropping and tampering, and how can these issues be addressed?**
- **Eavesdropping**: Unauthorized listening to communication.
- **Tampering**: Unauthorized alteration of communication.
- **Addressed by**: Using HTTPS, encryption, and secure protocols.

12. **How do you use CORS for secure configuration?**
```javascript
const cors = require('cors');
const app = express();
app.use(cors({ origin: 'https://example.com', methods: ['GET', 'POST'] }));
```

13. **What are X-Content-Type-Options and X-Frame-Options, and how do they prevent MIME-type sniffing and clickjacking?**
- **X-Content-Type-Options**: Prevents MIME-type sniffing.
  ```http
  X-Content-Type-Options: nosniff
  ```
- **X-Frame-Options**: Prevents clickjacking by restricting framing of content.
  ```http
  X-Frame-Options: DENY
  ```

14. **What is MIME-type sniffing?**
- **MIME-type Sniffing**: Browsers determining content type from content rather than declared type, leading to security risks.

15. **What is clickjacking?**
- **Clickjacking**: Malicious technique to trick users into clicking on something different from what they perceive, by overlaying hidden elements.

16. **What are MIME types?**
- **MIME Types**: Standardized identifiers for file formats and content types on the internet (e.g., `text/html`, `image/png`).

17. **What are cookies and secure cookies? What are their functions?**
- **Cookies**: Small pieces of data stored by the browser to maintain state between requests.
- **Secure Cookies**: Cookies with the `Secure` flag, sent only over HTTPS, enhancing security.

18. **What does `HttpOnly` mean in cookie attributes?**
- **HttpOnly**: Cookie flag that makes the cookie inaccessible to JavaScript, reducing XSS risks.

19. **What is cookie theft and session hijacking?**
- **Cookie Theft**: Stealing cookies to gain unauthorized access.
- **Session Hijacking**: Taking over a user session by using stolen session ID.

20. **How do you manage sessions securely?**
- Use HTTPS, secure and HttpOnly cookies, regenerate session IDs, and set appropriate session expiration times.

21. **How do you automate dependency updates in Node.js?**
- Use tools like `npm-check-updates`, Dependabot, or Renovate to automatically check and update dependencies.

22. **Why are regular dependency updates necessary?**
- To fix security vulnerabilities, get new features, and improve performance.

23. **What is dependency locking, and why is it important? Explain the mechanism with a code example.**
- **Dependency Locking**: Ensures consistent dependency versions across environments using lock files.
  ```json
  // package-lock.json
  {
	"name": "my-app",
	"version": "1.0.0",
	"dependencies": {
	  "express": {
		"version": "4.17.1",
		"resolved": "https://registry.npmjs.org/express/-/express-4.17.1.tgz"
	  }
	}
  }
  ```

24. **What is Content Security Policy (CSP), and what is its purpose?**
- **CSP**: A security measure to prevent XSS and data injection attacks by specifying which content sources are allowed.

25. **How do you define a CSP policy?**
```html
<meta http-equiv="Content-Security-Policy" content="default-src 'self'; img-src https://*; child-src 'none';">
```

26. **What is a Nonce-based CSP, and how does it work?**
- **Nonce-based CSP**: Uses a unique nonce (number used once) for each request to allow inline scripts/styles only if they have the correct nonce.
  ```html
  <meta http-equiv="Content-Security-Policy" content="script-src 'nonce-random123';">
  <script nonce="random123">console.log('secure script');</script>
  ```

27. **How can CSP reporting enhance website security?**
- **CSP Reporting**: Sends violation reports to a specified URL, helping identify and fix security issues.
  ```html
  <meta http-equiv="Content-Security-Policy" content="default-src 'self'; report-uri /csp-report;">
  ```

28. **What are CSP meta tags?**
- **CSP Meta Tags**: HTML meta tags used to define Content Security Policies directly within HTML documents.

29. **List 15 common error status codes (4XX and 5XX).**
- **4XX (Client Errors)**:
  - 400 Bad Request


  - 401 Unauthorized
  - 403 Forbidden
  - 404 Not Found
  - 405 Method Not Allowed
  - 406 Not Acceptable
  - 408 Request Timeout
  - 409 Conflict
  - 410 Gone
  - 413 Payload Too Large
- **5XX (Server Errors)**:
  - 500 Internal Server Error
  - 501 Not Implemented
  - 502 Bad Gateway
  - 503 Service Unavailable
  - 504 Gateway Timeout

30. **Why is it important to use meaningful and correct status codes?**
- To provide clear communication between client and server, help with debugging, and conform to web standards.

31. **How do you centralize error handling, and why is it important?**
- **Centralized Error Handling**: Use middleware to catch and handle errors in one place, improving code maintainability and consistency.
  ```javascript
  app.use((err, req, res, next) => {
	console.error(err.stack);
	res.status(500).send('Something went wrong!');
  });
  ```

32. **List 5 ways to create user-friendly error messages.**
- Use plain language.
- Provide actionable steps.
- Avoid technical jargon.
- Include error codes for reference.
- Offer contact information for support.

33. **What are Error Boundaries in React?**
- Components that catch JavaScript errors in their child component tree, log those errors, and display a fallback UI.
  ```javascript
  class ErrorBoundary extends React.Component {
	constructor(props) {
	  super(props);
	  this.state = { hasError: false };
	}

	static getDerivedStateFromError(error) {
	  return { hasError: true };
	}

	componentDidCatch(error, info) {
	  logErrorToMyService(error, info);
	}

	render() {
	  if (this.state.hasError) {
		return <h1>Something went wrong.</h1>;
	  }

	  return this.props.children;
	}
  }
  ```

34. **What is logging, and why is it important?**
- **Logging**: Recording information about an application's operations for debugging, monitoring, and auditing purposes. Important for identifying issues, tracking performance, and ensuring security.

35. **What is the difference between Winston and Bunyan for logging?**
- **Winston**: Flexible, multi-transport logging library with custom formats.
- **Bunyan**: Focuses on structured JSON logging, making it easier to parse and query logs.

36. **What are storage, rotation, and monitoring in log management?**
- **Storage**: Saving logs for future reference.
- **Rotation**: Archiving and removing old logs to manage storage space.
- **Monitoring**: Continuously checking logs for errors and performance issues.

37. **What can centralized log management provide?**
- Aggregation of logs from multiple sources, real-time monitoring, alerting, and easier analysis.

38. **What log strategies can be applied to make code more robust?**
- Use structured logging (e.g., JSON format).
- Implement log levels (e.g., debug, info, error).
- Anonymize sensitive data.
- Use log rotation and retention policies.
- Centralize log management for aggregation and analysis.