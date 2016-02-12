
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
 * @author tatad6701
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot denis = new Robot(Kitchener, 0, 1, Direction.WEST);
        Robot fineas = new Robot(Kitchener,3, 3, Direction.EAST);
        
        new Wall (Kitchener, 2, 3, Direction.EAST):
        new Wall (Kitchener, 2, 3, Direction.NORTH):
        new Wall (Kitchener, 2, 3, Direction.WEST):
        
        
        
        new Thing(Kitchener, 0, 0);
        new Thing(Kitchener, 1, 0);
        new Thing(Kitchener, 1, 1);
        new Thing(Kitchener, 1, 2);
        new Thing(Kitchener, 2, 2);
    }
}
