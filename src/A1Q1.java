
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
 * @author ramli8368
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
      new Wall(kw, 3, 4, Direction.EAST);
      new Wall(kw, 2, 4, Direction.EAST);
      new Wall(kw, 2, 4, Direction.NORTH);
      new Wall(kw, 2, 3, Direction.NORTH);
      new Wall(kw, 2, 3, Direction.WEST);
      new Wall(kw, 3, 3, Direction.WEST);
      new Wall(kw, 3, 3, Direction.SOUTH);
      new Wall(kw, 3, 4, Direction.SOUTH);
      
      new Thing(kw, 3, 5);
      
      Robot commando = new Robot(kw, 3, 5, Direction.NORTH);
      
      commando.pickThing();
      commando.move();
      commando.move();
      commando.turnLeft();
      commando.move();
      commando.move();
      commando.move();
      commando.turnLeft();
      commando.move();
      commando.move();
      commando.move();
      commando.turnLeft();
      commando.move();
      commando.move();
      commando.move();
      commando.turnLeft();
      commando.move();
      commando.putThing();
    }
}
