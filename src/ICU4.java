
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
 * @author eadil1765
 */
public class ICU4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City L = new City();
    new Wall (L, 0, 1, Direction.WEST);
    new Wall (L, 1, 1, Direction.WEST);
    new Wall (L, 1, 1, Direction.SOUTH);
    
    Robot Liam = new Robot (L, 0, 0, Direction.SOUTH);
    Robot Jamez = new Robot (L, 0, 1, Direction.SOUTH);
    Liam.move();
    Liam.move();
    Liam.turnLeft();
    Liam.move();
    
   Jamez.move();
   Jamez.turnLeft();
 Jamez.move();
 Jamez.turnLeft();
 Jamez.turnLeft();
 Jamez.turnLeft();
 Jamez.move();
 Jamez.turnLeft();
 Jamez.turnLeft();
 Jamez.turnLeft();
 Jamez.move();
   

    }  
}
