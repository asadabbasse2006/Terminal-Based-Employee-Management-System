# Terminal-Based Employee Management System

A simple **console-based Employee Management System** written in **Java**. It allows users to manage employee records in real-time using an `ArrayList`, demonstrating core **OOP concepts**, **control structures**, and **collection handling** in Java.

---

## 📖 Table of Contents
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Example Commands](#example-commands)
- [Troubleshooting](#troubleshooting)
- [Contributors](#contributors)
- [License](#license)

---

## 🚀 Features
- ➕ Add new employees  
- 📋 View all employees  
- 🔍 Search employees by ID  
- ✏️ Update employee details  
- ❌ Delete employee records  
- 🚪 Exit application gracefully  

---

## 🛠 Technologies Used
- **Java (JDK 8+)**  
- **Java Collections (ArrayList)**  
- **Scanner** for input/output  
- Object-Oriented Programming concepts  

---

## ⚙️ Installation
1. Clone this repository:  
   ```bash
   git clone https://github.com/asadabbasse2006/Terminal-Based-Employee-Management-System.git
   cd Terminal-Based-Employee-Management-System
   ```
2. Compile the Java files:  
   ```bash
   javac Main.java Employee.java EmployeeService.java
   ```
3. Run the program:  
   ```bash
   java Main
   ```

---

## 🗂 Project Structure
```
├── Employee.java        # Employee class (fields, getters, setters, toString)
├── EmployeeService.java # Handles CRUD operations using ArrayList
├── Main.java            # Entry point with menu-driven UI
└── README.md            # Project documentation
```

---

## ▶️ Usage
Run the application:
```bash
java Main
```
You’ll be presented with a **menu-driven console interface** to manage employee records.

---

## 💡 Example Commands
- Add an employee → choose option `1` and enter details  
- Search employee → option `3` and enter ID  
- Update details → option `4`  
- Delete employee → option `5`  

---

## 🐞 Troubleshooting
- **Compilation errors** → Make sure you’re using Java 8+  
- **NoClassDefFoundError** → Ensure you compile **all files together** (`javac Main.java Employee.java EmployeeService.java`)  
- **Scanner input issues** → Press **Enter** properly after each input  

---

## 👨‍💻 Contributors
- [Asad Abbas](https://github.com/asadabbasse2006)  

---

## 📜 License
This project is licensed under the **MIT License**.  
