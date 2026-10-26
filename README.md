# Spring Core Demo

A simple Java project created to understand the fundamental concepts of the **Spring Framework**, especially how Spring manages dependencies and object creation.

This project focuses on the concepts that form the foundation of Spring Core before moving on to annotations and Spring Boot.

## Concepts Covered

The project demonstrates:

- Tight Coupling
- Loose Coupling
- Dependency Injection
- Constructor Injection
- Setter Injection
- Inversion of Control
- Interfaces and abstraction
- Spring IoC Container
- Spring Beans
- Dependency wiring
- Object creation and lifecycle management

## Why This Project?

Consider a class that directly creates another object inside itself:

```java
class Car {

    Engine engine = new Engine();

}
```

Here, `Car` is tightly coupled with `Engine`.

If the implementation of `Engine` changes, the `Car` class may also need to be modified.

A better approach is to depend on an abstraction:

```java
interface Engine {
    void start();
}
```

Different implementations can then be created:

```java
class PetrolEngine implements Engine {

    public void start() {
        System.out.println("Petrol Engine Started");
    }
}
```

```java
class ElectricEngine implements Engine {

    public void start() {
        System.out.println("Electric Engine Started");
    }
}
```

The dependency can then be supplied from outside instead of being created inside the class.

## Dependency Injection

Dependency Injection means that a class receives the objects it depends on instead of creating them itself.

### Constructor Injection

```java
class Car {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

}
```

Usage:

```java
Engine engine = new PetrolEngine();

Car car = new Car(engine);
```

The dependency is provided through the constructor.

### Setter Injection

Dependencies can also be provided using setter methods.

```java
class Car {

    private Engine engine;

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

}
```

Usage:

```java
Car car = new Car();

car.setEngine(new PetrolEngine());
```

## Inversion of Control

Normally, an application is responsible for:

```text
Creating Objects
      ↓
Managing Objects
      ↓
Connecting Dependencies
```

With Spring:

```text
Spring IoC Container
        ↓
Creates Objects
        ↓
Manages Objects
        ↓
Injects Dependencies
```

The responsibility of object creation and dependency management is transferred from the application code to the Spring Framework.

This concept is called **Inversion of Control (IoC)**.

## IoC vs Dependency Injection

IoC is the broader principle.

Dependency Injection is one of the techniques used to implement IoC.

```text
Inversion of Control
        |
        └── Dependency Injection
```

Spring uses Dependency Injection to achieve Inversion of Control.

## Spring IoC Container

The Spring IoC Container is responsible for:

- Creating Java objects
- Managing object lifecycle
- Injecting dependencies
- Connecting objects together
- Managing application configuration

Two commonly used Spring containers are:

```text
BeanFactory
ApplicationContext
```

`ApplicationContext` is commonly used in modern Spring applications.

## Spring Beans

Objects created and managed by the Spring IoC Container are called **Spring Beans**.

For example:

```java
@Component
class PetrolEngine {

}
```

Spring can detect this class, create its object, and manage it as a bean.

Instead of writing:

```java
PetrolEngine engine = new PetrolEngine();
```

Spring creates and manages the object for us.

## Important Spring Annotations

After understanding IoC and Dependency Injection, the following annotations become easier to understand:

```java
@Component
```

Marks a class as a Spring-managed component.

```java
@Autowired
```

Allows Spring to automatically inject dependencies.

```java
@Bean
```

Registers an object as a Spring Bean through a configuration class.

```java
@Configuration
```

Defines a class containing Spring configuration.

## Basic Flow

```text
Application Starts
       |
       v
Spring IoC Container Starts
       |
       v
Spring Scans Configuration
       |
       v
Spring Creates Beans
       |
       v
Spring Resolves Dependencies
       |
       v
Dependencies Are Injected
       |
       v
Application Runs
```

## Project Structure

A typical structure for this project may look like:

```text
src
└── main
    └── java
        └── com
            └── shaunak
                └── coredemo
                    ├── Main.java
                    ├── Engine.java
                    ├── PetrolEngine.java
                    ├── ElectricEngine.java
                    └── Car.java
```

The exact structure may change as more Spring Core concepts are added.

## Prerequisites

Make sure the following are installed:

- Java
- JDK 17 or later
- Maven
- IntelliJ IDEA / Eclipse / VS Code
- Git

Check Java:

```bash
java --version
```

Check Maven:

```bash
mvn --version
```

## Clone the Repository

```bash
git clone <your-repository-url>
```

Move into the project:

```bash
cd core-demo
```

## Run the Project

If the project uses Maven:

```bash
mvn clean compile
```

Then run the main Java class from your IDE.

If the project later becomes a Spring Boot project, it can be started using:

```bash
mvn spring-boot:run
```

## Learning Goal

The main purpose of this repository is to understand the progression:

```text
Tight Coupling
      ↓
Interfaces
      ↓
Loose Coupling
      ↓
Dependency Injection
      ↓
Inversion of Control
      ↓
Spring IoC Container
      ↓
Spring Beans
      ↓
Spring Annotations
      ↓
Spring Boot
```

Understanding this flow makes Spring concepts such as `@Component`, `@Autowired`, `@Bean`, and dependency management much easier to understand.

## Topics To Explore Next

Future additions can include:

- `@Component`
- `@Autowired`
- `@Primary`
- `@Qualifier`
- `@Bean`
- `@Configuration`
- Bean scopes
- Bean lifecycle
- Component scanning
- Spring Boot
- REST APIs

## Author

**Shaunak Dhar**

Learning Java Backend Development and the Spring Framework.
