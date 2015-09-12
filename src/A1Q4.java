
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
 * @author watsk8668
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City kw = new City();
                
        //make walls
        new Wall(kw, 0,1, Direction.WEST);
        new Wall(kw, 1,1, Direction.WEST);
        new Wall(kw, 1,1, Direction.SOUTH);
        
        //make robots
        Robot karel = new Robot(kw, 0,1, Direction.SOUTH);
        Robot steve = new Robot(kw, 0,0, Direction.SOUTH);
        
        //move robots into each other
        steve.move();
        karel.move();
        steve.move();
        steve.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        steve.move();
        karel.move();
        
        
    }
}
