
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make city for robots to live in
        City kw = new City();
        
        //Place things for robots to pick up
        new Thing (kw, 0,0);
        new Thing (kw, 1,0);
        new Thing (kw, 1,1);
        new Thing (kw, 1,2);
        new Thing (kw, 2,2);
        
        //Make walls
        new Wall (kw, 2,3, Direction.WEST);
        new Wall (kw, 2,3, Direction.NORTH);
        new Wall (kw, 2,3, Direction.EAST);
        new Wall (kw, 3,3, Direction.EAST);
        new Wall (kw, 3,3, Direction.SOUTH);
        
        //Make robots
        Robot Jonny = new Robot (kw, 0,1, Direction.WEST);
        Robot RoboCop = new Robot (kw, 3,3, Direction.EAST);
        
        //Make robots move
        Jonny.move();
        Jonny.pickThing();
        Jonny.turnLeft();
        Jonny.move();
        Jonny.pickThing();
        Jonny.turnLeft();
        Jonny.move();
        Jonny.pickThing();
        RoboCop.turnLeft();
        RoboCop.turnLeft();
        RoboCop.move();
        RoboCop.turnLeft();
        RoboCop.turnLeft();
        RoboCop.turnLeft();
        RoboCop.move();
        RoboCop.pickThing();
        RoboCop.move();
        RoboCop.pickThing();
        RoboCop.turnLeft();
        
        
        
        
    }
}
