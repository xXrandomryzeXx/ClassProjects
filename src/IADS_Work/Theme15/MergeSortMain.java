/* Current file: MergeSortMain.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package IADS_Work.Theme15;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MergeSortMain {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int[] array = rand.ints(input.nextInt(), 0, 100).toArray();

        System.out.println("Before sort " + Arrays.toString(array));
        MergeSortMethods.sort(array, 0, array.length - 1);
        System.out.println("After sort " + Arrays.toString(array));

    }
}
