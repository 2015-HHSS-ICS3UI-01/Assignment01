
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author snowc4636
 */
public class A1Q2 {
    private static City City;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city for the robot to live in
        City aa = new City();
        
        // make walls\
        new Wall(aa,1, 1, Direction.WEST);
        new Wall(aa,2, 1, Direction.WEST);
        new Wall(aa,2, 1, Direction.SOUTH);
        new Wall(aa,1, 1, Direction.NORTH);
        new Wall(aa,1, 2, Direction.NORTH);
        new Wall(aa,1, 2, Direction.EAST);
        new Wall(aa,1, 2, Direction.SOUTH);
    }
}
