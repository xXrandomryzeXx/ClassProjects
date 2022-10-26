/* Current file: HigherLower_Auto.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package IADS_Work.Theme12;

import java.util.Scanner;

public class HigherLower_Auto {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int max = 1000;
        int min = 1;
        int guess = (int)Math.ceil(min + ((max - min)/2.0)); // max - ((max - min) / 2) does the same
        while(guess != n){
            System.out.println("guess " + guess + " min " + min + " max " + max);
            if(lowerHigher(guess, n)){ // if higher
                min = guess;
                guess = (int)Math.ceil(min + ((max - min)/2.0));
            }else{
                max = guess;
                guess = (int)Math.floor(min + ((max - min)/2.0));
            }

        }

        System.out.println("The computer guessed the number " + n + " and it got " + guess);

    }

    // false -> go lower
    // true  -> go higher
    static boolean lowerHigher(int guess, int answer){
        if(guess > answer){
            return false;
        }else{
            return true;
        }
    }
}
