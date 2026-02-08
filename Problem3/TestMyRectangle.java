package Problem3;

import Problem2.MyPoint;

public class TestMyRectangle {
    public static void main(String[] args) {

        // Test constructor with coordinates
        MyRectangle rect1 = new MyRectangle(1,5,6, 1);
        System.out.println("rect1: " + rect1);

        System.out.println("Width: " + rect1.getWidth());
        System.out.println("Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        // Test constructor with MyPoint objects
        MyPoint p1 = new MyPoint(0, 4);
        MyPoint p2 = new MyPoint(5,0);
        MyRectangle rect2 = new MyRectangle(p1, p2);

        System.out.println("\nrect2: " + rect2);
        System.out.println("Area: " + rect2.getArea());


    }
}
