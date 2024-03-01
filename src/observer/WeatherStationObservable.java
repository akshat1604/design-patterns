package observer;

public interface WeatherStationObservable {

    public void add(WeatherStationObserver observer);

    public boolean remove(WeatherStationObserver observer);

    public void notifyObservers();
}
