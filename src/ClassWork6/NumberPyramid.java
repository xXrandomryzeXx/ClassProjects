/* Current file: NumberPyramid.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork6;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int lastSteps = 1;
        int steps = 1;
        for(int i = 1; i <= n; i++){
            System.out.print(i);
            steps += 1;
            if(steps > lastSteps){
                lastSteps += 1;
                steps = 1;
                System.out.println();
            }


        }

    }
}
