package ClassWork4;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int width = Integer.parseInt(input.nextLine());

        for(int y = 0; y < width; y++){
            for(int x = 0; x < width - y; x++){
                System.out.print(" ");
            }
            System.out.print("*");

            for(int x = 0; x <  y; x++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int y = width; y >= 0; y--){
            for(int x = width - y; x > 0; x--){
                System.out.print(" ");
            }
            System.out.print("*");

            for(int x = y; x > 0; x--){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
