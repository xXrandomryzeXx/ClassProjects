/* Current file: BackToThePast.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork4;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int Age = 18;
        int currentYear = 1800;
        double inheritance = Double.parseDouble(input.nextLine());
        double money = inheritance;
        int TargetYear = Integer.parseInt(input.nextLine());

        for(; currentYear <= TargetYear; currentYear++, Age++){
            if(currentYear % 2 == 0){
                money -= 12000;
            }else{
                money -= 12000 + (50 * Age);
            }
        }

        System.out.println((money > 0)? "Yes! He will live a carefree life and \n will have " + String.format("%.2f", money) + " dollars left"
                            : "He will need " + String.format("%.2f",(money * -1)) + " dollars to survive");


    }
}
