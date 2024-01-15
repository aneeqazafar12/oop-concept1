abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape square = new Square();

        circle.draw();
        square.draw();
    }
}