
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
 * @author pearr2740
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      City tw = new City();
      Robot joe = new Robot(tw,3,0,Direction.EAST);
      
        new Wall(tw, 3, 2, Direction.WEST);
        new Wall(tw, 3, 2, Direction.NORTH);
        new Wall(tw, 2, 3, Direction.WEST);
        new Wall(tw, 1, 3, Direction.WEST);
        new Wall(tw, 1, 3, Direction.NORTH);
        new Wall(tw, 1, 3, Direction.EAST);
        new Wall(tw, 2, 4, Direction.NORTH);
        new Wall(tw, 2, 4, Direction.EAST);
        new Wall(tw, 3, 4, Direction.EAST);
        
        new Thing(tw, 3, 1);
        
        joe.move();
        joe.pickThing();
        joe.turnLeft();
        joe.move();
        joe.turnLeft();
        joe.turnLeft();
        joe.turnLeft();
        joe.move();
        joe.turnLeft();
        joe.move();
        joe.move();
        joe.turnLeft();
        joe.turnLeft();
        joe.turnLeft();
        joe.move();
        joe.putThing();
        joe.move();
        joe.turnLeft();
        joe.turnLeft();
        joe.turnLeft();
        joe.move();
        joe.turnLeft();
        joe.move();
        joe.turnLeft();
        joe.turnLeft();
        joe.turnLeft();
        joe.move();
        joe.move();
        joe.turnLeft();
        
        
        
        
        
        
    
    
    }
}
