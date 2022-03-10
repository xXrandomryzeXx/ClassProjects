package ClassWork10;

import java.util.Scanner;

public class MiddleElementsInEvenLengthArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] split = str.split(" ");

        System.out.println(split[split.length/2 - 1] + " " + split[split.length/2]);

    }
}
