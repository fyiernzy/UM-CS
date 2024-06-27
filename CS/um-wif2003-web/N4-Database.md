*Reference: Chapter 9*

# 1 - Database
---
## 1.1 - Database
- A database is a collection of information/ data. 
- It provides an interface for performing CRUD operations (Create, Read, Update, Delete)
- Examples: PostgreSQL, MySQL, Reddit, SQLite, MongoDB.

## 1.2 - SQL vs NoSQL
| SQL                                          | NoSQL                                                    |
| -------------------------------------------- | -------------------------------------------------------- |
| Relational database                          | Non-relational database                                  |
| Tabular structure                            | No tabular structure, data can be nested                 |
| Not flexible and requires predefined schema  | More flexible and dynamic; no need for predefined schema |
| Uses SQL (Structured Query Language)         | Uses BSON (Binary JSON); allows nested objects           |
- **SQL**: Adding a new attribute requires adding a new column to all existing records.

# 2 - MongoDB
---
- **Overview**
	- MongoDB is a document-based NoSQL database.
	- Each database contains collections, and each collection contains documents.
	- Documents within the same collection can have varying fields, sizes and content.
	- A document in MongoDB corresponds to a row/entity in a relational database.
- **Features**
	- MongoDB allows developers to represent hierarchical relationships, stores arrays and handle complex structures easily.
	- MongoDB is highly-scalable, with companies running clusters of 100+ nodes and millions of documents.
	- The `_id` field is added by MongoDB to uniquely identify each document in a collection. 
	- Embedded documents solve relationship issues in MongoDB.
- **BSON**
	- MongoDB represents JSON documents in BSON, a binary encoded format. 
	- BSON extends the JSON model with additional data types, ordered fields, and more efficient encoding/decoding in different languages.

**References**
1. https://www.mongodb.com/
2. https://www.guru99.com/mongodb-tutorials.html

# 3 - CRUD in MongoDB
**References:**
1. https://docs.mongodb.com/manual/crud/
2. https://docs.mongodb.com/manual/reference/method/#collection

| Operation | Explanation                                                                               | Reference                                                                      |
| --------- | ----------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------ |
| Create    | Adds new documents to a collection. If the collection does not exist, it will be created. | [Insert Documents](https://docs.mongodb.com/manual/tutorial/insert-documents/) |
| Read      | Retrieves documents from a collection. Filters like `$gt` can be used to refine queries.  | [Query Documents](https://docs.mongodb.com/manual/tutorial/query-documents/)   |
| Update    | Modifies existing documents in a collection.                                              | [Update Documents](https://docs.mongodb.com/manual/tutorial/update-documents/) |
| Delete    | Removes documents from a collection.                                                      | [Remove Documents](https://docs.mongodb.com/manual/tutorial/remove-documents/) |

## 3.1 - Create
| Command                      | Function                                                          |
| ---------------------------- | ----------------------------------------------------------------- |
| `db.collection.insertOne()`  | Inserts a single document into a collection                       |
| `db.collection.insertMany()` | Inserts multiple documents into a collection                      |
| `db.collection.insert()`     | Inserts a single document or multiple documents into a collection |

## 3.2 - Read
| Command                         | Function                                                                           |
| ------------------------------- | ---------------------------------------------------------------------------------- |
| `db.collection.find()`          | Performs a query on a collection or a ***view*** and returns a ***cursor*** object |
| `db.collection.findAndModify()` | Automatically modifies and returns a single document                               |
| `db.collection.findOne()`       | Performs a query and returns a single document.                                    |

## 3.3 - Update
| Command                      | Function                                     |
| ---------------------------- | -------------------------------------------- |
| `db.collection.update()`     | Modifies a document in a collection.         |
| `db.collection.udpateOne()`  | Modifies a single document in a collection.  |
| `db.collection.updateMany()` | Modifies multiple documents in a collection. |

## 3.4 - Delete
| Command                      | Function                                    |
| ---------------------------- | ------------------------------------------- |
| `db.collection.deleteOne()`  | Delete a single document in a collection.   |
| `db.collection.deleteMany()` | Deletes multiple documents in a collection. |
| `db.collection.remove()`     | Deletes documents from a collection.        |

# 4 - ORM/ODM
---
**Overview**
1. ODM/ORM (Object-Relational Mapping/Object-Document Mapping) represents the website's data as JavaScript objects, which are then mapped to the underlying database. 
2. Some ORMs are tied to a specific database, while others provide a ***database-agnostic*** backend. 
3. Examples of ODM: Mongoose, Waterline, Bookshelf, Objection, Sequelize.

**Benefits of using ORM**
- Allows developers to work with JS objects instead of database semantics.
- Provides data validation and checking.
- Lower development and maintenance costs.

**Considerations**
- Using ORM/ODM may causes performance issues, but these can often be overlooked if performance is not critical.

# 5 - Mongoose
---
**Mongoose**
1. Mongoose is a MongoDB object modeling tool for Node.js, designed to work in an ***asynchronous*** environment.
2. It provides a straightforward, schema-based solution to model the application data.
3. Includes built-in type casting, validation, query building, business logic hooks and more.

> Express apps can interact with databases using the database's native query language (e.g., SQL) or through an Object Data Model (ODM) / Object Relational Model (ORM).

**Resources**
1. https://expressjs.com/en/guide/database-integration.html
2. http://mongoosejs.com/

# 6 - Code Example
---
**Installation**
```bash
npm install mongoose --save
```

**Schema**
- A schema maps to a MongoDB collection and defines the structures of the documents within that collection, including ***casting properties***.
- Permitted `SchemaTypes` include String, Number, Date, ***Buffer, Mixed***, ObjectId, Array

```javascript
const blogSchema = new Schema({
	title: String,
	author: String,
	body: String,
	comments: [{ body: String, date: Date }],
	date: { type: Date, default: Date.now }
	hidden: Boolean,
	meta: {
		votes: Number,
		favs: Number
	}
});
```


**Model**
Convert the schema in to a model
```javascript
const Blog = mongoose.model('Blog', blogSchema);
```
- It is recommend to define the model schema in its own module (file) and exports the method to create the model. This promotes modularity and reusability.



**Adding New Documents**
```javascript
// Using .save()
const newCat = new Cat({
	name: "George",
	age: 11,
	breed: "Siamese",
	temparament: "Grounchy"
});

newCat.save()
	.then((newCat) => console.log('New cat saved:' newCat))
	.catch((error) => console.error('Error saving new cat:', error));

// Using .create()
const newCat = Cat.create({
	name: "Handsome"
	age: 10,
	breed: "Balinese",
	temperament: "Active"
}).then((newCat) => console.log('New cat saved:', newCat))
	.catch((error) => console.error('Error saving new cat:', error))
	
```

**Retrieving Documents**
```javascript
app.get('/cats', async (req, res) => {
	try {
		const cats = await Cat.find();
		res.json(cats);
	} catch (error) {
		res.status(500).json({ error: "Error retrieving cat data" });
	}
})
```

**Resources**
- http://mongoosejs.com/docs/guide.html
- http://mongoosejs.com/docs/schematypes.html