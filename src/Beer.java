import java.util.Random;

public class Beer extends Low{
    private String color;

    public Beer(double price, String name, int strength, String color) {
        super(price, name, strength);
        this.color = color;
        System.out.println("Цена=" + price + " Название " + name + " Крепость=" + strength + " Сорт " +  color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
