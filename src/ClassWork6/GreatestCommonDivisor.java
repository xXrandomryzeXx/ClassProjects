/* Current file: GreatestCommonDivisor.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork6;

import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());

        while(b != 0){
            int oldB = b;
            b = a % b;
            a = oldB;
        }

        System.out.println("GCD: " + a);


    }
}
