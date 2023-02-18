package project2;
//1. Create an Interface 'Shape' with undefined
//methods as calculateArea and
//calculatePerimiter. Create 2 classes Circle &
//Square that implements functionality defined in
//the Shape Interface. Test your code.

public interface Shape {
    void calculateArea();
    void calculatePerimeter();
    final double PI=3.14;



}
class Circle implements Shape{

    int radius;

    @Override
    public void calculatePerimeter() {
        radius=4;
        System.out.println(2*PI*radius);
    }

    @Override
    public void calculateArea() {
        radius=4;
        System.out.println(PI*radius);


    }
}
class Square implements Shape{
    int side;
    @Override
    public void calculateArea() {
        side=5;
        System.out.println(side*side);
    }

    @Override
    public void calculatePerimeter() {
        side=5;
        System.out.println(4*side);
    }
}
class ShapeTester{
    public static void main(String[] args) {
        Shape []shape={new Circle(),new Square()};
        for(Shape s:shape){
            s.calculatePerimeter();
            s.calculateArea();
        }
    }
}
