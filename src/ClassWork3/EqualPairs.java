package ClassWork3;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int iterations = n * 2;
        int maxDiff = 0;
        int lastPairSum = 0;
        int currentPairSum = 0;

        for(int i = 0; i <= iterations; i++){
            if(i%2 == 0 && i != 0) {
                if(lastPairSum != currentPairSum && i >= 4){ // There is a last pair and a current pair
                    int diff = (lastPairSum > currentPairSum)? lastPairSum - currentPairSum : currentPairSum - lastPairSum;
                    if(diff > maxDiff) maxDiff = diff;
                }
                lastPairSum = currentPairSum;
                currentPairSum = 0;
            }
            if(i != iterations){// Add num to the sum
                int num = Integer.parseInt(input.nextLine());
                currentPairSum += num;
            }
        }
        System.out.println((maxDiff == 0)? "Yes, value=" + lastPairSum : "No, maxdiff=" + maxDiff);
    }
}
