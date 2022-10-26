/* Current file: StringToIntMathWithMethods.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
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

        System.out.println("Sum = "     + SumInArray(numbers));
        System.out.println("Average = " + AverageInArray(numbers));
        System.out.println("Max = "      + MaxInArray(numbers));
        System.out.println("Min = "     + MinInArray(numbers));
    }

    static int MaxInArray(int[] array){
        int max = Integer.MIN_VALUE;
        for(int i : array) {
            if(i > max){
                max = i;
            }
        }
        return max;
    }

    static int MinInArray(int[] array){
        int min = Integer.MAX_VALUE;
        for(int i : array) {
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    static int SumInArray(int[] array){
        int sum = 0;
        for(int i : array){
            sum += i;
        }
        return sum;
    }

    static double AverageInArray(int[] array){
        return (double) SumInArray(array) / array.length;
    }

}
