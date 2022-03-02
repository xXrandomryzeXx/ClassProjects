package ClassWork9;

import java.util.Scanner;

public class IndexInAlphabet {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        for(char ch : str.toCharArray()){
            System.out.println(ch + " -> " + ((int)ch-'a'));
        }


    }
}
