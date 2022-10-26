/* Current file: InputReversePrintWithComma.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork10;

import java.util.Scanner;

public class InputReversePrintWithComma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[] myArr = new int[n];
        for(int i = 0; i < n; i++) myArr[i] = Integer.parseInt(input.nextLine());

        for(int i = myArr.length-1; i >= 0; i--){
            System.out.print(myArr[i] + ((i == 0)? "" : ", "));
        }

    }
}
