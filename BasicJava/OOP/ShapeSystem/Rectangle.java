package ShapeSystem;

public class Rectangle implements Shape {
    //fields
    double length;
    double width;

    // constructor
    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void draw(){
        System.out.println("Rectangle");
    }

    public void area(){
        double area = length * width;
        System.out.println(area);
    }
}
