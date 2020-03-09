public class Cheese extends Additive {
    public Cheese(double price, String name,Drinks drinks){
        super(price, name, drinks);
    }
    @Override
    public double getPrice() {
        return this.price+drinks.getPrice();
    }
}
