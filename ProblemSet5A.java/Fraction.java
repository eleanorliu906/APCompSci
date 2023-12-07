public class Fraction
{
    private int n;
    private int d;

    public Fraction() { // default constructor
        n = 1;
        d = 1;
    }

    public Fraction(int num, int dem){
        n = num;
        d = dem;
    }

    public Fraction(String s){
        int split = s.indexOf("/");
        n = Integer.parseInt(s.substring(0, split));
        d = Integer.parseInt(s.substring(split+1));
    }

    public Fraction(Fraction f){
        n = f.getNum();
        d = f.getDenom();
    }

    public int getNum(){
        return n;
    }

    public int getDenom(){
        return d;
    }

    public String toString(){
        return n + "/" + d;
    }

    public double toDouble(){
        return n/d;
    }

    public void setNum(int num) {
        n = num;
    }

    public void setDenom(int dem) {
        d = dem;
    }

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

        if (n==0) d = 1; 
    }

    public static Fraction multiply(Fraction f1, Fraction f2){
        Fraction f = new Fraction();
        f.setNum(f1.getNum() * f2.getNum());
        f.setDenom(f1.getDenom() * f2.getDenom());
        f.reduce();
        return f;
    }

    public static Fraction divide(Fraction f1, Fraction f2){
        Fraction f = new Fraction();
        f.setNum(f1.getNum() * f2.getDenom());
        f.setDenom(f1.getDenom() * f2.getNum());
        // System.out.println(f.getNum() + " " + f.getDenom());
        f.reduce();
        return f;
    }

    public static Fraction add(Fraction f1, Fraction f2){
        Fraction f = new Fraction();
        int lcm = lcm(f1.getDenom(), f2.getDenom());
        f.setDenom(lcm);
        f.setNum(f1.getNum()*(lcm/f1.getDenom()) + f2.getNum()*(lcm/f2.getDenom()));
        f.reduce();
        return f;
    }

    public static Fraction subtract(Fraction f1, Fraction f2){
        Fraction f = new Fraction();
        int lcm = lcm(f1.getDenom(), f2.getDenom());
        f.setDenom(lcm);
        f.setNum(f1.getNum()*(lcm/f1.getDenom()) - f2.getNum()*(lcm/f2.getDenom()));
        f.reduce();
        return f;
    }
    
    public static int lcm(int a, int b){ // LCM - Least Common Multiple
        int l = 0;
        for(int i = 1; i <= a*b; i++){
            if (i % a == 0 && i % b == 0) return i;
        }
        return a*b;
    }

    public static void main(String[] args){
        Fraction f1 = new Fraction("2/9");
        Fraction f2 = new Fraction(1, 6);
        System.out.println("Fraction 1: " + f1.toString());
        System.out.println("Fraction 2: " + f2.toString());
        System.out.println("Addition: " + Fraction.add(f1, f2));
        System.out.println("Subtraction: " + Fraction.subtract(f1, f2));
        System.out.println("Multiplication: " + Fraction.multiply(f1, f2));
        System.out.println("Division: " + Fraction.divide(f1, f2));

    }
}
