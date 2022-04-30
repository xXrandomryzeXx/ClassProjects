package IADS_Work.Theme5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = Integer.parseInt(input.nextLine());
        int[] A = new int[n];
        int currentMax = Integer.MIN_VALUE;
        //                      ^ - If A[0] is used, undefined element n a primitive array = 0
        //                      resulting in the code not being able to return a max number < 0

        //          V - Single for loop
        for(int i = 0; i <= n - 1; i++){
            System.out.print("Enter the value for array index -  " + i + " : ");
            int inp = Integer.parseInt(input.nextLine());
            A[i] = inp;

            if(A[i] > currentMax) currentMax = A[i];
        }

        System.out.println("Largest value in the Array is: " + currentMax);
    }
}