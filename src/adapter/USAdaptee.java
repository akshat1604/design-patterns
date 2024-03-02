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
/*
package adapter;

public class IndianPinClient {

    CurrentConfiguration currentConfiguration;

    Target target;
    //in real word this could come from upstream
    IndianPinClient(CurrentConfiguration currentConfiguration){
        this.currentConfiguration = currentConfiguration;
    }

    public CurrentConfiguration getCurrentConfiguration() {
        return currentConfiguration;
    }

    public void setCurrentConfiguration(CurrentConfiguration currentConfiguration) {
        this.currentConfiguration = currentConfiguration;
    }

    public Target getTarget() {
        return target;
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}

 */
