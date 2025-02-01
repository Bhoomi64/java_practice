import java.util.*;
abstract class shape{
    abstract double calculatearea();
    void display(){
        System.out.println("This is  a shape");
    }
}
interface drawable{
    void draw();
}
class Circle extends shape implements drawable{
    private double radius;
    Circle(double radius){
        this.radius=radius;
    }
    double calculatearea(){
        return 3.14*radius*radius;
    }
    public void draw(){
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends shape implements drawable{
    private double length,breadth;
    Rectangle(double length,double breadth){
        this.length = length;
        this.breadth=breadth;
    }
    double calculatearea(){
        return length*breadth;
    }
    public void draw(){
        System.out.println("Drawing a Rectangle");
    }
}

public class q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        c.display();
        c.draw();
        System.out.println("Area of circle: "+c.calculatearea());
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        Rectangle rec = new Rectangle(l, b);
        rec.display();
        rec.draw();
        System.out.println("Area of rectangle: "+rec.calculatearea());
        sc.close();
    }
}
