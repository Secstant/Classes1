public abstract class  Alcohol implements Byxlo {
    protected double price;
    protected String name;

    public Alcohol(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

//    public void setPrice(int price) {
//        this.price = price;
//    }

    public String getName() {
        return this.name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

}
