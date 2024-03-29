/* Current file: SpecialNumbers.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork7;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = Integer.parseInt(input.nextLine());
        for(int i = 1111; i <= 9999; i++){
            if(special(N, i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean special(int n, int num){
        String snum = Integer.toString(num);
        for(int i = 0; i < snum.length(); i++){
            int current = Integer.parseInt(String.valueOf(snum.charAt(i)));
            if(current != 0){
                if(n%current != 0){
                    return false;
                }
            }else{
                return false;
            }
        }
        return true;
    }
}
