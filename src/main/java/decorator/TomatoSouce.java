package decorator;

/**
 * Created by schiduvasile on 12/6/17.
 */
public class TomatoSouce extends ToppingDecorator {


    public TomatoSouce(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Souce");

    }

    public String getDescription() {

        return pizza.getDescription() + ", Tomato Sauce";

    }

    public double getCost() {

        return pizza.getCost() + .35;

    }

}
