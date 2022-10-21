package factory;

public class CoffeeFactory {
    public static Coffee createCoffee(String type){
        if (type.equals(Coffee.EXPRESSO)){
            return new Expresso(25, "chocolate", "black");
        }else if (type.equals(Coffee.AMERICANO)){
            return new Americano(30, "banana", true);
        }else {
            return null;
        }
    }
}
