# Unit Converter Spring Boot Application

A simple web-based unit converter built with Java, Spring Boot, and a minimal HTML/JavaScript frontend.

## Features

- Convert between common units:
  - Celsius ⇄ Fahrenheit
  - Meters ⇄ Feet
  - Kilograms ⇄ Pounds
  - Liters ⇄ Gallons
  - Kilometers ⇄ Miles
- REST API for programmatic access
- Simple web interface for interactive use

## Project Structure

```
unitconvertor/
├── pom.xml
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── kiran/
│       │           └── unitconvertor/
│       │               ├── UnitConvertorApplication.java
│       │               ├── UnitConvertorController.java
│       │               └── UnitConvertorService.java
│       └── resources/
│           ├── application.properties
│           └── static/
│               └── index.html
```

## Getting Started

### Prerequisites

- Java 17+
- Maven

### Running Locally

1. **Clone the repository:**
    ```
    git clone https://github.com/your-username/unitconvertor.git
    cd unitconvertor
    ```

2. **Build and run the application:**
    ```
    mvn spring-boot:run
    ```
    or
    ```
    mvn clean package
    java -jar target/unitconvertor-0.0.1-SNAPSHOT.jar
    ```

3. **Access the web frontend:**
    - Open [http://localhost:8080/](http://localhost:8080/) in your browser.

4. **Use the REST API:**
    - Example:
      ```
      http://localhost:8080/api/convert?type=celsius-to-fahrenheit&value=100
      ```
      Response:
      ```
      212.00 °F
      ```

## API Usage

| Conversion Type            | Query Parameter Value         |
|---------------------------|------------------------------|
| Celsius to Fahrenheit     | celsius-to-fahrenheit        |
| Fahrenheit to Celsius     | fahrenheit-to-celsius        |
| Meters to Feet            | meters-to-feet               |
| Feet to Meters            | feet-to-meters               |
| Kilograms to Pounds       | kilograms-to-pounds          |
| Pounds to Kilograms       | pounds-to-kilograms          |
| Liters to Gallons         | liters-to-gallons            |
| Gallons to Liters         | gallons-to-liters            |
| Kilometers to Miles       | kilometers-to-miles          |
| Miles to Kilometers       | miles-to-kilometers          |

**Example API call:**
```
GET /api/convert?type=meters-to-feet&value=10
```

## Customization

- Add more conversion methods in `UnitConvertorService.java`.
- Improve the frontend in `src/main/resources/static/index.html`.
- Change the server port or other settings in `src/main/resources/application.properties`.

## License

This project is for educational/demo purposes.

---

**Happy Converting!**
```

---

If you want to add badges, author info, or deployment instructions, let me know!  
Just replace `your-username` in the clone URL with your actual GitHub username.

