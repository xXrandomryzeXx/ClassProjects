/* Current file: EvenNumbersInArray.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork9;

import java.util.Scanner;

public class EvenNumbersInArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] splitText = text.split(" ");

        for(String str : splitText){
            if(Integer.parseInt(str) % 2 == 0){
                System.out.print(str + " ");
            }
        }

    }
}
