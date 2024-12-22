# **Composite Pattern**

* to be used when we need objects in a structure to be treated the same way

1. **Base Component** - interface for all objects in the composition, 
   - It can be an interface or an abstract class with common methods.


2. **Leaf** - Defines the behaviour for the elements in the composition. 
   - It is the building block for the composition and implements base component. 
   - It doesn’t have references to other components.


3. **Composite** 
   - consists of leaf elements and
   - implements the operations in base component.