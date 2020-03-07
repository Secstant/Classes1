import java.util.Random;

public class Whiskey extends High {
    private String type;

    public Whiskey(double price, String name, int strength, String type) {
        super(price, name, strength);
        this.type = type;
        System.out.println("Цена=" + price + " Название " + name + " Крепость=" + strength + " Сорт " +  type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
