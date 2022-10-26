/* Current file: Service.java
 * Was created by student -> 19402@uktc-bg.com
 * This is a free to use as reference code that should be able to help
 * with solving the problem at hand.
*/
package Help.Work7;

import java.util.ArrayList;

public class Service {
    ArrayList<Device> devices = new ArrayList<>();
    ArrayList<BrokenDevice> brokenDevices = new ArrayList<>();
    ArrayList<BrokenDevice> fixedDevices = new ArrayList<>();

    public Service(){

    }

    public void AddDevice(Device device){
        devices.add(device);
    }
    public void AddBrokenDevice(BrokenDevice brokenDevice){
        brokenDevices.add(brokenDevice);
    }
    public void FixBrokenDevice(BrokenDevice brokenDevice){

    }

}
