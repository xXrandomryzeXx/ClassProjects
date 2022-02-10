package ClassWork3;

import java.util.Scanner;

public class VowelLetterSum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        int sum = 0;

        for(int i = 0; i < sentence.length(); i++){
            switch(sentence.charAt(i)){
                case 'a':
                    sum += 1;
                    break;
                case 'e':
                    sum += 2;
                    break;
                case 'i':
                    sum += 3;
                    break;
                case 'o':
                    sum += 4;
                    break;
                case 'u':
                    sum += 5;
                    break;
            }
        }

        System.out.println("Vowel sum = " + sum);

    }
}
