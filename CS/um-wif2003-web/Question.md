*(Why? How? What is DOM and Virtual DOM?)*
Props drilling
Controlled components (Definition?)
Renders
Client-Server Model
What are the other model? What is a client-server model? What's the advantages and disadvantages?

HTTP methods and explanations? Is it valid to use wrong method? Is it a good practice to use incorrect HTTP methods since either one could return the correct result?
What is Client and Server (Definition)

Roles of Front-End, Separation of Concerns, Server and Database Server (Persistent Data Storage Type)
What does server-side and client-side means in backend?
Event subscription and entities
Static destinations.
What is a RESTFUL API?

Command Line
`npm isntall -g express`. `-g` means ***install globally***.
`mkdir`, `cd`, `fsutil file createnew app.js 0` 
How to read a version? What does `~` and `^` means in version specification?

Use `npm init` to create a `package.json`. `--save` meaning? 
Difference between `package.json` and `package-lock.json`?
Define scalability and NoSQL

What is auto-sharding in MongoDB?
What are Chrome V8' engine?
***event-driven, non-blocking I/O model*** (meaning?)
Express is a minimal, flexible and unopinionated (meaning?)
Supports ***routings, template engine, file uploading***. It can be used to develop ***SPA*** and ***real-time applications***.
Middleware functions with access to the request object (`req`), the response object (`res`) and the next middleware function (`next`) in the application's ***request-response cycle***.
GET requests a representation of the specified resource. Requests using GET should only retrieve data. (Why)
POST submits an entity to the specified resource, often causing a change instate or ***side effects*** on the server. (What are the side effects?)
PUT replaces all current representations of the target resource with the request ***payload***. (What is payload?)

GET requests can be cached.
(What does it mean by cached here? And why the difference occur?)
GET requests can be cached. This means that the responses can be stored and reused, improving performance.

Has limits on the amount of information to send (about 2000 characters). Why (GET method)
Suitable for sending sensitive and non-sensitive data. Support advanced functionality such as multi-part binary input for uploading files to server. (What is multi-part?)
The second parameter is the **callback function**. A callback function takes two different object arguments, i.e, request and response. (What is a callback function?)

!!! Status code and their meaning

Non-***relational database***

| NoSQL                                                 |
| ----------------------------------------------------- |
| Non-***relational database***                         |
| No tabular structure, data can be nested (Reference?) |
|                                                       |

> Companies across the world have defined ***clusters*** with some of them running 100+ ***nodes*** with around millions of documents within the database (Definition?)

Some ORMs are tied to a specific database, while others provide a ***database-agnostic*** backend. 

diff between orm/odm

 Mongoose is a MongoDB object modeling tool for Node.js, designed to work in an ***asynchronous*** environment.
includes built-in type casting, validation, query building, business logic hooks and more.

A schema maps to a MongoDB collection and defines the structures of the documents within that collection, including ***casting properties***.

Permitted `SchemaTypes` include String, Number, Date, ***Buffer, Mixed***, ObjectId, Array