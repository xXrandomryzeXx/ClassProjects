package ClassWork5;

//3
//...._______....
//...//_____\\...
//..//_______\\..
//.//_________\\.
////___STOP!___\\
//\\___________//
//.\\_________//.
//..\\_______//..

//6
//......._____________.......
//......//___________\\......
//.....//_____________\\.....
//....//_______________\\....
//...//_________________\\...
//..//___________________\\..
//.//_____________________\\.
////_________STOP!_________\\
//\\_______________________//
//.\\_____________________//.
//..\\___________________//..
//...\\_________________//...
//....\\_______________//....
//.....\\_____________//.....


// n = 3
//height = n*2 + 2 = 3*2 + 2 = 6 + 2 = 8

// n = 6
//height = n*2 + 2 = 6*2 + 2 = 12 + 2 = 14


import java.util.Scanner;

public class StopSign {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int height = n*2 + 2;
        int width = n*2 + 1;
        int sideDots = n + 1;

        for(int i = 0; i < height; i++){
            System.out.print(generateString('.', sideDots));
            if(i == 0) {
                System.out.print(generateString('_', width));
            }else{
                if(i < height/2)
                    System.out.print("//" + generateString('_', width - 4) + "\\\\");
                else if(i == height/2)
                    System.out.print("//" + generateString('_', width/2 - 2 - 2) + "STOP!" + generateString('_', width/2 - 2 - 2) + "\\\\");
                else
                    System.out.print("\\\\" + generateString('_', width - 4) + "//");
            }
            System.out.println(generateString('.', sideDots));
            if(i < height/2) {
                sideDots--;
                width+=2;
            }else if(i == height/2){
                sideDots = 0;
                //width+=2;
            }
            else {
                sideDots++;
                width-=2;
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
