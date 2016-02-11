
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
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot denis = new Robot(Kitchener, 3, 4, Direction.WEST);
        Robot rafa  = new Robot(Kitchener, 1, 3, Direction.SOUTH);
       
        new Wall (Kitchener, 3, 3, Direction.EAST);
        new Wall (Kitchener, 4, 3, Direction. EAST);
        new Wall (Kitchener, 4, 3, Direction.SOUTH);
        new Wall (Kitchener, 4, 2, Direction.SOUTH);
        new Wall (Kitchener, 4, 2, Direction.WEST);
        new Wall (Kitchener, 3, 2, Direction.WEST);
        new Wall (Kitchener, 3, 2, Direction.NORTH);
        new Wall (Kitchener, 3, 3, Direction.NORTH);
     
        
        denis.setLabel("D");
        denis.setColor(Color.ORANGE);
        denis.turnLeft();
        denis.move();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.move();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.move();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.move();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
    }
}

