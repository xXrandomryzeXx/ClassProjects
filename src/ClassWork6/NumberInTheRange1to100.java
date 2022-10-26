/* Current file: NumberInTheRange1to100.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork6;

import java.util.Scanner;

public class NumberInTheRange1to100 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = 0;

        while(!(num >= 1 && num <= 100)){
            num = Integer.parseInt(input.nextLine());

            if(num >= 1 && num <= 100){
                break;
            }else{
                System.out.println("Invalid Number");
            }
        }

        System.out.println("Number is: " + num );
    }

}
