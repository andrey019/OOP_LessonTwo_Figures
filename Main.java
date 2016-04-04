/**
 * Created by andrey on 04.04.16.
 */
public class Main {
    public static void main(String[] args){
        Triangle t1 = new Triangle(3, 5, 5);
        System.out.println("Triangle area: " + t1.getArea());

        Circle c1 = new Circle(15);
        c1.setTransparent(true);
        c1.setPosition(12, 20);
        System.out.println("Circle area: " + c1.getArea());

        Rectangle r1 = new Rectangle(3, 7);
        System.out.println("Rectangle area: " + r1.getArea());
    }
}
/*
Triangle area: 4.242640687119285
Circle area: 706.8583470577034
Rectangle area: 21

Process finished with exit code 0
*/