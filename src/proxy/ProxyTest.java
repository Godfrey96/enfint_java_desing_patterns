package proxy;

public class ProxyTest {

    public static void main(String[] args) {
        Internet internet = new ProxyConnectInternet("enfintDB");

        internet.connectToHost("localhost:port");
    }
}
