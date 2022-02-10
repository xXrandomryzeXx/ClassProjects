package ClassWork4;

import java.util.Scanner;

public class Square {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size:");
        int size = Integer.parseInt(input.nextLine());

        for(int y = 0; y < size; y++){
            for(int x = 0; x < size; x++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
