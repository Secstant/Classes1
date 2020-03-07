import java.util.Random;

public class Rum extends High {
    public String grade;

    public Rum(double price, String name, int strength, String grade) {
        super(price, name, strength);
        this.grade = grade;
        System.out.println("Цена=" + price + " Название " + name + " Крепость=" + strength + " Сорт " +  grade);
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

