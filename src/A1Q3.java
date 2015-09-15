
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
 * @author nelss9013
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        //Make City
        City A1Q3 = new City();
        
        //Make Walls (West)
        new Wall(A1Q3, 3, 2, Direction.WEST);
        new Wall(A1Q3, 1, 3, Direction.WEST);
        new Wall(A1Q3, 2, 3, Direction.WEST);
        
        //Make Walls (North)
        new Wall(A1Q3, 1, 3, Direction.NORTH);
        new Wall(A1Q3, 3, 2, Direction.NORTH);
        new Wall(A1Q3, 2, 4, Direction.NORTH);
        
        //Make Walls (East)
        new Wall(A1Q3, 2, 4, Direction.EAST);
        new Wall(A1Q3, 3, 4, Direction.EAST);
        new Wall(A1Q3, 1, 3, Direction.EAST);
        
        //Make Robot
        Robot karel = new Robot(A1Q3, 3, 0, Direction.EAST);
        
        //Make Thing
        new Thing(A1Q3, 3, 1);
        
        //Move Robot 
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
