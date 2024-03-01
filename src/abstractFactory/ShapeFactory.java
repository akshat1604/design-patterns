package abstractFactory;

public class ShapeFactory implements AbstractFactory{

    private final static String RECTANGLE = "RECTANGLE";
    private final static String SQUARE = "SQUARE";
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equals(ShapeFactory.RECTANGLE)){
            return new Rectangle();
        }
        else if(shapeType.equals(ShapeFactory.SQUARE)){
            return new Square();
        }
        else{
            throw new IllegalArgumentException("Pass a valid shape type");
        }
    }
}
