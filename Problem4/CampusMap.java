package Problem4;

import java.util.ArrayList;

// Import the information from the files previously created.
import Problem2.MyLine;
import Problem2.MyPoint;
import Problem3.MyRectangle;
import Problem2.MyCircle;


public class CampusMap {
    
    private ArrayList<MyRectangle> buildings;
    private ArrayList<MyLine> walkways;
    private ArrayList<MyCircle> fountains;

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
    public void addFountain(MyCircle fountain) {
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
        walkways.add(new MyLine(fromCenter.getX(), fromCenter.getY(), toCenter.getX(), toCenter.getY()));
    }

    // Calculate total walkway length
        public double calculateTotalWalkwayLength() {
        double total = 0;
        for(MyLine line : walkways) {
            total += line.getLength();
        }
        return total;

}
    // Check if a walkway exists between two buildings

        public boolean isWalkwayFromTo(MyRectangle fromBuilding, MyRectangle toBuilding) {
        MyPoint fromCenter = getCenter(fromBuilding);
        MyPoint toCenter = getCenter(toBuilding);

        for (MyLine line : walkways) {
            boolean forward = 
            line.getBegin().equals(fromCenter) && line.getEnd().equals(toCenter);

            boolean reverse = 
            line.getBegin().equals(toCenter) && line.getEnd().equals(fromCenter);
            
            if (forward || reverse) {
                return true;
            }
        }
        return false;

    } 

    // Help method to calculate center of a rectangle
    private MyPoint getCenter(MyRectangle rect) {
        int centerX = (rect.getTopLeft().getX() + rect.getBottomRight().getX()) / 2;

        int centerY = (rect.getTopLeft().getY() + rect.getBottomRight().getY()) / 2;
        return new MyPoint(centerX, centerY);
    }
}

