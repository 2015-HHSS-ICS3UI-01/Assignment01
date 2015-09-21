
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
 * @author vickj2854
 */
public class A1G4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // make city
        City kw = new City();
        // make walls
        new Wall(kw, 0,1, Direction.WEST);
        new Wall(kw, 1,1, Direction.WEST);
        new Wall(kw, 1,1, Direction.SOUTH);
        // make robots 
        Robot karel = new Robot(kw, 0,0, Direction.SOUTH);
        Robot jim = new Robot(kw, 0,1, Direction.SOUTH);
      // move karel and jim the robot
      karel.move();
      jim.move();
      karel.move();
      jim.turnLeft();
      karel.move();
      jim.move();
      karel.turnLeft();
      jim.turnLeft();
      jim.turnLeft();
      jim.turnLeft();
      karel.move();
      jim.move();
      karel.turnLeft();
      jim.turnLeft();
      jim.turnLeft();
      jim.turnLeft();
      jim.move();
      karel.move();

      

      
      
      
      
     
      
    }
}
