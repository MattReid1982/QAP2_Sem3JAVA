package Problem4;

import Problem2.MyCircle;
import Problem2.MyLine;
import Problem2.MyPoint;
import Problem3.MyRectangle;

public class TestCampusMap {
    public static void main(String[] args) {
        CampusMap campus = new CampusMap();

    // Add Buildings (x, y, width, height)
    MyRectangle scienceHall = new MyRectangle(400, 350 , 200, 150);
    MyRectangle library = new MyRectangle(100, 100, 220, 180);
    
    // Five lecture rooms
    MyRectangle lecture1 = new MyRectangle(650, 100, 80, 60);
    MyRectangle lecture2 = new MyRectangle(740, 100, 80, 60);
    MyRectangle lecture3 = new MyRectangle(650, 170, 80, 60);
    MyRectangle lecture4 = new MyRectangle(740, 170, 80, 60);
    MyRectangle lecture5 = new MyRectangle(650, 240, 80, 60);

    // Add buildings
    campus.addBuilding(scienceHall);
    campus.addBuilding(library);
    campus.addBuilding(lecture1);
    campus.addBuilding(lecture2);
    campus.addBuilding(lecture3);
    campus.addBuilding(lecture4);
    campus.addBuilding(lecture5);

    MyCircle fountainCircle = new MyCircle(new MyPoint(300, 300), 40);
    campus.addFountain(fountainCircle);

    
    // Add the walkways that connect everything
    campus.addWalkway(scienceHall, library);
    campus.addWalkway(library, lecture1);
    campus.addWalkway(lecture1, lecture2);

    // Print the total walkway length
    System.out.println("Total walkway length: " + campus.calculateTotalWalkwayLength());
    
    // Check to see if a walkway exists between two places.
    System.out.println("Is there a walkway between the Science Hall and the Library? " + campus.isWalkwayFromTo(scienceHall, library));

    System.out.println("Is there a walkway between the Library to Lecture 5? " + campus.isWalkwayFromTo(library, lecture5));

    }
}   