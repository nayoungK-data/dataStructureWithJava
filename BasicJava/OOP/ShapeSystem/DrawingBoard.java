package ShapeSystem;
import java.util.ArrayList;

public class DrawingBoard {
    ArrayList<Shape> shapes;

    // constructor
    public DrawingBoard(){
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape){
        shapes.add(shape);
    }

    public void drawAll(){
        for(Shape s : shapes){
            s.draw();
        }
    }

    public void areaAll(){
        for(Shape s : shapes){
            s.area();
        }
    }

    
}
