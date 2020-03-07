import java.util.Random;

public abstract class Low extends Alcohol {
    protected int strength;

    public Low(double price, String name, int strength) {
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
