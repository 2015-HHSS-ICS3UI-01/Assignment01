
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author watsk8668
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
                
        new Wall(kw, 0,1, Direction.WEST);
        new Wall(kw, 1,1, Direction.WEST);
        
        
    }
}
