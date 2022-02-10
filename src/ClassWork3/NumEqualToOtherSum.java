package ClassWork3;

import java.util.Scanner;

public class NumEqualToOtherSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        int sum = 0;
        int largestNum = 0;

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(input.nextLine());
            if(num > largestNum) largestNum = num;
            sum += num;
        }
        int otherSum = sum - largestNum;
        int difference = (largestNum > otherSum)? largestNum - otherSum : otherSum - largestNum;
        System.out.println((largestNum == sum - largestNum)? "Yes\nSum = " + (sum - largestNum) : "No\nDiff = " + difference);
    }

}
