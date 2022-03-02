package ClassWork9;

import java.util.Scanner;

public class LongestSequence {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] splitText = text.split(" ");

        int startIndex = 0, endIndex = 0;
        int length = 0;

        for(int i = 0; i < splitText.length; i++){
            int currentEndIndex = 0;
            int currentLength = 0;
            for(int j = i; j < splitText.length; j++){
                if(splitText[i].equals(splitText[j])){
                    currentEndIndex = j;
                    currentLength += 1;
                }else{
                    break;
                }

            }

            if(currentLength > length){
                length = currentLength;
                startIndex = i;
                endIndex = currentEndIndex;
            }
        }

        for(int i = startIndex; i <= endIndex; i++){
            System.out.print(splitText[i] + " ");
        }

    }
}
