/* Current file: OneToTwoPowerOfN.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork6;

import java.util.Scanner;

public class OneToTwoPowerOfN {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int num = 1;

        for(int i = 0; i <= n; i++){
            System.out.println(num);
            num *= 2;
        }

    }
}
