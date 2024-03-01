package adapter;

public class AdapterClient {
    public static void main(String[] args) {
        CurrentConfiguration currentConfiguration = new CurrentConfiguration("Indian");

        Target americanOutlet = new UniversalAdapter(new CurrentAdaptee(currentConfiguration));
        System.out.println("Current config:" + currentConfiguration.getOutput());
        americanOutlet.makeCompatible();
        System.out.println("Final config:" + currentConfiguration.getOutput());
    }



}
