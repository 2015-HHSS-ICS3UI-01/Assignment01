
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
 * @author snowc4636
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city for the robot to live in
        City bb = new City();
        
        // make walls
        new Wall(bb,3, 2, Direction.WEST);
        new Wall(bb,3, 2, Direction.NORTH);
        new Wall(bb,2, 3, Direction.WEST);
        new Wall(bb,1, 3, Direction.WEST);
        new Wall(bb,1, 3, Direction.NORTH);
        new Wall(bb,1, 3, Direction.EAST);
        new Wall(bb,2, 4, Direction.NORTH);
        new Wall(bb,2, 4, Direction.EAST);
        new Wall(bb,3, 4, Direction.EAST);
        
        //Make a Thing
        new Thing(bb,3, 1);
        
        //Make the robot to live in the city
        Robot Liam = new Robot(bb,3, 0, Direction.EAST);
        Liam.move();
        Liam.pickThing();
        Liam.turnLeft();
        Liam.move();
        Liam.turnLeft();
        Liam.turnLeft();
        Liam.turnLeft();
        Liam.move();
        Liam.turnLeft();
        Liam.move();
        Liam.move();
        Liam.turnLeft();
        Liam.turnLeft();
        Liam.turnLeft();
        Liam.move();
        Liam.move();
        Liam.turnLeft();
        Liam.turnLeft();
        Liam.turnLeft();
        Liam.move();
        Liam.turnLeft();
        Liam.move();
        Liam.turnLeft();
        Liam.turnLeft();
        Liam.turnLeft();
        Liam.move();
        Liam.move();
        Liam.turnLeft();
        
        
        
        
        
    }
}
