package Clases;

public class SmartPhone extends SmartDevice {
         int numPhone;
         int memory;

    public SmartPhone(){
    }
    public SmartPhone(String deviceName, String deviceModel, int deviceSerialNumber, double deviceFirmwareVersion ) {
        super(deviceName, deviceModel, deviceSerialNumber, deviceFirmwareVersion);
        this.numPhone = numPhone;
        this.memory = memory;

    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "numPhone=" + numPhone +
                ", memory=" + memory +
                ", deviceName='" + deviceName + '\'' +
                ", deviceModel='" + deviceModel + '\'' +
                ", deviceSerialNumber=" + deviceSerialNumber +
                ", deviceFirmwareVersion=" + deviceFirmwareVersion +
                '}';
    }
}
