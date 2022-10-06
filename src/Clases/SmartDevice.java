package Clases;

public class SmartDevice {

     public String deviceName;
     public String deviceModel;
     public int deviceSerialNumber;
     public double deviceFirmwareVersion;

public SmartDevice(){

    }
public  SmartDevice(String deviceName, String deviceModel, int deviceSerialNumber, double deviceFirmwareVersion){
        this.deviceName = deviceName;
        this.deviceModel = deviceModel;
        this.deviceSerialNumber = deviceSerialNumber;
        this.deviceFirmwareVersion = deviceFirmwareVersion;

    }
}


