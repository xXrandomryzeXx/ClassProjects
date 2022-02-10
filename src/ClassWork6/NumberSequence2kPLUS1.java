package ClassWork6;

import java.util.Scanner;

public class NumberSequence2kPLUS1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int k = 1;
        for(int i = 0; i < n; i++){
            System.out.println(k);
            k = (2 * k) + 1;
        }

    }
}
