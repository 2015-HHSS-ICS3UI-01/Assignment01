
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
 * @author pearr2740
 */
public class A1Q1 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       City KW = new City();
       Robot karel = new Robot(KW,0,2,Direction.WEST);
     
       new Wall(KW, 1, 1, Direction.WEST);
       new Wall(KW, 2, 1, Direction.WEST);
       new Wall(KW, 2, 2, Direction.SOUTH);
       new Wall(KW, 2, 1, Direction.SOUTH);
       new Wall(KW, 2, 2, Direction.EAST);
       new Wall(KW, 1, 2, Direction.EAST);
       new Wall(KW, 1, 1, Direction.NORTH);
       new Wall(KW, 1, 2, Direction.NORTH);
       
      
       
        
    }
       
}

 
