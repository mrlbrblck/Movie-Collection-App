# Movie Collection Management System

## Overview
The **Movie Collection Management System** is a Java-based console application that allows users to manage a collection of movies. Users can add, remove, search for movies, and list all stored movies. The system also provides a way to find movies directed by a specific director.

## Creator
**D.M. Anazario**  
**Bachelor of Science in Information Technology, 2nd Year (BSIT 2)**

## Functionalities
- **Add a Movie**: Users can add movies by entering the title, director's name, year of release, and genre.
- **Remove a Movie**: Allows users to remove a movie from the collection by title.
- **Find a Movie**: Users can search for a movie by title and view its details.
- **Find Movies by Director**: Displays all movies directed by a given director.
- **List All Movies**: Displays all movies in the collection.
- **Error Handling**: Ensures valid input for movie details (e.g., numeric validation for year).

## Getting Started
This project is developed using **Java** in **Visual Studio Code**. Follow the steps below to set up and run the program.

### Prerequisites
- Install [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html)
- Install [Visual Studio Code](https://code.visualstudio.com/)
- Install Java Extension Pack in VS Code

### Running the Program
1. Clone this repository or download the source code.
2. Open the project folder in **VS Code**.
3. Open the terminal and navigate to the `src` directory.
4. Compile the program:
   ```sh
   javac Main.java MovieCollection.java Movie.java Person.java
   ```
5. Run the program:
   ```sh
   java Main
   ```
6. Follow the on-screen instructions to interact with the system.

## Folder Structure
The workspace contains the following folders:
- `src/` - Contains the Java source code.
- `lib/` - Stores any external dependencies (if applicable).
- `bin/` - Contains compiled output files.

> To customize the folder structure, edit `.vscode/settings.json`.

## Dependency Management
Dependencies can be managed using the **JAVA PROJECTS** view in VS Code. More details can be found in the [VS Code Java Dependency Guide](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

---
### License
This project is developed for educational purposes and is open for improvements. Feel free to modify and contribute!

---
Happy Coding! 🚀

