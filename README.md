# DSList
DSList is an back-end application that allows you search for a game, which was build during a mini course from [DevSuperior](https://devsuperior.com.br/).

## Domain Model
![dslist-model](https://github.com/user-attachments/assets/6f4a0229-589e-40ba-8eb7-d6bcc59d4898)

## Used Techonologies
- Java
- Spring Boot
- H2 Database
- PostgreSQL
- Docker

## Requirements to run the application
- Java 23
- Clone the repository
- Address to test the API: `(localhost:8080)`

## Routes
- `(/games)`: Find a list of games
- `(/games/{id})`: Find a game by the id
- `(/lists)`: Find the list categories
- `(/lists/{id}/games)`: Find a categorized list with its games
- `(/lists/{id}/replacement)`: Let the user reorganize the list

![dslist](https://github.com/user-attachments/assets/fbb55fa2-351b-41b6-9102-0d7a04459f13)

## Docker Compose Script
https://gist.github.com/acenelio/5e40b27cfc40151e36beec1e27c4ff71
