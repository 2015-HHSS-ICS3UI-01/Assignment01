
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
 * @author alled7036
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create City
        City kw = new City();
        
        
       //Make Walls
        new Wall(kw, 0, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.SOUTH);
        
        //New Robot
        
       Robot josh = new Robot(kw, 0, 0, Direction.SOUTH);
       Robot jake = new Robot(kw, 0, 1, Direction.SOUTH);
       josh.move();
       josh.move();
       josh.turnLeft();
       josh.move();
       jake.move();
       jake.turnLeft();
       jake.move();
       jake.turnLeft();
       jake.turnLeft();
       jake.turnLeft();
       jake.move();
       jake.turnLeft();
       jake.turnLeft();
       jake.turnLeft();
       jake.move();
      
       
       
       
               
               
         
      
       
       
    }
}
