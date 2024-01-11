/**
 * @author Eleanor Liu
 */

import java.lang.Math;

public class Shape
{
    // instance variables - replace the example below with your own
    protected String color;
    protected boolean filled;
    
    public Shape(){
        color = "null";
        filled = false;
    }
    
    public Shape(String c, boolean f){
        this.color = c;
        this.filled = f;
    }

    public double calculateArea(){
        double area = -1;
        return area;
    }
    
    public double calculatePerimeter(){
        double perimeter = -1;
        return perimeter;
    }
    
    public void displayInfo(){
        System.out.println("Color: " + color);
        System.out.println("filled: " + filled);
    }
    
    public String getColor(){
        return color;
    }
    
    public boolean getFilled(){
        return filled;
    }
}
