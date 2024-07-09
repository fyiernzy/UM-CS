### Intermediate Mongoose CRUD Operations Questions (Especially Read):

1. Write a Mongoose query to find all documents in the `Book` collection where the `author` field matches a given author's name.
2. Write a Mongoose query to find the first document in the `User` collection where the `age` is greater than 30.
3. Write a Mongoose query to find all documents in the `Order` collection and sort them by `orderDate` in ascending order.
4. Write a Mongoose query to find all documents in the `Product` collection that have a `price` between 10 and 50.
5. Write a Mongoose query to find all documents in the `BlogPost` collection that contain a specific tag (e.g., 'technology') in the `tags` array.
6. Write a Mongoose query to find all documents in the `Customer` collection and limit the results to the first 10 documents.
7. Write a Mongoose query to find all documents in the `Employee` collection where the `department` field matches a given department name and the `salary` is greater than a given value.
8. Write a Mongoose query to find all documents in the `Event` collection that occurred in the year 2022.
9. Write a Mongoose query to find all documents in the `Review` collection where the `rating` is equal to 5 and populate the `user` field with the corresponding `User` document.
10. Write a Mongoose query to find all documents in the `Movie` collection and exclude the `description` and `reviews` fields from the results.

### Advanced Mongoose CRUD Operations Questions (Especially Read):

1. Write a Mongoose query to find all documents in the `Order` collection and populate the `customer` field with the corresponding `Customer` document, and sort the results by `orderDate` in descending order.
2. Write a Mongoose query to find all documents in the `Product` collection that are currently in stock (i.e., `stock` field is greater than 0) and have a `discount` greater than 10%.
3. Write a Mongoose query to find all documents in the `Transaction` collection that were created in the last 30 days and populate both `user` and `product` fields with the corresponding documents.
4. Write a Mongoose query to find all documents in the `User` collection and paginate the results by skipping the first 20 documents and limiting the results to the next 10 documents.
5. Write a Mongoose query to find all documents in the `BlogPost` collection that have more than 100 comments and populate the `comments` field with the corresponding `Comment` documents.
6. Write a Mongoose query to find all documents in the `Course` collection that have a `duration` of more than 40 hours and sort the results by `rating` in descending order, limiting the results to the top 5 courses.
7. Write a Mongoose query to find all documents in the `User` collection that have logged in within the last 7 days and populate the `profile` field with the corresponding `Profile` document.
8. Write a Mongoose query to find all documents in the `Book` collection that have been published within the last 5 years and exclude the `summary` field from the results.
9. Write a Mongoose query to find all documents in the `Employee` collection that are managers (i.e., `position` field is 'Manager') and have more than 5 years of experience, sorting the results by `hireDate` in ascending order.
10. Write a Mongoose query to find all documents in the `Article` collection that have been read more than 1000 times and populate the `author` field with the corresponding `User` document, excluding the `content` field from the results.

### Basic MongoDB Query Questions:

1. Write a MongoDB query to find all documents in the `users` collection where the `age` field is greater than 25.
2. Write a MongoDB query to find the first document in the `products` collection where the `price` is less than 100.
3. Write a MongoDB query to update the `status` field to "active" for all documents in the `accounts` collection where the `balance` is greater than 500.
4. Write a MongoDB query to delete all documents in the `logs` collection that were created more than a year ago.
5. Write a MongoDB query to insert a new document into the `customers` collection with fields `name`, `email`, and `joinedDate`.