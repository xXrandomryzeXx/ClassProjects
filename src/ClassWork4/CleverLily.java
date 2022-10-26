/* Current file: CleverLily.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork4;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int toys = 0;
        double money = 0;
        double pMoney = 10;

        int Age = Integer.parseInt(input.nextLine());
        double WashingMachineCost = Double.parseDouble(input.nextLine());
        double ToyCost = Double.parseDouble(input.nextLine());

        for(int currentAge = 1; currentAge <= Age; currentAge++){
            //Current Age stands for  birthday - We skip 0
            if(currentAge % 2 == 0){
                money += pMoney;
                pMoney += 10; // Increase the money for each even birthday
                money -= 1; // Lily's brother steals a bit
            }else{
                toys += 1;
            }
        }

        money += toys * ToyCost;

        System.out.println((money > WashingMachineCost)? "Yes!\n" + (money - WashingMachineCost) : "No!\n" + (WashingMachineCost - money));
    }
}
