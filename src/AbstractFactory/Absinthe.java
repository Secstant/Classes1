package AbstractFactory;

public class Absinthe implements Store {
    @Override
    public Low createLow() {
        return new AbsintheFruko();
    }

    @Override
    public High createHigh() {
        return new AbsintheXenta();
    }
}
