/* Current file: Triangle.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package Test;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int width = Integer.parseInt(input.nextLine());
        int height = (int) Math.ceil((double)width/2.0);
        int stars = 0;
        int stars2 = width;

        for(int i = height; i > 0; i--){
            System.out.println(generateString(' ', (width - stars2)/2) + generateString('*', stars2));
            stars2 -= 2;
        }

        if(width%2 == 0){
            stars = 2;
        }else{
            stars = 1;
        }
        for(int i = 0; i < height; i++){
            System.out.println(generateString(' ', (width - stars)/2) + generateString('*', stars));
            stars += 2;
        }


    }

    static String generateString(char ch, int n){
        String str = "";
        for(int i = 0; i < n; i++){
            str += ch;
        }
        return str;
    }
}
