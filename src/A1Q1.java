
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
 * @author hadik9595
 */
public class A1Q1 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City wl = new City();
        new Wall (wl, 2,1, Direction.WEST);
        new Wall (wl, 3,1, Direction.WEST);
        new Wall (wl, 2,1, Direction.NORTH);
        new Wall(wl, 2,2, Direction.NORTH);
        new Wall(wl, 2,2, Direction.EAST);
        new Wall (wl, 3,2, Direction.EAST);
        new Wall (wl, 3,2, Direction.SOUTH);
        new Wall (wl, 3,1, Direction.SOUTH);
        
        Robot khaled = new Robot(wl, 1, 0, Direction.SOUTH);
        khaled.move();
        khaled.move();
        khaled.move();
        khaled.turnLeft();
        khaled.move();
        khaled.move();
        khaled.move();
        khaled.turnLeft();
        khaled.move();
        khaled.move();
        khaled.move();
        khaled.turnLeft();
        khaled.move();
        khaled.move();
        khaled.move();
        khaled.turnLeft();
        
        
    }
}
