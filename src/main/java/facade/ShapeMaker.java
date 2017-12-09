package facade;

/**
 * Created by schiduvasile on 12/7/17.
 */
public class ShapeMaker {

    private Circle circle;
    private Square square;

    public ShapeMaker() {
        circle = new Circle();
        square = new Square();
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
