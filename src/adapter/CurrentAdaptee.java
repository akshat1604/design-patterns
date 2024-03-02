package adapter;

public class CurrentAdaptee implements UniversalAdaptee{

    private CurrentConfiguration currentConfiguration;

    public CurrentAdaptee(CurrentConfiguration currentConfiguration){
        this.currentConfiguration = currentConfiguration;
    }

    @Override
    public void getRequiredCurrent(){
        // there might be some changes to the current configuration object here too
        currentConfiguration.setOutput("Some  current");
        System.out.println("Here's the output voltage you need!");
    }
}
