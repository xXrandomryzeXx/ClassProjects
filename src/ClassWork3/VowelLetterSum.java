/* Current file: VowelLetterSum.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
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
