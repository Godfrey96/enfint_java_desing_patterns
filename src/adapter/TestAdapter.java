package adapter;

public class TestAdapter {

    public static void main(String[] args) {
        USBAdapter memoryCardReader = new MemoryCardReader(new MemoryCard());
        memoryCardReader.connectWithUsaAdapter();
    }
}
