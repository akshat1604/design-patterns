package abstractFactory;

public class AbstractFactoryDriver {
    public static void main(String[] args) {
        AbstractFactory shapeFactoryType = FactoryProducer.getFactory(true);
        Shape shape = shapeFactoryType.getShape("SQUARE");
        shape.draw();
    }
}
