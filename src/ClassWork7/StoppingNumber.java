/* Current file: StoppingNumber.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork7;

import java.util.Scanner;

public class StoppingNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = Integer.parseInt(input.nextLine());
        int M = Integer.parseInt(input.nextLine());
        int S = Integer.parseInt(input.nextLine());

        while(M > N){
            if(M%2 == 0 && M%3 == 0) {
                if(M == S) break;

                System.out.println(M);
            }
            M -= 1;
        }
    }
}
