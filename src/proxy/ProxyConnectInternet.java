package proxy;

public class ProxyConnectInternet implements Internet {

    private String dbName;
    private Database database;

    public ProxyConnectInternet(String dbName){
        this.dbName = dbName;
    }

    @Override
    public void connectToHost(String host) {
        if (host != null){
            database = new Database(dbName);
            database.connectToHost(host);
        }
    }
}
