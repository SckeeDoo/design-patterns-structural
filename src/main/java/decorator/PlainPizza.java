package decorator;

/**
 * Created by schiduvasile on 12/6/17.
 */
public class PlainPizza implements Pizza {


    public String getDescription() {
        return "Thin Dough";
    }

    public double getCost() {
        return 10.0;
    }
}
