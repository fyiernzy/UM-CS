Which probing techniques is the best to be used when the the hash table approaches high load factor?
5. When does quadratic probing is at its most optimal performance?
6. When should you resize the hash table?
7. What is the factor determining the best hash function to use?
8. When should you use Chaining and when should you use open addressing?

Dictionary involves the searching of a word from a subset of a word. The spell-checker involves comparing the word in its dictionary with the word given as parameter to see if they are match. The symbol-table in compiles, file-system indexing and routing in network all involves "Searching". For example, routing in network need to find the logical network (IPV4 or IPV6 addresses) in their relative table to find the port to be send out.

> Fast retrieval, access, searching, insert, delete (Fast CRUD - Create, Read, Update, Delete)

Learning objective:
1. What is a hash table? Why do we need a hast table? How a hash table is obtained/ implemented? How it is implemented to solve real-life problem?
2. What is a direct access table? Why do we need a direct access table? How a direct access table is obtained/ implemented? How it is implemented to solve real-life problem? What's it difference with a hash table?
3. What is collision and chaining? What's their mechanism?
4. What is a hash function? How to implement a hash function?
5. What is open addressing? Why do we need a open addressing? How a open addressing is obtained/ implemented? How it is implemented to solve real-life problem? 
6. <mark style="background: #FF5582A6;">What is dynamic set?</mark>

Why including $1,2,\ldot,m-1$ can make sure every hash-table position is eventually a slot? Or in other word, how can 1,2,3...m-1 make sures that every slot is filled up?

When we delete a key from slot i, we cannot simply mark that slot as empty by storing NIL in it. If we did, we might be unable to retrieve any key k during whose insertion we had probed slot i and found it occupied. But why? What's the mechanism behind it?

So what is probing? What's the role a probing played in open addressing?