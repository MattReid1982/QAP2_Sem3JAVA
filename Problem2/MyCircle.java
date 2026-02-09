package Problem2;

public class MyCircle {
   //Instance variables
   private double radius = 1.0;
   private String color = "red";
   private MyPoint center = new MyPoint(0,0); // Default  
    //1. When your class doesn't have a constructor, compiler provides a default constructor.
    
    //2. No argument constructor.
    public MyCircle()
    {
        this.radius = 1.0;
        this.color = "red";
        this.center = new MyPoint(0,0);
    }
    
    //3. Parameterised constructor
    public MyCircle(double r) {
        this.radius = r;
        this.center = new MyPoint(0,0);
    } 
    
    public MyCircle (double radius, String color) {
        this.color = color;
        this.radius = radius; 
        this.center = new MyPoint(0,0);
    }
    
    public MyCircle(MyPoint center, double radius) {
        this.center = center;
        this.radius = radius;
    }
    public double getRadius() {
        return this.radius;
    }
    
    public String getColor() {
        return this.color;
    }

    public MyPoint getCenter() {
        return this.center;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }
    
    public String toString() {
    return("Radius = " + this.radius + "and color =  " + this.color);
   }

    public double getArea() {
    return (Math.PI * this.radius*this.radius);
   }
}
