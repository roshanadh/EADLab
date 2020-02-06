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

class ShapeFactory {
    public Shape getShape(String shape) throws Exception {
        switch(shape) {
            case "Circle": return new Circle();
            case "Square": return new Square();
            case "Rectangle": return new Rectangle();
            default: throw new Exception("Invalid Shape Requested Error!");
        }
    }
}

public class FactoryPatternDemo {
    public static void main(String[] args) throws Exception {
        ShapeFactory factory = new ShapeFactory();
        Shape circle = factory.getShape("Circle");
        circle.draw();
    }
}