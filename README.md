This is a Spring Boot project using Gradle that exposes a REST API for car details. The main endpoint /api/car-details returns a sample car object in JSON format.
The project structure follows standard Spring Boot conventions, with controllers and models organized under the com.harts.rest.producer package.

Features:
RESTful API for car information
Example endpoint: /api/car-details
Built with Java, Spring Boot, and Gradle

How to run:
Clone the repository.
Run ./gradlew bootRun from the project root.
Access the API at http://localhost:8080/api/car-details.

Requirements:
Java 17+
Gradle
Usage: Send a GET request to /api/car-details to receive car details in JSON format.
