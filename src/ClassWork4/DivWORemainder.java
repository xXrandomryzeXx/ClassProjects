/* Current file: DivWORemainder.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork4;

import java.util.Scanner;

public class DivWORemainder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        double p1 = 0, p2 = 0, p3 = 0;
        int p1_n = 0, p2_n = 0, p3_n = 0;

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(input.nextLine());

            if(num%2 == 0){
                p1_n += 1;
            }

            if(num%3 == 0){
                p2_n += 1;
            }

            if(num%4 == 0){
                p3_n += 1;
            }
        }
        p1 = ((double)p1_n/n)*100;
        p2 = ((double)p2_n/n)*100;
        p3 = ((double)p3_n/n)*100;

        System.out.println(String.format("%.2f", p1) + "%");
        System.out.println(String.format("%.2f", p2) + "%");
        System.out.println(String.format("%.2f", p3) + "%");
    }
}
