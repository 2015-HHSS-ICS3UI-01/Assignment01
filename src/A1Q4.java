
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       City fl = new City ();
       new Wall (fl, 0,1,Direction.WEST);
       new Wall (fl, 1,1,Direction.WEST);
       new Wall (fl, 1,1,Direction.SOUTH);
       Robot bob = new Robot (fl,0,0,Direction.SOUTH);
       Robot kat = new Robot (fl,0,1,Direction.SOUTH);
       bob.move();
       kat.move();
       bob.move();
       bob.turnLeft();
       
       kat.turnLeft();
       kat.move();
       kat.turnLeft();
       kat.turnLeft();
       kat.turnLeft();
       kat.move();
       kat.turnLeft();
       kat.turnLeft();
       kat.turnLeft();
       kat.move();
       bob.move();
       // TODO code application logic here
    }
}
