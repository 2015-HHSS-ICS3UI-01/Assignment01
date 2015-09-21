
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
public class RobotExersize5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        Robot karle = new Robot (kw, 3, 3, Direction.EAST);
        Robot maria = new Robot (kw, 0, 1, Direction.WEST);
        new Wall(kw, 2, 3, Direction.WEST);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        maria.setLabel("M");
        karle.setLabel("K");
        new Thing(kw, 0, 0);
        new Thing(kw, 1, 0);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        karle.turnLeft();
        karle.turnLeft();
        karle.move();
        karle.turnLeft();
        karle.turnLeft();
        karle.turnLeft();
        karle.move();
        karle.pickThing();
        karle.move();
        karle.turnLeft();
        karle.pickThing();
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        // TODO code application logic here
    }
}
