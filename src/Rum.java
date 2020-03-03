import java.util.Random;

public class Rum extends High {
    public String grade;

    public Rum(int price, String name, int strength, String grade) {
        super(price, name, strength);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

