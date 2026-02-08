package Problem2;

public class TestMyLine {
    public static void main(String[] args) {

        // Test constructor with coordinates 
        MyLine line1 = new MyLine(1,2,4,6);
        System.out.println("line1: " + line1);

        // Test getBegin() and getEnd()
        System.out.println("Begin point: " + line1.getBegin());
        System.out.println("End point: " + line1.getEnd());

        // Test coordinate getters
        System.out.println("Begin X: " + line1.getBeginX());
        System.out.println("Begin Y: " + line1.getBeginY());
        System.out.println("End X: " + line1.getEndX());
        System.out.println("End Y: " + line1.getEndY());

        // Test getBeginXY() and getEndXY()
        int[] beginXY = line1.getBeginXY();
        int[] endXY = line1.getEndXY();
        System.out.println("Begin XY: (" + beginXY[0] + ", " + beginXY[1] + ")");
        System.out.println("End XY: (" + endXY[0] + ", " + endXY[1] + ")");

        // Test setters
        line1.setBeginXY(2, 3);
        line1.setEndXY(5, 7);
        System.out.println("After setBeginXY & setEndXY:");
        System.out.println("line1: " + line1);

        line1.setBeginX(0);
        line1.setBeginY(0);
        line1.setEndX(3);
        line1.setEndY(4);
        System.out.println("After individual setters:");
        System.out.println("line1: " + line1);

        // Test length
        System.out.printf("Length: %.2f%n", line1.getLength());
        
        // Test Gradient
        System.out.printf("Gradient (radians): %.2f%n", line1.getGradient());

    
    }

    
}
