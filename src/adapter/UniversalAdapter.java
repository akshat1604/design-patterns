package adapter;

public class UniversalAdapter implements Target{

    private UniversalAdaptee universalAdaptee;

    UniversalAdapter(CurrentAdaptee currentAdaptee){
        this.universalAdaptee = currentAdaptee;
    }

    @Override
    public void makeCompatible(){
        System.out.println("Converting (adapting) to required type...");
        //maybe some logic to change current
        universalAdaptee.getRequiredCurrent();
    }

    public UniversalAdaptee getUniversalAdaptee() {
        return universalAdaptee;
    }

    public void setUniversalAdaptee(UniversalAdaptee universalAdaptee) {
        this.universalAdaptee = universalAdaptee;
    }
}
