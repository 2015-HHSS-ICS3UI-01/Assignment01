
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxia2242
 */
public class A1Q1 {
    
    public static void main(String[] args) {
        City CM = new City();
        Robot Hello = new Robot(CM,0,2,Direction.WEST);
      
        new Wall(CM,1,1,Direction.NORTH);
        new Wall(CM,1,2,Direction.NORTH);
        new Wall(CM,2,1,Direction.SOUTH);
        new Wall(CM,2,2,Direction.SOUTH);
        new Wall(CM,1,1,Direction.WEST);
        new Wall(CM,2,1,Direction.WEST);
        new Wall(CM,2,2,Direction.EAST);
        new Wall(CM,1,2,Direction.EAST);
        
        Hello.move();
        Hello.move();
        Hello.turnLeft();
        Hello.move();
        Hello.move();
        Hello.move();
        Hello.turnLeft();
        Hello.move();
        Hello.move();
        Hello.move();
        Hello.turnLeft();
        Hello.move();
        Hello.move();
        Hello.move();
        Hello.turnLeft();
        Hello.move();
        
        
        
    }
    
    
}
