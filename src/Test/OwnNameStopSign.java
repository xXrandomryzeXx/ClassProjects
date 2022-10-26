/* Current file: OwnNameStopSign.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package Test;

import java.util.Scanner;

public class OwnNameStopSign {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int dots = n + 1 ;
        int lines = n*2 + 1;
        int height = (n*2) + 2 ;
        String Name = scanner.nextLine();
        int nameSpaces = 0;

        if(Name.length() % 2 == 0)
            Name = Name + "!";

        nameSpaces = Name.length()/2+2;

        for (int i = 0; i < height ; i ++ ){
            System.out.print(generateString('.', dots)  );

            if (i == 0) {
                System.out.print(generateString('_', lines));
            }else if(i  < height / 2){
                System.out.print("//" + generateString('_', lines - 4) + "\\\\");
            }else if(i == height / 2){
                System.out.print("//" + generateString('_', lines/2 - nameSpaces) + Name + generateString('_', lines/2 - nameSpaces)  + "\\\\");
            }else if (i > height/2){
                System.out.print("\\\\" + generateString('_', lines - 4) + "//");

            }
            System.out.println(generateString('.', dots));


            if (i < height / 2){
                dots -= 1 ;
                lines += 2;
            }else if (i == height /2){

            }else if(i > height / 2){
                dots += 1;
                lines -= 2;
            }
        }
    }

    static String generateString(char ch , int n){
        String str = "";
        for (int i = 0; i < n; i++ ){
            str += ch;
        }
        return str;
    }
}
