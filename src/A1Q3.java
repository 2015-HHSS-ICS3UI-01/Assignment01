
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
 * @author agott2059
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City thomas = new City ();
        
        Robot bean = new Robot(thomas, 3,0 , Direction.EAST);
        
        new Thing (thomas, 3,1);
        
        new Wall (thomas, 3,2 , Direction.WEST);
        new Wall (thomas, 3,2 , Direction.NORTH);
        new Wall (thomas, 2,3 , Direction.WEST);
        new Wall (thomas, 1,3 , Direction.WEST);
        new Wall (thomas, 1,3 , Direction.NORTH);
        new Wall (thomas, 1,3 , Direction.EAST);
        new Wall (thomas, 2,4 , Direction.NORTH);
        new Wall (thomas, 2,4 , Direction.EAST);
        new Wall (thomas, 3,4 , Direction.EAST);
        
        bean.move();
        bean.pickThing();
        bean.turnLeft();
        bean.move();
        bean.turnLeft();
        bean.turnLeft();
        bean.turnLeft();
        bean.move();
        bean.turnLeft();
        bean.move();
        bean.move();
        bean.turnLeft();
        bean.turnLeft();
        bean.turnLeft();
        bean.move();
        bean.putThing();
        bean.move();
        bean.turnLeft();
        bean.turnLeft();
        bean.turnLeft();
        bean.move();
        bean.turnLeft();
        bean.turnLeft();
        bean.turnLeft();
        bean.turnLeft();
        bean.turnLeft();
        bean.move();
        bean.turnLeft();
        bean.turnLeft();
        bean.turnLeft();
        bean.move();
        bean.move();
        bean.turnLeft();
        
                
    }
    
        
        

        
}
