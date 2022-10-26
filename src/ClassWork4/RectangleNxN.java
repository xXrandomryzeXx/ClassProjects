/* Current file: RectangleNxN.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork4;

import java.util.Scanner;

public class RectangleNxN {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter width:");
        int width = Integer.parseInt(input.nextLine());
        System.out.print("Enter height:");
        int height = Integer.parseInt(input.nextLine());

        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
