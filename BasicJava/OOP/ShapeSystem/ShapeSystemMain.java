package ShapeSystem;

public class ShapeSystemMain {
    public static void main(String[] args){

    Circle c1 = new Circle(2);
    Circle c2 = new Circle(5);

    Rectangle r1 = new Rectangle(2,3);
    Rectangle r2 = new Rectangle(4,5); 

    DrawingBoard board = new DrawingBoard();

    board.addShape(c1);
    board.addShape(c2);
    board.addShape(r1);
    board.addShape(r2);

    board.drawAll();
    board.areaAll();
    }
}
