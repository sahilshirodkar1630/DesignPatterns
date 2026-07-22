package org.sahil.BehaviouralPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

//Observer Interface
interface Observer{
    void update(float temp);
}

//Subject Interface
interface Subject{
    void attach(Observer obs);
    void detach(Observer obs);
    void notifyObservers();

}

class Weather implements Subject{

    private float temperature;
    private List<Observer> observers;

    public Weather() {
        observers = new ArrayList<>();
    }

    public void setTemperature(float temp){
        this.temperature = temp;
        notifyObservers();
    }

    @Override
    public void attach(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void detach(Observer obs) {
        observers.remove(obs);
    }

    @Override
    public void notifyObservers() {
        for(Observer obs: observers){
            obs.update(temperature);
        }

    }
}

class DisplayDevicee implements Observer{

    @Override
    public void update(float temp) {
        System.out.println("Temperature on Display is "+temp);
    }
}

class MobileDevice implements Observer{

    @Override
    public void update(float temp) {
        System.out.println("Temperature on Mobile is "+temp);
    }
}
public class ObserverPatternExample {

    public static void main(String[] args) {
        Weather weather = new Weather();
        MobileDevice mobile = new MobileDevice();
        DisplayDevicee display = new DisplayDevicee();

        weather.attach(mobile);
        weather.attach(display);

        weather.setTemperature(29);
        weather.detach(display);

        weather.setTemperature(2);
    }

}
