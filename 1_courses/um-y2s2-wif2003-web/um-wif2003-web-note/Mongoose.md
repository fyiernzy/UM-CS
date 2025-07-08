### N4 - Database

1. **What is a database?**
   - A structured collection of data stored electronically in a computer system, managed by a database management system (DBMS).

2. **Differentiate between PostgreSQL, MySQL, Redis, SQLite, and MongoDB.**
   - **PostgreSQL**: Open-source, advanced SQL database with strong support for ACID transactions and complex queries.
   - **MySQL**: Popular open-source SQL database known for reliability and ease of use, commonly used in web applications.
   - **Redis**: In-memory NoSQL key-value store, used for caching and real-time analytics.
   - **SQLite**: Lightweight, file-based SQL database, embedded within applications.
   - **MongoDB**: NoSQL database storing data in flexible, JSON-like documents.

3. **What are the differences between SQL and NoSQL databases?**
   - **SQL**: Relational, structured data, fixed schemas, ACID transactions (e.g., MySQL, PostgreSQL).
   - **NoSQL**: Non-relational, unstructured/semi-structured data, flexible schemas, eventual consistency (e.g., MongoDB, Redis).

4. **What is MongoDB?**
   - A NoSQL database that stores data in JSON-like documents with flexible schemas, making it easy to scale and adapt to changing requirements.

5. **Explain the relationship between databases, collections, and documents in NoSQL and their counterparts in SQL.**
   - **Database (SQL)**: A collection of related tables.
   - **Table (SQL)**: A collection of related rows (records).
   - **Row (SQL)**: A single record with fields (columns).
   - **Database (NoSQL)**: A collection of related collections.
   - **Collection (NoSQL)**: A collection of related documents.
   - **Document (NoSQL)**: A single record with fields (key-value pairs).

6. **What are the advantages of using MongoDB?**
   - Flexible schemas
   - Horizontal scalability
   - High performance for read and write operations
   - Easy to use and integrate with modern applications

7. **What is BSON?**
   - Binary JSON, a binary-encoded serialization of JSON-like documents used by MongoDB for storage and data transfer.

8. **Briefly explain the CRUD operations in MongoDB.**
   - **Create**: `insertOne()`, `insertMany()`
   - **Read**: `find()`, `findOne()`
   - **Update**: `updateOne()`, `updateMany()`
   - **Delete**: `deleteOne()`, `deleteMany()`

9. **Compare ODM and ORM.**
   - **ODM (Object Document Mapper)**: Maps objects to NoSQL databases (e.g., Mongoose for MongoDB).
   - **ORM (Object Relational Mapper)**: Maps objects to SQL databases (e.g., Sequelize for MySQL).

10. **What are the benefits of using ODM and ORM?**
    - Simplifies database interactions
    - Provides a higher level of abstraction
    - Reduces boilerplate code
    - Ensures data consistency and integrity

11. **What does it mean to be database-agnostic? Provide 3 examples of ORM/ODM that are database-agnostic.**
    - **Database-agnostic**: Compatible with multiple database systems.
    - Examples:
      - **Sequelize** (ORM)
      - **TypeORM** (ORM)
      - **Mongoose** (ODM, primarily for MongoDB but can be adapted for other NoSQL databases)

12. **What are the ways to connect MongoDB to the MERN stack? Compare their pros and cons.**
    - **Mongoose**:
      - **Pros**: Schema validation, middleware support, easy integration.
      - **Cons**: Additional learning curve, slight performance overhead.
    - **Native MongoDB Driver**:
      - **Pros**: Direct access to MongoDB features, high performance.
      - **Cons**: Less abstraction, more boilerplate code.

13. **What is Mongoose?**
    - An ODM for MongoDB and Node.js, providing a higher level of abstraction over the native MongoDB driver.

14. **How do you perform validation in Mongoose?**
    - Define validation rules in the schema definition using built-in validators and custom validation functions.

15. **How do you build a query in Mongoose?**
    ```javascript
    const result = await Model.find({ field: value }).exec();
    ```

16. **What are the business logic hooks in Mongoose?**
    - Middleware functions that run before or after certain operations (e.g., `pre-save`, `post-save`, `pre-find`, `post-find`).

17. **What is a schema in MongoDB?**
    - A structure that defines the shape of documents within a collection.

18. **What are the permitted `SchemaTypes` in MongoDB?**
    - String, Number, Date, Buffer, Boolean, Mixed, ObjectId, Array, Decimal128, Map.

