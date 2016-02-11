
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
 * @author halll7908
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City town = new City();
    Robot bot = new Robot(town, 0, 1, Direction.WEST);
    bot.setLabel("B");
    bot.setColor(Color.cyan);
    Robot ro = new Robot(town, 3, 3, Direction.EAST);
    ro.setLabel("R");
    
    new Wall(town, 2, 3, Direction.WEST);
    new Wall(town, 2, 3, Direction.EAST);
    new Wall(town, 2, 3, Direction.NORTH);
    new Wall(town, 3, 3, Direction.SOUTH);
    new Wall(town, 3, 3, Direction.EAST);
    new Thing(town, 0, 0);
    new Thing(town, 1, 0);
    new Thing(town, 1, 1);
    new Thing(town, 1, 2);
    new Thing(town, 2, 2);
    
    ro.turnLeft();
    ro.turnLeft();
    bot.move();
    bot.pickThing();
    ro.move();
    ro.turnLeft();
    ro.turnLeft();
    ro.turnLeft();
    ro.move();
    ro.pickThing();
    bot.turnLeft();
    bot.move();
    bot.pickThing();
    bot.turnLeft();
    ro.move();
    bot.move();
    ro.turnLeft();
    ro.pickThing();
    bot.pickThing();

    
    }
}
