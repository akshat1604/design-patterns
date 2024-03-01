package factory;

public class ShapeFactoryConcrete implements ShapeFactory{

    private final static String RECTANGLE = "RECTANGLE";
    private final static String SQUARE = "SQUARE";
    @Override
    public Shape getShape(String shapeType,int side) {
        return new Square(side);
    }

    @Override
    public Shape getShape(String shapeType, int length, int breadth) {
        return new Rectangle(length,breadth);
    }
}
