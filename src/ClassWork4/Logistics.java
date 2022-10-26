/* Current file: Logistics.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork4;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        float average = 0;

        int bus = 0;
        int truck = 0;
        int train = 0;

        int cost = 0;
        int allLoad = 0;

        for(int i = 0; i < n; i++){
            int load = Integer.parseInt(input.nextLine());
            allLoad += load;
            if(load <= 3){
                bus += load;
                cost += load*200;
            }else if(load > 3 && load <= 11){
                truck += load;
                cost += load* 175;
            }else if(load > 11){
                train += load;
                cost += load * 120;
            }
        }

        average = cost/allLoad;

        System.out.println(average);
        System.out.println(String.format("%.2f",((double)bus/allLoad) * 100) + "%");
        System.out.println(String.format("%.2f",((double)truck/allLoad) * 100) + "%");
        System.out.println(String.format("%.2f",((double)train/allLoad) * 100) + "%");

    }
}
