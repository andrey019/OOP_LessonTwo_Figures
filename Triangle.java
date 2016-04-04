/**
 * Created by andrey on 04.04.16.
 */
public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(){
        this.sideA = 1;
        this.sideB = 1;
        this.sideC = 1;
    }

    public Triangle(int sideA, int sideB, int sideC){
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public void setSideA(int sideA){
        this.sideA = sideA;
    }

    public void setSideB(int sideB){
        this.sideB = sideB;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public int getPerimeter(){
        return sideA + sideB + sideC;
    }

    public double getArea(){                // Heron's formula
        int s = (this.getPerimeter() / 2);
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }
}
