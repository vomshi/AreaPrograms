package coding;

public class Circle extends shape {
    float width;
    float areaCal;

    public Circle (float l){
        width = l;
    }

    @Override
    void area() {
        areaCal = (float) (Math.PI*width*width);
        System.out.println("Area of Circle" +areaCal);
    }

}
