
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
 * @author voigr4865
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City bot = new City();
        
        Robot bill = new Robot(bot, 3, 0, Direction.EAST);
        
        new Wall(bot, 3, 2, Direction.WEST);
        new Wall(bot, 3, 2, Direction.NORTH);
        new Wall(bot, 2, 3, Direction.WEST);
        new Wall(bot, 1, 3, Direction.WEST);
        new Wall(bot, 1, 3, Direction.NORTH);
        new Wall(bot, 1, 3, Direction.EAST);
        new Wall(bot, 2, 4, Direction.EAST);
        new Wall(bot, 2, 4, Direction.NORTH);
        new Wall(bot, 3, 4, Direction.EAST);
        new Thing(bot, 3, 1);
        
        bill.move();
        bill.pickThing();
        bill.turnLeft();
        bill.move();
        bill.turnLeft();
        bill.turnLeft();
        bill.turnLeft();
        bill.move();
        bill.turnLeft();
        bill.move();
        bill.move();
        bill.turnLeft();
        bill.turnLeft();
        bill.turnLeft();
        bill.move();
        bill.putThing();
        bill.move();
        bill.turnLeft();
        bill.turnLeft();
        bill.turnLeft();
        bill.move();
        bill.turnLeft();
        bill.move();
        bill.turnLeft();
        bill.turnLeft();
        bill.turnLeft();
        bill.move();
        bill.move();
        bill.turnLeft();
        
        
    }
}
