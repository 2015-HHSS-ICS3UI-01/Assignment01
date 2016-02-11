
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
 * @author voigr4865
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City bot = new City();
        
        Robot bill = new Robot(bot, 0, 0, Direction.SOUTH);
        
        Robot tim = new Robot(bot, 0, 1, Direction.SOUTH);
        
        new Wall(bot, 0, 1, Direction.WEST);
        new Wall(bot, 1, 1, Direction.SOUTH);
        new Wall(bot, 1, 1, Direction.WEST);
        
        bill.setColor(Color.blue);
        
        bill.move();
        bill.move();
        bill.turnLeft();
        
        tim.move();
        tim.turnLeft();
        tim.move();
        tim.turnLeft();
        tim.turnLeft();
        tim.turnLeft();
        tim.move();
        tim.turnLeft();
        tim.turnLeft();
        tim.turnLeft();
        bill.move();
        tim.move();
    }
}
