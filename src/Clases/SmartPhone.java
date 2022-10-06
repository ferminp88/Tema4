package Clases;

public class SmartPhone extends SmartDevice {
         int numPhone;
         int memory;

    public SmartPhone(){
    }
    public SmartPhone(String deviceName, String deviceModel, int deviceSerialNumber, double deviceFirmwareVersion ) {
        super(deviceName, deviceModel, deviceSerialNumber, deviceFirmwareVersion);
    }
    public void setNumPhone(int numPhone) {
        this.numPhone = numPhone;}
    public int  getNumPhone() {
        return this.numPhone;}

    public void setMemory(int memory) {
        this.memory = memory;}
    public int  getMemory () {
        return this.memory;}

}
