package ClassWork10;

import java.util.Scanner;

public class NumberRounding {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] split = str.split(" ");

        for(int i = 0; i < split.length; i++){
            int num = (int)Math.round(Double.parseDouble(split[i]));
            System.out.println(split[i] + " => " + num);
        }
    }
}
