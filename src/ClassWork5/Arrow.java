package ClassWork5;

import java.util.Scanner;



/*
3
.###.
.#.#.
##.##
.#.#.
..#..

5
..#####..
..#...#..
..#...#..
..#...#..
###...###
.#.....#.
..#...#..
...#.#...
....#....

9
....#########....
....#.......#....
....#.......#....
....#.......#....
....#.......#....
....#.......#....
....#.......#....
....#.......#....
#####.......#####
.#.............#.
..#...........#..
...#.........#...
....#.......#....
.....#.....#.....
......#...#......
.......#.#.......
........#........
* */

public class Arrow {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int height = (n*2) - 1;
        int dots = (n/2);

        for(int i = 0; i <= height; i++){
            if(i < height/2){ // Base of the arrow
                System.out.print(generateString('.', dots));
                if(i == 0) System.out.print(generateString('#', n));
                else System.out.print("#" + generateString('.', n-2) + "#");
                System.out.println(generateString('.', dots));

            }else if(i == (height/2) + 1){ // Base of the arrow triangle
                System.out.print(generateString('#', dots + 1));
                System.out.print(generateString('.', n-2));
                System.out.println(generateString('#', dots + 1));
                dots = 1;

            }else if(i > (height/2)+1){  // Generate the triangle
                if(i == height) {
                    System.out.print(generateString('.', (n%2 == 0)? height/2 - 1 : height/2));
                    System.out.print((n%2 == 0)? "##" : "#");
                    System.out.println(generateString('.', (n%2 == 0)? height/2 - 1 : height/2));
                    break;
                }


                System.out.print(generateString('.', dots));
                System.out.print("#");
                System.out.print(generateString('.', height - (dots*2) - 2 ));  //height and width are the same
                System.out.print("#");
                System.out.println(generateString('.', dots));
                dots += 1;

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
