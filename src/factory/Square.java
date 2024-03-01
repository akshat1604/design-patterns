package factory;

public class Square implements Shape{

    private int side;

    Square(int size){
        this.side = size;
    }
    @Override
    public int area() {
        return side * side;
    }
}
