## Method Overloading

* compile-time polymorphism.
* helps to increase the readability of the program.
* It occurs within the class.
* Method overloading may or may not require inheritance.
* In method overloading, methods must have the same name and different signatures.
* In method overloading, the return type can or can not be the same, but we just have to change the parameter.
* Static binding is being used for overloaded methods.
* Poor Performance due to compile time polymorphism.
* Private and final methods can be overloaded.
* The argument list should be different while doing method overloading.

## Method Overriding

* Method overriding is a run-time polymorphism.
* Method overriding is used to grant the specific implementation of the method which is already provided by its parent class or superclass.
* It is performed in two classes with inheritance relationships.
* Method overriding always needs inheritance.
* In method overriding, methods must have the same name and same signature.
* In method overriding, the return type must be the same or co-variant.
* Dynamic binding is being used for overriding methods.
* It gives better performance. The reason behind this is that the binding of overridden methods is being done at runtime.
* Private and final methods can’t be overridden.
* The argument list should be the same in method overriding.