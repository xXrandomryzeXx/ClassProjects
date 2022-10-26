/* Current file: NumberRounding.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork10;

import java.util.Scanner;

public class NumberRounding {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] split = str.split(" ");

        for(int i = 0; i < split.length; i++){
            int num = (int)Math.round(Double.parseDouble(split[i]));
            System.out.println(split[i] + " => " + num);
        }
    }
}
