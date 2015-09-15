
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
 * @author sevcm7279
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City jimbabwae = new City();
        new Wall (jimbabwae, 1, 2, Direction. NORTH);
        new Wall (jimbabwae, 1, 1, Direction. NORTH);
        new Wall (jimbabwae, 1, 1, Direction. WEST);
        new Wall (jimbabwae, 2, 1, Direction. WEST);
        new Wall (jimbabwae, 2, 1, Direction. SOUTH);
        new Wall (jimbabwae, 1, 2, Direction. SOUTH);
        new Wall (jimbabwae, 1, 2, Direction. EAST);
        
        new Thing (jimbabwae, 2, 2);
        //jimbo
        Robot jimbo = new Robot (jimbabwae, 1, 2, Direction. SOUTH);
    jimbo.turnLeft();
    jimbo.turnLeft();
    jimbo.turnLeft();
    jimbo.move();
    jimbo.turnLeft();
    jimbo.move();
    jimbo.turnLeft();
    jimbo.move();
    jimbo.pickThing();
    jimbo.turnLeft();
    jimbo.turnLeft();
    jimbo.move();
    jimbo.turnLeft();
    jimbo.turnLeft();
    jimbo.turnLeft();
    jimbo.move();
    jimbo.turnLeft();
    jimbo.turnLeft();
    jimbo.turnLeft();
    jimbo.move();
    jimbo.turnLeft();
    jimbo.turnLeft();
    jimbo.turnLeft();
   
        
    }
}
