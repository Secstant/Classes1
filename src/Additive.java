public abstract class Additive implements Drinks {
    protected Drinks drinks;
    protected double price;
    protected String name;
    public Additive(double price, String name, Drinks drinks) {
        this.price=price;
        this.name=name;
        this.drinks=drinks;
    }
    //public abstract double getPrice();
    public String getName(){
        return this.name + ", " + drinks.getName();
    }


}
