package ClassWork6;

import java.util.Scanner;

public class OneToNOverThree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        for(int i = 1; i < n; i += 3){
            System.out.println(i);
        }

    }

}
