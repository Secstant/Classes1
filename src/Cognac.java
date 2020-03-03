import java.util.Random;

public class Cognac extends High {
    private int stars;

    public Cognac(int price, String name, int strength, int stars) {
        super(price, name, strength);
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
