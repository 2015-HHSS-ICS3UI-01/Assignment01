
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denis
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot denis = new Robot(Kitchener, 3, 1, Direction.EAST);
        
        new Wall (Kitchener, 3, 2, Direction.WEST);
        new Wall (Kitchener, 3, 2, Direction.NORTH);
        new Wall (Kitchener, 2, 3, Direction.WEST);
        new Wall (Kitchener, 1, 3, Direction.WEST);
        new Wall (Kitchener, 1, 3, Direction.NORTH);
        new Wall (Kitchener, 1, 3, Direction.EAST);
        new Wall (Kitchener, 2, 4, Direction.NORTH);
        new Wall (Kitchener, 2, 4, Direction.EAST);
        new Wall (Kitchener, 3, 4, Direction.EAST);
        
        new Thing(Kitchener, 3, 1);
        
        denis.move();
        denis.pickThing();
        denis.turnLeft();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.turnLeft();
        denis.move();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.putThing();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.turnLeft();
        denis.move();
        denis.turnLeft();
        denis.turnLeft();
        denis.turnLeft();
        denis.move();
        denis.move();
        denis.turnLeft();
        }
     }
    

