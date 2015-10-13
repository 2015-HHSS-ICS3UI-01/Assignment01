
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
 * @author preej0747
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make city for robot to live in
        City kw = new City();
        
        //Make walls
        new Wall (kw, 0,1, Direction.WEST);
        new Wall (kw, 1,1, Direction.WEST);
        new Wall (kw, 1,1, Direction.SOUTH);
        
        //Make Robots
        Robot Jonny = new Robot (kw, 0,0, Direction.SOUTH);
        Robot RoboCop = new Robot (kw, 0,1, Direction.SOUTH);
        
        //Make robots move
        Jonny.move();
        Jonny.move();
        Jonny.turnLeft();
        Jonny.move();
        RoboCop.move();
        RoboCop.turnLeft();
        RoboCop.move();
        RoboCop.turnLeft();
        RoboCop.turnLeft();
        RoboCop.turnLeft();
        RoboCop.move();
        RoboCop.turnLeft();
        RoboCop.turnLeft();
        RoboCop.turnLeft();
        RoboCop.move();
    }
}
