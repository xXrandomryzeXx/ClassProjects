package IADS_Work;

import java.util.ArrayList;
import java.util.Scanner;


/*
* Capacity
* Array of N elements 2 - 5 (maximum of 5 elements)
* */

public class BackpackSort {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the capacity of the backpack");
        int capacity = Integer.parseInt(input.nextLine());
        System.out.println("Enter the number of elements");
        int n = Integer.parseInt(input.nextLine());

        int[] weights = new int[n];

        ArrayList<Integer> moves = new ArrayList<Integer>();

        for(int i = 0; i < weights.length; i++){
            while(weights[i] < 2) {   // If the entered weight is invalid, try with a new input
                System.out.println("Enter the weight of this element (can't be less than 2)");
                weights[i] = Integer.parseInt(input.nextLine());
            }
        }

        //Let's sort the weights
        int tmp;
        for(int i = 0; i < weights.length; i++){
            for(int j = i; j > 0; j--){
                if(weights[j] > weights[j - 1]) {
                    tmp = weights[j];
                    weights[j] = weights[j - 1];
                    weights[j - 1] = tmp;
                }
            }
        }

        /*
        //Backpack sort algorithm time!!!!
        for(int i = 0; i < weights.length;){
            int difference = capacity - backpackWeight(moves);

            if(difference >= weights[i]){
                moves.add(weights[i]);
                if(difference%weights[i+1] == 0 && i < weights.length - 1){
                    i += 1;
                }
                if(backpackWeight(moves) == capacity) {
                    System.out.println("Weight: " + backpackWeight(moves));
                    break;
                }
            }else if(difference < weights[i] && i < weights.length - 1){
                i += 1;
                if(difference%weights[i] != 0){
                    i += 1;
                }
            }else{
                break;
            }
        }
        */

        int index = 0;
        int lightEl = weights[weights.length - 1]; //Lightest element
        while(capacity > 0){
            if(index + 1 == weights.length)
                break;
            if(capacity%weights[index] == 0 || capacity - weights[index] >= lightEl && lightEl%(capacity%weights[index]) % weights[index + 1] == 0){
                capacity -= weights[index];
                moves.add(weights[index]);
            }else{
                if(index + 1 <= weights.length - 1){
                    if(capacity % weights[index + 1] == 0 || capacity - weights[index + 1] >= lightEl){
                        index++;
                    }else if(index + 2 <= weights.length){
                        index += 2;
                    }else{
                        break;
                    }
                }else{
                    break;
                }
            }
        }

        if(capacity == 0) {
            System.out.println("There are weights to successfully cover the capacity of the backpack: ");
            for (int i : moves) {
                System.out.print(i + " ");
            }
        }else{
            System.out.println("The backpack couldn't be filled with the available weights");
        }
    }
}