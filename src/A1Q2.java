
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
public class A1Q2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        //Make City
        City A1Q2 = new City();
        
        //Make Walls (West)
        new Wall(A1Q2, 1, 1, Direction.WEST);
        new Wall(A1Q2, 2, 1, Direction.WEST);
        
        //Make Walls (North)
        new Wall(A1Q2, 1, 1, Direction.NORTH);
        new Wall(A1Q2, 1, 2, Direction.NORTH);
        
        //Make Wall (East)
        new Wall(A1Q2, 1, 2, Direction.EAST);
        
        //Make Walls (South)
        new Wall(A1Q2, 2, 1, Direction.SOUTH);
        new Wall(A1Q2, 1, 2, Direction.SOUTH);
        
        //Make Robot
         Robot karel = new Robot(A1Q2, 1, 2, Direction.SOUTH);
         
         //Make a Thing
         new Thing(A1Q2, 2, 2);
         
         //Move Robot 
         
         karel.turnLeft();
         karel.turnLeft();
         karel.turnLeft();
         karel.move();
         
         karel.turnLeft();
         karel.move();
         
         karel.turnLeft();
         karel.move();
         karel.pickThing();
         
         karel.turnLeft();
         karel.turnLeft();
         karel.move();
         
         karel.turnLeft();
         karel.turnLeft();
         karel.turnLeft();
         karel.move();
         
         karel.turnLeft();
         karel.turnLeft();
         karel.turnLeft();
         karel.move();
         
         
         karel.turnLeft();
         karel.turnLeft();
         karel.turnLeft();
         karel.putThing();
    }
}
