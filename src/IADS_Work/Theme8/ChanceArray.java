package IADS_Work.Theme8;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ChanceArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int[] array = new int[25];
        byte[] taken = new byte[25];
        int count = 0;
        int iterations = 0;
        boolean end = false;
        int M = 0;

        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(100);
        }

        System.out.print("Enter number to search for: ");
        M = Integer.parseInt(input.nextLine());

        while(!end){
            iterations += 1;
            int i = rand.nextInt(array.length);

            if(array[i] == M){
                System.out.println("Found a match at index [" + i + "]");
                taken[i] = 1;
                break;
            }else{
                taken[i] = 1;
                count = 0;

                for(byte b : taken){ // Foreach loop
                    if(b == 1){
                        count += 1;
                    }
                }

                if(count == taken.length){
                    end = true;
                    System.out.println("All elements checked. No matches");
                }

            }

        }

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Binary array: " + Arrays.toString(taken));
        System.out.println("Number of iterations: " + iterations);

    }
}
