package ClassWork6;

import java.util.Scanner;

public class SumOfDigitsInNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int sum = 0;

        while(n > 0){
            sum += n%10;
            n /= 10;
        }

        System.out.println("Sum: " + sum);
    }
}
