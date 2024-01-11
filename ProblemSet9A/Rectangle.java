public class Rectangle extends Shape{
    
    protected double width;
    protected double length;
    
    public Rectangle(double l, double w) {
        super();
        length = l;
        width = w;
    }
    
    public double getLength(){
        return length;
    }
    
    public double getWidth(){
        return width;
    }
    
    public void setLength(double l){
        this.length = l;
    }
    
    public void setWidth(double w){
        this.width = w;
    }
    
    public double calculateArea(){
        return length*width;
    }
    
    public double calculatePerimeter(){
        return 2*(length+width);
    }
}
