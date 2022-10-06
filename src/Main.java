import Clases.SmartDevice;
import Clases.SmartPhone;
import Clases.SmartWatch;

public class Main {
    public static void main(String[] args) {


SmartPhone devicePhone = new SmartPhone("Iphone","11 pro",4555215,3.2);
SmartWatch deviceWatch = new SmartWatch("WatchApple","runing",25145,10.89,true,true);

devicePhone.setNumPhone(452185);
devicePhone.setMemory(256);
deviceWatch.setRunApp(true);
deviceWatch.setBedApp(true);

System.out.println(devicePhone.deviceName);
System.out.println(devicePhone.deviceModel);
System.out.println(devicePhone.deviceSerialNumber);
System.out.println(devicePhone.deviceFirmwareVersion);
System.out.println(devicePhone.getNumPhone());
System.out.println(devicePhone.getMemory());


System.out.println(deviceWatch.deviceName);
System.out.println(deviceWatch.deviceModel);
System.out.println(deviceWatch.deviceSerialNumber);
System.out.println(deviceWatch.deviceFirmwareVersion);
System.out.println(deviceWatch.getRunApp());
System.out.println(deviceWatch.getBedApp());
    }
}