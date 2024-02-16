# MovieHub

This project is a RESTful movie management API built with Spring Boot and Maven. It provides CRUD (Create, Read, Update, Delete) operations for the `Movie` entity. Each movie has a unique ID, title, director, release year, country, and genre.

Users can interact with the API to add new movies to the database, retrieve information about existing movies, update movie details, and delete movies. The API communicates with a MySQL database to store and retrieve data.

## Prerequisites

You will need to have installed:

- Java 21
- Maven
- Postman

## How to Run the Project

1. Clone the repository to your local machine using `git clone https://github.com/xrimsonn/movies-crud-spring.git`.

2. Navigate to the project directory.

3. Run the command `mvn install` to download dependencies.

4. Run the `Main.java` file.

The application should now be running at `http://localhost:8080`.

## How to Test the Application with Postman

1. Open Postman.

2. To get movies, make a GET request to `http://localhost:8080/movies/get`.

3. To create a new movie, make a POST request to `http://localhost:8080/movies/create` with the request body in JSON format, for example:

```json
{
    "title": "The Godfather",
    "director": "Francis Ford Coppola",
    "year": 1972,
    "country": "US",
    "genre": "Crime, Drama"
}
```

4. To update an existing movie, make a PUT request to `http://localhost:8080/movies/update/{id}` with the request body in JSON format, for example:

```json
{
    "title": "Chungking Express",
    "director": "Wong Kar-wai",
    "year": 1994,
    "country": "HK",
    "genre": "Drama, Comedy"
}
```

To delete a movie, make a DELETE request to `http://localhost:8080/movies/delete/{id}`.

Remember to replace `{id}` with the ID of the movie you want to retrieve or delete.
