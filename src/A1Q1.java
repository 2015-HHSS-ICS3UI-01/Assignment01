
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
 * @author moraj0721
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Make a City for the Robot
        City Terra = new City();
        
        //Make a Robot to live in the City
        Robot jeff=new Robot(Terra, 0, 2, Direction.WEST);
        
        //Make a Wall
        new Wall (Terra, 1, 1, Direction.WEST);
        new Wall (Terra, 2, 1, Direction.WEST);
        new Wall (Terra, 2, 1, Direction.SOUTH);
        new Wall (Terra, 2, 2, Direction.SOUTH);
        new Wall (Terra, 2, 2, Direction.EAST);
        new Wall (Terra, 1, 2, Direction.EAST);
        new Wall (Terra, 1, 2, Direction.NORTH);
        new Wall (Terra, 1, 1, Direction.NORTH);
        
    }
}
