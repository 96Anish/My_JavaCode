import java.util.Scanner;
class Shape {
    public double getPeri() {
        return 0;
    }
    public double getArea() {
        return 0;
    }
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double getPeri() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
public class ShapeTest 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        Circle c = new Circle(r);
        System.out.println("Perimeter of Circle: " + c.getPeri());
        System.out.println("Area of Circle: " + c.getArea());
    }
}
 