19. **What do Buffer and Mixed mean in `SchemaTypes`?**
    - **Buffer**: Stores binary data.
    - **Mixed**: Stores any data type, offering flexibility.

20. **Write a code snippet to connect MongoDB to Express using Mongoose with proper error handling and print `The database is connected to Backend` upon successful connection.**
    ```javascript
    const mongoose = require('mongoose');

    mongoose.connect('mongodb://localhost:27017/mydb', { useNewUrlParser: true, useUnifiedTopology: true })
      .then(() => console.log('The database is connected to Backend'))
      .catch(err => console.error('Database connection error:', err));
    ```

21. **What are the ways to connect MongoDB to Express using Mongoose, and what are their differences?**
    - **Direct Connection**:
      ```javascript
      mongoose.connect('mongodb://localhost:27017/mydb', { useNewUrlParser: true, useUnifiedTopology: true });
      ```
    - **Using Connection Pooling**:
      ```javascript
      mongoose.createConnection('mongodb://localhost:27017/mydb', { useNewUrlParser: true, useUnifiedTopology: true });
      ```
    - **Differences**: Direct connection is simpler, while connection pooling provides better performance and scalability for handling multiple connections.

22. **What are the `create` operations provided by MongoDB?**
    - `insertOne()`, `insertMany()`

23. **What are the `read` operations provided by MongoDB?**
    - `find()`, `findOne()`, `findById()`, `countDocuments()`

24. **What does `db.collection.find()` return in MongoDB?**
    - A cursor that can be used to iterate over the documents matching the query criteria.

25. **What is a view and a cursor in MongoDB, and what are their functions?**
    - **View**: A queryable object representing a saved aggregation pipeline.
    - **Cursor**: An object that allows iteration over the results of a query.

26. **What are the `update` operations provided by MongoDB?**
    - `updateOne()`, `updateMany()`, `findOneAndUpdate()`, `replaceOne()`

27. **What are the `delete` operations provided by MongoDB?**
    - `deleteOne()`, `deleteMany()`, `findOneAndDelete()`

28. **What are the filters provided in Mongoose?**
    - Equality, comparison, logical, and element filters (e.g., `$eq`, `$gt`, `$lte`, `$in`, `$and`, `$exists`).

29. **Write a schema for a Post model with the following fields: `userId` (refers to `_id` of a user), created time, updated time, content, number of likes (an array of `userId`), and comments (an embedded object with `userId` and content).**
    ```javascript
    const mongoose = require('mongoose');
    const Schema = mongoose.Schema;

    const CommentSchema = new Schema({
      userId: { type: Schema.Types.ObjectId, ref: 'User', required: true },
      content: { type: String, required: true }
    });

    const PostSchema = new Schema({
      userId: { type: Schema.Types.ObjectId, ref: 'User', required: true },
      createdAt: { type: Date, default: Date.now },
      updatedAt: { type: Date, default: Date.now },
      content: { type: String, required: true },
      likes: [{ type: Schema.Types.ObjectId, ref: 'User' }],
      comments: [CommentSchema]
    });

    const Post = mongoose.model('Post', PostSchema);
    ```

30. **How to fine-tune a database query using Mongoose? Provide 3 possible ways with code examples.**
    - **Projection**: Limit the fields returned by the query.
      ```javascript
      const result = await Model.find({ field: value }).select('field1 field2').exec();
      ```
    - **Population**: Populate referenced documents.
      ```javascript
      const result = await Model.find({ field: value }).populate('field').exec();
      ```
    - **Indexing**: Use indexes to speed up queries.
      ```javascript
      Model.collection.createIndex({ field: 1 });
      ```

31. **What is a relational database?**
    - A database structured to recognize relations among stored items of information, using tables, rows, and columns.

32. **What is auto-sharding in MongoDB?**
    - Automatically distributing data across multiple servers to ensure scalability and high availability.

33. **

Define casting properties in the context of MongoDB schemas.**
    - Transforming data types of schema fields to ensure they match the defined schema type.

34. **Define clusters and nodes in the context of database architecture.**
    - **Cluster**: A group of servers working together to handle data and provide redundancy.
    - **Node**: An individual server within a cluster.

35. **Define scalability in NoSQL databases.**
    - The ability to handle increased loads by adding more resources (horizontal scaling) without compromising performance.