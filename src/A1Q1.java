
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
 * @author vandk5061
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City fl = new City ();
        Robot bob = new Robot (fl,0,2,Direction.WEST);
        new Wall (fl,1,1,Direction.NORTH);
        new Wall (fl,1,2,Direction.NORTH);
        new Wall (fl,1,2,Direction.EAST);
        new Wall (fl,2,2,Direction.EAST);
        new Wall (fl,2,2,Direction.SOUTH);
        new Wall (fl,2,1,Direction.SOUTH);
        new Wall (fl,2,1,Direction.WEST);
        new Wall (fl,1,1,Direction.WEST);
        // TODO code application logic here
    }
}
