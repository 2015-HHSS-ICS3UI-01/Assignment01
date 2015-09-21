
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
public class RobotExersize3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot karle = new Robot (kw, 3, 0, Direction.EAST);
        new Thing(kw, 3, 1);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.WEST);
        new Wall(kw, 1, 3, Direction.WEST);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        karle.move();
        karle.pickThing();
        karle.turnLeft();
        karle.move();
        karle.turnLeft();
        karle.turnLeft();
        karle.turnLeft();
        karle.move();
        karle.turnLeft();
        karle.move();
        karle.move();
        karle.turnLeft();
        karle.turnLeft();
        karle.turnLeft();
        karle.move();
        karle.move();
        karle.turnLeft();
        karle.turnLeft();
        karle.turnLeft();
        karle.move();
        karle.turnLeft();
        karle.move();
        karle.turnLeft();
        karle.turnLeft();
        karle.turnLeft();
        karle.move();
        karle.move();
        karle.turnLeft();
    }
}
