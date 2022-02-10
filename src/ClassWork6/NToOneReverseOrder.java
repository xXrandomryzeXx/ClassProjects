package ClassWork6;

import java.util.Scanner;

public class NToOneReverseOrder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }

    }
}
