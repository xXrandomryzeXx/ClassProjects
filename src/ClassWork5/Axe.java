package ClassWork5;

import java.util.Scanner;


/*
2
------**--
------*-*-
*******-*-
------***-

5
---------------**--------
---------------*-*-------
---------------*--*------
---------------*---*-----
---------------*----*----
****************----*----
****************----*----
---------------*----*----
--------------********---

8
------------------------**--------------
------------------------*-*-------------
------------------------*--*------------
------------------------*---*-----------
------------------------*----*----------
------------------------*-----*---------
------------------------*------*--------
------------------------*-------*-------
*************************-------*-------
*************************-------*-------
*************************-------*-------
*************************-------*-------
------------------------*-------*-------
-----------------------*---------*------
----------------------*-----------*-----
---------------------***************----


height = (n%2 == 0)? n*2 : (n*2)-1
 */

public class Axe {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int height = (n%2 == 0)? n*2 : (n*2)-1;
        int width = n*5;
        int leftDashes = n*3;
        int rightDashes = 0;

        int axeWidth = 0;
        int axeWidthTarget = n - 1;

        for(int i = 0; i < height; i++){
            rightDashes = width - (leftDashes+2+axeWidth);
            if(i < n){ // Start to handle
                System.out.print(generateString('-', leftDashes));
                System.out.print("*");
                System.out.print(generateString('-', axeWidth));
                System.out.print("*");
                System.out.println(generateString('-', rightDashes));
                if(axeWidth < axeWidthTarget) axeWidth++;
            }else if(i >= n && i < n + (n/2)){ // Handle
                System.out.print(generateString('*', leftDashes)); //We can use leftDashes for the handle
                System.out.print("*");
                System.out.print(generateString('-', axeWidth));
                System.out.print("*");
                System.out.println(generateString('-', rightDashes));
            }else if(i == height-1){
                System.out.print(generateString('-', leftDashes));
                System.out.print(generateString('*', axeWidth+2));
                System.out.println(generateString('-', rightDashes));
            }else{ // Between handle and the edge
                System.out.print(generateString('-', leftDashes));
                System.out.print("*");
                System.out.print(generateString('-', axeWidth));
                System.out.print("*");
                System.out.println(generateString('-', rightDashes));
                axeWidth += 2; // The edge expands till the end
                leftDashes -= 1;
            }
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
