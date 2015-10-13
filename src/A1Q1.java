
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author eadil1765
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
City L = new City ();
new Wall (L, 1, 1, Direction.NORTH );
new Wall (L, 1, 1, Direction.WEST);
new Wall (L, 2, 1, Direction.WEST);
new Wall (L, 2, 1, Direction.SOUTH);
new Wall (L, 2, 2, Direction.SOUTH);
new Wall (L, 2, 2, Direction.EAST);
new Wall (L, 1, 2, Direction.EAST);
new Wall (L, 1, 2, Direction.NORTH);

Robot Liam = new Robot (L, 0, 0, Direction.SOUTH);
Liam.move();
Liam.move();
Liam.move();
Liam.turnLeft();
Liam.move();
Liam.move();
Liam.move();
Liam.turnLeft();
Liam.move();
Liam.move();
Liam.move();
Liam.turnLeft();
Liam.move();
Liam.move();
Liam.move();
Liam.turnLeft();




    }
}
