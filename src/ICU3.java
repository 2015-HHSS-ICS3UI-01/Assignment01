
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
 * @author eadil1765
 */
public class ICU3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 City L = new City ();
 new Wall (L, 3, 2, Direction.WEST);
 new Wall (L, 3, 2, Direction.NORTH);
 new Wall (L, 2, 3, Direction.WEST);
 new Wall (L, 1, 3, Direction.WEST);
 new Wall (L, 1, 3, Direction.NORTH);
 new Wall (L, 1, 3, Direction.EAST);
 new Wall (L, 2, 4, Direction.NORTH);
 new Wall (L, 2, 4, Direction.EAST);
 new Wall (L, 3, 4, Direction.EAST);
 
 new Thing (L, 3, 1);
 
 Robot Liam = new Robot (L, 3, 0, Direction.EAST);
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
 Liam.putThing();
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
