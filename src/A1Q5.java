
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
 * @author stahc1596
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City ();
                
        new Wall (kw, 2, 3, Direction.EAST);
        new Wall (kw, 2, 3, Direction.NORTH);
        new Wall (kw, 2, 3, Direction.WEST);
        new Wall (kw, 3, 3, Direction.EAST);
        new Wall (kw, 3, 3, Direction.SOUTH);
        
        Robot Karel = new Robot (kw, 3, 3, Direction.EAST);
        Robot Maria = new Robot (kw, 0, 1, Direction.WEST);
        
        new Thing (kw, 0, 0);
        new Thing (kw, 1, 0);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 2);
        new Thing (kw, 2, 2);
        
        Maria.setLabel("M");
        Karel.setLabel("K");
        
        Maria.move();
        Maria.pickThing();
        Maria.turnLeft();
        Maria.move();
        Maria.pickThing();
        Maria.turnLeft();
        Maria.move();
        Maria.pickThing();
        
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.pickThing();
        Karel.move();
        Karel.pickThing();
        Karel.turnLeft();
        
    }
}
