import java.util.Random;

public class main<randomNumber> {
    public static void main(String[] args){
        int num;
        double cost;
        String name[]=new String [] {"Dark","Light"};
        Alcohol[] array = new Alcohol[10];
//        for (int i=0; i<10; i++){
//            num= (int) (1+Math.random()*5);
//            cost= 100+ Math.random()*100;
//            System.out.println (num);
//            switch(num){
//                case 1:
//                    new Beer((int) cost,"Posh", 10, "Dark");
//                    break;
//                case 2:
//                    new Whiskey((int) cost, "william", 40, "Scotch");
//                    break;
//                case 3:
//                    new Rum((int) cost, "Rum",40,"Gold");
//                    break;
//                case 4:
//                    new Fruitwine((int) cost,"Stefano", 12, "Carton","apple" );
//                    break;
//                case 5:
//                    new Grapewine((int) cost, "Bole", 10, "Bottle", "Merlot");
//                    break;
//                case 6:
//                    new Cognac ((int) cost, "Tiflis", 40, 3);
//                    break;
//        }
        Byxlo will=new Whiskey (100, "William",40, "Scotch");
        will=new Cola(50,"Coca",will);
        will=new Juice(40, "Dobryi", will);
        System.out.println(will.getPrice());
        System.out.println(will.getName());

        }

    }

