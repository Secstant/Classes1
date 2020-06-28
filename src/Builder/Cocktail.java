package Builder;

public class Cocktail {
    public String getFirst(){
        return first;
    }
    public String getSecond(){
        return second;
    }
    public int getStrength(){
        return strength;
    }
    public String getFruit(){
        return fruit;
    }
    private String first;
    private String second;
    private int strength;
    private String fruit;
    private Cocktail(Builder builder){
        this.first=builder.first;
        this.fruit=builder.fruit;
        this.second=builder.second;
        this.strength=builder.strength;
    }
    public static class Builder{
        private String first;
        private String second;
        private int strength;
        private String fruit;
        public Builder (String fruit){
            this.fruit=fruit;
        }
        public Builder setFirst(String first){
            this.first=first;
            return this;
        }
        public Builder setSecond(String second){
            this.second=second;
            return this;
        }
        public Builder setStrength(int strength){
            this.strength=strength;
            return this;
        }
        public Cocktail build(){
            return new Cocktail(this);
        }
    }
}
