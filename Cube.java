package coding;

public class Cube extends shape {

    float width;
    float areaCal;

    public Cube (float l){
        width = l;
    }

    @Override
    void area() {
        areaCal = width*width*width;
        System.out.println("Volume of Cube" +areaCal);
    }
}
