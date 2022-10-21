package proxy;

public class Database implements Internet {
    private String name;

    public Database(String name) {
        this.name = name;
    }

    @Override
    public void connectToHost(String host) {
        System.out.println("Connected to: " + host + "/" + name);
    }
}
