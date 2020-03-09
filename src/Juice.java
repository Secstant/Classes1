public class Juice extends Additive {

    public Juice(double price, String name,Byxlo byxlo){
        super(price, name,byxlo);
    }
    @Override
    public double getPrice() {
        return this.price+byxlo.getPrice();
    }
}
