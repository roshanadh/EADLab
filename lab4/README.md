**Lab #4**

**Date** : January 31, 2020

**Submitted by** : Roshan Adhikari (_2016SE28_)

## Singleton Pattern
The Singleton design pattern ensures that a class has only one instance, and it provides a global point of access to it. Since this pattern is concerned with the creation of objects, it is a creational design pattern.

The fundamental steps for implementing the Singleton Pattern are:
* Make the default constructor private. This prevents other objects from creating objects of the class in question using the _new_ operator.
* Create a static method that acts as a constructor. This method calls the private constructor to create a static object. All following calls to this method return the cached object.

![Singleton Pattern Class Diagram](https://github.com/roshanadh/EADLab/blob/master/lab4/res/singleton-pattern.jpg)

[Image Source](https://www.tutorialspoint.com/design_pattern/singleton_pattern.htm)

Depending on the time of object creation, there are two forms of Singleton design patterns:
* Early Instantiation
* Lazy Instantiation

### Early Instantiation
In Early Instantiation, the instance of the class is created at the time of declaring the static field. So, the class is instantiated at the time of classloading.

Early Instantiation is better interms of performance requirements since the object is ready when it is needed. However, it does add up to the memory requirements of the application.

### Lazy Instantiation
In Lazy Instantiation, the instance of the class is created only when another object calls for it. This instantiaion can also be kept inside a _synchronized_ block so as to block multiple threads from creating multiple objects.

Lazy Instantiaion is better interms of memory requirements since the object is created only if (or when) it is needed. However, this method may not be as performant as Early Instantiation.

## Conclusion

In this lab exercise, we implemented the Early Initialization and Lazy Initialization types of Singleton design pattern in Java.
