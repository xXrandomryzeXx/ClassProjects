/* Current file: MiddleElementsInEvenLengthArray.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork10;

import java.util.Scanner;

public class MiddleElementsInEvenLengthArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] split = str.split(" ");

        System.out.println(split[split.length/2 - 1] + " " + split[split.length/2]);

    }
}
