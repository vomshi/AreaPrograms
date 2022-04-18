package coding;

public class Rectangle extends shape{

    float width;
    float areaCal;

    public Rectangle (float l){
        width = l;
    }

    @Override
    void area() {
        areaCal = width*width;
        System.out.println("Area of square" +areaCal);
    }
}
