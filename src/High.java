import java.util.Random;

public abstract class High extends Alcohol {
    protected int strength;

    public High(double price, String name, int strength) {
        super(price, name);
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
}
