/* Current file: Butterfly.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork5;

//3
//*\ /*
//  @
//*/ \*


//5
//***\ /***
//---\ /---
//***\ /***
//    @
//***/ \***
//---/ \---
//***/ \***

//7
//*****\ /*****
//-----\ /-----
//*****\ /*****
//-----\ /-----
//*****\ /*****
//      @
//*****/ \*****
//-----/ \-----
//*****/ \*****
//-----/ \-----
//*****/ \*****

// 2 * (n - 2) + 1
// stars/dashes = n - 2
import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());

        char element = '*';

        int height = (2 * (n - 2) + 1);
        for(int i = 0; i < height; i++){
            if(i < height / 2){
                System.out.print(generateString(element, n-2));
                System.out.print("\\ /");
                System.out.println(generateString(element, n-2));
            }else if(i == height/2){
                System.out.println(generateString(' ', n-1) + "@");
            }else{
                System.out.print(generateString(element, n-2));
                System.out.print("/ \\");
                System.out.println(generateString(element, n-2));
            }

            if(element == '*') element = '-';
            else element = '*';

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
