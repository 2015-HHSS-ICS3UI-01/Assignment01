
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
 * @author pintm1551
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City kw = new City(); 
    Robot bot1 = new Robot(kw, 0, 1, Direction.WEST);
    Robot bot2 = new Robot(kw, 3, 3, Direction.EAST);
    bot1.setColor(Color.WHITE);
    bot2.setColor(Color.WHITE);
    bot1.setLabel("M");
    bot2.setLabel("K");
    new Thing(kw, 0, 0);
    new Thing(kw, 1, 0);
    new Thing(kw, 1, 1);
    new Thing(kw, 1, 2);
    new Thing(kw, 2, 2);
    new Wall(kw,2,3, Direction.EAST);
    new Wall(kw,2,3, Direction.WEST);
    new Wall(kw,2,3, Direction.NORTH);
    new Wall(kw,3,3, Direction.EAST);
    new Wall(kw,3,3, Direction.SOUTH);
    bot1.move();
    bot2.turnLeft();
    bot2.turnLeft();
    bot1.pickThing();
    bot2.move();
    bot1.turnLeft();
    bot2.turnLeft();
    bot2.turnLeft();
    bot2.turnLeft(); 
    bot1.move();
    bot2.move();
    bot1.pickThing();
    bot2.pickThing();
    bot1.turnLeft();
    bot2.move();
    bot1.move();
    bot2.pickThing();
    bot1.pickThing();
    bot2.turnLeft();
    }
}
