# WIA2001 - Database

## 学习

- 课本：*Database System: Design, Implementation, Management*
- **如果只是为了备考**，那没必要读 Textbook。理由有二：
  - 一，课本涵盖面广，学习起来极为耗时。
  - 二，课件 和 笔记 的内容已经划好了备考重点。
  - 事半功倍岂不美哉？何苦哀哉。
- 若有不解，才参阅课本即可，特别是 ERD/ Normalization。
- 前几课主要介绍概念（Concept）和术语（Terminology），比如：`Conceptual Model`, `Primary Key (PK)`, `Foreign Key (FK)` 等，都需要了解。
- 后几课是面试会问到的知识点，比如 Normalization, ACID (Atomicity, Consistency, Isolation, Durability)。掌握知识点对面试也有帮助。

## 备考

- 必考：`Entity Relational Diagram (ERD)`, `Normalization`, `SQL` 和 Concurrency。把这几课学好基本都能 Pass。
- ERD：
  - 要会写 Business Rule
  - 要会判断两个 Entity 的 Relationship（1:1, 1:M, M:M）
  - 要会用 Chen's notation 和 Crow Foot Notation
- Normalization
  - 要懂什么是 1NF, 2NF 和 3NF 的 Condition 和要怎么 Eliminate 那些 Dependency（Functional & Transitive）
- SQL：
  - 通常不会考太难的，大多都是简单的 CRUD。
  - 会用 `SELECT * FROM * WHERE * ORDER` 和 `JOIN` 已经很足够了。
  - `GROUPBY` 和 `HAVING` 可以看，但不太常考。
- Concurrency
  - 都是 Theory
- 备考技巧：
  - 课后练习（Tutorial）和 历年考题（Past Year）是一定要做的。无他，惟手熟尔。
  - 如果要练习 Normalization/ SQL，可以 Prompt chatGPT 出题，然后练习。

## 小组作业

- 小组作业：
  - 采访某个公司
  - 写出他们的 Business Rule
  - 根据 Business Rule 画 ERD
  - 根据 ERD 进行 Normalization
  - 使用 SQL 展现 CRUD
- 个人建议：
  - 如果你的同学父母有开店的话，那采访会轻松很多。
  - 或者你有 Senior 的文件的话，也可以直接拿来改，我当初就是这样。
  - 第一版的 ERD 可以刻意弄得比较烂一点，嵌套多层 Dependencies，这样做 Normalization 的效果也会比较明显。
  - 第二版的 ERD 就要好好检查 + 盘逻辑。
  - SQL 不用很复杂，如果懒惰想可以直接丢给 chatGPT 做。个人认为 WIA2001 的小组作业对锻炼 SQL 的帮助不大。
