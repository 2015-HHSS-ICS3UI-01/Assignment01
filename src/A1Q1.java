
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
 * @author kulla6503
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Make a City for the Robot to live in
        City NYC = new City();
        
        //Make Walls 
        new Wall(NYC, 2, 1, Direction.NORTH); 
        new Wall(NYC, 2, 2, Direction.NORTH); 
        new Wall(NYC, 2, 1, Direction.WEST); 
        new Wall(NYC, 3, 1, Direction.WEST); 
        new Wall(NYC, 3, 1, Direction.SOUTH); 
        new Wall(NYC, 3, 2, Direction.SOUTH);
        new Wall(NYC, 2, 2, Direction.EAST); 
        new Wall(NYC, 3, 2, Direction.EAST); 
        //Make a Robot 
        Robot karel = new Robot(NYC, 1, 3, Direction.WEST); 
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
        karel.move(); 
        karel.move(); 
        karel.turnLeft(); 
        
        
        
        
    }
}
