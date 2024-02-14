# MovieHub

Este proyecto es una API RESTful de gestión de películas construida con Spring Boot y Maven. Proporciona operaciones CRUD (Crear, Leer, Actualizar, Eliminar) para la entidad `Movie`. Cada película tiene un ID único, título, director, año de lanzamiento, país y género.

Los usuarios pueden interactuar con la API para agregar nuevas películas a la base de datos, recuperar información sobre películas existentes, actualizar los detalles de las películas y eliminar películas. La API se comunica con una base de datos MySQL para almacenar y recuperar datos.

## Prerrequisitos

Necesitarás tener instalado:

- Java 8 o superior
- Maven
- Postman

## Cómo ejecutar el proyecto

1. Clona el repositorio en tu máquina local usando `git clone https://github.com/xrimsonn/movies-crud-spring.git`.

2. Navega hasta el directorio del proyecto.

3. Ejecuta el comando `mvn install` para descargar las dependencias.

4. Ejecuta el archivo `Main.java`.

La aplicación ahora debería estar ejecutándose en `http://localhost:8080`.

## Cómo probar la aplicación con Postman

1. Abre Postman.

2. Para obtener las películas haz una solicitud GET a `http://localhost:8080/movies/get`.

3. Para crear una nueva película, haz una solicitud POST a `http://localhost:8080/movies/create` con el cuerpo de la solicitud en formato JSON, por ejemplo:

```json
{
    "title": "The Godfather",
    "director": "Francis Ford Coppola",
    "year": 1972,
    "country": "US",
    "genre": "Crime, Drama"
}
```

4. Para actualizar una  película existente, haz una solicitud PUT a `http://localhost:8080/movies/update/{id}` con el cuerpo de la solicitud en formato JSON, por ejemplo:

```json
{
    "title": "Chungking Express",
    "director": "Wong Kar-wai",
    "year": 1994,
    "country": "HK",
    "genre": "Drama, Comedy"
}
```

Para eliminar una película, haz una solicitud DELETE a `http://localhost:8080/movies/delete/{id}`.

Recuerda reemplazar `{id}` con el ID de la película que deseas obtener o eliminar.
