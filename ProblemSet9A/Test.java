public class Test{
    public static void main(String[] args){
        Circle c = new Circle(3);
        Rectangle r = new Rectangle(2, 4);
        Triangle t = new Triangle(2, 2, 2);
        Square s = new Square(3);
        Pentagon p = new Pentagon(3);
        House h = new House(s, t);
        
        Shape[] shapeArray = {c, r, t, s, p, h};
        
        for (Shape myShape : shapeArray){
            System.out.println("Shape Information: ");
            myShape.displayInfo();
            System.out.println("Area: " + myShape.calculateArea());
            System.out.println("Perimeter: " + myShape.calculatePerimeter());
        }
    }
}
