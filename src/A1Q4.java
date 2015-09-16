
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import becker.robots.City;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author fitws6356
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        City kw = new City();
      
    //make a robot to live in the city
    Robot kar = new Robot (kw, 0, 0, Direction.SOUTH);
      new Wall(kw, 0, 1, Direction.WEST);
      new Wall(kw, 1, 1, Direction.WEST);
      new Wall(kw, 1, 1, Direction.SOUTH);
      Robot jab = new Robot (kw, 0, 1, Direction.SOUTH);
    kar.move();
    jab.move();
    jab.turnLeft();
    kar.move();
    jab.move();
    jab.turnLeft();
    jab.turnLeft();
    jab.turnLeft();
    kar.turnLeft();
    jab.move();
    jab.turnLeft();
    jab.turnLeft();
    jab.turnLeft();
    kar.move();
    jab.move();
    
    
    
    }
}
    
