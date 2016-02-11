
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
 * @author fostp4040
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City Kitchener = new City();
        
        Robot karel = new Robot(Kitchener, 3, 3, Direction.EAST);
        Robot maria = new Robot(Kitchener, 0, 1, Direction.WEST);
        new Thing(Kitchener, 0, 0);
        new Thing(Kitchener, 1, 0);
        new Thing(Kitchener, 1, 1);
        new Thing(Kitchener, 1, 2);
        new Thing(Kitchener, 2, 2);
        new Wall(Kitchener, 3, 3, Direction.EAST);
        new Wall(Kitchener, 3, 3, Direction.SOUTH);
        new Wall(Kitchener, 2, 3, Direction.EAST);
        new Wall(Kitchener, 2, 3, Direction.WEST);
        new Wall(Kitchener, 2, 3, Direction.NORTH);
        
        karel.setLabel("K");
        maria.setLabel("M");
        karel.setColor(Color.green);
        maria.setColor(Color.pink);
        
        maria.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        maria.turnLeft();
        maria.pickThing();
        karel.pickThing();
        maria.move();
        karel.move();
        karel.turnLeft();
        maria.pickThing();
        karel.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
    }
}
