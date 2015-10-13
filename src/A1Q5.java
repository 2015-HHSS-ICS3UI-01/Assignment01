
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
 * @author vickj2854
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city
        City kw = new City();
        // make walls
        new Wall(kw,2,3, Direction.WEST);
        new Wall(kw,2,3, Direction.NORTH);
        new Wall(kw,2,3, Direction.EAST);
        new Wall(kw,3,3, Direction.EAST);
        new Wall(kw,3,3, Direction.SOUTH);
        // make karel and maria the robots
        Robot karel = new Robot(kw, 3,3, Direction.EAST);
        Robot maria = new Robot(kw, 0,1, Direction.WEST);
        // make things
        new Thing(kw,0,0);
        new Thing(kw, 1,0);
        new Thing(kw,1,1);
        new Thing(kw,1,2);
        new Thing(kw,2,2);
        // move maria and karel to pick up things
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        maria.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        maria.move();
     
       
      
      
        
        
        
        
        
    }
}
