package Classwork7;

import java.util.Scanner;

public class StoppingNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = Integer.parseInt(input.nextLine());
        int M = Integer.parseInt(input.nextLine());
        int S = Integer.parseInt(input.nextLine());

        while(M > N){
            if(M%2 == 0 && M%3 == 0) {
                if(M == S) break;

                System.out.println(M);
            }
            M -= 1;
        }
    }
}