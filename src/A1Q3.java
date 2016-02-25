
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
 * @author coulh9904
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
    Robot defaultsteve = new Robot (Kitchener, 3, 0, Direction.EAST);
        new Wall(Kitchener, 2, 4, Direction.NORTH);
    new Wall(Kitchener, 1, 3, Direction.EAST);
    new Wall(Kitchener, 1, 3, Direction.NORTH);
    new Wall(Kitchener, 1, 3, Direction.WEST);
    new Wall(Kitchener, 2, 3, Direction.WEST);
    new Wall(Kitchener, 3, 2, Direction.NORTH);
    new Wall(Kitchener, 3, 2, Direction.WEST);
    new Wall(Kitchener, 2, 4, Direction.EAST);
    new Wall(Kitchener, 3, 4, Direction.EAST);
    new Thing(Kitchener,3,1);
    defaultsteve.move();
    defaultsteve.pickThing();
    defaultsteve.turnLeft();
    defaultsteve.move();
    defaultsteve.turnLeft();
    defaultsteve.turnLeft();
    defaultsteve.turnLeft();
    defaultsteve.move();
    defaultsteve.turnLeft();
    defaultsteve.move();
    defaultsteve.move();
    defaultsteve.turnLeft();
    defaultsteve.turnLeft();
    defaultsteve.turnLeft();
    defaultsteve.move();
    defaultsteve.putThing();
    defaultsteve.move();
    defaultsteve.turnLeft();
    defaultsteve.turnLeft();
    defaultsteve.turnLeft();
    defaultsteve.move();
    defaultsteve.turnLeft();
    defaultsteve.move();
    defaultsteve.turnLeft();
    defaultsteve.turnLeft();
    defaultsteve.turnLeft();
    defaultsteve.move();
    defaultsteve.move();
    defaultsteve.turnLeft();
    }
}
