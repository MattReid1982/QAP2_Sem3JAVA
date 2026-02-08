package Problem3;

import Problem2.MyPoint;

public class MyRectangle {
   private MyPoint topLeft;
   private MyPoint bottomRight;

   public MyRectangle(int x1, int x2, int y1, int y2) {
    topLeft = new MyPoint(x1, y1);
    bottomRight = new MyPoint(x2, y2);
    }

   public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
    this.topLeft = topLeft;
    this.bottomRight = bottomRight;
   }
   // Getters
   public MyPoint getTopLeft() {
    return topLeft;
   }

   public MyPoint getBottomRight() {
    return bottomRight;
   }

   // Setters
   public void setTopLeft(MyPoint topLeft) {
    this.topLeft = topLeft;
   }

   public void setBottomRight(MyPoint bottomRight) {
    this.bottomRight = bottomRight;
   }

//    Rectangle width
   public int getWidth() {
    return Math.abs(bottomRight.getX() - topLeft.getX());
   }

//    Rectangle height
   public int getHeight() {
    return Math.abs(topLeft.getY() - bottomRight.getY());
   }

//    Rectangle Area
   public int getArea() {
    return getWidth() * getHeight();
   }

//    Rectangle perimeter
   public int getPerimeter() {
    return 2 * (getWidth() + getHeight());
   }
   
   public String toString() {
    return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
   }
   


}

