package ClassWork9;

import java.util.Scanner;

public class EvenNumbersInArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] splitText = text.split(" ");

        for(String str : splitText){
            if(Integer.parseInt(str) % 2 == 0){
                System.out.print(str + " ");
            }
        }

    }
}
