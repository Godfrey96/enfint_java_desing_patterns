package factory;

public class Expresso extends Coffee {

    private String color;

    public Expresso(int price, String flavor, String color) {
        super(price, flavor);
        this.color = color;
    }
}
