package factory;

public class Americano extends Coffee {
    private boolean calories;

    public Americano(int price, String flavor, boolean calories) {
        super(price, flavor);
        this.calories = calories;
    }

}
