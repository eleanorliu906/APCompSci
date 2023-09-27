import java.util.Scanner;
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FormulaDriver
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b, and c:");
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();
        
        OrderedPair roots = Formulas.findQuadraticRoots(a, b, c);
        System.out.println("The solutions for 1x^2 + 5x + 6 are " + roots);
        
        System.out.println("SLOPE FORMULA: Find the slope between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        double x1 = input.nextDouble();
        System.out.print("y1: ");
        double y1 = input.nextDouble();
        System.out.print("x2: ");
        double x2 = input.nextDouble();
        System.out.print("y2: ");
        double y2 = input.nextDouble();
        OrderedPair p1 = new OrderedPair(x1, y1);
        OrderedPair p2 = new OrderedPair(x2, y2);
        double m = Formulas.findSlope(p1, p2);
        System.out.println("A line between " + p1 + " and " + p2 + " has a slope of " + m + ".");
        
        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
        System.out.print("x1: ");
        x1 = input.nextDouble();
        System.out.print("y1: ");
        y1 = input.nextDouble();
        System.out.print("x2: ");
        x2 = input.nextDouble();
        System.out.print("y2: ");
        y2 = input.nextDouble();
        OrderedPair p3 = new OrderedPair(x1, y1);
        OrderedPair p4 = new OrderedPair(x2, y2);
        OrderedPair midpoint = Formulas.findMidpoint(p3, p4);
        System.out.println("The midpoint between" + p1 + " and " + p2 + " is " + midpoint + ".");
        
        
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("Number of terms: ");
        int k = input.nextInt();
        System.out.print("Starts with: ");
        a = input.nextDouble();
        System.out.print("Increases by: ");
        double d = input.nextDouble();
        double asum = Formulas.findArithmeticSeriesSum(a, d, k);
        System.out.println("The sum of the first " + k + " terms of an arithmetic series that starts with " + a + " and increases by " + d + " is " + asum);

        System.out.println("SUM OF AN GEOMETRIC SERIES");
        System.out.print("Number of terms: ");
        k = input.nextInt();
        System.out.print("Starts with: ");
        a = input.nextDouble();
        System.out.print("Rate of Growth: ");
        double r = input.nextDouble();
        double gsum = Formulas.findGeometricSeriesSum(a, r, k);
        System.out.println("The sum of the first " + k + " terms of a finite geometric series that starts with " + a + " and increases by a rate of " + r + " is " + gsum);

        System.out.println("DIE ROLLER");
        System.out.print("How many sides does your die have? ");
        int n = input.nextInt();
        int dieRoll = Formulas.rollDie(n);
        System.out.println("Rolling a " + n + "-sided die... you got a " + dieRoll + "!");
    }
}
