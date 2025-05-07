# Spring Boot Application for Entity Management

This project is a Spring Boot application designed to manage information for two entities, Entity1 and Entity2. It implements create, read, and update operations, providing a complete solution for managing these entities through a web interface.

## Project Structure

The project follows a standard Spring Boot structure with separate layers for controllers, services, repositories, and entities. Below is an overview of the key components:

- **DemoApplication.java**: The entry point of the Spring Boot application.
- **Controllers**: 
  - `Entity1Controller.java`: Handles HTTP requests for Entity1.
  - `Entity2Controller.java`: Handles HTTP requests for Entity2.
- **Entities**: 
  - `Entity1.java`: Represents the first entity with its attributes and JPA annotations.
  - `Entity2.java`: Represents the second entity with its attributes and JPA annotations.
- **Repositories**: 
  - `Entity1Repository.java`: Repository interface for Entity1, extending JpaRepository.
  - `Entity2Repository.java`: Repository interface for Entity2, extending JpaRepository.
- **Services**: 
  - `Entity1Service.java`: Contains business logic for Entity1.
  - `Entity2Service.java`: Contains business logic for Entity2.
- **Views**: JSP templates for user interaction:
  - Entity1: create.jsp, read.jsp, update.jsp
  - Entity2: create.jsp, read.jsp, update.jsp

## Setup Instructions

1. **Clone the Repository**: 
   ```
   git clone <repository-url>
   cd spring-boot-app
   ```

2. **Build the Project**: 
   Use Maven to build the project:
   ```
   mvn clean install
   ```

3. **Configure Database**: 
   Update the `application.properties` file with your database connection settings.

4. **Run the Application**: 
   Start the Spring Boot application:
   ```
   mvn spring-boot:run
   ```

5. **Access the Application**: 
   Open your web browser and navigate to `http://localhost:8080` to interact with the application.

## Features

- Create, read, and update operations for both Entity1 and Entity2.
- JSP views for user-friendly interaction.
- Layered architecture for better maintainability and scalability.

## Dependencies

This project uses the following key dependencies:
- Spring Boot Starter Web
- Spring Boot Starter Data JPA
- JSP support

## License

This project is licensed under the MIT License. See the LICENSE file for more details.