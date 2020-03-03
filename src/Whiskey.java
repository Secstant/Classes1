import java.util.Random;

public class Whiskey extends High {
    private String type;

    public Whiskey(int price, String name, int strength, String type) {
        super(price, name, strength);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
