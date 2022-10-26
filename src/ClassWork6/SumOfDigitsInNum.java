/* Current file: SumOfDigitsInNum.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork6;

import java.util.Scanner;

public class SumOfDigitsInNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int sum = 0;

        while(n > 0){
            sum += n%10;
            n /= 10;
        }

        System.out.println("Sum: " + sum);
    }
}
