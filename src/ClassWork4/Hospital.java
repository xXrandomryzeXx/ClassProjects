/* Current file: Hospital.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package ClassWork4;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int timePeriod = Integer.parseInt(input.nextLine());

        int treated = 0;
        int untreated = 0;

        int doctors = 7;

        for(int i = 1; i <= timePeriod; i++){
            int patients = Integer.parseInt(input.nextLine());
            int dailyTreated = 0;
            int dailyUntreated = 0;

            if(i%3 == 0 && untreated > treated) doctors += 1;

            dailyTreated = (patients > doctors)? patients -(patients - doctors) : patients;
            dailyUntreated = patients - dailyTreated;

            treated += dailyTreated;
            untreated += dailyUntreated;
        }

        System.out.println("Treated patients: " + treated);
        System.out.println("Untreated patients: " + untreated);
    }
}
