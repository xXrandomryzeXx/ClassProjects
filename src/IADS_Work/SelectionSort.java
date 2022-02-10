package IADS_Work;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int n = Integer.parseInt(input.nextLine());
        int[] myArray = new int[n];
        myArray = mixArray(myArray);
        System.out.println("Array before selection sort: " + Arrays.toString(myArray));
        myArray = SelectionSort(myArray);
        System.out.println("Array after selection sort: " + Arrays.toString(myArray));

    }


    public static int[] mixArray(int[] array){
        Random rand = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(100);
        }
        return array;
    }

    public static int[] SelectionSort(int[] array){
        int swapIndex = 0;
        for(int i = 0; i < array.length; i++){
            swapIndex = i;
            System.out.println("Index " + i + " array looks like this: "+ Arrays.toString(array));
            for(int j = i + 1; j < array.length; j++){
                if(array[j] < array[swapIndex]){
                    swapIndex = j;
                }
            }
            int tempValue = array[swapIndex];
            array[swapIndex] = array[i];
            array[i] = tempValue;
            System.out.println("Index " + i + " after the swap array looks like this: "+ Arrays.toString(array));
            System.out.println();
        }

        return array;
    }


}
