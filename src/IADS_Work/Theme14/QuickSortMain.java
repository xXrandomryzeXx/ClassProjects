/* Current file: QuickSortMain.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package IADS_Work.Theme14;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSortMain {
    public static void main(String[] args){
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int[] myArr = new int[n];
        for(int i = 0; i < myArr.length; i++){
            myArr[i] = rand.nextInt(100);
        }

        System.out.println("myArr: " + Arrays.toString(myArr));
        System.out.println("\nSorting...\n");
        QuickSortMethods methods = new QuickSortMethods();
        methods.sort(myArr, 0, myArr.length-1);
        System.out.println("Sorted myArr using quick sort: " + Arrays.toString(methods.getSortedArray()));
    }
}
