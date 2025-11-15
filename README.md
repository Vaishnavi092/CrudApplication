## Running the Project with Docker

This project includes Docker and Docker Compose setup for easy containerized deployment of the Java Spring Boot application.

### Project-Specific Docker Requirements
- **Java Version:** Uses Eclipse Temurin JDK 17 for building and JRE 17 for running the application (as specified in the Dockerfile).
- **Build Tool:** Maven Wrapper (`mvnw`) is used for building the project inside the container.

### Environment Variables
- No required environment variables are set in the Dockerfile or `docker-compose.yml` by default.
- If you need to set custom environment variables, you can uncomment and use the `env_file` section in `docker-compose.yml`.

### Build and Run Instructions
1. **Build and start the application:**
   ```sh
   docker compose up --build
   ```
   This will build the Docker image and start the `java-app` service.

2. **Access the application:**
   - The application will be available on [http://localhost:8080](http://localhost:8080)

### Ports
- **8080:** The Spring Boot application is exposed on port 8080 (mapped to the same port on your host).

### Special Configuration
- The application runs as a non-root user (`appuser`) inside the container for improved security.
- No external services (such as databases) are configured by default. If you add a database, update `docker-compose.yml` accordingly.

---
_This section was added to document the Docker-based setup for this project. For further details, see the provided `Dockerfile` and `docker-compose.yml`._
