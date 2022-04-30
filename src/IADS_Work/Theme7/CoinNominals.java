package IADS_Work.Theme7;

import java.util.Scanner;

public class CoinNominals {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] nominals = {1, 2, 5, 10, 20, 50};
        int sum = 0;
        int coinCount = 0;
        int index = nominals.length - 1;

        System.out.println("Enter sum (ex. 1.50lv)");
        float floatSum = Float.parseFloat(input.nextLine());
        sum = (int)(floatSum*100);

        int currentSum = 0;
        for(; index >= 0;){
            int sumDifference = sum - currentSum;

            if(sumDifference >= nominals[index]){
                currentSum += nominals[index];
                coinCount += 1;
                System.out.println(coinCount + " coin has a nominal of " + nominals[index] + " new difference is " + (float)(sum - currentSum)/100);
            }else if(sumDifference < nominals[index]){
                index -= 1;
            }else{
                return;
            }
        }
        System.out.println("Number or coins used: " + coinCount);
    }
}
