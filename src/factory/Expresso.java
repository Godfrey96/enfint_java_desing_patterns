package factory;

public class Expresso extends Coffee {
    private int price;
    private String flavor;
    private String color;

    public Expresso(int price, String flavor, String color) {
        this.price = price;
        this.flavor = flavor;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Expresso = [" +
                "price=" + price +
                ", flavor='" + flavor + '\'' +
                ", color='" + color + '\'' +
                ']';
    }
}
