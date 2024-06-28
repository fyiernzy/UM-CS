# 1 - Authentication vs Authorization
| Authentication                                                                    | Authorization                                                                                                           |
| --------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------- |
| The process of verifying a user's or an entity's identity                         | The process of granting or denying access to specific resources or functions within an application                      |
| Involves validating user credentials, such as username and password, during login | After authentication, the application checks the user's level of authorization to determine which areas they can access |

# 2 - NoSQL Injection
---
1. NoSQL **injection** is an attack targeting NoSQL databases, such as MongoDB. 
2. It exploits poorly sanitized user input directly used in database queries without proper validation.
3. As a result, attackers can *alter query logic*, *gain unauthorized access to sensitive data* and *corrupt the entire database*.

# 3 - Best practices
---
## 3.1 - Input validation and Sanitization
- **Input Validation** 
	- Ensures user input meets specific criteria, such as format, length and type
	- Can be done using libraries like [Joi](https://joi.dev/) or [validator.js](https://www.npmjs.com/package/validator)
- **Input Sanitization** 
	- Removes potentially harmful characters or code to prevent injection attacks and other security vulnerabilities.
	- Can be done using functions like [escapeHTML](https://github.com/component/escape-html) or [sanitize-html](https://www.npmjs.com/package/sanitize-html).
- **Best Practices**
	- Uses parameterized queries in database operations to ***prevent SQL injection*** attacks by separating SQL code from user input
	- Leverages ODM/ORM for input sanitization, query construction, and data scheme validation.
	- Performs [Regex](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_expressions) validation for email addresses, passwords or other sensitive data to ensures only valid input is accepted. 

## 3.2 - Authentication and Authorization
- **Authentication**
	- Verifies the identity of users attempting to access the application.
	- Uses frameworks like [JSON Web Token (JWT)](https://jwt.io/) or [OAuth](https://oauth.net/) for robust user authentication.
	- Implements multi-factor authentication (MFA) for added security by requiring multiple verification factors.
		- [Learn more about MFA](https://www.geeksforgeeks.org/multi-factor-authentication-using-mern/)
		- [MFA Quickstart with Node.js](https://github.com/TwilioDevEd/account-security-quickstart-node)
- **Authorization** 
	- Determines the actions users can perform based on their roles and permissions.

| Methods                          | Explanation                                                                                                                                                                                                                                                                                    |
| -------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Role-based access control (RBAC) | Defines granular permissions for different user roles, ensuring users have access only to appropriate resources and functionalities.<br><br>**Reference:**<br>https://auth0.com/docs/manage-users/access-control/rbac<br>https://code.pieces.app/blog/role-based-access-systems-in-nodejs<br> |
| Password hashing                 | Uses strong cryptographic algorithm to securely store passwords in the database.                                                                                                                                                                                                               |
| Token-based authentication       | Enables stateless communication between the client and the server, reducing the risk of ***session hijacking***.                                                                                                                                                                               |
 
## 3.3 Secure configuration
1. **HTTPS Configuration**: 
	- Enforces HTTPS encryption for all communication between the client and server protects data from eavesdropping and tampering
2. **CORS Configuration**: 
	- Properly configure CORS to restrict cross-origin requests and prevent unauthorized access to sensitive resources.
3. **Securing Configuration Files**: 
	- Protect sensitive configuration files and credentials, such as database connection strings or API keys, from unauthorized access or exposure.
4. **Restricting Access**: 
	- Limit access to administrative interfaces and debug endpoints to reduce the risk of unauthorized access or exploitation.
5. **Security Headers**: 
	- Use security headers like [***X-Content-Type Options***](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Content-Type-Options) and [***X-Frame-Options***](https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/X-Frame-Options) adds an extra layer of protection against common web vulnerabilities like ***MIME-type sniffing and clickjacking***

## 3.4 - Session Management
- Maintain user sessions securely to prevent unauthorized access, session fixation, or session hijacking attacks

**Key Practices**
- **Secure Storage**
	- Store session data securely using server side storage mechanisms like databases or server memory, ensuring that sensitive session information is not exposed to client-side attacks
- **Session Timeout**
	- Set appropriate session timeout periods based on security requirements and user behavior to reduce the risk of session hijacking or unauthorized access from idle sessions.
- **Session Regeneration**
	- Regenerate session identifiers after successful authentication or privilege escalation to prevent session fixation attacks.
- **Secure Cookies**
	- Implement secure [cookie](https://developer.mozilla.org/en-US/docs/Web/HTTP/Cookies) attributes like `HttpOnly` and `Secure` to ensures session cookies are only accessible via HTTP and HTTPS connections, reducing the risk of cookie theft or session hijacking.
- **Encryption**
	- Encrypt ***session data*** using strong encryption algorithms to protect it from unauthorized access or tampering, even if intercepted in transit or stored in a compromised location

## 3.5 - Keeping Dependencies Updated
Regularly updating dependencies is crucial for mitigating security vulnerabilities and ensuring application stability.

- **Regular Updates**
	- Outdated dependencies may contain known security flaws that attackers can exploit
	- Regularly review and update dependencies to apply security patches promptly.
- **Automation**
	- Use tools like [`npm audit`](https://docs.npmjs.com/auditing-package-dependencies-for-security-vulnerabilities ) and [`Renovate`](https://docs.renovatebot.com/) to automate dependency updates and save time.
- **Dependency Locking**
	- Utilize `package-lock.json` or `yarn.lock` files to ensure consistent dependency versions across different environments, reducing compatibility issues.
- **Monitoring**
	- Monitor release notes and security advisories for installed packages to prioritize and address critical issues promptly.
	- Conduct periodic security audits to proactively identify and mitigate vulnerabilities, maintaining robust security. 

## 3.6 - Implementing Content Security Policy (CSP)
Content Security Policy (CSP) is a security standard that helps mitigate cross-site scripting (XSS) attacks by controlling which resources a web page is allowed to load.

- **Purpose of CSP**
	- CSP prevents the execution of malicious scripts injected into web pages by attackers
- **Defining CSP policy**
	- Use directives like `default-src` and [`script-src`](https://content-security-policy.com/script-src/) to specify the trusted sources for content, scripts, and other resources, reducing the risk of XSS attacks
- [**Nonce-based CSP**](https://content-security-policy.com/nonce/)
	- Implementing nonce-based CSP to securely execute inline scripts by generating a unique nonce for each script tag and including the corresponding nonce value in the CSP header
- [**CSP Reporting**](https://developer.mozilla.org/en-US/docs/Web/HTTP/CSP#enabling_reporting)
	- Enables CSP reporting to collect violation report, providing insights into potential security threats and helping fine-tune the CSP policy
- **Applying CSP** 
	- Utilize CSP [meta tags](https://content-security-policy.com/examples/meta/) or HTTP headers to apply the CSP policy consistently across all pages of the web application
- **Regular Review and Update**
	- Regularly review and update CSP directives to accommodate changes in application requirements or dependencies, ensuring the policy remains effective against evolving security threats.

**References**
1. https://content-security-policy.com/
2. https://www.w3.org/TR/CSP2/
3. https://developer.mozilla.org/en-US/docs/Web/HTTP/CSP

# 4 - Error Handling
---
Error handling involves responding to and managing errors in software applications to maintain functionality.

**Importance of Error Handling**
- Prevents crashes and provides clear, user-friendly messages
- Uses meaningful error messages and HTTP status codes (200, 400, 500) to show the problem.
- Identifies issues early quick fixes, maintaining system reliability.

**Types of Error Handling**
1. **Synchronous Error Handling**: Using `try-catch`. 
2. **Asynchronous Error Handling**: Using callbacks. 
3. **Promise-Based Error Handling**: Using `.catch()` for promises or `async/await` with `try-catch`.

## 4.1 - **Best Practices I**
*Reference: https://expressjs.com/en/guide/error-handling.html*

### 4.1.1 - Centralize Your Error Handling
- Centralized error handling simplifies maintenance and enhances stability. 
- Use a global error handler middleware to catch errors during the request-response cycle. 
- Place it after all other middleware and route handlers to capture unhandled errors. 
- [Guide to Setting Up a Global Error Handler in Express.js](https://medium.com/@mohsinogen/simplified-guide-to-setting-up-a-global-error-handler-in-express-js-daf8dd640b69)

**Use Middleware for Async Errors**
- Wrap async route handlers with middleware to catch errors and pass them to the next middleware. 
- Ensure errors in async operations are handled uniformly. 

**Create Custom Error Classes** 
- Define custom error classes for different types of errors.
- Throw specific errors and catch them globally for predictable and manageable error responses.

### 4.1.2 - Creating User-Friendly Error Messages
- Ensure error messages are meaningful and user-friendly
- Avoid technical jargon that can confuse users 
- Provide clear, concise, and helpful information on what went wrong and possible fixes.
- Highlight required fields in forms using conditional styling to guide users effectively.
- Develop a custom`ErrorHandler` class extending the native Error class for consistent handling of exceptions like `BadRequest` or `AuthExceptions`.

### 4.1.3 - Utilizing HTTP Status Codes Correctly
- Use HTTP status codes to show the error (200 for success, 400 for client errors, 500 for server errors). 
- Use these codes correctly to clarify errors to the client. 
- Avoid exposing sensitive data in error messages for security.
- Define error-handling middleware in Express.js with four parameters (err, req, res, next) to manage errors during the request-handling pipeline.

## 4.2 - Best Practices II
### 4.2.1 - Graceful Error Management in User Interfaces
- Use [Error Boundaries](https://react.dev/reference/react/useTransition#displaying-an-error-to-users-with-error-boundary) to gracefully handle errors without disrupting the user experience. 
- Error Boundaries act as a safety net, catching JavaScript errors in the component tree and preventing them from propagating. 
- Implementing Error Boundaries ensures the application remains stable even if a component fails. 

### 4.2.2 - Integrating Error Handling with React Context API
- Centralize error handling with the Context API, reducing repetitive code. 
- [React Context API](https://react.dev/reference/react/createContext) - [Passing Data Deeply with Context](https://react.dev/learn/passing-data-deeply-with-context) - [Leveraging React Context API for State Management](https://medium.com/@maraim/leveraging-react-context-api-for-state-management-in-complex-applications-3add1727f7e0) 
- Create a `ToastContextProvider` to manage notifications and error messages efficiently, using libraries like MUI for visual feedback. 
- [Simple Toast Notification System for React](https://reactjsexample.com/an-incredibly-simple-toast-notification-system-for-react/) 

### 4.2.3 - Improving User Experience with Clearly Communicated Errors
- Provide clear and concise messages that guide users on what went wrong and possible next steps.
- Utilize React’s capabilities to catch and handle errors smoothly, enhancing your application’s reliability and user trust.

# 5 - Logging
---
Logging is the practice of recording error details and system events to facilitate debugging and monitoring.

**Importance of Logging**
1. Diagnoses issues within an application
2. Enables central storage and log rotation with tools like Winston or Bunyan
3. Monitors critical errors or performance issues

**Security Considerations**
1. MongoDB is not susceptible to NoSQL injections but can be altered maliciously.
2. Express.js is vulnerable to various injection and cross-site attacks.
3. Secure these by encrypting data, sanitizing user input, and updating dependencies regularly to minimize security risks

## 5.1 - Logging Strategies
### 5.1.1 - Choosing the Right Logging Tools
**Winston**
- Popular for its rich API, flexible log formatting, and transport options
- Automatically tracks errors and captures stack traces
- [Winston GitHub](https://github.com/winstonjs/winston)
- [Winston Logging Tutorial](https://stackify.com/winston-logging-tutorial/)
- [Using Winston and Morgan to Log Node.js Applications](https://betterstack.com/community/guides/logging/how-to-install-setup-and-use-winston-and-morgan-to-log-node-js-applications/)

**Bunyan**
- Known for simple JSON logging and creating child loggers
- Useful for larger applications with multiple components
- [Bunyan GitHub](https://github.com/trentm/node-bunyan)
- [Bunyan Logger on npm](https://www.npmjs.com/package/bunyan-logger)

### 5.1.2 - Log Management: Storage, Rotation and Monitoring
- Effective log management includes strategic storage, rotation, and monitoring.
- A centralized log management system provides a unified view of logs across different instances.
- Facilitate easier analysis and debugging, and ensures logs are available during server downtimes.
- Tools like [Better Stack](https://betterstack.com/logs) offer live tailing, alert notifications, and interactive dashboards.

### 5.1.3 - Setting Up Alerts for Critical Errors
- Services like [Sentry](https://sentry.io/welcome/) and [New Relic](https://newrelic.com/welcome-back) can monitor and alert you about significant incidents affecting your application’s performance
- Setting up these tools for real-time alerts allows quick issue resolution.
- A proactive approach saves time and prevents potential downtime.