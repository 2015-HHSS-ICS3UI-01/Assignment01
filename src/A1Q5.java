
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
 * @author agott2059
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        City thomas = new City ();
        
        Robot maria = new Robot (thomas, 0,1 , Direction.WEST);
        maria.setLabel("M");
        
        Robot karel = new Robot (thomas, 3,3 , Direction.EAST);
        karel.setLabel("K");
        
        new Wall (thomas, 3,3 , Direction.SOUTH);
        new Wall (thomas, 3,3 , Direction.EAST);
        new Wall (thomas, 2,3 , Direction.EAST);
        new Wall (thomas, 2,3 , Direction.NORTH);
        new Wall (thomas, 2,3 , Direction.WEST);
        
        new Thing (thomas, 0,0);
        new Thing (thomas, 1,0);
        new Thing (thomas, 1,1);
        new Thing (thomas, 1,2);
        new Thing (thomas, 2,2);
        
        maria.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        maria.pickThing();
        maria.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        maria.move();
        karel.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        karel.pickThing();
        karel.turnLeft();

        
        
        
        
        
        
    }
}
