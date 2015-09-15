
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City yo = new City();
        new Wall (yo, 3, 2, Direction. WEST);
        new Wall (yo, 3, 2, Direction. NORTH);
        new Wall (yo, 2, 3, Direction. WEST);
        new Wall (yo, 1, 3, Direction. WEST);
        new Wall (yo, 1, 3, Direction. NORTH);
        new Wall (yo, 1, 3, Direction. EAST);
        new Wall (yo, 2, 4, Direction. NORTH);
        new Wall (yo, 2, 4, Direction. EAST);
        new Wall (yo, 3, 4, Direction. EAST);
        
        new Thing (yo, 3, 1);
        
        Robot jimbo = new Robot (yo, 3, 0, Direction. EAST);
        jimbo.move();
        jimbo.pickThing();
        jimbo.turnLeft();
        jimbo.move();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.move();
        jimbo.turnLeft();
        jimbo.move();
        jimbo.move();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.move();
        jimbo.putThing();
        jimbo.move();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.move();
        jimbo.turnLeft();
        jimbo.move();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.turnLeft();
        jimbo.move();
        jimbo.move();
        jimbo.turnLeft();
        
    }
}
