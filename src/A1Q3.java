
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
 * @author duttr4019
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city for the robot to live in.
        City gotham = new City();
        
        //Make a mountain.
        new Wall (gotham, 3, 2, Direction.WEST);
        new Wall (gotham, 3, 2, Direction.NORTH);
        new Wall (gotham, 2, 3, Direction.WEST);
        new Wall (gotham, 1, 3, Direction.WEST);
        new Wall (gotham, 1, 3, Direction.NORTH);
        new Wall (gotham, 1, 3, Direction.EAST);
        new Wall (gotham, 2, 4, Direction.NORTH);
        new Wall (gotham, 2, 4, Direction.EAST);
        new Wall (gotham, 3, 4, Direction.EAST);
        
        //Make a robot to climb the mountain.
        Robot Bill = new Robot(gotham, 3, 0, Direction.EAST); 
        
        //Place a flag.
        new Thing (gotham, 3, 1);
        
        //Make the robot pick up the flag
        //Place on top of mountain
        //and climb back down.
        
        Bill.move();
        Bill.pickThing();
        Bill.turnLeft();
        Bill.move();
        Bill.turnLeft();
        Bill.turnLeft();
        Bill.turnLeft();
        Bill.move();
        Bill.turnLeft();
        Bill.move();
        Bill.move();
        Bill.turnLeft();
        Bill.turnLeft();
        Bill.turnLeft(); 
        Bill.move();
        Bill.putThing();
        Bill.move();
        Bill.turnLeft();
        Bill.turnLeft();
        Bill.turnLeft();
        Bill.move();
        Bill.turnLeft();
        Bill.move();
        Bill.turnLeft();
        Bill.turnLeft();
        Bill.turnLeft();
        Bill.move();
        Bill.move();
        Bill.turnLeft();
        
        
        
        
    }
}
