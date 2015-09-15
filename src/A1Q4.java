
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
 * @author nelss9013
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       //Make City
        City A1Q4 = new City();
        
        //Make Walls (West)
        new Wall(A1Q4, 1, 1, Direction.WEST);
        new Wall(A1Q4, 2, 1, Direction.WEST);
        
        //Make Wall(North)
        new Wall(A1Q4, 2, 1, Direction.SOUTH);
        
        //Make Robot
        Robot karel = new Robot(A1Q4, 0, 0, Direction.SOUTH); 
        Robot steve = new Robot(A1Q4, 0, 1, Direction.SOUTH);
        
        //Move Robots
        steve.move();
        karel.move();
        steve.move();
        karel.move();
        steve.turnLeft();
        karel.move();
        steve.move();
        karel.turnLeft();
        steve.turnLeft();
        karel.turnLeft();
        steve.turnLeft();
        karel.turnLeft();
        steve.turnLeft();
        karel.turnLeft();
        steve.move();
        karel.turnLeft();
        steve.turnLeft();
        karel.turnLeft();
        steve.turnLeft();
        karel.turnLeft();
        steve.turnLeft();
        karel.turnLeft();
        steve.move();
        karel.turnLeft();
        karel.move(); 
    }
}
