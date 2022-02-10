package Test;

import java.util.Scanner;

public class StarsLine {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++){
            System.out.print("*");
        }
    }
}
