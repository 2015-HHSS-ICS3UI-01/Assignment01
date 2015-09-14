
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
 * @author kulla6503
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Make a City for the Robot to live in
        City NYC = new City();
        
        Robot karel = new Robot(NYC, 0, 0, Direction.SOUTH);
        Robot steve = new Robot(NYC, 0, 1, Direction.SOUTH); 
        
        new Wall(NYC, 0, 1, Direction.WEST); 
        new Wall(NYC, 1, 1, Direction.WEST); 
        new Wall(NYC, 1, 1, Direction.SOUTH);
        
        karel.move();
        steve.move();
        karel.move();
        steve.turnLeft();
        steve.move();
        steve.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        steve.move();
        karel.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        karel.move();
        steve.move();
        
        
        
    }
}
