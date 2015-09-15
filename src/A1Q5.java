
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
public class A1Q5 {
    private static Object Sandy;
    private static Object Emily;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make a city for the robot to live in
        City dd = new City();
        
        //make walls
        new Wall(dd,2, 3, Direction.NORTH);
        new Wall(dd,2, 3, Direction.WEST);
        new Wall(dd,2, 3, Direction.EAST);
        new Wall(dd,3, 3, Direction.EAST);
        new Wall(dd,3, 3, Direction.SOUTH);
        
        //Make a Thing
        new Thing(dd,0, 0);
        new Thing(dd,1, 0);
        new Thing(dd,1, 1);
        new Thing(dd,1, 2);
        new Thing(dd,2, 2);
        
        //make the robot to live in the city
        Robot Emily = new Robot(dd,0, 1, Direction.WEST);
        Robot Sandy = new Robot(dd,3, 3, Direction.EAST);
        Emily.setLabel("E");
        Sandy.setLabel("S");
        Sandy.turnLeft();
        Sandy.turnLeft();
        Sandy.move();
        Emily.move();
        Emily.pickThing();
        Sandy.turnLeft();
        Sandy.turnLeft();
        Sandy.turnLeft();
        Sandy.move();
        Sandy.pickThing();
        Emily.turnLeft();
        Emily.move();
        Sandy.move();
        Sandy.pickThing();
        Emily.turnLeft();
        Emily.pickThing();
        Emily.move();
        Emily.pickThing();
        Sandy.turnLeft();
        
        
        
        
        
        
        
        
       
    }
}
