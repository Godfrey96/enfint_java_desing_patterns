package factory;

public class FactoryTest {

    public static void main(String[] args) {
        Coffee expresso = CoffeeFactory.createCoffee(Coffee.EXPRESSO);
        Coffee americano = CoffeeFactory.createCoffee(Coffee.AMERICANO);
        System.out.println(expresso);
        System.out.println(americano);

    }
}
