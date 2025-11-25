package OOPInterface;

public class DrawMain {
    public static void main(String[] args){
        Drawable d1 = new Circle();
        Drawable d2 = new Square();

        d1.draw();
        d2.draw();
        
    }
}
