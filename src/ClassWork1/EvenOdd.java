/* Current file: EvenOdd.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork1;

import java.util.Scanner;

public class EvenOdd {
    public EvenOdd(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number to see if it's Even or Odd: ");
        int n = Integer.parseInt(input.nextLine());
        System.out.println("The number is: " + ((n%2 == 0)? "Even" : "Odd"));
    }
}
