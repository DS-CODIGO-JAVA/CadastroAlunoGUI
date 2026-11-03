# CadastroAlunoGUI

A desktop application for managing student records, built with Java Swing and backed by a MySQL database through JDBC.

## Overview

CadastroAlunoGUI lets users register, view, update and delete students through a graphical interface. The project was developed as part of my Systems Development course at ETEC Uirapuru, with the goal of practicing desktop UI design, relational databases and the separation of responsibilities in a Java application.

## Features

- Register new students
- List all registered students
- Update existing student data
- Delete students
- Persistent storage in MySQL
- Graphical interface built with Java Swing

## Tech Stack

| Layer      | Technology    |
|------------|---------------|
| Language   | Java          |
| Interface  | Java Swing    |
| Database   | MySQL         |
| Connection | JDBC          |
| IDE        | IntelliJ IDEA |

## Project Structure

```
CadastroAlunoGUI/
├── src/                  Application source code
├── database.sql          Database schema
├── ExGUIProjeto.iml      IntelliJ module file
└── README.md
```

## Getting Started

### Prerequisites

- JDK 11 or higher
- MySQL Server 8.0 or higher
- MySQL Connector/J (JDBC driver)
- IntelliJ IDEA (or any Java IDE)

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/DS-CODIGO-JAVA/CadastroAlunoGUI.git
   cd CadastroAlunoGUI
   ```

2. Create the database by running the provided script in MySQL:

   ```bash
   mysql -u root -p < database.sql
   ```

3. Add the MySQL Connector/J `.jar` to the project libraries.

4. Update the connection settings (URL, user and password) in the database connection class:

   ```java
   String url = "jdbc:mysql://localhost:3306/your_database";
   String user = "your_user";
   String password = "your_password";
   ```

5. Run the main class from your IDE.

## Screenshots

Add screenshots of the application here:

```
![Main screen](docs/main-screen.png)
```

## Roadmap

- Input validation on the registration form
- Search and filter students by name
- Move database credentials to an external configuration file
- Separate the code into DAO, model and view packages

## Author

**Fabricio**
GitHub: [@DevFcodes](https://github.com/DevFcodes)

## License

This project is released for educational purposes.
