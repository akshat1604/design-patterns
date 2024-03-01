package abstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory(boolean isRound){
        if(isRound){
            return new RoundedFactory();
        }
        else{
            return new ShapeFactory();
        }
    }
}
