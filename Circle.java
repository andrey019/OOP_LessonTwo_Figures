/**
 * Created by andrey on 04.04.16.
 */
public class Circle extends Figure {
    private int radius;

    public Circle(){
        radius = 1;
    }

    public Circle(int radius){
        this.radius = radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }
}
