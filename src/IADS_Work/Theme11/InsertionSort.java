package IADS_Work.Theme11;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[] myArr = new int[n];
        myArr = mixArray(myArr);
        System.out.print("Starting array -> ");
        DisplayArray(myArr);

        System.out.println("\nSorting array: ");
        myArr = InsertionSort(myArr);
        System.out.print("\nInsertion sorting complete, result -> ");
        DisplayArray(myArr);

    }

    public static int[] InsertionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j >= 0; j--){
                if(j > 0) {
                    int temp = 0;
                    if (arr[j] < arr[j - 1]) {
                        System.out.print("\nStart of sorting move -> ");
                        DisplayArray(arr);
                        System.out.println("Swapping [" + arr[j] + "] with [" + arr[j - 1] + "] ");

                        temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;

                        System.out.print("Sorting move resulted in -> ");
                        DisplayArray(arr);
                    }else{
                        break;
                    }
                }
            }
        }
        return arr;
    }

    static int[] mixArray(int[] arr){
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rand.nextInt( 100);
        }
        return arr;
    }

    static void DisplayArray(int[] arr){
        for (int j = 0; j < arr.length; j++) {
            System.out.print("[" + arr[j] + "]" + ((j == arr.length - 1)? " " : ", ")); //
        }
        System.out.println();
    }
}