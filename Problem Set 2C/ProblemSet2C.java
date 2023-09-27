import java.lang.Math;
/**
 * Write a description of class ProblemSet2C here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProblemSet2C
{    
    public static OrderedPair findQuadraticRoots(double a, double b, double c){
        double r1 = (-b + Math.sqrt(b*b - 4*a*c)) /2*a;
        double r2 = (-b - Math.sqrt(b*b - 4*a*c)) /2*a;
        OrderedPair ans = new OrderedPair(r1, r2);
        return ans;
    }
    
    public static double findSlope (OrderedPair A, OrderedPair B){
        double x1 = A.getX();
        double y1 = A.getY();
        double x2 = B.getX();
        double y2 = B.getY();
        return (y2-y1)/(x2-x1);
    }
    
    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
        double x1 = A.getX();
        double y1 = A.getY();
        double x2 = B.getX();
        double y2 = B.getY();
        OrderedPair ans = new OrderedPair((x1+x2)/2, (y1+y2)/2);
        return ans;
    }
    
    public static double findArithmeticSeriesSum (double a, double d, int k){
        return (k/2)*(2*a + d*(k-1));
    }
    
    public static double findGeometricSeriesSum (double a, double r, int k){
        return (a)*(1- Math.pow(r, k))/(1-r);
    }
    
    public static int rollDie(int sides){
        return (int) (Math.random() * sides) + 1;
    }
}
