import java.util.Random;

public class Fruitwine extends Wine {
    public String fruit;

    public Fruitwine(int price, String name, int strength, String pack, String fruit) {
        super(price, name, strength, pack);
        this.fruit = fruit;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }
}
