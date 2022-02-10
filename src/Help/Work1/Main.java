package Help.Work1;

import java.util.Scanner;

class Building{
    public int height = 0;
    public float area = 0;
    char[] address = new char[32];

    public void setHeight(int input){
        height = input;
    }
    public void setArea(int input){
        area = input;
    }
    public void setAddress(String input){
        for(int i = 0; i < address.length; i++){
            if(i < input.length())address[i] = input.charAt(i);
            else address[i] = ' ';
        }
    }

    public int getHeight(){
        return height;
    }
    public float getArea(){
        return area;
    }
    public char[] getAddress(){
        return address;
    }

}

class House extends Building {
    Scanner scanner = new Scanner(System.in);
    public int floors = 0;
    char[] owner_name = new char[32];
    int[] phone_number = new int[10];

    public void SetValues_UserInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Въведете височината на сградата");
        setHeight(Integer.parseInt(scanner.nextLine()));
        System.out.println("Въведете площта на сградата");
        setArea(Integer.parseInt(scanner.nextLine()));
        System.out.println("Въведете адреса на сградата");
        setAddress(scanner.nextLine());

        System.out.println("Въведете броя етажи на сградата");
        setFloors(Integer.parseInt(scanner.nextLine()));
        System.out.println("Въведете името на собственика");
        setOwner_name(scanner.nextLine());
        System.out.println("Въведете телефонния номер на собственика");
        setPhone_number(scanner.nextLine());
    }
    public void PrintValues(){
        System.out.println("Сградата е висока: " + getHeight() + "м");
        System.out.println("Сградата заема площ: " + getArea()+ "кв.м");
        System.out.println("Сградата се намира на адрес: " + String.valueOf(getAddress()));

        System.out.println("Сградата има: " + getFloors() + " етажа");
        System.out.println("Собственика се казва: " + String.valueOf(getOwner_name()));

        System.out.print("Телефонния номер на собственика е: ");
        for(int i : getPhone_number()){
            System.out.print(i);
        }
        System.out.println();
    }

    public void setFloors(int input){
        floors = input;
    }
    public void setOwner_name(String input){
        for(int i = 0; i < owner_name.length; i++){
            if(i < input.length())owner_name[i] = input.charAt(i);
            else owner_name[i] = ' ';
        }
    }
    public void setPhone_number(String input){
        for(int i = 0; i < phone_number.length; i++){
            if(i < input.length())phone_number[i] = Integer.parseInt(String.valueOf(input.charAt(i)));
        }
    }

    public int getFloors(){
        return floors;
    }
    public char[] getOwner_name(){
        return owner_name;
    }
    public int[] getPhone_number(){
        return phone_number;
    }

}


public class Main {
    public static void main(String[] args){
        House[] houses = new House[4];
        houses[0] = new House();
        houses[0].setHeight(15);
        houses[0].setFloors(4);

        houses[1] = new House();
        houses[1].setHeight(20);
        houses[1].setFloors(8);

        houses[2] = new House();
        houses[2].setHeight(30);
        houses[2].setFloors(10);

        houses[3] = new House();
        houses[3].setHeight(100);
        houses[3].setFloors(20);

        House mostSpacious = largestHouse(houses);
        System.out.println("Най-просторната сграда е висока: " + mostSpacious.getHeight() + "м");
        System.out.println("И има: " + mostSpacious.getFloors() + " етажа");

        System.out.println("\n");
        System.out.println("Нека направим сграда");
        House newHouse = new House();
        newHouse.SetValues_UserInput();

        System.out.println("Направихте сграда!");
        newHouse.PrintValues();

    }

    public static House largestHouse(House[] houses){
        House largest = null;
        float highestAverage = 0;
        for (House house : houses) {
            float average = (float) house.getHeight() / house.getFloors();
            if (average > highestAverage) {
                highestAverage = average;
                largest = house;
            }
        }
        return largest;
    }
}
