
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pintm1551
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   City kw = new City();
   Robot bot1 = new Robot(kw, 3, 0, Direction.EAST);
   bot1.setColor(Color.BLACK);
   new Thing(kw, 3, 1);
   new Wall(kw,3,2, Direction.WEST);
   new Wall(kw,3,2, Direction.NORTH);
   new Wall(kw,2,3, Direction.WEST);
   new Wall(kw,1,3, Direction.WEST);
   new Wall(kw,1,3, Direction.NORTH);
   new Wall(kw,1,3, Direction.EAST);
   new Wall(kw,2,4, Direction.EAST);
   new Wall(kw,2,4, Direction.NORTH);
   new Wall(kw,3,4, Direction.EAST);
   bot1.move();
   bot1.pickThing();
   bot1.turnLeft();
   bot1.move();
   bot1.turnLeft();
   bot1.turnLeft();
   bot1.turnLeft();
   bot1.move();
   bot1.turnLeft();
   bot1.move();
   bot1.move();
   bot1.turnLeft();
   bot1.turnLeft();
   bot1.turnLeft();
   bot1.move();
   bot1.putThing();
   bot1.move(); 
   bot1.turnLeft();
   bot1.turnLeft();
   bot1.turnLeft();
   bot1.move(); 
   bot1.turnLeft();
   bot1.move();
   bot1.turnLeft();
   bot1.turnLeft();
   bot1.turnLeft();
   bot1.move();
   bot1.move(); 
   bot1.turnLeft(); 
    }
}
