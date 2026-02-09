package Problem2;

public class Circle {
   //Instance variables
   private double radius = 1.0;
   private String color = "red";
   
    //1. When your class doesn't have a constructor, compiler provides a default constructor.
    //2. No argument constructor.
    public Circle()
    {
        this.radius = 1.0;
        this.color = "red";
    }
    //3. Parameterised constructor
    public Circle(double r)
    {
        this.radius = r;

    } 
    public Circle (double radius, String color)
    {
        this.color = color;
        this.radius = radius; 
    }
    
    public double getRadius() 
    {
        return this.radius;
    }
    
    public String getColor()
    {
        return this.color;
    }
    
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public void setColor(String color)
    {
        this.color = color;
    }
    
    public String toString()
   {
    return("Radius = " + this.radius + "and color =  " + this.color);
   }

   public double getArea()
   {
    return (Math.PI * this.radius*this.radius);
   }
}
