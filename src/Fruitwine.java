import java.util.Random;

public class Fruitwine extends Wine {
    public String fruit;

    public Fruitwine(double price, String name, int strength, String pack, String fruit) {
        super(price, name, strength, pack);
        this.fruit = fruit;
        System.out.println("Цена=" + price + " Название " + name + " Крепость=" + strength + " Фрукт " +  fruit);
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }
}
