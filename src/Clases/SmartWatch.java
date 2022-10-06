package Clases;

public class SmartWatch  extends SmartDevice{


      boolean RunApp;
      boolean BedApp;


    public SmartWatch(){

    };

    public SmartWatch(String deviceName, String deviceModel, int deviceSerialNumber, double deviceFirmwareVersion, boolean runApp, boolean bedApp) {
        super(deviceName, deviceModel, deviceSerialNumber, deviceFirmwareVersion);

        this.RunApp = runApp;
        this.BedApp = bedApp;

    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "RunApp=" + RunApp +
                ", BedApp=" + BedApp +
                ", deviceName='" + deviceName + '\'' +
                ", deviceModel='" + deviceModel + '\'' +
                ", deviceSerialNumber=" + deviceSerialNumber +
                ", deviceFirmwareVersion=" + deviceFirmwareVersion +
                '}';
    }
}
