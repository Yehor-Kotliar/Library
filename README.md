# 📚 Java Library Project

This is a simple Java project that simulates a small library system.  
It demonstrates the use of **Object-Oriented Programming (OOP)** concepts in Java, including classes, constructors, methods, arrays, and overriding.

---

## 🚀 Features
- **Book management**:
    - Create books with title, author, year, and availability.
    - Borrow (`prestito`) and return (`restituzione`) books.
    - Default values for unknown books.

- **Library management**:
    - Store up to 100 books in an array.
    - Add books individually or multiple books at once.
    - Search for a book by title (case-insensitive).
    - Print the list of all books in the library.

- **Main program**:
    - Demonstrates how to create books and add them to the library.
    - Shows borrowing and returning functionality.
    - Displays search results (found / not found).
    - Prints the state of the library before and after operations.

---

## 🛠️ Classes
- `Libro`  
  Represents a book.  
  Contains fields for title, author, year, and availability.  
  Includes methods for borrowing, returning, and printing details.

- `Biblioteca`  
  Represents a library.  
  Stores books in an array.  
  Includes methods to add, search, and display books.

- `Main`  
  Entry point of the program.  
  Creates a sample library with three books and demonstrates all functionality.

---

## 📦 Example Output
Biblioteca creata
Libro aggiunto: Il Signore degli Anelli
Libro aggiunto: 1984
Libro aggiunto: I Promessi Sposi

Lista dei libri in biblioteca:
Libro: Il Signore degli Anelli di J.R.R. Tolkien (1954) - Disponibile
Libro: 1984 di George Orwell (0) - Disponibile
Libro: I Promessi Sposi di Alessandro Manzoni (1827) - Disponibile

Il libro e' stato trovato: Libro: Il Signore degli Anelli di J.R.R. Tolkien (1954) - Disponibile
Libro "Jeck" non trovato

Hai preso in prestito: Il Signore degli Anelli

Il libro non era stato prestato.

Lista dei libri in biblioteca:
Libro: Il Signore degli Anelli di J.R.R. Tolkien (1954) - Indisponibile
Libro: 1984 di George Orwell (0) - Disponibile
Libro: I Promessi Sposi di Alessandro Manzoni (1827) - Disponibile

yaml
Copia codice

---

## 🎯 Learning Goals
This project helps practice:
- Java classes and objects
- Constructors and default values
- Method overloading
- Arrays and `varargs`
- Encapsulation (getters/setters)
- `toString()` overriding
- Case-insensitive string comparison

---

## 📖 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/Library.git
Compile the Java files:

bash
Copia codice
javac src/*.java
Run the program:

bash
Copia codice
java src.Main
## ✨ Author
Developed by Yegor Kotliar as a learning project in Java OOP.