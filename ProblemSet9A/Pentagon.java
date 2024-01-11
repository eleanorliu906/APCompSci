import java.lang.Math;

public class Pentagon extends Shape{
    private double side;
    private double c = Math.sqrt(5*(5+2*Math.sqrt(5)));
    
    public Pentagon(int s) {
        side = s;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double s){
        this.side = s;
    }

    public double calculateArea(){
        return c*side*side/4;
    }

    public double calculatePerimeter(){
        return 5*side;
    }
}
