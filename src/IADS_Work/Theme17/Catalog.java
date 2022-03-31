package IADS_Work.Theme17;

import java.util.HashMap;
import java.util.Scanner;

public class Catalog {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        HashMap<String, String> Catalog = new HashMap<>();
        Catalog.put("Money For Nothing", "Dire Straits");
        Catalog.put("Brothers In Arms", "Dire Straits");
        Catalog.put("Your Latest Trick", "Dire Straits");
        Catalog.put("Walk Of Life", "Dire Straits");
        Catalog.put("Why Worry", "Dire Straits");
        Catalog.put("Urgent", "Foreigner");
        Catalog.put("Snowman", "Foreigner");
        Catalog.put("I Want To Know", "Foreigner");
        Catalog.put("The Wall", "Pink Floyd");
        Catalog.put("Shine On You Crazy Diamond", "Pink Floyd");
        Catalog.put("Wish You Were Here", "Pink Floyd");
        Catalog.put("Time", "Pink Floyd");

        Catalog.forEach((key, value)->{
            System.out.println(key + " -> " + value);
        });

        System.out.println();
        System.out.println("1. Group");
        System.out.println("2. Song");
        System.out.print("Choose an option from the menu: ");
        int choice = Integer.parseInt(input.nextLine());

        if(choice == 1){
            String group = input.nextLine();
            if(Catalog.containsValue(group))Catalog.forEach((key, value)->{ if(value.equals(group)) System.out.println(key); });
            else System.out.println("This group does not exist in the list");
        }else{
            String song = input.nextLine();
            if(Catalog.containsKey(song))System.out.println(song + " is written by the group " + Catalog.get(song));
            else System.out.println("This song does not exist in the list");
        }
    }
}