
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author preej0747
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city for the robot to live in
        City kw = new City();
        
        //Make walls
        new Wall (kw, 3,2, Direction.WEST);
        new Wall (kw, 3,2, Direction.NORTH);
        new Wall (kw, 2,3, Direction.WEST);
        new Wall (kw, 1,3, Direction.WEST);
        new Wall (kw, 1,3, Direction.NORTH);
        new Wall (kw, 1,3, Direction.EAST);
        new Wall (kw, 2,4, Direction.NORTH);
        new Wall (kw, 2,4, Direction.EAST);
        new Wall (kw, 3,4, Direction.EAST);
        
        //Place thing for robot to pick up
        new Thing (kw, 3,1);
        
        //Make robot
        Robot RoboCop = new Robot (kw, 3,0, Direction.EAST);
        
        //Make robot move
        RoboCop.move();
        RoboCop.pickThing();
        RoboCop.turnLeft();
        RoboCop.move();
        RoboCop.turnLeft();
        RoboCop.turnLeft();
        RoboCop.turnLeft();
        RoboCop.move();
        RoboCop.turnLeft();
        RoboCop.move();
        RoboCop.move();
        RoboCop.turnLeft();
        RoboCop.turnLeft();
        RoboCop.turnLeft();
        RoboCop.move();
        RoboCop.move();
        RoboCop.turnLeft();
        RoboCop.turnLeft();
        RoboCop.turnLeft();
        RoboCop.move();
        RoboCop.turnLeft();
        RoboCop.move();
        RoboCop.turnLeft();
        RoboCop.turnLeft();
        RoboCop.turnLeft();
        RoboCop.move();
        RoboCop.move();
        RoboCop.turnLeft();
        
                
    }
}
