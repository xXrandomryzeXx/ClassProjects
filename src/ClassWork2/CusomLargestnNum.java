package ClassWork2;

import java.util.Scanner;
public class CusomLargestnNum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        int largestNum = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++){
            int num = Integer.parseInt(input.nextLine());
            if(num > largestNum) largestNum = num;
        }

        System.out.println("Largest Num: " + largestNum);

    }
}
