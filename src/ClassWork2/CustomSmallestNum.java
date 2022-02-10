package ClassWork2;

import java.util.Scanner;

public class CustomSmallestNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        int smallestNum = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(input.nextLine());
            if(num < smallestNum) smallestNum = num;
        }

        System.out.println("Smallest Num: " + smallestNum);
    }
}
