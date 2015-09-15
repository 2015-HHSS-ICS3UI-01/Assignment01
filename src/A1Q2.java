
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
 * @author snowc4636
 */
public class A1Q2 {
    private static City City;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city for the robot to live in
        City aa = new City();
        
        // make walls\
        new Wall(aa,1, 1, Direction.WEST);
        new Wall(aa,2, 1, Direction.WEST);
        new Wall(aa,2, 1, Direction.SOUTH);
        new Wall(aa,1, 1, Direction.NORTH);
        new Wall(aa,1, 2, Direction.NORTH);
        new Wall(aa,1, 2, Direction.EAST);
        new Wall(aa,1, 2, Direction.SOUTH);
        
        //Make a Thing
        new Thing(aa,2, 2);
        
        //Make the robot to live in the city
        Robot Jacob = new Robot(aa,1, 2, Direction.SOUTH);
        Jacob.turnLeft();
        Jacob.turnLeft();
        Jacob.turnLeft();
        Jacob.move();
        Jacob.turnLeft();
        Jacob.move();
        Jacob.turnLeft();
        Jacob.move();
        Jacob.pickThing();
        Jacob.turnLeft();
        Jacob.turnLeft();
        Jacob.move();
        Jacob.turnLeft();
        Jacob.turnLeft();
        Jacob.turnLeft();
        Jacob.move();
        Jacob.turnLeft();
        Jacob.turnLeft();
        Jacob.turnLeft();
        Jacob.move();
        Jacob.turnLeft();
        Jacob.turnLeft();
        Jacob.turnLeft();
    }
}
