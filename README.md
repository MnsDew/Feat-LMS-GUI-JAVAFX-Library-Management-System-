# Library Management System

## Overview
The **Library Management System** (LMS) is a software application designed to manage and organize the day-to-day operations of a library. It allows librarians to manage books, issue/return books, and maintain member records. The system helps library staff keep track of borrowed books, overdue fines, and generate reports for better management.

## Features
- **Book Management**: Add, remove, and search books.
- **Member Management**: Register, update, and manage library members.
- **Book Borrowing/Returning**: Allows members to borrow and return books, and tracks borrowed books.
- **Fine Calculation**: Automatically calculates fines for overdue books.
- **Transaction History**: Tracks each borrowing and returning transaction.
- **Reports**: Generate reports for book inventory, borrowed books, and overdue fines.

## Technologies Used
- **Java**: Core programming language.
- **NetBeans**: Integrated development environment (IDE).
- **MySQL**: For managing the database.
- **JavaFX** or **Swing**: For creating the user interface (UI).

## Prerequisites
To run this project locally, you will need:
- **Java 8 or higher**
- **NetBeans IDE** or any other Java IDE
- **MySQL Database**

## Installation
Follow the steps below to set up the project locally:

### 1. Clone the repository:
```bash
git clone https://github.com/MnsDew/Feat-LMS-GUI-JAVAFX-Library-Management-System-.git

```
Username: admin , Password: admin

### 2. Open the project in NetBeans:
1. Open **NetBeans IDE**.
2. Go to **File** > **Open Project**.
3. Select the **Library Management System** project directory you just cloned.

### 3. Set up the MySQL database:
1. Create a new MySQL database (e.g., `lms`).
2. Import the necessary SQL files (e.g., `lms.sql`) to set up tables like `books`, `members`, `lendings`, etc.

### 4. Configure the database connection:
1. Edit the database connection settings in the project configuration files (`config.properties` or similar).
2. Ensure the database details (username, password, and database URL) are correctly configured for your local MySQL setup.

### 5. Run the application:
1. In NetBeans, right-click the project and select **Run**.
2. The application should start, and you can access the GUI for managing the library.
3. Username: admin , Password: admin

## License
This project is licensed under the MIT License - see the [LICENSE](./LICENSE) file for details.

### Acknowledgment
Please mention the original author, **MANSOOR Gabali or MNS or MnsDew**, if you use this code in your project or create a derivative work based on it. Credit is appreciated!



