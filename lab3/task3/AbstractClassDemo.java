abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Hello, I am Circle!");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Hello, I am Rectangle!");
    }
}

class Square extends Shape {
    @Override
    public void draw() {
        System.out.println("Hello, I am Square!");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape square = new Square();
    
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}