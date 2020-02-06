interface Shape {
    public void draw();
}

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Hello, I am Circle!");
    }
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Hello, I am Rectangle!");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Hello, I am Square!");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        Shape square = new Square();
    
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}