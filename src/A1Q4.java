
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
 * @author rahmf8586
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot a1q4 = new Robot(kw, 0, 0, Direction.SOUTH);
        Robot aq2 = new Robot(kw, 0, 1, Direction.SOUTH);
        new Wall (kw, 0, 1, Direction.WEST);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 1, 1, Direction.SOUTH);
        aq2.move();
        aq2.turnLeft();
        a1q4.move();
        aq2.move();
        aq2.turnLeft();
        aq2.turnLeft();
        aq2.turnLeft();
        a1q4.move();
        aq2.move();
        a1q4.turnLeft();
        aq2.turnLeft();
        aq2.turnLeft();
        aq2.turnLeft();
        a1q4.move();
        aq2.move();
    }
}
