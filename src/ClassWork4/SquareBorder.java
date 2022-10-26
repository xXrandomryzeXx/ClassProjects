/* Current file: SquareBorder.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork4;

import java.util.Scanner;

public class SquareBorder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        for(int y = 0; y < n; y++){
            for(int x = 0; x < n; x++){
                if((x == 0 && y == 0) || (x == n-1 && y == n-1) || (x == 0 && y == n-1) || (x == n-1 && y == 0)){
                    System.out.print("+ ");
                }else if(x > 0 && x < n-1){
                    System.out.print("- ");
                }else if(y > 0 && y < n-1){
                    System.out.print("| ");
                }
            }
            System.out.println();
        }

    }
}
