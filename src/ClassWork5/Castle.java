/* Current file: Castle.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork5;

import java.awt.*;
import java.util.Scanner;
/*
3
/^\/^\
|    |
\_/\_/

/^\/^\
|    |
\_/ \_/

8
/^^^^\____/^^^^\
|              |
|              |
|              |
|              |
|              |
|     ____     |
\____/    \____/

 */
public class Castle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        for(int i = 0; i < n; i++){
            if(i == 0){//Top of the castle
                System.out.print("/");
                System.out.print(generateString('^', n/2));
                System.out.print("\\");
                if(n > 4) System.out.print(generateString('_', n/2));
                System.out.print("/");
                System.out.print(generateString('^', n/2));
                System.out.println("\\");
            }
            else if(i == n - 2){//Top of the bottom
                System.out.print("|");
                System.out.print(generateString(' ', (n/2) + 1));
                if(n > 4) System.out.print(generateString('_', n/2));
                System.out.print(generateString(' ', (n/2) + 1));
                System.out.println("|");
            }
            else if(i == n-1){  //Bottom of the castle
                System.out.print("\\");
                System.out.print(generateString('_', n/2));
                System.out.print("/");
                if(n > 4) System.out.print(generateString(' ', n/2));
                System.out.print("\\");
                System.out.print(generateString('_', n/2));
                System.out.println("/");
            }
            else{
                System.out.print("|");
                System.out.print(generateString(' ', (n*2)-2));
                System.out.println("|");
            }
        }
    }

    public static String generateString(char ch, int n){
        String str = "";
        for(int i = 0; i < n; i++){
            str += ch;
        }
        return str;
    }
}
