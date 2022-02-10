package ClassWork5;

import java.util.Scanner;


/*
* -*-
* *-*
* -*-
* */


//--**--
//-*--*-
//*----*
//-*--*-
//--**--
public class Diamond {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int width = Integer.parseInt(input.nextLine());
        int height = (width%2 == 0)? width - 1 : width;

        int sideDashes = (width-1)/2;
        for(int i = 0; i < height; i++){
            System.out.print(generateString('-', sideDashes));
            if(i == 0 || i == height - 1)
                System.out.print(generateString('*', (width%2 == 0)? 2 : 1));
            else{
                System.out.print("*");
                System.out.print(generateString('-', (width - (sideDashes*2)) - 2));
                System.out.print("*");
            }
            System.out.println(generateString('-', sideDashes));
            if(i < height/2) sideDashes--;
            else sideDashes++;
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
