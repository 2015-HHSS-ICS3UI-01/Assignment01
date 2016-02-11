import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;
 /* To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City kw = new City();
    Robot karel = new Robot(kw,0,1, Direction.SOUTH);    
    Robot victor = new Robot(kw,0,0, Direction.SOUTH);
    new Wall(kw, 0, 1, Direction.WEST);
    new Wall(kw,1,1,Direction.WEST);
    new Wall(kw,1,1, Direction.SOUTH);
    victor.move();
    karel.move();
    victor.move();
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    victor.turnLeft();
    victor.move();
    karel.move();
    }
}
