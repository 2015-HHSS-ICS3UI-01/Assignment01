
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City bot = new City();
        
        Robot bill = new Robot(bot, 1, 2, Direction.SOUTH);
        
        new Wall(bot, 1, 1, Direction.NORTH);
        new Wall(bot, 1, 2, Direction.NORTH);
        new Wall(bot, 1, 1, Direction.WEST);
        new Wall(bot, 2, 1, Direction.WEST);
        new Wall(bot, 2, 1, Direction.SOUTH);
        new Wall(bot, 1, 2, Direction.SOUTH);
        new Thing(bot, 2, 2);
        new Wall(bot, 1, 2, Direction.EAST);
        
        bill.turnLeft();
        bill.turnLeft();
        bill.turnLeft();
        bill.move();
        bill.turnLeft();
        bill.move();
        bill.turnLeft();
        bill.move();
        bill.pickThing();
        bill.turnLeft();
        bill.turnLeft();
        bill.move();
        bill.turnLeft();
        bill.turnLeft();
        bill.turnLeft();
        bill.move();
        bill.turnLeft();
        bill.turnLeft();
        bill.turnLeft();
        bill.move();
        bill.turnLeft();
        bill.turnLeft();
        bill.turnLeft();
        
                
                
    }
}
