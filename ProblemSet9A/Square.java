public class Square extends Rectangle{
    
    protected double side;
    
    public Square(double s) {
        super(s, s);
    }
    
    public double getSide(){
        return side;
    }
        
    public void setSide(double s){
        super.setLength(s);
        super.setWidth(s);
        this.side = s;
    }
    
    public void setLength(double s){
        setSide(s);
    }
    
    public void setWidth(double s){
        setSide(s);
    }
    
    public double calculateArea(){
        return super.calculateArea();
    }
    
    public double calculatePerimeter(){
        return super.calculatePerimeter();
    }
}
