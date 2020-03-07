public class Cola extends Additive {

    public Cola(double price, String name,Byxlo byxlo) {
        super(price, name,byxlo);
    }

    @Override
    public double getPrice() {
        return this.price+byxlo.getPrice();
    }

}
