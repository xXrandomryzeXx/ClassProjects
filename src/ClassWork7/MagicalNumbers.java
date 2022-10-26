/* Current file: MagicalNumbers.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork7;

import java.util.Scanner;

public class MagicalNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        for(int d1 = 1; d1 <= 9; d1++){
            for(int d2 = 1; d2 <= 9; d2++){
                for(int d3 = 1; d3 <= 9; d3++){
                    for(int d4 = 1; d4 <= 9; d4++){
                        for(int d5 = 1; d5 <= 9; d5++){
                            for(int d6 = 1; d6 <= 9; d6++){
                                if(d1 * d2 * d3 * d4 * d5 * d6 == num)
                                    System.out.print(String.format("%d%d%d%d%d%d ", d1, d2, d3, d4, d5, d6));
                            }
                        }
                    }
                }
            }
        }
    }
}
