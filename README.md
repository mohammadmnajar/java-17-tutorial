# Java Data Types and Their Real-World Usage

## Table of Data Types
| **Data Type**  | **Category**           | **Description**                              | **Real-World Usage**                                    |
|----------------|------------------------|----------------------------------------------|--------------------------------------------------------|
| `int`          | Primitive              | Integer value                                | Counting items, iterations in loops                    |
| `double`       | Primitive              | Double-precision floating-point value        | Financial calculations, scientific measurements        |
| `float`        | Primitive              | Single-precision floating-point value        | Graphics, game development (e.g., position coordinates)|
| `boolean`      | Primitive              | Boolean value (`true` or `false`)            | Decision making, flags (e.g., isAdmin, isActive)       |
| `char`         | Primitive              | Single 16-bit Unicode character              | Storing individual characters (e.g., 'A', 'b')         |
| `byte`         | Primitive              | 8-bit signed integer                         | File I/O operations, memory-saving large arrays        |
| `short`        | Primitive              | 16-bit signed integer                        | When memory is a concern and the range of values is small|
| `long`         | Primitive              | 64-bit signed integer                        | Large integer calculations (e.g., timestamps, IDs)     |
| `String`       | Non-Primitive (Reference) | Sequence of characters                     | Storing and manipulating text (e.g., names, messages)  |
| `Array`        | Non-Primitive (Reference) | Fixed-size collection of elements of same type | Storing lists of items (e.g., list of scores, names)  |
| `Class`        | Non-Primitive (Reference) | User-defined data type                      | Representing objects with attributes and methods (e.g., Customer, Product) |

## Examples of Data Types in Java

```java
int age = 30;                      // Real-world usage: Age of a person
double price = 19.99;              // Real-world usage: Price of an item
float temperature = 36.6f;         // Real-world usage: Body temperature in Celsius
boolean isStudent = true;          // Real-world usage: Student status flag
char grade = 'A';                  // Real-world usage: Grade in a course
byte smallNumber = 10;             // Real-world usage: Small integer values, file I/O
short mediumNumber = 1000;         // Real-world usage: Medium-range integer values
long distance = 123456789L;        // Real-world usage: Distance in meters
String name = "John Doe";          // Real-world usage: Person's name
int[] scores = {90, 85, 78};       // Real-world usage: List of scores
class Customer {                   // Real-world usage: Representing a customer
    String name;
    int id;
    // Methods and attributes
}
