import java.util.Random;

public class Grapewine extends Wine {
    public String grape;

    public Grapewine(int price, String name, int strength, String pack, String grape) {
        super(price, name, strength, pack);
        this.grape = grape;
    }

    public String getGrape() {
        return grape;
    }

    public void setGrape(String grape) {
        this.grape = grape;
    }
}
