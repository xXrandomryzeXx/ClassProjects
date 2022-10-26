/* Current file: BrokenDevice.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package Help.Work7;

public class BrokenDevice extends Device{
    String symptoms = "";
    int timeToRepair = 0;

    public BrokenDevice() {
        super();
    }
    public void setSymptoms(){
        this.symptoms = scanner.nextLine();
    }
    public void setTimeToRepair(){
        this.timeToRepair = Integer.parseInt(scanner.nextLine());
    }

    public String getSymptoms(){
        return symptoms;
    }
    public int getTimeToRepair(){
        return timeToRepair;
    }

    public void printInfo(){
        System.out.println("Broken device symptoms: " + getSymptoms());
        System.out.println("Broken device time to repair: " + getTimeToRepair());
    }
}
