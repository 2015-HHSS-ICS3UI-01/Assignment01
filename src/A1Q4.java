
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
 * @author guanv6321
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw, 0, 0, Direction.SOUTH);
        Robot kevin = new Robot(kw, 0, 1, Direction.SOUTH);
        new Wall(kw, 0, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.SOUTH);
        
        karel.move();
        kevin.move();
        karel.move();
        kevin.turnLeft();
        karel.turnLeft();
        kevin.move();
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.move();
        kevin.turnLeft();
        kevin.turnLeft();
        kevin.turnLeft();
        karel.move();
        kevin.move();
    }
}
