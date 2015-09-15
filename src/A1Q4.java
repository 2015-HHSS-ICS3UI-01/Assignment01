
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
 * @author snowc4636
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city for the robot to live in
        City cc = new City();
        
        //make walls
        new Wall(cc,0, 1, Direction.WEST);
        new Wall(cc,1, 1, Direction.WEST);
        new Wall(cc,1, 1, Direction.SOUTH);
        
        //Make the robot to live in the city
        Robot Carter = new Robot(cc,0, 0, Direction.SOUTH);
        Robot Mark = new Robot(cc,0, 1, Direction.SOUTH);
        Carter.move();
        Mark.move();
        Mark.turnLeft();
        Carter.move();
        Mark.move();
        Mark.turnLeft();
        Mark.turnLeft();
        Mark.turnLeft();
        Mark.move();
        Carter.turnLeft();
        Mark.turnLeft();
        Mark.turnLeft();
        Mark.turnLeft();
        Carter.move();
        Mark.move();
    }
}
