
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City town = new City();
    Robot bot = new Robot(town, 0, 1, Direction.SOUTH);
    Robot ro = new Robot(town, 0, 0, Direction.SOUTH);
    bot.setColor(Color.cyan);
    
    new Wall(town, 0, 1, Direction.WEST);
    new Wall(town, 1, 1, Direction.WEST);
    new Wall(town, 1, 1, Direction.SOUTH);
    
    ro.move();
    bot.move();
    ro.move();
    ro.turnLeft();
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
    ro.move();
    }
}
