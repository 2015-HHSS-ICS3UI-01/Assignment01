
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City town = new City();
    Robot bot = new Robot(town, 3, 0, Direction.EAST);
    bot.setColor(Color.cyan);
    
    new Thing(town, 3, 1);
    new Wall(town, 3, 2, Direction.NORTH); //incomplete
    new Wall(town, 3, 2, Direction.WEST);
    new Wall(town, 2, 3, Direction.WEST);
    new Wall(town, 1, 3, Direction.WEST);
    new Wall(town, 1, 3, Direction.NORTH);
    new Wall(town, 1, 3, Direction.EAST);
    new Wall(town, 2, 4, Direction.NORTH);
    new Wall(town, 2, 4, Direction.EAST);
    new Wall(town, 3, 4, Direction.EAST);
    
    bot.move();
    bot.turnLeft();
    bot.pickThing();
    bot.move();
    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();
    bot.turnLeft();
    bot.move();
    bot.move();
    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();
    bot.putThing();
    bot.move();
    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();//problem
    bot.move();
    bot.turnLeft();
    bot.move();
    bot.turnLeft();
    bot.turnLeft();
    bot.turnLeft();
    bot.move();
    bot.move();
    bot.turnLeft();
    }
}
