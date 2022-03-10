package ClassWork10;

import java.util.Arrays;
import java.util.Scanner;

public class SortAndPrintWithComma {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] split = sort(str.split(" "));

        for(int i = 0; i < split.length; i++){
            System.out.print(split[i] + ((i == split.length-1)? "":", "));
        }
    }

    public static String[] sort(String[] array){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length-i-1; j++){
                if(Integer.parseInt(array[j]) > Integer.parseInt(array[j+1])){
                    String temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
