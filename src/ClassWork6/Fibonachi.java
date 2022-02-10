package ClassWork6;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        int f0 = 1;
        int f1 = 1;

        for(int i = 0; i < n - 1; i++){
            int nf = f0 + f1;
            f0 = f1;
            f1 = nf;
        }

        System.out.println(f1);
    }
}
