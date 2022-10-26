/* Current file: HigherLower.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package IADS_Work.Theme12;

import java.util.Random;
import java.util.Scanner;


public class HigherLower {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int rndNum = rand.nextInt(1000);
        int num = Integer.parseInt(input.nextLine());
        while(num != rndNum){
            if(num < rndNum) System.out.println("Higher");
            if(num > rndNum) System.out.println("Lower");
            num = Integer.parseInt(input.nextLine());
        }

        System.out.println("Correct");
    }
}
