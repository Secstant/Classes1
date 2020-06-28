package AbstractFactory;

public interface Store {
    Low createLow();
    High createHigh();
}
