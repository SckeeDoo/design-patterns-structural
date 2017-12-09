package proxy;

/**
 * Created by schiduvasile on 12/7/17.
 */
public class ProxyDemo {


    public static void main(String[] args) {
        Image image = new ProxyImage("file.jpeg");

        image.display();
        System.out.println(" ");

        image.display();

        image.display();

    }

}
