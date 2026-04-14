# 🏙️ Smart City Management System (Java CLI)

A simple command-line based **Smart City Management System** built using Java.
This program allows users to interact with a basic menu system to manage building data.

---

## ✨ Features

* 📌 Add a new building with:

  * Name
  * Address
  * Number of floors
* 📋 View buildings *(currently under development)*
* 🚪 Exit the program safely

---

## 🧠 How It Works

The program runs in a loop and displays a menu with options:

```
1. Add New Building
2. View All Buildings
3. Exit
```

Users input a number to select an option, and the program responds accordingly.

---

## 🛠️ Technologies Used

* Java
* `java.util.Scanner` for user input
* Basic control structures (`while`, `switch`, etc.)

---

## ▶️ How to Run

1. Make sure you have Java installed
2. Save the file as `main.java`
3. Compile the program:

```
javac main.java
```

4. Run the program:

```
java main
```

---

## 📸 Example Usage

```
Welcome to Smart City Management System
1. Add New Building
2. View All Buildings
3. Exit
Please select an option: 1

Enter Building Name: Sky Tower
Enter Building Address: Downtown Street
Enter Number of Floors: 25

========================================
Building Name: Sky Tower
Building Address: Downtown Street
Number of Floors: 25
========================================
Building added successfully!
```

---

## 🚧 Future Improvements

* 🗂️ Store multiple buildings using ArrayList or database
* 🔍 Implement "View All Buildings" feature
* ✏️ Add edit and delete functionality
* 💾 Save data to file or database
* 🖥️ Upgrade to GUI (JavaFX / Swing)

---

## ⚠️ Notes

* Currently, building data is **not stored permanently**
* "View All Buildings" is a placeholder feature

---

## 👨‍💻 Author

Created as a simple Java practice project for learning basic input handling and program structure.

---

## 🌱 Final Thought

This project is like a seed 🌿 — small now, but with the right features added, it could grow into a full-fledged city management system.
