package low_level_design.OOP_Design.Abstraction;

abstract class Shape {
    abstract void draw(); // Abstract method, to be implemented by subclasses
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
