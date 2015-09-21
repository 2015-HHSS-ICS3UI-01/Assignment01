
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
 * @author fitws6356
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
      
    //make a robot to live in the city
    Robot kar = new Robot (kw, 1, 2, Direction.WEST);
      new Wall(kw, 3, 1, Direction.WEST);
      new Wall(kw, 2, 1, Direction.WEST);
      new Wall(kw, 2, 1, Direction.NORTH);
      new Wall(kw, 2, 2, Direction.NORTH);
      new Wall(kw, 2, 2, Direction.EAST);
      new Wall(kw, 3, 2, Direction.EAST);
      new Wall(kw, 3, 2, Direction.SOUTH);
      new Wall(kw, 3, 1, Direction.SOUTH);
       kar.move();
      kar.move();
      kar.turnLeft();
      kar.move();
      kar.move();
      kar.move();
      kar.turnLeft();
      kar.move();
      kar.move();
      kar.move();
      kar.turnLeft();
      kar.move();
      kar.move();
      kar.move();
      kar.turnLeft();
      kar.move();
      
       
    }
}
