package observer;

public class TabletDisplay implements WeatherStationObserver{

    private ConcreteWeatherStation concreteWeatherStation;

    private double tabletDisplayTemperature;

    public TabletDisplay(ConcreteWeatherStation weatherStation){
        this.concreteWeatherStation = weatherStation;
    }
    @Override
    public void update() {
        setTabletDisplayTemperature(concreteWeatherStation.getTemperature());
    }

    public ConcreteWeatherStation getConcreteWeatherStation() {
        return concreteWeatherStation;
    }

    public void setConcreteWeatherStation(ConcreteWeatherStation concreteWeatherStation) {
        this.concreteWeatherStation = concreteWeatherStation;
    }

    public double getTabletDisplayTemperature() {
        return tabletDisplayTemperature;
    }

    public void setTabletDisplayTemperature(double tabletDisplayTemperature) {
        this.tabletDisplayTemperature = tabletDisplayTemperature;
    }
}
