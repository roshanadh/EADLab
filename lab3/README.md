**Lab #3**

**Date** : January 24, 2020

**Submitted by** : Roshan Adhikari (_2016SE28_)

## Interfaces in Java
In Java, an interface is an abstract data type that is used to specify a behaviour that classes must implement. In layman's terms, an interface is an abstract class that groups together related methods with empty bodies. Interfaces are declared using the _interface_ keyword, like:
```sh
public interface Shape {
    public void draw();
}
```

To access the methods of an interface, the interface must be _implemented_ using the _implements_ keyword. Unless the class that implements the interface is abstract, it needs to define all methods of the interface.

## Abstract Classes in Java
A class which is declared with the _abstract_ keyword is called an abstract class. An abstract class can have abstract (those with empty bodies) as well as non-abstract (those with non-empty bodies) methods. An abstract method is declared without an implementation, like:
```sh
abstract void moveTo(double x, double y);
```
If a class includes even one abstract method, then the class itself must be declared as abstract. Abstract classes are a method of achieving abstraction in Java.

Abstract classes cannot be instantiated (using the _new_ operator), but they can be subclassed (using the _extends_ keyword). The subclass usually provides the implementations for all of the abstract methods in its parent class. However, if it does not, then the subclass must also be declared abstract.

## Factory Pattern in Java
Factory Pattern is a creational design pattern, which means that it is concerned with the way of creating objects. Factory Method/Factory Pattern provides an interface for creating objects in  a superclass, but allows subclasses to alter the type of objects that will be created.

The Factory Method Pattern suggests that instead of using the _new_ operator to create objects, we use calls to a special _factory_ method. The objects are still instantiated via the _new_ operator, but the calls reside within the aforementioned _factory_ method.

Factory Pattern promotes loose-coupling by avoiding hard-coded instantiation calls.

![Factory Pattern Class Diagram](https://github.com/roshanadh/EADLab/blob/master/lab3/res/factory-pattern.jpg)

[Image Source](https://www.tutorialspoint.com/design_pattern/factory_pattern.htm)

## Conclusion

In this lab exercise, we revised different Java concepts like Object Instantiation, Inheritance, Abstract Classes, and implemented the Factory Design Pattern in Java.
