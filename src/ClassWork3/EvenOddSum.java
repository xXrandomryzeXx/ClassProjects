package ClassWork3;

import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        int evenSum = 0, oddSum = 0;

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(input.nextLine());

            if(i % 2 == 0)
                evenSum += num;
            else
                oddSum += num;
        }

        int diff = (evenSum > oddSum)? evenSum - oddSum : oddSum - evenSum;
        System.out.println((evenSum == oddSum)? "Yes\nSum = " + evenSum : "No\nDiff = " + diff);

    }
}
