# **Observer Pattern**

* used when an object (called the **Subject**) needs to notify multiple dependent objects (called **Observers**) about changes in its state

* This pattern ensures a one-to-many relationship between objects, where the observers are updated automatically whenever the subject changes.

#### Key Characteristics of the Observer Pattern

1. **Subject**:
   - Maintains a list of observers.
   - Provides methods to attach, detach, and notify observers.

2. **Observers**:
   - Define an interface for receiving updates. 
   - Implement the update logic to respond to state changes in the subject.