/* Current file: Histogram.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork4;

import java.util.Scanner;

public class Histogram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        /* p = p_totalNum/n * 100
        p1 = 0 - 200
        p2 = 200 - 399
        p3 = 400 - 599
        p4 = 600 - 799
        p5 = 800 - 1000
         */

        //Percents
        double p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;

        //Total numbers in each p
        int p1_totalNum = 0, p2_totalNum = 0, p3_totalNum = 0, p4_totalNum = 0, p5_totalNum = 0;

        int n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(input.nextLine());

            if(num < 200) p1_totalNum += 1;
            if(num >= 200 && num < 400) p2_totalNum += 1;
            if(num >= 400 && num < 600) p3_totalNum += 1;
            if(num >= 600 && num < 800) p4_totalNum += 1;
            if(num >= 800) p5_totalNum += 1;
        }

        //Calculate percents
        p1 = (double)p1_totalNum/n * 100;
        p2 = (double)p2_totalNum/n * 100;
        p3 = (double)p3_totalNum/n * 100;
        p4 = (double)p4_totalNum/n * 100;
        p5 = (double)p5_totalNum/n * 100;

        System.out.println(String.format("%.2f", p1) + "%");
        System.out.println(String.format("%.2f", p2) + "%");
        System.out.println(String.format("%.2f", p3) + "%");
        System.out.println(String.format("%.2f", p4) + "%");
        System.out.println(String.format("%.2f", p5) + "%");

    }
}
