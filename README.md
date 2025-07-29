# Object-Oriented Programming Assignment

This project demonstrates various Object-Oriented Programming concepts in Java, including inheritance, polymorphism, method overloading, method overriding, and the use of the `super` keyword.

## Project Structure

```
OOP_Assignment/
├── GeometricObject/
│   ├── SimpleGeometricObject.java
│   ├── CircleFromSimpleGeometricObject.java
│   ├── RectangleFromSimpleGeometricObject.java
│   └── TestCircleRectangle.java
├── Super_keyword/
│   ├── SimpleGeometricObject.java
│   ├── CircleFromSimpleGeometricObject.java
│   ├── PrintCircleTest.java
│   ├── Apple.java
│   ├── Fruit.java
│   ├── Faculty.java
│   └── TestChaining.java
├── Overload/
│   ├── Circle.java
│   └── Test.java
├── Overriding/
│   └── Test.java
└── Polymorphism/
    └── PolymorphismDemo.java
```

## Packages and Classes

### 1. GeometricObject Package
Demonstrates inheritance and basic geometric object modeling.

#### Classes:
- **SimpleGeometricObject.java**: Base class for geometric objects
  - Properties: color, filled status, creation date
  - Methods: getters, setters, toString()
  
- **CircleFromSimpleGeometricObject.java**: Circle class extending SimpleGeometricObject
  - Properties: radius
  - Methods: getArea(), toString(), printCircle()
  
- **RectangleFromSimpleGeometricObject.java**: Rectangle class extending SimpleGeometricObject
  - Properties: width, height
  - Methods: getArea(), getPerimeter(), toString()
  
- **TestCircleRectangle.java**: Test class demonstrating inheritance

### 2. Super_keyword Package
Demonstrates the use of the `super` keyword for constructor chaining and method overriding.

#### Classes:
- **SimpleGeometricObject.java**: Base class (similar to GeometricObject package)
- **CircleFromSimpleGeometricObject.java**: Circle class with `super` usage
  - Uses `super()` in constructor
  - Uses `super.toString()` in toString() method
  - Includes `printCircle()` method for displaying circle information
  
- **PrintCircleTest.java**: Test class for CircleFromSimpleGeometricObject
  - Creates a circle with radius 3.5, green color, and filled status
  - Calls `printCircle()` method to display circle information
  
- **Apple.java**: Demonstrates inheritance with Apple extending Fruit
- **Fruit.java**: Base class for fruits
- **Faculty.java**: Demonstrates constructor chaining
- **TestChaining.java**: Test class for constructor chaining

### 3. Overload Package
Demonstrates method overloading and inheritance.

#### Classes:
- **Circle.java**: Contains Circle class and B class (inheriting from Circle)
  - Circle: Basic circle with radius and area calculation
  - B: Extended class with length property and overridden getArea() method
  
- **Test.java**: Test class for demonstrating overloading

### 4. Overriding Package
Demonstrates method overriding concepts.

#### Classes:
- **Test.java**: Test class demonstrating method overriding

### 5. Polymorphism Package
Demonstrates polymorphic behavior with geometric objects.

#### Classes:
- **PolymorphismDemo.java**: Demonstrates polymorphism
  - `displayObject()` method accepts SimpleGeometricObject parameter
  - Can handle both Circle and Rectangle objects polymorphically

## Key OOP Concepts Demonstrated

### 1. Inheritance
- `CircleFromSimpleGeometricObject` extends `SimpleGeometricObject`
- `RectangleFromSimpleGeometricObject` extends `SimpleGeometricObject`
- `B` class extends `Circle`
- `Apple` extends `Fruit`

### 2. Polymorphism
- `PolymorphismDemo` shows how different geometric objects can be treated uniformly
- Method overriding in various classes

### 3. Method Overloading
- Demonstrated in the `Overload` package
- Multiple constructors and methods with different parameters

### 4. Method Overriding
- `toString()` method overridden in child classes
- `getArea()` method overridden in `B` class

### 5. Super Keyword Usage
- Constructor chaining with `super()`
- Method calls with `super.methodName()`
- Accessing parent class members

## How to Run

### Compile and Run Individual Tests

1. **GeometricObject Package:**
   ```bash
   javac GeometricObject/*.java
   java GeometricObject.TestCircleRectangle
   ```

2. **Super_keyword Package:**
   ```bash
   javac Super_keyword/*.java
   java Super_keyword.PrintCircleTest
   ```

3. **Overload Package:**
   ```bash
   javac Overload/*.java
   java Overload.Test
   ```

4. **Overriding Package:**
   ```bash
   javac Overriding/*.java
   java Overriding.Test
   ```

5. **Polymorphism Package:**
   ```bash
   javac Polymorphism/*.java GeometricObject/*.java
   java Polymorphism.PolymorphismDemo
   ```

### Compile All Packages
```bash
javac GeometricObject/*.java Super_keyword/*.java Overload/*.java Overriding/*.java Polymorphism/*.java
```

## Features

- **Inheritance**: Multiple examples of class inheritance
- **Polymorphism**: Runtime polymorphism with geometric objects
- **Encapsulation**: Private fields with public getters/setters
- **Method Overloading**: Multiple methods with same name, different parameters
- **Method Overriding**: Child classes overriding parent methods
- **Super Keyword**: Proper usage for constructor chaining and method calls
- **Abstract Classes**: Base classes providing common functionality

## Learning Objectives

This project covers:
1. Understanding inheritance hierarchies
2. Implementing method overriding and overloading
3. Using the `super` keyword effectively
4. Applying polymorphism in real-world scenarios
5. Creating and testing object-oriented designs
6. Understanding constructor chaining
7. Working with packages and class relationships

## Recent Fixes

- **Fixed PrintCircleTest.java**: Added missing `printCircle()` method to `CircleFromSimpleGeometricObject` class
- The method now displays comprehensive circle information including color, filled status, radius, and area

## Author

This project demonstrates fundamental Object-Oriented Programming concepts in Java, suitable for learning and understanding OOP principles. 
