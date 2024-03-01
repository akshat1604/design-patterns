package adapter;

public class CurrentAdaptee implements UniversalAdaptee{

    private CurrentConfiguration currentConfiguration;

    public CurrentAdaptee(CurrentConfiguration currentConfiguration){
        this.currentConfiguration = currentConfiguration;
    }

    @Override
    public void getRequiredCurrent(){
        currentConfiguration.setOutput("USA Baby!");
        System.out.println("Here's the output voltage you need!");
    }
}
