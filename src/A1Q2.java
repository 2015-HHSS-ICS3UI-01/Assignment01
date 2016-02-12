
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   City rp = new City();
   Robot karel = new Robot(rp,2,1,Direction.WEST);
     
   
   new Wall(rp, 1, 1, Direction.WEST);
   new Wall(rp, 2, 1, Direction.WEST);
   new Wall(rp, 2, 1, Direction.SOUTH);
   new Wall(rp, 1, 1, Direction.NORTH);
   new Wall(rp, 1, 2, Direction.NORTH);
   new Wall(rp, 1, 2, Direction.EAST);
   new Wall(rp, 1, 2, Direction.SOUTH);
   
   new Thing (rp, 2, 2);
   
   
   
    }
}
