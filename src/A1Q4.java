
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
 * @author tatad6701
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot denis = new Robot(Kitchener, 0, 0, Direction.SOUTH);
        Robot fineas = new Robot(Kitchener,0, 1, Direction.SOUTH);
        
        new Wall (Kitchener, 0, 1, Direction.WEST);
        new Wall (Kitchener, 1, 1, Direction.WEST);
        new Wall (Kitchener, 1, 1, Direction.SOUTH);
        
        denis.setLabel("D");
        denis.setColor(Color.red);
        fineas.setLabel("F");
        fineas.setColor(Color.yellow);
        
        denis.move();
        denis.move();
        fineas.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        fineas.turnLeft();
        fineas.move();
        denis.turnLeft();
        denis.turnLeft();
        fineas.turnLeft();
        fineas.turnLeft();
        fineas.turnLeft();
        fineas.move();
        fineas.turnLeft();
        fineas.turnLeft();
        fineas.turnLeft();
        denis.move();
        fineas.move();       
    }
}
