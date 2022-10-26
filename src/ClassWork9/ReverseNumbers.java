/* Current file: ReverseNumbers.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork9;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] splitText = text.split(" ");
        for(int i = splitText.length - 1; i >= 0; i--){

            System.out.print(splitText[i] + " ");

        }

    }
}
