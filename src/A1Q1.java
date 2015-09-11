
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
 * @author moraj0721
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Make a City for the Robot 
        City Terra = new City();
        
        //Make a Robot to live in the city
        Robot jeff=new Robot(Terra, 01, 2, Direction.SOUTH); 
        
        //Make a thing
        new Thing(Terra, 2, 2);
        
        //Make a Wall
        new Wall (Terra, 1, 1, Direction.NORTH);
        new Wall (Terra, 1, 2, Direction.NORTH);
        new Wall (Terra, 1, 2, Direction.EAST);
        new Wall (Terra, 2, 2, Direction.NORTH);
        new Wall (Terra, 2, 2, Direction.SOUTH);
        new Wall (Terra, 2, 1, Direction.SOUTH);
        new Wall (Terra, 2, 1, Direction.WEST);
        new Wall (Terra, 1, 1, Direction.WEST);
        
        jeff.turnLeft();
        jeff.turnLeft();
        jeff.turnLeft();
        jeff.move();
        jeff.turnLeft();
        jeff.move();
        jeff.turnLeft();
        jeff.move();
        jeff.pickThing();
        jeff.turnLeft();
        jeff.turnLeft();
        jeff.move();
        jeff.turnLeft();
        jeff.turnLeft();
        jeff.turnLeft();
        jeff.move();
        jeff.turnLeft();
        jeff.turnLeft();
        jeff.turnLeft();
        jeff.move();
        jeff.turnLeft();
        jeff.turnLeft();
        jeff.turnLeft();
        
        
        
       
        
        
        
        
        
    }
}
