import AbstractFactory.Cider;
import AbstractFactory.Store;
import Builder.Cocktail;
import Compan.*;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main<randomNumber> {
    public static void main(String[] args){
        int num;
        double cost;
        String name[]=new String [] {"Dark","Light"};
        Alcohol[] array = new Alcohol[10];
//        Для 1 лабы
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
//        Декоратор
//        Drinks will=new Whiskey (100, "William",40, "Scotch");
//        will=new Cola(50,"Coca",will);
//        will=new Juice(40, "Dobryi", will);
//        System.out.println(will.getPrice());
//        System.out.println(will.getName());
//        Фабрика
//        Bar time = new Bar();
//        Drinks beer = time.getDrinks(Pivzavod.BEER);
//        Drinks whiskey=time.getDrinks(Pivzavod.WHISKEY);
//        Drinks rum=time.getDrinks(Pivzavod.RUM);
//        Регулярные выражения
//        String text = "Предвижу всё: вас оскорбит\n" +
//                "Печальной тайны объясненье.\n" +
//                "Какое горькое презренье\n" +
//                "Ваш гордый взгляд изобразит!";
//        Pattern pattern = Pattern.compile("о.+о");
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()) {
//            System.out.println(text.substring(matcher.start(), matcher.end()));
//        }
//        Абстрактная фабрика
//        Store factory;
//        factory = new Cider();
//        factory.createHigh();
//        Билдер
//        Cocktail Cocktail=new Cocktail.Builder("apple").setFirst("vodka").setSecond("tonik").setStrength(30).build();
//        System.out.println(Cocktail.getFruit());
//        System.out.println(Cocktail.getFirst());
//        System.out.println(Cocktail.getSecond());
//        System.out.println(Cocktail.getStrength());
//        Компановщик
//        Magazine vodka = new Type();
//        Magazine beer = new Type();
//        Magazine juice = new Additivedrink();
//        Magazine soda = new Additivedrink();
//        Magazine ice = new Extra();
//        Magazine fruit = new Extra();
//        Drink weak = new Drink();
//        Drink strong = new Drink();
//        strong.addComponent(vodka);
//        strong.addComponent(juice);
//        strong.addComponent(ice);
//        strong.mix();
//        Итератор
//        ArrayList<String> whiskey = new ArrayList<String>();
//        whiskey.add("Redlabel");
//        whiskey.add("William");
//        whiskey.add("Scotch");
//        whiskey.add("Grants");
//        ListIterator<String> listIter = whiskey.listIterator();
//        while(((ListIterator) listIter).hasNext()){
//            System.out.println(listIter.next());
//        }
//        listIter.set("William");
//        while(listIter.hasPrevious()){
//            System.out.println(listIter.previous());
//        }
        }

    }

