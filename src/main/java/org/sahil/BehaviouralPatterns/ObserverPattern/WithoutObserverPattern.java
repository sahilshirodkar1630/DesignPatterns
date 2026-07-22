package org.sahil.BehaviouralPatterns.ObserverPattern;

class DisplayDevice{

    public void showTemp(float temp){
        System.out.println("Current Temp: "+ temp+" C");
    }
}

class WeatherStation{

    private float temperature;
    private DisplayDevice displayDevice; // can be multiple devices later on
    //private MobileDevice mobileDevice;
    //private SmartWatch smartWatch;

    public WeatherStation(DisplayDevice displayDevice
//                          MobileDevice mobileDevice,
//                          SmartWatch smartWatch,

    ) {
        this.displayDevice = displayDevice;
//        this.mobileDevice = mobileDevice;
//        this.smartWatch = smartWatch;
    }

    public void setTemperature(float temp){
        this.temperature = temp;
        notifyDevice();
    }

    public void notifyDevice(){
        displayDevice.showTemp(temperature);
    }

}

public class WithoutObserverPattern {

    public static void main(String[] args) {
        DisplayDevice displayDevice = new DisplayDevice();
        WeatherStation weatherStation = new WeatherStation(displayDevice);

        weatherStation.setTemperature(26);
        weatherStation.setTemperature(30);
    }

}
