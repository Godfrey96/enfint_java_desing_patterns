package factory;

public class Coffee {

    private int price;
    private String flavor;
    public static final String EXPRESSO = "Expresso";
    public static final String AMERICANO = "Americano";

    public Coffee(int price, String flavor) {
        this.price = price;
        this.flavor = flavor;
    }
}
