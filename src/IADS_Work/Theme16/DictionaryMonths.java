// Very cheesed way of doing it
package IADS_Work.Theme16;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class DictionaryMonths {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Dictionary<Integer, String> months = new Hashtable<>();
        months.put(1, "January");
        months.put(2, "February");
        months.put(3, "March");
        months.put(4, "April");
        months.put(5, "May");
        months.put(6, "June");
        months.put(7, "July");
        months.put(8, "August");
        months.put(9, "September");
        months.put(10, "October");
        months.put(11, "November");
        months.put(12, "December");

        System.out.println("Enter 1 to get Index from Month");
        System.out.println("Enter 2 to get Month from Index");
        int txt = Integer.parseInt(input.nextLine());
        String str = input.nextLine();
        if(txt == 1){
            for(int i = 1; i <= 12; i++){
                if(months.get(i).equals(str)){
                    System.out.println(i);
                }
            }
        }else if(txt == 2){
            System.out.println(months.get(Integer.parseInt(str)));
        }
    }
}