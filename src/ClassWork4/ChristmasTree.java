/* Current file: ChristmasTree.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork4;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        for(int y = 0; y <= n; y++){
            System.out.print(createString(' ', n - y)); // Spaces
            System.out.print(createString('*', y)); // Stars
            System.out.print("|");
            System.out.print(createString('*', y)); // Stars
            System.out.print(createString(' ', n - y)); // Spaces
            System.out.println();
        }
    }

    public static String createString(char ch, int n){
        String str = "";
        for(int i = 0; i < n; i++){
            str += ch;
        }
        return str;
    }
}
