/* Current file: FiftyToTwoHundred.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package Test;

public class FiftyToTwoHundred {
    public static void main(String[] args){
        for(int i = 50; i <= 200; i++){
            if(i%2 != 0){
                System.out.print(i + ((i != 199)? ", " : ""));
            }
        }
    }
}
