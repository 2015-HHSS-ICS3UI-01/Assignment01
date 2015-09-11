
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
 * @author lalim9800
 */
public class a1q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //make city 
        //make new wall
        City a1q1 = new City();
        Robot jeff= new Robot(a1q1,0,2,Direction.WEST);
        new Wall(a1q1,1,1,Direction.NORTH);
        new Wall(a1q1,1,2,Direction.NORTH);
        new Wall(a1q1,1,1,Direction.WEST);
        new Wall(a1q1,2,1,Direction.WEST);
        new Wall(a1q1,2,1,Direction.SOUTH);
        new Wall(a1q1,2,2,Direction.SOUTH);
        new Wall(a1q1,1,2,Direction.EAST);
        new Wall(a1q1,2,2,Direction.EAST);
        //Make jeff move 
       jeff.move();
       jeff.move();
       jeff.turnLeft();
       jeff.move();
       jeff.move();
       jeff.move();
       jeff.turnLeft();
       jeff.move();
       jeff.move();
       jeff.move();
       jeff.turnLeft();
       jeff.move();
       jeff.move();
       jeff.move();
       jeff.turnLeft();
       jeff.move();
        
        
    }
}
