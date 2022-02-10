package ClassWork6;

import java.util.Scanner;

public class PrimeNumCheck {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        boolean isPrime = n >= 2;
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        System.out.println("The number entered is " + ( (isPrime)? "" : "not" ) + "prime");
    }
}
