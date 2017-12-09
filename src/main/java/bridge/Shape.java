package bridge;

/**
 * Created by schiduvasile on 12/9/17.
 */
abstract public class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
