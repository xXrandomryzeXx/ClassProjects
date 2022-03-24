package ClassWork11;

import java.util.Scanner;

public class FoodStorage {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String[] fruits = input.nextLine().split(" ");

        String str_quantity = input.nextLine();
        String str_prices = input.nextLine();

        long[] quantities = new long[fruits.length];
        double[] prices = new double[fruits.length];

        for(int i = 0; i < fruits.length; i++){
            quantities[i] = Long.parseLong(str_quantity.split(" ")[i]);
            prices[i] = Double.parseDouble(str_prices.split(" ")[i]);
        }

        String comm = "";

        do{
            comm = input.nextLine();
            for(int i = 0; i < fruits.length; i++){
                if(comm.equals(fruits[i])){
                    System.out.println(comm + " costs: " + prices[i] + "; Available quantity: " + quantities[i]);
                }
            }
        }while(!comm.equals("done"));

    }
}
