package ClassWork6;

import java.util.Scanner;

public class OneToTwoPowerOfN {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int num = 1;

        for(int i = 0; i <= n; i++){
            System.out.println(num);
            num *= 2;
        }

    }
}
