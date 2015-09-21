
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
 * @author fitws6356
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        //make a robot to live in the city
        Robot kar = new Robot(kw, 3, 0, Direction.EAST);
        new Wall (kw, 3, 2, Direction.WEST);
        new Wall (kw, 3, 2, Direction.NORTH);
        new Wall (kw, 2, 3, Direction.WEST);
        new Wall (kw, 1, 3, Direction.WEST);
        new Wall (kw, 1, 3, Direction.NORTH);
        new Wall (kw, 1, 3, Direction.EAST);
        new Wall (kw, 2, 4, Direction.NORTH);
        new Wall (kw, 2, 4, Direction.EAST);
        new Wall (kw, 3, 4, Direction.EAST);
        new Thing (kw, 3, 1);
        kar.move();
        kar.pickThing();
        kar.turnLeft();
        kar.move();
        kar.turnLeft();
        kar.turnLeft();
        kar.turnLeft();
        kar.move();
        kar.turnLeft();
        kar.move();
        kar.move();
        kar.turnLeft();
        kar.turnLeft();
        kar.turnLeft();
        kar.move();
        kar.putThing();
        kar.move();
        kar.turnLeft();
        kar.turnLeft();
        kar.turnLeft();
        kar.move();
        kar.turnLeft();
        kar.move();
        kar.turnLeft();
        kar.turnLeft();
        kar.turnLeft();
        kar.move();
        kar.move();
       
        
       
        
    }
}
