
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
 * @author fostp4040
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City Kitchener = new City();
        
        Robot karel = new Robot(Kitchener, 0, 0, Direction.SOUTH);
        Robot bob = new Robot(Kitchener, 0, 1, Direction.SOUTH);
        new Wall(Kitchener, 0, 1, Direction.WEST);
        new Wall(Kitchener, 1, 1, Direction.SOUTH);
        new Wall(Kitchener, 1, 1, Direction.WEST);
        karel.move();
        bob.move();
        karel.move();
        bob.turnLeft();
        bob.move();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        karel.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.turnLeft();
        bob.move();
        karel.move();
        
    }
}
