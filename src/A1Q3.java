
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make City for Robot to live in
        City kw = new City();
        
        //Make Walls
        new Wall(kw, 1, 2, Direction.NORTH);
    }
}
