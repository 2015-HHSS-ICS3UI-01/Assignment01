
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
 * @author kulla6503
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         //Make a City for the Robot to live in
        City NYC = new City();
        
        //Make a Thing
       new Thing(NYC, 3, 1);  
         
       Robot karel = new Robot(NYC, 3, 0, Direction.EAST);
         
       new Wall(NYC, 3, 2, Direction.WEST); 
       new Wall(NYC, 3, 2, Direction.NORTH);
       new Wall(NYC, 2, 3, Direction.WEST); 
       new Wall(NYC, 1, 3, Direction.WEST); 
       new Wall(NYC, 1, 3, Direction.NORTH);
       new Wall(NYC, 1, 3, Direction.EAST);
       new Wall(NYC, 2, 4, Direction.NORTH);
       new Wall(NYC, 2, 4, Direction.EAST);
       new Wall(NYC, 3, 4, Direction.EAST);
       
       karel.move();
       karel.pickThing();
       karel.turnLeft(); 
       karel.move();
       karel.turnLeft(); 
       karel.turnLeft(); 
       karel.turnLeft(); 
       karel.move();
       karel.turnLeft(); 
       karel.move();
       karel.move();
       karel.turnLeft(); 
       karel.turnLeft(); 
       karel.turnLeft();
       karel.move();
       karel.putThing(); 
       karel.move();
       karel.turnLeft(); 
       karel.turnLeft(); 
       karel.turnLeft();
       karel.move();
       karel.turnLeft();
       karel.move();
       karel.turnLeft(); 
       karel.turnLeft(); 
       karel.turnLeft();
       karel.move();
       karel.move();
       karel.turnLeft();
       
       
       
    }
}
