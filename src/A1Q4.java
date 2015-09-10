
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jon
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city for robots
        City kw = new City();
        // make 2 robots to live within city
        Robot RoboCop = new Robot(kw, 0,0, Direction.SOUTH);
        Robot karel = new Robot(kw, 0, 1, Direction.SOUTH);
        //make walls within city
        new Wall (kw, 0, 1, Direction.WEST);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 1, 1, Direction.SOUTH);
        // make the robots move together
        karel.move();
        RoboCop.move();
        karel.turnLeft();
        RoboCop.move();
        karel.move();
        RoboCop.turnLeft();
        karel.turnLeft();
        RoboCop.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
    }
    
}
