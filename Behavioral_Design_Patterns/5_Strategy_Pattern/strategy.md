# **Strategy Pattern**

* The Strategy Design Pattern is a behavioral design pattern that allows you to define a family of algorithms, put each algorithm into a separate class, and make their objects interchangeable. 
* This pattern is particularly useful when you want to select an algorithm's behavior at runtime.

#### Key Concepts
1. **Strategy Interface**: Defines a common interface for all supported algorithms.
2. **Concrete Strategy**: Implements the Strategy interface with specific behavior.
3. **Context**: Maintains a reference to a Strategy object and allows the behavior to be dynamically changed.
