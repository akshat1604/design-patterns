package observer;

public class ObserverDriver {
    public static void main(String[] args) {
        ConcreteWeatherStation concreteWeatherStation = new ConcreteWeatherStation();

        PhoneDisplay phoneDisplay = new PhoneDisplay(concreteWeatherStation);
        TabletDisplay tabletDisplay = new TabletDisplay(concreteWeatherStation);

        concreteWeatherStation.add(phoneDisplay);
        concreteWeatherStation.add(tabletDisplay);

        concreteWeatherStation.setTemperature(60.0);
        concreteWeatherStation.notifyObservers();

        System.out.println("The temperature on phone display is: "+phoneDisplay.getPhoneDisplayTemperature());
        System.out.println("The temperature on tablet display is: "+tabletDisplay.getTabletDisplayTemperature());
        concreteWeatherStation.setTemperature(80.0);
        concreteWeatherStation.notifyObservers();
        System.out.println("The temperature on phone display is: "+phoneDisplay.getPhoneDisplayTemperature());
        System.out.println("The temperature on tablet display is: "+tabletDisplay.getTabletDisplayTemperature());

        concreteWeatherStation.remove(tabletDisplay);
    }
}
