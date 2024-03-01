package observer;

public class PhoneDisplay implements WeatherStationObserver{

    private ConcreteWeatherStation concreteWeatherStation;

    private double phoneDisplayTemperature;

    public PhoneDisplay(ConcreteWeatherStation weatherStation){
        this.concreteWeatherStation = weatherStation;
    }
    @Override
    public void update() {
        setPhoneDisplayTemperature(getConcreteWeatherStation().getTemperature());
    }

    public ConcreteWeatherStation getConcreteWeatherStation() {
        return concreteWeatherStation;
    }

    public void setConcreteWeatherStation(ConcreteWeatherStation concreteWeatherStation) {
        this.concreteWeatherStation = concreteWeatherStation;
    }

    public double getPhoneDisplayTemperature() {
        return phoneDisplayTemperature;
    }

    public void setPhoneDisplayTemperature(double phoneDisplayTemperature) {
        this.phoneDisplayTemperature = phoneDisplayTemperature;
    }
}
