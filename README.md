# Advance-java-TKA
Advance Java CURD operation DAO approch
This is a simple Employee Management System implemented in Java. It follows a layered architecture, dividing responsibilities into the Controller, Service, and DAO (Data Access Object) layers. This approach ensures modularity, scalability, and ease of maintenance.

## Project Structure

- Controller Layer: Handles user inputs and calls the Service layer.
- Service Layer: Contains the business logic and interacts with the DAO layer.
- DAO Layer: Manages database operations directly (CRUD operations).

### Files Overview
1. `EmployeControl.java`: 
   - Acts as the Controller layer.
   - Displays a menu-driven interface for the user.
   - Handles user input and invokes corresponding methods in the Service layer.

2. `EmployeService.java`:
   - Represents the Service layer.
   - Contains methods that implement business logic.
   - Interacts with the DAO layer for database-related operations.

3. `EmployeDAO.java`:
   - Represents the DAO layer.
   - Contains methods for Create, Read, Update, and Delete (CRUD) operations on the database.

---

## Features

1. *Create Table*:
   - Creates an `employe` table in the database if it doesn't already exist.
   - Table Schema: 
     - `id` (INT, Primary Key)
     - `name` (VARCHAR, 20)
     - `age` (INT)

2. *Insert Data*:
   - Adds a new employee record into the table.

3. *Update Data*:
   - Updates an existing employee record (e.g., changes name or age based on the `id`).

4. *Delete Data*:
   - Deletes an employee record based on the `id`.

5. *Fetch and Display Data*:
   - Retrieves all records from the `employe` table and displays them.
