package factory;

public class Americano extends Coffee {
    private int price;
    private String flavor;
    private boolean calories;

    public Americano(int price, String flavor, boolean calories) {
        this.price = price;
        this.flavor = flavor;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Americano = [" +
                "price=" + price +
                ", flavor='" + flavor + '\'' +
                ", calories=" + calories +
                ']';
    }
}
