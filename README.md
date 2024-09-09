### Business Domain: Library Management System

Build a Library Management System for a small local library. The system should manage book inventory and customer borrowing activities.

### Features:
## Feature 1: Book Management (CRUD)
Users (library staff) should be able to add new books to the inventory.
Users should be able to view all available books.
Users should be able to update book details (e.g., changing the number of available copies after restocking).
Users should be able to delete a book if there are no copies available and no pending borrows.

## Feature 2: Customer Management (CRUD)
Users should be able to register new customers by adding their personal information.
Users should be able to view all customers.
Users should be able to update customer information.
Users should be able to delete a customer if they have no active book borrowings.

## Feature 3: Borrowing Activity
Customers should be able to borrow available books.
The system should update the number of available copies when a book is borrowed.
If no copies are available, the system should not allow borrowing.
Users should be able to return borrowed books, which will update the available copies.

## Optional Extension:
Add an entity for Borrow Records to track when books were borrowed and returned. This could create relationships between Book and Customer entities.