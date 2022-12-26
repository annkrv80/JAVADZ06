import java.util.UUID;

public class Laptop {
    private UUID uuid = UUID.randomUUID();
    private String producer;
    private int diagonalScreen;
    private String cpu;
    private int ram;
    private int price;

    public Laptop(String producer, int diagonalScreen, String cpu, int ram) {
        this.producer = producer;
        this.diagonalScreen = diagonalScreen;
        this.cpu = cpu;
        this.ram = ram;

    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public float getDiagonalScreen() {
        return diagonalScreen;
    }

    public void setDiagonalScreen(int diagonalScreen) {
        this.diagonalScreen = diagonalScreen;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {

        return this.producer + "-" + this.price + "руб.";
    }

    
}
