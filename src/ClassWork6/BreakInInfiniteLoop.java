package ClassWork6;

import java.util.Scanner;

public class BreakInInfiniteLoop {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = 0;

        while(true){
            n = Integer.parseInt(input.nextLine());
            if(n%2 == 0) break;
            System.out.println("Number is not even");
        }
        System.out.println("Number: " + n + " is even");

    }
}
