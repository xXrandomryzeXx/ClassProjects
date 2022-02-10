package IADS_Work;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DoubleArraySort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Enter the size of the main array");
        int n = Integer.parseInt(input.nextLine());
        int[] myArr = new int[n];
        System.out.println("Mixing the main array with random values");
        int even = 0, odd = 0;
        for(int i = 0; i < myArr.length; i++){
            myArr[i] = rand.nextInt(100);
            if(myArr[i]%2 == 0) even++;
            else odd++;

        }

        int[] evenNumArray = new int[even];
        int[] oddNumArray = new int[odd];

        arraySeparation(even, odd, myArr, evenNumArray, oddNumArray);


        System.out.println("Sorting the array of EVEN numbers (ascending order)");
        //Sort the array with even numbers
        ascendingSort(evenNumArray);

        System.out.println("Sorting the array of ODD numbers (descending order)");
        //Sort the array with odd numbers
        descendingSort(oddNumArray);

        System.out.println();
        System.out.println("The main array consisted of: " + Arrays.toString(myArr));
        System.out.println();
        System.out.println("The array of EVEN numbers consists of: " + Arrays.toString(evenNumArray));
        System.out.println("The array of ODD numbers consists of:  " + Arrays.toString(oddNumArray));
    }


    public static void arraySeparation(int even, int odd, int[] myArr, int[] evenNumArray, int[] oddNumArray){
        even = 0;
        odd = 0;

        System.out.println("Dividing the main array into 2 arrays: EVEN numbers array and ODD numbers array");
        for (int i : myArr) {
            if (i % 2 == 0) {
                evenNumArray[even] = i;
                even++;
            } else {
                oddNumArray[odd] = i;
                odd++;
            }
        }
    }

    public static void ascendingSort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                int temp = 0;
                if (array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void descendingSort(int[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                int temp = 0;
                if (array[i] < array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}