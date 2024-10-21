# Employee Payroll System

## OOP Concepts Demonstrated:

### 1. Abstraction
- We have an **abstract class** `Employee` that defines common things all employees share.
- It has an abstract method `calculateSalary()` that is not defined in `Employee`, but its subclasses must provide their own version of this method.
- This lets full-time and part-time employees each calculate their salary in their own way without changing the base `Employee` class.

### 2. Inheritance
- **Subclasses** `FullTimeEmployee` and `PartTimeEmployee` are created by extending `Employee`.
- These subclasses inherit shared properties like `name`, `baseSalary`, and the method to display employee details.
- Each subclass defines its own version of the `calculateSalary()` method based on how their salary is calculated.

### 3. Encapsulation
- Employee details like `name` and `baseSalary` are **private**, meaning they are protected and can’t be accessed directly.
- **Public getter methods** are used to access these details safely.
- Subclasses use these inherited methods instead of directly accessing or changing the private fields.
