package ClassWork9;

import java.util.Scanner;

public class StringToIntMathWithMethods {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] textSplit = text.split(" ");
        int[] numbers = new int[textSplit.length];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(textSplit[i]);
        }

        System.out.println("Sum = " + Sum(numbers));
        System.out.println("Average = " + Average(numbers));
        System.out.println("Max = " + Max(numbers));
        System.out.println("Min = " + Min(numbers));
    }

    static int Max(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i : array) {
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    static int Min(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i : array) {
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    static int Sum(int[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum;
    }

    static double Average(int[] array){
        return (double)Sum(array) / array.length;
    }

}
