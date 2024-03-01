package factory;

public class Rectangle implements Shape{

    private int length;
    private int breadth;
    Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }
    @Override
    public int area() {
        return length* breadth;
    }
}
