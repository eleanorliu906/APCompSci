import java.lang.Math;

public class EstimatingPi
{
    Fraction MILU = new Fraction(355, 113);
    final double EPSILON = Math.abs( Math.PI - MILU.toDouble() );

    public void sampleMethod(){
        Fraction m = new Fraction(355, 113);
        double e = m.toDouble() - Math.PI;
        while (Math.abs(e) >= EPSILON){
            if (e < 0) m.setNum(m.getNum() +1);
            else m.setDenom(m.getDenom() +1);
            e = m.toDouble() - Math.PI;
        }
        System.out.println(m.toString());
    }
    
}

