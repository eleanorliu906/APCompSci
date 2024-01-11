public class Circle extends Shape{
    
    private double radius;
    
    public Circle(int r) {
        super();
        radius = r;
    }
    
    public Circle(){
        super();
        radius = 1;
    }

    public double getRadius(){
        return radius;
    }
    
    public void setRadius(int r){
        this.radius = r;
    }
    
    public double calculateArea(){
        return Math.PI*radius*radius;
    }
    
    public double calculatePerimeter(){
        return 2*Math.PI*radius;
    }
}
