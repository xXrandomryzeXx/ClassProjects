package ClassWork6;

import java.util.Scanner;

public class TableOfNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        for(int y = 0; y < n; y++){
            for(int x = 0; x < n; x++){
                int num = x + y + 1;
                if(num > n){
                    num = 2 * n - num;
                }
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
