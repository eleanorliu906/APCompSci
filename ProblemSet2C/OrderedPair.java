public class OrderedPair
{
    // instance variables - replace the example below with your own
    double X;
    double Y;

    /**
     * Constructor for objects of class OrderedPair
     */
    public OrderedPair()
    {
        X = 0;
        Y = 0;
    }

    public OrderedPair(double x, double y){
        X = x;
        Y = y;
    }
    
    public String toString() {
        String str = "(" + X + ", " + Y + ")";
        return str;
    }
    
    public double getX(){
        return X;
    }
    
    public double getY(){
        return Y;
    }
}