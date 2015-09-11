
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
 * @author lalim9800
 */
public class a1q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city for the robot to live in 
         City a1q2= new City();
        //new robot 
        Robot jeff= new Robot(a1q2,1,2,Direction.SOUTH);
        new Wall(a1q2,1,2,Direction.SOUTH);
        new Wall(a1q2,1,2,Direction.EAST);
        new Wall(a1q2,1,2,Direction.NORTH);
        new Wall(a1q2,1,1,Direction.NORTH);
        new Wall(a1q2,1,1,Direction.WEST);
        new Wall(a1q2,2,1,Direction.WEST);
        new Wall(a1q2,2,1,Direction.SOUTH);
        new Thing(a1q2,2,2);
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
        
        

