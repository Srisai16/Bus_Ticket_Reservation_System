# Bus Ticket Reservation System

A desktop GUI application for booking bus tickets, implemented using Java Swing for the front‑end, JDBC for database connectivity, and MySQL as the back‑end database.

---

## 🚀 Features

- **Simple and intuitive GUI** built with Java Swing components (`JButton`, `JTextField`, `JLabel`, `JComboBox`, `JCalendar`, `JTextArea`)
- GUI buttons for **Book**, **Submit**, and **Reset** to manage ticket booking workflows
- **Dynamic fare calculation** based on the number of passengers
- **MySQL integration** via JDBC; user data and booking details are persisted in the database
- Secure data entry using **`PreparedStatement`** to insert records into the database

---

## 🛠 Technologies Used

| Component       | Description                           |
|----------------|----------------------------------------|
| **Java Swing** | GUI framework providing UI components  |
| **JDBC**       | Java API to connect and execute SQL on MySQL |
| **MySQL**      | Relational database for storing bookings |

---

## ⚙️ Setup Instructions

### 1. Install Prerequisites

- Java Development Kit (JDK)
- MySQL Server and optionally MySQL Workbench

### 2. Clone or Download the Project

Set it up in an IDE like IntelliJ, NetBeans, or Eclipse. Alternatively, compile from the terminal.

### 3. Configure MySQL Database

- Create a database, e.g., `booking`
- Create necessary tables using SQL like:

    ```sql
    CREATE TABLE bus_bookings (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100),
    phone VARCHAR(15),
    source VARCHAR(100),
    destination VARCHAR(100),
    date_of_travel DATE,
    number_of_seats INT,
    total_fare DECIMAL(10, 2)
    );
    ````

### 4. Set Up JDBC Connection

Update your database connection in Java:

```java
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/booking", "username", "password"
);
```

### 5. Compile and Run

```bash
javac *.java
java Main
```

### 6. Use the Application

* **Submit**: Calculates fare and previews details
* **Book**: Finalizes and stores booking
* **Reset**: Clears the form

---

## 📸 Output Screenshots

### 1. Main Booking Interface

![Main Booking Interface](bus-ticket-reservation\src\main\java\com\busreservation\lib\screenshots\booking-interface.png)

### 2. Fare Calculation / Booking Confirmation

![Fare Calculation](bus-ticket-reservation\src\main\java\com\busreservation\lib\screenshots\fare-calculation.png)

### 3. MySQL Database View of Stored Bookings

![Database View](bus-ticket-reservation\src\main\java\com\busreservation\lib\screenshots\database-view.png)

---

## 🧠 Development Insights

* Swing components handle user inputs, with event listeners (`ActionListener`) controlling actions.
* `PreparedStatement` is used to safely insert booking data into the MySQL database.
* The project follows a simple architecture suitable for beginners learning Java GUI + Database integration.

---

## 📌 Future Enhancements

* Display past bookings using `JTable`
* Add login/authentication for personalized user sessions
* Enable booking cancellation or update
* Improve user interface with more robust input validation and feedback

---

## 🙏 Acknowledgements

* JDBC documentation reference: [Wikipedia - JDBC](https://en.wikipedia.org/wiki/Java_Database_Connectivity)

---

## 📎 License

This project is open-source and available under the [MIT License](LICENSE).

```

---