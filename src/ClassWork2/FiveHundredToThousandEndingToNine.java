/* Current file: FiveHundredToThousandEndingToNine.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork2;

public class FiveHundredToThousandEndingToNine {
    public static void main(String[] args){
        for(int i = 500; i <  1000; i++){
            if(i%10 == 9){
                System.out.println("Ends in 9: " + i);
            }
        }
    }
}
