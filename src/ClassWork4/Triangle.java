package ClassWork4;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int width = Integer.parseInt(input.nextLine());
        for(int y = 0; y < width; y++){
            for(int x = 0; x <= y; x++){
                System.out.print("$");
            }
            System.out.println();
        }
    }
}
