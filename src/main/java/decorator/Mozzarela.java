package decorator;

/**
 * Created by schiduvasile on 12/6/17.
 */
public class Mozzarela extends ToppingDecorator {


    public Mozzarela(Pizza newPizza) {
        super(newPizza);
        System.out.println("Adding Dough");
        System.out.println("Addin mozzarela");

    }

    public String getDescription() {

        return pizza.getDescription() + ", Mozzarela";

    }

    public double getCost() {

        return pizza.getCost() + .50;

    }

}
