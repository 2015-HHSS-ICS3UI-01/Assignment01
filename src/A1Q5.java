
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
public class A1Q5 {
    private static String k;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    City fl = new City ();
    new Wall (fl, 2,3,Direction.NORTH);
    new Wall (fl, 2,3,Direction.WEST); 
    new Wall (fl, 2,3,Direction.EAST); 
    new Wall (fl, 3,3,Direction.EAST);
    new Wall (fl, 3,3,Direction.SOUTH);
    Robot bob = new Robot (fl,3,3,Direction.EAST);
    Robot ash = new Robot (fl,0,1,Direction.WEST);
    new Thing (fl,0,0);
    new Thing (fl,1,0);
    new Thing (fl,1,1);
    new Thing (fl,1,2);
    new Thing (fl,2,2);
    bob.setLabel("k");
    ash.setLabel("m");
    bob.turnLeft();
    bob.turnLeft();
    bob.move();
    bob.turnLeft();
    bob.turnLeft();
    bob.turnLeft();
    bob.move();
    bob.pickThing();
    bob.move();
    bob.pickThing();
    bob.turnLeft();
    ash.move();
    ash.pickThing();
    ash.turnLeft();
    ash.move();
    ash.pickThing();
    ash.turnLeft();
    ash.move();
    ash.pickThing();
    
    // TODO code application logic here
    }
}
