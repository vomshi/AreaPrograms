package coding;

public class square extends shape{
    float width;
    float areaCal;

    public square (float l){
        width = l;
    }

    @Override
    void area() {
        areaCal = width*width;
        System.out.println("Area of square " +areaCal);
    }
}
