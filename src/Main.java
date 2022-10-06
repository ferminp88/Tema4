import Clases.SmartDevice;
import Clases.SmartPhone;
import Clases.SmartWatch;

public class Main {
    public static void main(String[] args) {


SmartPhone devicePhone = new SmartPhone("Iphone","11 pro",4555215,3.2);
SmartWatch deviceWatch = new SmartWatch("WatchApple","runing",25145,10.89,true,true);

        System.out.println("El smartphone es: " + devicePhone + "\nEl smartwatch es: " + deviceWatch );

    }
}