package ClassWork2;

import java.util.Scanner;

public class CustomSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        int sum = 0;

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(input.nextLine());
            sum += num;
        }

        System.out.println("ClassWork1.Sum of all numbers: " + sum);

    }
}
