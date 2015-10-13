
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
 * @author vickj2854
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a city
        City kw = new City();
        // make walls (mountain)
        new Wall(kw, 1,3, Direction.EAST);
        new Wall(kw, 1,3, Direction.NORTH);
        new Wall(kw, 1,3, Direction.WEST);
        new Wall(kw, 2,3, Direction.WEST);
        new Wall(kw, 2,4, Direction.NORTH);
        new Wall(kw, 3,2, Direction.WEST);
        new Wall(kw, 3,2, Direction.NORTH);
        new Wall(kw, 2,4, Direction.EAST);
        new Wall(kw, 3,4, Direction.EAST);
        // make robot in city 
        Robot karel = new Robot(kw, 3,0, Direction.EAST); 
        // make thing in city
        new Thing(kw, 3,1);
        // move karel and thing
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.putThing();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.turnLeft();
        
    
        
        
        
       
       
        
    
        
        
   
    }
}
