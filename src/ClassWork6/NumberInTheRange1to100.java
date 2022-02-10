package ClassWork6;

import java.util.Scanner;

public class NumberInTheRange1to100 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = 0;

        while(!(num >= 1 && num <= 100)){
            num = Integer.parseInt(input.nextLine());

            if(num >= 1 && num <= 100){
                break;
            }else{
                System.out.println("Invalid Number");
            }
        }

        System.out.println("Number is: " + num );
    }

}
