/* Current file: NumbersInArray.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package IADS_Work.Theme17;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class NumbersInArray {
    public static void main(String[] args){
        Random rand = new Random();
        int[] myArr = rand.ints(20, 1, 11).toArray();
        HashMap<Integer, Integer> numbers = new HashMap<>();

        for(int i = 0; i <= 10; i++){
            numbers.put(i, 0);
        }

        for(int i = 0; i < myArr.length; i++){
            numbers.put(myArr[i], numbers.get(myArr[i])+1);
        }

        System.out.println(Arrays.toString(myArr));

        numbers.forEach((key, value) -> {
            System.out.println("The number " + key + " appears " + value + " times");
        });
    }
}
