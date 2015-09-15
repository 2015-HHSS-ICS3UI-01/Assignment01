
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city
        City gotham = new City();
        
           //Make walls
    new Wall (gotham, 1, 1, Direction.NORTH);  
    new Wall (gotham, 1, 2, Direction.NORTH); 
     new Wall (gotham, 1, 1, Direction.WEST); 
    new Wall (gotham, 2, 1, Direction.WEST);
     new Wall (gotham, 2, 1, Direction.SOUTH);
     new Wall (gotham, 1, 2, Direction.EAST);
     new Wall (gotham, 1, 2, Direction.SOUTH);
     
     //Make a robot to live in this city.
     Robot Bill = new Robot (gotham, 1, 2, Direction.SOUTH);
     
     //Make a thing.
     new Thing (gotham, 2, 2);
     
     //Make robot get the thing.
     
     Bill.turnLeft();
     Bill.turnLeft();
     Bill.turnLeft();
     Bill.move();
     Bill.turnLeft();
     Bill.move();
     Bill.turnLeft();
     Bill.move();
     Bill.pickThing();
     
     //Bring the robot back to bed with the thing.
     
     Bill.turnLeft();
     Bill.turnLeft();
     Bill.move();
     Bill.turnLeft();
     Bill.turnLeft();
     Bill.turnLeft();
     Bill.move();
     Bill.turnLeft();
     Bill.turnLeft();
     Bill.turnLeft();
     Bill.move();
      Bill.turnLeft();
     Bill.turnLeft();
     Bill.turnLeft();
     Bill.putThing();
     
     
     
     
    }
}
