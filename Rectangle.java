/**
 * Created by andrey on 04.04.16.
 */
public class Rectangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;

    public Rectangle(){
        sideA = 1;
        sideB = 1;
        sideC = 1;
        sideD = 1;
    }

    public Rectangle(int sideA, int sideB){
        this.sideA = sideA;
        this.sideC = sideA;
        this.sideB = sideB;
        this.sideD = sideB;
    }

    public void setSize(int sideA, int sideB){
        this.sideA = sideA;
        this.sideC = sideA;
        this.sideB = sideB;
        this.sideD = sideB;
    }

    public int getSideA(){
        return sideA;
    }

    public int getSideB(){
        return sideB;
    }

    public int getPerimeter(){
        return 2 * (sideA + sideB);
    }

    public int getArea(){
        return sideA * sideB;
    }
}
