package ClassWork5;

import java.util.Scanner;

public class SunGlasses {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        for(int i = 0; i < n; i++){
            if(i == 0 || i == n - 1)System.out.println(generateString('*', n * 2) + generateString(' ', n) + generateString('*', n * 2));
            else if(i == (n - 1) / 2)System.out.println("*" + generateString('/', (n*2) - 2) + "*" + generateString('|', n) + "*" + generateString('/', (n*2) - 2) + "*");
            else System.out.println("*" + generateString('/', (n*2) - 2) + "*" + generateString(' ', n) + "*" + generateString('/', (n*2) - 2) + "*");

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
