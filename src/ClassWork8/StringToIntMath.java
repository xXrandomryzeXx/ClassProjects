package ClassWork8;

import java.util.Scanner;

public class StringToIntMath {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] textSplit = text.split(" ");
        int[] numbers = new int[textSplit.length];

        int sum = 0;
        double average = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(textSplit[i]);
            sum += numbers[i];
            min = Math.min(min, numbers[i]);
            max = Math.max(max, numbers[i]);
        }
        average = (double)sum/numbers.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);


    }
}
