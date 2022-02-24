package ClassWork9;

import java.util.Scanner;

public class MostCommonElement {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] splitText = text.split(" ");

        int commonNum = 0;
        int times = 0;
        for(String str : splitText){
            int currentTimes = 0; // Number of times the number has appeared
            int num = Integer.parseInt(str);

            for (String s : splitText) {
                int n = Integer.parseInt(s);
                if (num == n) {
                    currentTimes += 1;
                }
            }
            if(currentTimes > times){
                times = currentTimes;
                commonNum = num;
            }
        }
        System.out.println("Most common number: " + commonNum + " appears in the array " + times + " times");
    }
}
