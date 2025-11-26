package ShapeSystem;

public class Circle implements Shape{
    // Field
    double radius;

    // constructor
    public Circle(double radius){
        this.radius = radius;
    }

    public void draw(){
        System.out.println("Circle");
    }

    
    public void area(){
        double area = Math.PI * radius * radius;
        System.out.println(area);
    }
}