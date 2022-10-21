package adapter;

public class MemoryCardReader implements USBAdapter {

    private MemoryCard memoryCard;

    public MemoryCardReader(MemoryCard memoryCard){
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectWithUsaAdapter() {
        this.memoryCard.insertMemoryCard();
        this.memoryCard.readData();
    }
}
