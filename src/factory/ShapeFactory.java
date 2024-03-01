package factory;

public interface ShapeFactory {

    public Shape getShape(String shapeType,int side);

    public Shape getShape(String shapeType, int length, int breadth);
}
