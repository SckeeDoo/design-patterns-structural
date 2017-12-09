package decorator;



/**
 * Created by schiduvasile on 11/10/17.
 */


public class PizzaMaker {

    public static void main(String[] args) {

        Pizza basicPizza = new TomatoSouce(new Mozzarela(new PlainPizza()));
        System.out.println("Ingredients: " + basicPizza.getDescription());
        System.out.println("Total cost of pizza: " + basicPizza.getCost());

    }
}


