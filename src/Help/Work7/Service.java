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
