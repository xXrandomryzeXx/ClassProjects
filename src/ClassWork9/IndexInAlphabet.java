/* Current file: IndexInAlphabet.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork9;

import java.util.Scanner;

public class IndexInAlphabet {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        for(char ch : str.toCharArray()){
            System.out.println(ch + " -> " + ((int)ch-'a'));
        }
    }
}
