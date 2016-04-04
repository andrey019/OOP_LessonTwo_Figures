/**
 * Created by andrey on 04.04.16.
 */
public class Figure {
    private int xAxis;
    private int yAxis;
    private boolean transparent;

    public void setTransparent(boolean transparent){
        this.transparent = transparent;
    }

    public boolean isTransparent(){
        return transparent;
    }

    public void setPosition(int xAxis, int yAxis){
        this.xAxis = xAxis;
        this.xAxis = yAxis;
    }

    public int getxAxis(){
        return xAxis;
    }

    public int getyAxis(){
        return yAxis;
    }
}
