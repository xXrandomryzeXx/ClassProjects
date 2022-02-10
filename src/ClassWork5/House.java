package ClassWork5;

import java.util.Scanner;

public class House {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());


        int stars = 0;
        int dashes = 0;
        if(n%2 == 0) stars += 2;
        else stars += 1;
        int half = (int) Math.ceil(((float)n / 2));
        System.out.println(half);
        for(int i = 1; i <= n; i++){
            dashes = (n - stars) / 2;
            if(i <= half){ // Top half
                System.out.println(generateString('-', dashes) + generateString('*', stars) + generateString('-', dashes));
            }else{ // Bottom half
                System.out.println("|" +  generateString('*', n - 2) + "|");
            }
            stars += 2;
        }
    }

    public static String generateString(char ch, int n){
        String str = "";
        for(int i = 0; i < n; i++){
            str += ch;
        }
        return str;
    }
}
