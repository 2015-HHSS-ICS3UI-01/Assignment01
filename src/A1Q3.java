
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make a city for the robot to live in
        City kw = new City();
        
               //make a robot to live within the city
        Robot Climber = new Robot (kw, 3, 0, Direction.EAST);
        
        // make walls (mountains) within the city
        new Wall (kw, 3, 2, Direction.WEST);
        new Wall (kw, 3, 2, Direction.NORTH);
        new Wall (kw, 2, 3, Direction.WEST);
        new Wall (kw, 1, 3, Direction.WEST);
        new Wall (kw, 1, 3, Direction.NORTH);
        new Wall (kw, 1, 3, Direction.EAST);
        new Wall (kw, 2, 4, Direction.NORTH);
        new Wall (kw, 2, 4, Direction.EAST);
        new Wall (kw, 3, 4, Direction.EAST);
        
        // make things in the city
        new Thing (kw, 3, 1);
        
        // make robot move within city
        Climber.move();
        Climber.pickThing();
        Climber.turnLeft();
        Climber.move();
        Climber.turnLeft();
        Climber.turnLeft();
        Climber.turnLeft();
        Climber.move();
        Climber.turnLeft();
        Climber.move();
        Climber.move();
        Climber.turnLeft();
        Climber.turnLeft();
        Climber.turnLeft();
        Climber.move();
        Climber.putThing();
        Climber.move();
        Climber.turnLeft();
        Climber.turnLeft();
        Climber.turnLeft();
        Climber.move();
        Climber.turnLeft();
        Climber.move();
        Climber.turnLeft();
        Climber.turnLeft();
        Climber.turnLeft();
        Climber.move();
        Climber.move();
        Climber.turnLeft();
    }
    
}
