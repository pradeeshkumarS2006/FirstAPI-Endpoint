# FirstAPI-Endpoint
Minimal Spring Boot REST server with two GET endpoints (/hello, /status) returning JSON. Built to understand the core HTTP request → response lifecycle — no database or auth yet, just an embedded Tomcat server responding to requests. Tested via browser and curl. Java 17 + Spring Boot 4.1.0.
# Spring Boot Mini Server

A minimal Spring Boot REST server built to understand the core request → response
lifecycle — no database, no authentication, just the smallest possible backend
that responds to HTTP requests with JSON.

## Endpoints

| Method | Path      | Description                              |
|--------|-----------|-------------------------------------------|
| GET    | `/hello`  | Returns a static JSON greeting message     |
| GET    | `/status` | Returns server status and a live timestamp |

### Example responses

`GET /hello`
```json
{ "message": "Hello, world!" }
```

`GET /status`
```json
{ "status": "running", "timestamp": 1752345600000 }
```

## Tech Stack

- Java 17
- Spring Boot 4.1.0
- Maven
- Embedded Tomcat

## How it works

- `@RestController` marks the class as one that returns raw data (JSON), not HTML views.
- `@GetMapping("/path")` maps an HTTP GET request to a specific method.
- Returning a `Map<String, Object>` is automatically converted to JSON by Spring's
  built-in Jackson serializer — no manual JSON handling needed.

## Running locally

```bash
# Clone the repo
git clone https://github.com/<your-username>/spring-boot-mini-server.git
cd spring-boot-mini-server

# Run the server (Windows)
.\mvnw.cmd spring-boot:run

# Run the server (Mac/Linux)
./mvnw spring-boot:run
```

Once running, visit:
- http://localhost:8080/hello
- http://localhost:8080/status

Or test with curl:
```bash
curl http://localhost:8080/hello
curl http://localhost:8080/status
```

## What this project demonstrates

This was built as Week 1 of a backend engineering internship track, focused on
grasping the request → response loop from the server side before introducing
databases, DTOs, or JWT authentication in later assignments.
