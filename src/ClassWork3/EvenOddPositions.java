/* Current file: EvenOddPositions.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork3;

import java.util.Scanner;

public class EvenOddPositions {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        double OddSum = 0, OddMin = Double.MAX_VALUE, OddMax = Double.MIN_VALUE;
        double EvenSum = 0, EvenMin = Double.MAX_VALUE, EvenMax = Double.MIN_VALUE;

        int odds = 0, evens = 0;

        for(int i = 0; i < n; i++){
            double num = Integer.parseInt(input.nextLine());
            if(num % 2 == 0){ // Even numbers
                evens += 1;
                EvenSum += num;
                if(num > EvenMax) EvenMax = num;
                if(num < EvenMin) EvenMin = num;
            }else{            // Odd numbers
                odds += 1;
                OddSum += num;
                if(num > OddMax) OddMax = num;
                if(num < OddMin) OddMin = num;
            }
        }

        System.out.println("OddSum=" + OddSum + ",");
        System.out.println("OddMin=" + ((odds != 0)? OddMin + ",": "No,"));
        System.out.println("OddMax=" + ((odds != 0)? OddMax + ",": "No,"));
        System.out.println("EvenSum=" + EvenSum + ",");
        System.out.println("EvenMin=" + ((evens != 0)? EvenMin + ",": "No,"));
        System.out.println("EvenMax=" + ((evens != 0)? EvenMax + ",": "No,"));

    }
}
