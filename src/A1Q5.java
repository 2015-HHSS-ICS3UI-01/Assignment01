
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city for the robot to live in
        City kw = new City();
        
        // make robots to live in the city
        Robot maria = new Robot(kw, 0, 1, Direction.WEST);
        Robot karel = new Robot(kw, 3, 3, Direction.EAST);
        
        // make labels for robots
        maria.setLabel("M");
        karel.setLabel("K");
        
        // make walls within the city
        new Wall (kw, 2, 3, Direction.WEST);
        new Wall (kw, 2, 3, Direction.NORTH);
        new Wall (kw, 2, 3, Direction.EAST);
        new Wall (kw, 3, 3, Direction.EAST);
        new Wall (kw, 3, 3, Direction.SOUTH);
        
        // make things within the city
        new Thing (kw, 0, 0);
        new Thing (kw, 1, 0);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 2);
        new Thing (kw, 2, 2);
        
        // move robots around the city
        maria.move();
        karel.turnLeft();
        maria.pickThing();
        karel.turnLeft();
        maria.turnLeft();
        karel.move();
        maria.move();
        karel.turnLeft();
        maria.pickThing();
        karel.turnLeft();
        maria.turnLeft();
        karel.turnLeft();
        maria.move();
        karel.move();
        maria.pickThing();
        karel.pickThing();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
    }
}
