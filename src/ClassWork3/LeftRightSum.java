/* Current file: LeftRightSum.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork3;

import java.util.Scanner;

public class LeftRightSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int iterations = n * 2;

        int leftSum = 0, rightSum = 0;

        for(int i = 0; i < iterations; i++){
            if(i == 0){
                System.out.println("Enter the numbers of the left side sum");
            }else if(i == n){
                System.out.println("Enter the numbers of the right side sum");
            }
            if(i < n){
                int num = Integer.parseInt(input.nextLine());
                leftSum += num;
            }else if(i >= n){
                int num = Integer.parseInt(input.nextLine());
                rightSum += num;
            }
        }

        int difference = (leftSum > rightSum)? leftSum - rightSum : rightSum - leftSum;
        System.out.println((leftSum == rightSum)? "Yes, sum = " + leftSum : "No, diff = " + difference);

    }
}
