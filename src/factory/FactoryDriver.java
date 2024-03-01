package factory;

public class FactoryDriver {
    public static void main(String[] args) {
        ShapeFactoryConcrete shapeFactoryConcrete = new ShapeFactoryConcrete();
        Shape shape = shapeFactoryConcrete.getShape("RECTANGLE",4,2);
        System.out.println(shape.area());
    }
}
