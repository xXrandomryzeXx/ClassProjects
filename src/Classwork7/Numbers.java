package Classwork7;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int N = getIntAt(n, 0) + getIntAt(n, 1);
        int M = getIntAt(n, 0) + getIntAt(n, 2);

        System.out.println("N = " + N + "  M = " + M);
        System.out.println(getIntAt(n, 0) + " " + getIntAt(n, 1) + " " + getIntAt(n, 2) + "\n");

        int new_num = n;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(new_num%5 == 0){
                    new_num -= getIntAt(n, 0);
                }else if(new_num%3 == 0){
                    new_num -= getIntAt(n, 1);
                }else{
                    new_num += getIntAt(n, 2);
                }
                System.out.print(new_num + " ");
            }
            System.out.println();
        }
    }

    static int getIntAt(int n, int i){
       return Integer.parseInt(String.valueOf(Integer.toString(n).charAt(i)));
    }

    /*
    static int getIntAt(int n, int i){
        String str_n = Integer.toString(n);
        int[] nums = new int[str_n.length()];
        for(int j = 0; j < nums.length; j++){
            nums[j] = Integer.parseInt(String.valueOf(str_n.charAt(j)));
        }
        return nums[i];
    }*/
}
