package AbstractFactory;

public class Cider implements Store {

    @Override
    public Low createLow() {
        return new CiderPosh();
    }

    @Override
    public High createHigh() {
        return new CiderChester();
    }
}
