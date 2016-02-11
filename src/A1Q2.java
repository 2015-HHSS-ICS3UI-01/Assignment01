
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  City town = new City();
    Robot bot = new Robot(town, 1, 2, Direction.SOUTH);
    bot.setColor(Color.cyan);
    new Thing(town, 2, 2);
    new Wall(town, 1, 2, Direction.NORTH);
    new Wall(town, 1, 1, Direction.NORTH);
    new Wall(town, 1, 1, Direction.WEST);
    new Wall(town, 2, 1, Direction.WEST);
    new Wall(town, 1, 2, Direction.EAST);
    new Wall(town, 2, 1, Direction.SOUTH);
    new Wall(town, 1, 2, Direction.SOUTH);
    
    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();
    bot.turnLeft();
    bot.move();
    bot.turnLeft();
    bot.move();
    bot.pickThing();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();
    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();
    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();
    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.putThing();
    }
}
