
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nelss9013
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Make city
        City A1Q1 = new City();
        
        //Make Walls (West)
        new Wall(A1Q1, 1, 1, Direction.WEST);
        new Wall(A1Q1, 2, 1, Direction.WEST);
        
        //Make Walls (North)
        new Wall(A1Q1, 1, 1, Direction.NORTH);
        new Wall(A1Q1, 1, 2, Direction.NORTH);
        
        //Make Walls (East)
        new Wall(A1Q1, 1, 2, Direction.EAST);
        new Wall(A1Q1, 2, 2, Direction.EAST);
        
         //Make Walls (South)
        new Wall(A1Q1, 2, 2, Direction.SOUTH);
        new Wall(A1Q1, 2, 1, Direction.SOUTH);
        
        //Make Robot live in the city
        Robot karel = new Robot(A1Q1, 0, 2, Direction.WEST);
        
        //Move Robot
        karel.move();
        karel.move();
        karel.turnLeft();
        
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        
        
        karel.move();
    }
}
