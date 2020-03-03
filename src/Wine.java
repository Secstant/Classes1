import java.util.Random;

public abstract class Wine extends Low {
    protected String pack;

    public Wine(int price, String name, int strength, String pack) {
        super(price, name, strength);
        this.pack = pack;
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack;
    }
}
