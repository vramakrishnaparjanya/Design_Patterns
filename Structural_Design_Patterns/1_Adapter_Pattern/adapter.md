# **Adapter Pattern**

* makes 2 unrelated interfaces work together
* middle object --> adapter

- Classic example --> Iphone charger
  - 1st phone --> iphone6 (forgot charger)
  - 2nd phone --> iphone4
  - to charge, 1st uses 2nd phone's charger instead --> adapter

### **Two Way Adapter Pattern**

While implementing Adapter pattern, 
there are two approaches - class adapter and object adapter - 
however both these approaches produce same result.

1. **Class Adapter** - This form uses java inheritance and extends the source interface, in our case Socket class.
2. **Object Adapter** - This form uses Java Composition and adapter contains the source object.