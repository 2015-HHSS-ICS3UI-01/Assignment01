
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City kw = new City();  
    Robot bot1 = new Robot(kw, 0, 0, Direction.SOUTH);
    Robot bot2 = new Robot(kw, 0, 1, Direction.SOUTH);
    bot1.setColor(Color.BLACK);
    bot2.setColor(Color.BLACK);
    new Wall(kw,0,0, Direction.EAST);
    new Wall(kw,1,0, Direction.EAST);
    new Wall(kw,1,1, Direction.SOUTH);
    bot1.move();
    bot2.move();
    bot1.move();
    bot2.turnLeft();
    bot2.move();
    bot2.turnLeft();
    bot2.turnLeft();
    bot2.turnLeft();
    bot2.move();
    bot2.turnLeft();
    bot2.turnLeft();
    bot2.turnLeft();
    bot1.turnLeft(); 
    bot1.move();
    bot2.move();
    }
}
