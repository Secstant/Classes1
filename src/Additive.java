public abstract class Additive implements Byxlo {
    protected Byxlo byxlo;
    protected double price;
    protected String name;
    public Additive(double price, String name, Byxlo byxlo) {
        this.price=price;
        this.name=name;
        this.byxlo=byxlo;
    }
    //public abstract double getPrice();
    public String getName(){
        return this.name + ", " + byxlo.getName();
    }


}
