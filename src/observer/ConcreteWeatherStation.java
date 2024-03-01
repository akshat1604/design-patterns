package observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteWeatherStation implements WeatherStationObservable{

    private List<WeatherStationObserver> observers;

    public ConcreteWeatherStation(){
        this.observers = new ArrayList<>();
    }
    private double temperature;

    @Override
    public void add(WeatherStationObserver observer) {
        observers.add(observer);
    }

    @Override
    public boolean remove(WeatherStationObserver observer){

        for(WeatherStationObserver weatherStationObserver : observers){
            if(weatherStationObserver.equals(observer)){
                observers.remove(weatherStationObserver);
                return true;
            }
        }
        throw new IllegalArgumentException("There is no such observer! Pass a valid observing device!");
    }

    @Override
    public void notifyObservers() {
        for(WeatherStationObserver weatherStationObserver: observers){
            weatherStationObserver.update();
        }
    }

    public List<WeatherStationObserver> getObservers() {
        return observers;
    }

    public void setObservers(List<WeatherStationObserver> observers) {
        this.observers = observers;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
