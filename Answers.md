1. Explain the relationship between the "Product" and "Product_Category" entities from the above diagram.
Ans: The relationship between the "Product" and "Product_Category" entities is a example of a foreign key relationship in a relational database.
Each "Product" has a "category_id" attribute which serves as a foreign key.
This "category_id" corresponds to the "id" attribute of "Product_Category", it establishes link between two entities.
The relationship ensures that each product is assigned to one category from the "Product_Category" table.
This is a many-to-one relationship, where many products can belong to one category. It's a fundamental concept that helps maintain data integrity and enables efficient data retrieval.

2. How could you ensure that each product in the "Product" table has a valid category assigned to it ?
Ans: We can implement a foreign key constraint between the "category_id" field in the "Product" table and the "id" field in the "Product_Category" table. This will enforce referential integrity, meaning that any "category_id" entered in the "Product_Category" table.
