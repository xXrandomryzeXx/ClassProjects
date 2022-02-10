package ClassWork1;

import java.util.Scanner;
public class Sum {
    public Sum(){
        Scanner input = new Scanner(System.in);

        int n1, n2;

        System.out.println("Enter n1 and n2 to sum them up: ");

        n1 = Integer.parseInt(input.nextLine());
        n2 = Integer.parseInt(input.nextLine());

        System.out.println("ClassWork1.Sum of n1 and n2: " + (n1 + n2));
    }
}
