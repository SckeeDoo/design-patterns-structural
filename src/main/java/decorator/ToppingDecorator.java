package decorator;

/**
 * Created by schiduvasile on 12/6/17.
 */
abstract class ToppingDecorator implements Pizza {

    protected Pizza pizza;

    public ToppingDecorator(Pizza newPizza) {
        pizza = newPizza;
    }

    public String getDescription() {

        return pizza.getDescription();

    }

    public double getCost() {

        return pizza.getCost();

    }

}
