/* Current file: SwapArrayOrder.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork10;

import java.util.Arrays;
import java.util.Scanner;

public class SwapArrayOrder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] split = str.split(" ");
        for(int i = 0; i < split.length/2; i++){
            String temp = split[i];
            split[i] = split[(split.length-1) - i];
            split[(split.length - 1) - i] = temp;
        }
        System.out.println(Arrays.toString(split));
    }
}
