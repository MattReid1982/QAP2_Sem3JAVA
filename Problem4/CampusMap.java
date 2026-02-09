package Problem4;

import java.util.ArrayList;

// Import the information from the files previously created.
import Problem2.MyLine;
import Problem2.MyPoint;
import Problem3.MyRectangle;
import Problem2.Circle;


public class CampusMap {
    
    private ArrayList<MyRectangle> buildings;
    private ArrayList<MyLine> walkways;
    private ArrayList<Circle> fountains;

    public CampusMap() {
        buildings = new ArrayList<>();
        walkways = new ArrayList<>();
        fountains = new ArrayList<>();
    }

    // Add a building
    public void addBuilding(MyRectangle building) {
        buildings.add(building);
    }

    // Add a fountain
    public void addFountain(Circle fountain) {
        fountains.add(fountain);
    }

    // Add a walkway between two buildings
    public void addWalkway(MyRectangle from, MyRectangle to) {
        if (!buildings.contains(from) || !buildings.contains(to)) {
            System.out.println("Error: Both buildings must exist on the campus map.");
            return;
        }

        MyPoint fromCenter = getCenter(from);
        MyPoint toCenter = getCenter(to);
        // Use a coordinate-based constructor
        walkways.add(new MyLine(fromCenter.getX(), fromCenter.getY(), toCenter.getX(), fromCenter.getY()));
    }

    // Calculate total walkway length
    public double calculateTotalWalkwayLength() {
        double total = 0;
    }

    for (MyLine line : walkways) {
        total += line.getLength();
    }
    
    return total;

    // Check if a walkway exists between two buildings

    public boolean isWalkwayFromTo(MyRectangle fromBuilding, MyRectangle toBuilding) {
        MyPoint fromCenter = getCenter(fromBuilding);
        MyPoint toCenter = getCenter(toBuilding);

        for (MyLine line : walkways) {
            boolean forward = 
            line.getBegin().getX() == fromCenter.getX() &&
            line.getBegin().getY() == fromCenter.getY() && 
            line.getEnd().getY() == toCenter.getX() && line.getEnd().getY() == toCenter.getY();

            boolean reverse = 
            line.getBegin().getX() == toCenter.getX() && line.getBegin().getY() == toCenter.getY() && line.getEnd().getX() == fromCenter.getX() && line.getEnd().getY() == fromCenter.getY();
        }

    } 

    // Help method to calculate center of a rectangle
    private MyPoint getCenter(MyRectangle rect) {
        int centerX = (rect.getTopLeft().getX() + rect.getBottomRight().getX()) / 2;

        int centerY = (rect.getTopLeft().getY() + rect.getBottomRight().getY()) / 2;
        return new MyPoint(centerX, centerY);
    }
}
