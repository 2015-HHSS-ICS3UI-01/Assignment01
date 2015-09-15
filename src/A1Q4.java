
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duttr4019
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make city for the robots to live in.
        City gotham = new City();
        
        //Make walls
        new Wall (gotham, 0, 1, Direction.WEST);
        new Wall (gotham, 1, 1, Direction.WEST);
        new Wall (gotham, 1, 1, Direction.SOUTH);
        
        //Make two robots.
        Robot Bill = new Robot (gotham, 0, 0, Direction.SOUTH);
        Robot Steve = new Robot (gotham, 0, 1, Direction.SOUTH);
        
        //Make the two robots arrive to their destination at the same time.
        Bill.move();
        Bill.move();
        Bill.turnLeft();
        Steve.move();
        Steve.turnLeft();
        Steve.move();
        Steve.turnLeft();
        Steve.turnLeft();
        Steve.turnLeft();
        Steve.move();
        Steve.turnLeft();
        Steve.turnLeft();
        Steve.turnLeft();
        Bill.move();
        Steve.move();
        
        
         
        
    }
}
