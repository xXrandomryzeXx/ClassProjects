/* Current file: ArrayWorkAdvanced.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork11;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayWorkAdvanced {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] arr = text.split(" ");
        String[] command;

        do{
            command = input.nextLine().split(" ");
            if(command[0].equals("Reverse")){
                arr = Reverse(arr);
            }else if(command[0].equals("Distinct")){
                arr = Distinct(arr);
            }else if(command[0].equals("Replace")){
                if(Integer.parseInt(command[1]) >= 0 &&
                        Integer.parseInt(command[1]) < arr.length - 1 &&
                        !command[2].equals(arr[Integer.parseInt(command[1])])){
                    arr = Replace(arr, Integer.parseInt(command[1]), command[2]);
                }else{
                    System.out.println("Invalid input!");
                }
            }else{
                if(!command[0].equals("END")) System.out.println("Invalid command!");
            }
        }while(!command[0].equals("END"));

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ((i < arr.length - 1)? ", ": ""));
        }

    }

    public static String[] Reverse(String[] array){
        String[] reversed = new String[array.length];
        int j = 0;
        for(int i = array.length-1; i >= 0; i--) {
            reversed[j] = array[i];
            j += 1;
        }
        return reversed;
    }
    // Leave only the distinct elements in the array (unique)
    public static String[] Distinct(String[] array){
        int distinctElements = array.length;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                try{
                    if(i != j && array[i].equals(array[j]) && array[i]!=null){
                        array[j] = null;
                        distinctElements -= 1;
                    }
                }catch(NullPointerException ignored){

                }
            }
        }
        String[] distinctArr = new String[distinctElements];
        int k = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != null){
                distinctArr[k] = array[i];
                k+=1;
            }
        }
        return distinctArr;
    }

    public static String[] Replace(String[] array, int index, String element){
        String[] replaced = Arrays.copyOf(array, array.length);
        replaced[index] = element;
        return replaced;
    }
}
