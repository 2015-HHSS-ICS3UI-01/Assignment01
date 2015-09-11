
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
 * @author stahc1596
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City ();
        
        new Wall (kw, 0, 1, Direction.WEST);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 1, 1, Direction.SOUTH);
        
        Robot Bonnie = new Robot (kw, 0, 0, Direction.SOUTH);
        Robot Clyde = new Robot (kw, 0, 1, Direction.SOUTH);
        
        Bonnie.move();
        Clyde.move();
        Bonnie.move();
        Clyde.turnLeft();
        Bonnie.turnLeft();
        Clyde.move();
        Bonnie.turnLeft();
        Clyde.turnLeft();
        Bonnie.turnLeft();
        Clyde.turnLeft();
        Bonnie.turnLeft();
        Clyde.turnLeft();
        Bonnie.turnLeft();
        Clyde.move();
        Bonnie.turnLeft();
        Clyde.turnLeft();
        Bonnie.turnLeft();
        Clyde.turnLeft();
        Bonnie.turnLeft();
        Clyde.turnLeft();
        Bonnie.turnLeft();
        Clyde.move();
        Bonnie.move();
        
    }
}
