/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author tatad6701
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot denis = new Robot(Kitchener, 1, 2, Direction.SOUTH);
        
        
        new Wall (Kitchener, 1, 2, Direction.EAST);
        new Wall (Kitchener, 1, 2, Direction.NORTH);
        new Wall (Kitchener, 1, 2, Direction.SOUTH);
        new Wall (Kitchener, 1, 1, Direction.NORTH);
        new Wall (Kitchener, 1, 1, Direction.WEST);
        new Wall (Kitchener, 2, 1, Direction.WEST);
        new Wall (Kitchener, 2, 1, Direction.SOUTH);
        
        new Thing(Kitchener, 2, 2);
        
        denis.setLabel("K");
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.turnLeft();
        denis.move();
        denis.turnLeft();
        denis.move();
        denis.pickThing();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
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
