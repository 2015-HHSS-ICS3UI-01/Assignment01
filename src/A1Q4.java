
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
 * @author sevcm7279
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City no = new City();
        new Wall (no, 0, 1, Direction. WEST);
        new Wall (no, 1, 1, Direction. WEST);
        new Wall (no, 1, 1, Direction. SOUTH);
        
        Robot jimbo = new Robot (no, 0, 0, Direction. SOUTH);
        
        Robot cletus = new Robot (no, 0, 1, Direction. SOUTH);
        
        jimbo.move();
        cletus.move();
        jimbo.move();
        cletus.turnLeft();
        cletus.move();
        cletus.turnLeft();
        cletus.turnLeft();
        cletus.turnLeft();
        cletus.move();
        jimbo.turnLeft();
        cletus.turnLeft();
        cletus.turnLeft();
        cletus.turnLeft();
        jimbo.move();
        cletus.move();
        
        
        
    }
}
