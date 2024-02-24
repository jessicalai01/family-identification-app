96-120
Item 15: Minimize the accessibility of classes and members
Abstraction for decoupling
How: make each class or package as inaccessible as possible
- private: the member only accessible from the top level class where declared
- package-private: accessible from any class in the package where it is declared
  - Note:
  -  private and package-private fields can, however, “leak” into the exported API if the class implements Serializable
- protected: 
  - accessible for the class and its subclass 
  - part of the exported API and should be supported forever - hygiene risk 
- public:
  - accessible from anywhere 
  - instance and static fields of public classes should rarely be public - ensure the thread-safety
  - example: instead of doing `public static final`, 
  - do `private static final` and then return a `Collections.unmodifiableList()` or `result.clone()`
  - 


Item 16: In public classes, use accessor methods, not public fields
- instead of `public double x;` use `private double x` then make getter, setter, and constructor

Item 17: Minimize mutability
- All the information contained in each instance is fixed for the lifetime of the object, so no changes can ever be observed.
- rules
  - dont provide methods that modify the object's state
    - be more functional programming 
    - create a new instance in return rather than applying a procedure to their operand
    - Note that the method names are prepositions (such as plus) rather than verbs (such as add). This emphasizes the fact that methods don’t change the values of the objects.
  - ensure the class cannot be extended
    - it will make the class less flexible though
  - make all fields final
  - make all fields private 
  - ensure exclusive access to mutable components 
Why? 
  - Immutable objects are inherently thread-safe; they require no synchronization.
  - immutable objects can be shared freely. 
    - so encourage clients to reuse existing instances wherever possible.
  - immutable class can provide static factories that cache frequently requested instances to avoid creating new instances when existing one would do

flexible alternative
- making all of the constructors private or package private
- and then add public static factories in places of the public constructors
```
 // Immutable class with static factories instead of constructors
  public class Complex {
  private final double re;
  private final double im;
  private Complex(double re, double im) { 
    this.re = re;
    this.im = im;
  }
  public static Complex valueOf(double re, double im) { 
    return new Complex(re, im);
    }
  }
```

Item 18: Favor composition over inheritance
- a class B should extend a class A only if an “is-a” relationship exists between the two classes.
Can inherit interface but not class 
- since changes in superclasses can break child classes
Instead, use composition
- meaning the existing class becomes a component of the new one 
- each instance method in the new class invokes the corresponding method on the contained instance of the existing class
- so the new class (wrapper class) is free from the detail implementation of the existing class
- also the flaws in the existing class will not be propagated into new one


Item 20: Prefer interfaces to abstract classes















