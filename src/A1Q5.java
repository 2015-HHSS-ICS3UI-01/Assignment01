
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      City rt = new City();
      Robot karel = new Robot(rt,0,1,Direction.WEST);
      Robot maria = new Robot(rt,3,3,Direction.EAST);
      
       new Thing(rt, 0, 0);
       new Thing(rt, 1, 0);
       new Thing(rt, 1, 1);
       new Thing(rt, 1, 2);
       new Thing(rt, 2, 2);
       
        new Wall(rt, 3, 3, Direction.EAST);
        new Wall(rt, 2, 3, Direction.EAST);
        new Wall(rt, 2, 3, Direction.NORTH);
        new Wall(rt, 2, 3, Direction.WEST);
        new Wall(rt, 3, 3, Direction.SOUTH);
        
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        
        maria.turnLeft();
        maria.turnLeft();
        maria.move();
        maria.turnLeft();
        maria.turnLeft();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        maria.move();
        maria.pickThing();
        maria.turnLeft();
        
        
        
        
        
      
      
      
      
      
      
    
    }
}
