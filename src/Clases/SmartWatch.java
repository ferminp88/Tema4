package Clases;

public class SmartWatch  extends SmartDevice{


      boolean RunApp;
      boolean BedApp;


    public SmartWatch(){

    };

    public SmartWatch(String deviceName, String deviceModel, int deviceSerialNumber, double deviceFirmwareVersion, boolean runApp, boolean bedApp) {
        super(deviceName, deviceModel, deviceSerialNumber, deviceFirmwareVersion);

    }
    public void setRunApp (boolean RunApp) {
        this.RunApp = RunApp;}
    public boolean  getRunApp() {
        return this.RunApp;}

    public void setBedApp (boolean BedApp) {
        this.BedApp = BedApp;}
    public boolean  getBedApp() {
        return this.BedApp;}

}
