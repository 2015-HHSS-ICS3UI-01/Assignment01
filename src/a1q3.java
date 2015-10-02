
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
public class a1q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //make new city 
        City a1q3= new City();
        //make robot 
        Robot jeff= new Robot(a1q3,3,0,Direction.EAST);
        //make things 
        new Thing(a1q3,3,1);
        new Wall(a1q3,3,2,Direction.WEST);
        new Wall (a1q3,3,2,Direction.NORTH);
        new Wall (a1q3,2,3,Direction.WEST);
        new Wall(a1q3,1,3,Direction.WEST);
        new Wall(a1q3,1,3,Direction.NORTH);
        new Wall(a1q3,1,3,Direction.EAST);
        new Wall(a1q3,2,4,Direction.NORTH);
        new Wall(a1q3,2,4,Direction.EAST);
        new Wall(a1q3,3,4,Direction.EAST);
        //make robot move 
        jeff.move();
        jeff.pickThing();
        jeff.turnLeft();
        jeff.move();
        jeff.turnLeft();
        jeff.turnLeft();
        jeff.turnLeft();
        jeff.move();
        jeff.turnLeft();
        jeff.move();
        jeff.move();
        jeff.turnLeft();
        jeff.turnLeft();
        jeff.turnLeft();
        jeff.move();
        jeff.putThing();
        jeff.move();
        jeff.turnLeft();
        jeff.turnLeft();
        jeff.turnLeft();
        jeff.move();
        
        
        
        
        jeff.turnLeft();
        jeff.move();
        
    
        
       
        jeff.turnLeft();
        jeff.turnLeft();
        jeff.turnLeft();
        jeff.move();
        jeff.move();
        jeff.turnLeft();
        
  
        
    }   
}
