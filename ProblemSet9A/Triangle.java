public class Triangle extends Shape{

    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(double s1, double s2, double s3) {
        super();
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }

    public Triangle(double side) { // create an equilateral triangle
        super();
        side1 = side;
        side2 = side;
        side3 = side;
    }

    public double getSide1(){
        return side1;
    }

    public double getSide2(){
        return side2;
    }

    public double getSide3(){
        return side3;
    }

    public void setSide1(double s1){
        this.side1 = s1;
    }

    public void setSide2(double s2){
        this.side2 = s2;
    }

    public void setSide3(double s3){
        this.side3 = s3;
    }

    public double calculateArea(){
        double s = calculatePerimeter()*0.5;
        return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    public double calculatePerimeter(){
        return side1 + side2 + side3;
    }
}
