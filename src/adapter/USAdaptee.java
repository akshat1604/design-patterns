package adapter;

public class USAdaptee implements UniversalAdaptee {

    private CurrentConfiguration currentConfiguration;
    public USAdaptee(CurrentConfiguration currentConfiguration) {
        this.currentConfiguration = currentConfiguration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;



    @Override
    public void getRequiredCurrent() {
        currentConfiguration.setOutput("USA Baby!");
        System.out.println("Here's the output voltage you need!");
    }
}

