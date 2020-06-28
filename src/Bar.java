public class Bar {
    public Drinks getDrinks (Pivzavod type) {
        Drinks toReturn = null;
        switch (type) {
            case RUM:
                toReturn = new Rum(150, "Bacardi", 40,"Caribian");
                break;
            case BEER:
                toReturn = new Beer(50, "Chester",5,"Light");
                break;
            case COGNAC:
                toReturn = new Cognac(110, "Tiflis", 40, 3);
                break;
            case FRUITWINE:
                toReturn = new Fruitwine(100, "Sunsmile",15,"bottle", "apple");
                break;
            case GRAPEWINE:
                toReturn = new Grapewine(80, "Merlot", 15, "bottle", "Risling" );
                break;
            case WHISKEY:
                toReturn = new Whiskey(130, "Redlabel", 40, "Scotch");
                break;
        }
        return toReturn;
    }
}
