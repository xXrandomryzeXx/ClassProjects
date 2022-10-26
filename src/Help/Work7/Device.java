/* Current file: Device.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package Help.Work7;

import java.util.Scanner;

public class Device {
    String brand = "";
    String model = "";
    double price = 0.0;
    Scanner scanner = new Scanner(System.in);
    public Device(){
        setBrand();
        setModel();
        setPrice();
    }

    public void setBrand(){
        this.brand = scanner.nextLine();
    }
    public void setModel(){
        this.model = scanner.nextLine();
    }
    public void setPrice(){
        this.price = Double.parseDouble(scanner.nextLine());
    }

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }
    public double getPrice(){
        return price;
    }

    public void printInfo(){
        System.out.println("Device brand: " + getBrand());
        System.out.println("Device model: " + getModel());
        System.out.println("Device price: " + getPrice());
    }
}
