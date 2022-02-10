package ClassWork6;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        long num = 1;
        for(int i = 1; i <= n; i++){
            num *= i;
        }
        System.out.println(num);
    }
}
