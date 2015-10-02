
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
public class a1q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
       City a1q4= new City();
       //make robots 
       Robot jeff= new Robot(a1q4,0,0,Direction.SOUTH);
       Robot lali= new Robot (a1q4,0,1,Direction.SOUTH);
       //make walls 
       new Wall(a1q4,0,1,Direction.WEST);
       new Wall(a1q4,1,1,Direction.WEST);
       new Wall(a1q4,1,1,Direction.SOUTH);
       
       //make robots move 
       lali.move();
       lali.turnLeft();
       lali.move();
       lali.turnLeft();
       lali.turnLeft();
       lali.turnLeft();
       
       jeff.move();
       jeff.move();
       
       lali.move();
       
      jeff.turnLeft();
      
      lali.turnLeft();
      lali.turnLeft();
      lali.turnLeft();
      lali.move();
      
      jeff.move();
      
       
               
              
    }
}
