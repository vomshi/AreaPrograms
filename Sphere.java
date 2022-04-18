package coding;

public class Sphere extends  shape{

    float width;
    float areaCal;

    public Sphere (float l){
        width = l;
    }

    @Override
    void area() {
        areaCal = width*width;
        System.out.println("Volume of square" +areaCal);
    }
}
