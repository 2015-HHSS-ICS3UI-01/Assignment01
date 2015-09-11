import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author duttr4019
 */
public class A1 {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Make a city for the Robot to live in.
    City gotham = new City();
    
    //Make walls
    new Wall (gotham, 1, 1, Direction.NORTH);  
    new Wall (gotham, 1, 2, Direction.NORTH); 
    new Wall (gotham, 1, 1, Direction.WEST); 
    new Wall (gotham, 2, 1, Direction.WEST); 
    new Wall (gotham, 2, 1, Direction.SOUTH); 
    new Wall (gotham, 2, 2, Direction.SOUTH); 
    new Wall (gotham, 2, 2, Direction.EAST); 
    new Wall (gotham, 1, 2, Direction.EAST);
    
    //Make a robot to live in the city.
    
    Robot Bill = new Robot (gotham, 0, 2, Direction.WEST);
    
    //Make robot move around wall counterclockwise.
    Bill.move();
    Bill.move();
    Bill.turnLeft();
     Bill.move();
    Bill.move();
    Bill.move();
    Bill.turnLeft();
     Bill.move();
    Bill.move();
    Bill.move();
    Bill.turnLeft();
     Bill.move();
    Bill.move();
    Bill.move();
    Bill.turnLeft();
    Bill.move();
    
            
            
            
    
    }
}
    
   