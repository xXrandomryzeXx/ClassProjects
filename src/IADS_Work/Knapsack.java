package IADS_Work;

import java.util.Scanner;

public class Knapsack {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the mass that the backpack can carry");
        int M = Integer.parseInt(input.nextLine());

        System.out.println("Enter the number of available objects");
        int n = Integer.parseInt(input.nextLine());

        int[] ci = new int[n];
        int[] m = new int[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter the weight of object " + (i+1) + " :");
            m[i] = Integer.parseInt(input.nextLine());
            System.out.print("Enter the value of object " + (i+1) + " :");
            ci[i] = Integer.parseInt(input.nextLine());
        }

        int K[][] = new int[n+1][M+1];
        for(int i = 0; i <= n; i++){
            for(int w = 0; w <= M; w++){
                if(i == 0 || w == 0) K[i][w] = 0;
                else if(m[i - 1] <= w)
                    K[i][w] = max(ci[i - 1] + K[i - 1][w - m[i - 1]], K[i - 1][w]);
                else K[i][w] = K[i-1][w];
            }
        }

        System.out.println("Most profit: " + K[n][M]);

    }

    static int max(int a, int b){
        return (a > b)? a : b;
    }
}
