
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
public class a1q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city 
         City a1q5= new City();
         //make robots 
         Robot jeff= new Robot(a1q5,0,1,Direction.WEST);
         Robot lali= new Robot(a1q5,3,3,Direction.EAST);
         new Thing(a1q5,0,0);
         new Thing(a1q5,1,0);
         new Thing(a1q5,1,1);
         new Thing(a1q5,1,2);
         new Thing(a1q5,2,2);
         new Wall (a1q5,2,3,Direction.WEST);
         new Wall(a1q5,2,3,Direction.NORTH);
         new Wall(a1q5,2,3,Direction.EAST);
         new Wall(a1q5,3,3,Direction.EAST);
         new Wall(a1q5,3,3,Direction.SOUTH);
         
         //make labels for robots 
         jeff.setLabel("J");
          lali.setLabel("L");
         //make robots move 
          
         jeff.move();
         jeff.pickThing();
         jeff.turnLeft();
         jeff.move();
         jeff.pickThing();
        
         
         lali.turnLeft();
         lali.turnLeft();
         lali.move();
         lali.turnLeft();
         lali.turnLeft();
         lali.turnLeft();
         lali.move();
         lali.pickThing();
         lali.move();
         lali.pickThing();
         
         jeff.turnLeft();
         jeff.move();
         jeff.pickThing();
         
         lali.turnLeft();
         
          
       
        
         
    }
}
