
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahmf8586
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot a1q2 = new Robot (kw, 1, 2, Direction.SOUTH);
        new Wall (kw, 1, 2, Direction.SOUTH);
        new Wall (kw, 1, 2, Direction.EAST);
        new Wall (kw, 1, 2, Direction.NORTH);
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.SOUTH);
        new Thing(kw, 2, 2);
        a1q2.turnLeft();
        a1q2.turnLeft();
        a1q2.turnLeft();
        a1q2.move();
        a1q2.turnLeft();
        a1q2.move();
        a1q2.turnLeft();
        a1q2.move();
        a1q2.pickThing();
        a1q2.turnLeft();
        a1q2.turnLeft();
        a1q2.move();
        a1q2.turnLeft();
        a1q2.turnLeft();
        a1q2.turnLeft();
        a1q2.move();
        a1q2.turnLeft();
        a1q2.turnLeft();
        a1q2.turnLeft();
        a1q2.move();
        a1q2.turnLeft();
        a1q2.turnLeft();
        a1q2.turnLeft();
    }
}
