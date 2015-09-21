
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
 * @author prevw5940
 */
public class RobotExersize2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot karle = new Robot (kw, 1, 2, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Thing(kw, 2, 2);
        karle.turnLeft();
        karle.turnLeft();
        karle.turnLeft();
        karle.move();
        karle.turnLeft();
        karle.move();
        karle.turnLeft();
        karle.move();
        karle.pickThing();
        karle.turnLeft();
        karle.turnLeft();
        karle.move();
        karle.turnLeft();
        karle.turnLeft();
        karle.turnLeft();
        karle.move();
        karle.turnLeft();
        karle.turnLeft();
        karle.turnLeft();
        karle.move();
        karle.turnLeft();
        karle.turnLeft();
        karle.turnLeft();
    }
}
