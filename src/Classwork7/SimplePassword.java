package Classwork7;

import java.util.Scanner;

public class SimplePassword {
    public static void main(String[] args){
        //97-122 a-z characters
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int l = Integer.parseInt(input.nextLine());
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                for(char k = 'a'; k < 'a' + l; k++){
                    for(char m = 'a'; m < 'a' + l; m++){
                        for(int last = Math.max(i, j) + 1; last <= n; last++){
                            //System.out.print(i + j + (char)k + (char)m + last + " ");
                            System.out.print(String.format("%d%d%c%c%d ", i, j, k, m, last));
                        }
                    }
                }
            }

        }
    }
}
