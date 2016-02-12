
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
 * @author maxia2242
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City AM = new City();
        Robot Andrew = new Robot(AM,0,0,Direction.SOUTH);
        Robot Daniel = new Robot(AM,0,1,Direction.SOUTH);
        
        new Wall(AM,0,1,Direction.WEST);
        new Wall(AM,1,1,Direction.WEST);
        new Wall(AM,1,1,Direction.WEST);
        new Wall(AM,1,1,Direction.SOUTH);
        
        Andrew.move();
        Daniel.move();
        Andrew.move();
        Daniel.turnLeft();
        Andrew.turnLeft();
        Daniel.move();
        Daniel.turnLeft();
        Daniel.turnLeft();
        Daniel.turnLeft();
        Daniel.move();
        Daniel.turnLeft();
        Daniel.turnLeft();
        Daniel.turnLeft();
        Daniel.move();
        Andrew.move();
        
        
        
        
    }
}
