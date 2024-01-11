public class House extends Shape{
    
    protected Square square;
    protected Triangle triangle;
    
    public House(Square s, Triangle t) {
        this.square = s;
        this.triangle = t;
    }
    
    public House(double a){
        this.square = new Square(a);
        this.triangle = new Triangle(a);
    }
    
    public Square getSquare(){
        return square;
    }
        
    public void setSquare(Square s){
        this.square = s;
    }
    
    public double calculateArea(){
        return square.calculateArea() + triangle.calculateArea();
    }
    
    public double calculatePerimeter(){
        return square.calculatePerimeter() + triangle.calculatePerimeter() - 2*square.getSide();
    }
}
