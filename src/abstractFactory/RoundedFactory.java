package abstractFactory;

public class RoundedFactory implements AbstractFactory{

    private final static String RECTANGLE = "RECTANGLE";
    private final static String SQUARE = "SQUARE";
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equals(RoundedFactory.RECTANGLE)){
            return new RoundedRectangle();
        }
        else if(shapeType.equals(RoundedFactory.SQUARE)){
            return new RoundedSquare();
        }
        else{
            throw new IllegalArgumentException("Pass a valid shape type");
        }
    }
}
