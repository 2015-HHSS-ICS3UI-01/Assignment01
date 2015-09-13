
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
 * @author malcr1272
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make city
        City kw = new City();
        
        //make robot
        Robot karel = new Robot(kw,3,0,Direction.EAST);
        
        //make mountain
        new Wall(kw,3,2,Direction.WEST);
        new Wall(kw,3,2,Direction.NORTH);
        new Wall(kw,2,3,Direction.WEST);
        new Wall(kw,1,3,Direction.WEST);
        new Wall(kw,1,3,Direction.NORTH); 
        new Wall(kw,1,3,Direction.EAST);
        new Wall(kw,2,4,Direction.NORTH); 
        new Wall(kw,2,4,Direction.EAST);
        new Wall(kw,3,4,Direction.EAST);
       
        //Make Flag
        new Thing(kw,3,1);
        
        
    }
}
