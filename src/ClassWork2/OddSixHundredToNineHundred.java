/* Current file: OddSixHundredToNineHundred.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork2;

public class OddSixHundredToNineHundred {
    public static void main(String[] args){
        for(int i = 600;  i <= 900; i++){
            if(i%2 != 0){
                System.out.println("Odd numbers: " + i);
            }
        }
    }
}
