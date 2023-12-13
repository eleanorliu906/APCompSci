/*
 * The Fraction Class
 */

import java.lang.Math;

public class Fraction
{
    private int n;
    private int d;

    /** 
     * Defalt Constrctor. Generates a random fraction, with the numerator and denominator's values ranging from 1 to 10
     */
    public Fraction() { 
        n = (int) (Math.random()*10) + 1;
        d = (int) (Math.random()*10) + 1;
        checkFrac();
    }

    /** 
     * Parameterized Constrctor.
     * @param num   The desired numerator.
     * @param denom The desired denominator. 
     */
    public Fraction(int num, int den){
        n = num;
        d = den;
        checkFrac();
    }

    /** 
     * Parameterized Constrctor.
     * @param s     The desired fraction value, represented by a String a/b.
     */
    public Fraction(String s){
        int idx = s.indexOf("/");
        if (idx == s.lastIndexOf("/") && idx > 0 && idx < s.length()-1){
            n = Integer.parseInt(s.substring(0, idx));
            d = Integer.parseInt(s.substring(idx+1));
        } else {
            System.out.println("Invalid Input; default fraction created");
        }
        checkFrac();
    }

    /** 
     * Parameterized Constrctor.
     * @param f     A Fraction object to copy
     */
    public Fraction(Fraction f){
        n = f.getNum();
        d = f.getDenom();
    }

    // BEHAVIOUR METHODS -------------------------------------------
    /**
     * To check the value of the fraction
     * Prevent the denominator from equalling to zero, and then setting the value to the default value of one.
     * If both the numerator and denominator are negative, set both to be positive.
     */
    private void checkFrac(){
        if (d == 0) d = 1;
        if (d < 0 && n < 0 || d<0 && n>0){
            d = -1*d;
            n = -1*d;
        }
        reduce();
    }

    /**
     * To get the Numerator of the Fraction
     * @return  returns a int, the value of the numerator
     */
    public int getNum(){
        return n;
    }

    /**
     * To get the Denominator of the Fraction
     * @return returns a int, the value of the denominator
     */
    public int getDenom(){
        return d;
    }

    /**
     * To convert the value of the Fraction to a String
     * @return returns a String, the value of the fraction expressed in a string
     */
    public String toString(){
        return n + "/" + d;
    }

    /**
     * To convert the value of the Fraction to a Double
     * @return returns a double, the value of the fraction expressed in a double
     */
    public double toDouble(){
        return (double) n/d;
    }

    /**
     * To set the value of Numerator
     * @param num      The new value of the numerator
     */
    public void setNum(int num) {
        n = num;
    }

    /**
     * To set the value of Denominator
     * @param den      The new value of the denominator
     */
    public void setDenom(int den) {
        d = den;
    }

    /**
     * To reduce a fraction to its simplest terms
     */
    public void reduce(){
        int i = 1;
        while (i <= d){
            if (d % i == 0 && n % i == 0){
                d /= i;
                n /= i;
                i = 1;
            }
            i++;
        }

        while (i <= n){
            if (d % i == 0 && n % i == 0){
                d /= i;
                n /= i;
                i = 1;
            }
            i++;
        }

        if (n==0) d = 1; 
    }

    /**
     * To multipy two fractions
     * @param f1    The first fraction
     * @param f2    The second fraction
     * @return     Returns a fraction, which is f1 and f2 multiplied
     */
    public static Fraction multiply(Fraction f1, Fraction f2){
        Fraction f = new Fraction();
        f.setNum(f1.getNum() * f2.getNum());
        f.setDenom(f1.getDenom() * f2.getDenom());
        f.reduce();
        return f;
    }

    /**
     * To divide two fractions
     * @param f1    The first fraction
     * @param f2    The second fraction
     * @return     Returns a fraction, which is f1 and f2 divided
     */
    public static Fraction divide(Fraction f1, Fraction f2){
        Fraction f = new Fraction();
        f.setNum(f1.getNum() * f2.getDenom());
        f.setDenom(f1.getDenom() * f2.getNum());
        f.reduce();
        return f;
    }

    /**
     * To add two fractions
     * @param f1    The first fraction
     * @param f2    The second fraction
     * @return     Returns a fraction, which is f1 and f2 added
     */
    public static Fraction add(Fraction f1, Fraction f2){
        Fraction f = new Fraction();
        f.setDenom(f1.getDenom()*f2.getDenom());
        f.setNum(f1.getNum()*f2.getDenom() + f2.getNum()*f1.getDenom());
        f.reduce();
        return f;
    }

    /**
     * To subtract two fractions
     * @param f1    The first fraction
     * @param f2    The second fraction
     * @return     Returns a fraction, which is f1 and f2 subtracted
     */
    public static Fraction subtract(Fraction f1, Fraction f2){
        Fraction f = new Fraction();
        f.setDenom(f1.getDenom()*f2.getDenom());
        f.setNum(f1.getNum()*f2.getDenom() - f2.getNum()*f1.getDenom());
        f.reduce();
        return f;
    }

    public static void main(String[] args){
        Fraction f1 = new Fraction("1/9");
        Fraction f2 = new Fraction(2, 7);
        System.out.println("Fraction 1: " + f1.toString());
        System.out.println("Fraction 2: " + f2.toString());
        System.out.println("Addition: " + Fraction.add(f1, f2));
        System.out.println("Subtraction: " + Fraction.subtract(f1, f2));
        System.out.println("Multiplication: " + Fraction.multiply(f1, f2));
        System.out.println("Division: " + Fraction.divide(f1, f2));

    }

    /**
     * Returns true if Fraction f is identical to this fraction. It does not take into
     * account if two fractions are equal in value, just if the numerators and
     * denominators are the same.
     *
     * @param f	  The fraction to compare with
     * @return    A boolean value that represents whether f was equal to this Fraction
     */
    public boolean equals(Fraction f){
        checkFrac();
        f.checkFrac();
        if (n == f.getNum() && d == f.getDenom()) return true;
        else return false;
    }
}
