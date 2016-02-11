
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
 * @author voigr4865
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City bot = new City();
        
        Robot bill = new Robot(bot, 3, 3, Direction.EAST);
        
        Robot tim = new Robot(bot, 0, 1, Direction.WEST);
        
        new Wall(bot, 3, 3, Direction.SOUTH);
        new Wall(bot, 3, 3, Direction.EAST);
        new Wall(bot, 2, 3, Direction.WEST);
        new Wall(bot, 2, 3, Direction.NORTH);
        new Wall(bot, 2, 3, Direction.EAST);
        
        tim.setColor(Color.yellow);
        
        new Thing(bot, 2, 2);
        new Thing(bot, 1, 2);
        new Thing(bot, 1, 1);
        new Thing(bot, 1, 0);
        new Thing(bot, 0, 0);        
        
        tim.setLabel("M");
        bill.setLabel("K");
        
        tim.move();
        tim.pickThing();
        tim.turnLeft();
        tim.move();
        tim.pickThing();
        tim.turnLeft();
        tim.move();
        tim.pickThing();
        
        bill.turnLeft();
        bill.turnLeft();
        bill.move();
        bill.turnLeft();
        bill.turnLeft();
        bill.turnLeft();
        bill.move();
        bill.pickThing();
        bill.move();
        bill.pickThing();
        bill.turnLeft();
        
        
    }
}
