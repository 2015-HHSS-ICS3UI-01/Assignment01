
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
 * @author vandk5061
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    City fl = new City ();
    new Wall (fl,3,2,Direction.WEST);
    new Wall (fl,3,2,Direction.NORTH);
    new Wall (fl,2,3,Direction.WEST); 
    new Wall (fl,1,3,Direction.WEST);
    new Wall (fl,1,3,Direction.NORTH);
    new Wall (fl,1,3,Direction.EAST);
    new Wall (fl,2,4,Direction.NORTH);
    new Wall (fl,2,4,Direction.EAST);
    new Wall (fl,3,4,Direction.EAST);
    new Thing (fl,3,1);
    Robot bob = new Robot (fl,3,0,Direction.EAST);
    bob.move();
    bob.pickThing();
    bob.turnLeft();
    bob.move();
    bob.turnLeft();
    bob.turnLeft();
    bob.turnLeft();
    bob.move();
    bob.turnLeft();
    bob.move();
    bob.move();
    bob.turnLeft();
    bob.turnLeft();
    bob.turnLeft();
    bob.move();
    bob.putThing();
    bob.move();
    bob.turnLeft();
    bob.turnLeft();
    bob.turnLeft();
    bob.move();
    bob.turnLeft();
    bob.move();
    bob.turnLeft();
    bob.turnLeft();
    bob.turnLeft();
    bob.move();
    bob.move();
    bob.turnLeft();
   
    // TODO code application logic here
    }
}
