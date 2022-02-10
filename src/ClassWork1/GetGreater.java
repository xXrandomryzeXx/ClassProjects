package ClassWork1;

import java.util.Scanner;
public class GetGreater {
    public GetGreater(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter n1 and n2 to see which is greater: ");

        int n1 = Integer.parseInt(input.nextLine());
        int n2 = Integer.parseInt(input.nextLine());

        //Fails if numbers are equal
        System.out.println("Of n1 and n2, the greater number is: " + ((n1 > n2)? "n1 = " + n1 : "n2 = " + n2));

    }
}
