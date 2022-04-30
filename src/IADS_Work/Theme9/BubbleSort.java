package IADS_Work.Theme9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = Integer.parseInt(input.nextLine());

        int[] myArr = new int[n];

        myArr = mixArray(myArr, 420);
        System.out.println("Before sorting with FOR: " + Arrays.toString(myArr));
        bubbleSortFOR(myArr);
        System.out.println("After sorting with FOR: " + Arrays.toString(myArr));
        System.out.println();

        myArr = mixArray(myArr, 420);
        System.out.println("Before sorting with DoWhile: " + Arrays.toString(myArr));
        bubbleSortDoWhile(myArr);
        System.out.println("After sorting with DoWhile: " + Arrays.toString(myArr));
    }

    // Mix the array (int[] array) with random numbers generated in the range of (int range) 0 -> (range - 1)
    public static int[] mixArray(int[] array, int range){
        Random rand = new Random();
        System.out.println("Mixing the Array with random values");
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(range);
        }
        return array;
    }

    // Sorts the given array(int[] array) using a for loop
    public static void bubbleSortFOR(int[] array){
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

    // Sorts the given array(int[] array) using a Do While loop
    public static void bubbleSortDoWhile(int[] array){
        boolean sorting;
        int temp;
        do{
            sorting = false;
            for(int i = 0; i < array.length - 1; i++){
                if(array[i] > array[i + 1]){
                    sorting = true;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }while(sorting);
    }
}