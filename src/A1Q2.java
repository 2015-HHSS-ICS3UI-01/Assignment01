
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City kw = new City();
   Robot bot1 = new Robot(kw, 1, 2, Direction.SOUTH);
   bot1.setColor(Color.BLACK);
   new Wall(kw,1,1, Direction.NORTH);
   new Wall(kw,1,2, Direction.NORTH);
   new Wall(kw,1,2, Direction.EAST);
   new Wall(kw,1,2, Direction.SOUTH);
   new Wall(kw,2,1, Direction.SOUTH);
   new Wall(kw,2,1, Direction.WEST);
   new Wall(kw,1,1, Direction.WEST);
   new Thing(kw,2,2);
   bot1.turnLeft();
   bot1.turnLeft(); 
   bot1.turnLeft();
   bot1.move();
   bot1.turnLeft();
   bot1.move();
   bot1.turnLeft();
   bot1.move();
   bot1.pickThing();
   bot1.turnLeft();
   bot1.turnLeft();
   bot1.move();
   bot1.turnLeft();
   bot1.turnLeft(); 
   bot1.turnLeft();
   bot1.move();
   bot1.turnLeft();
   bot1.turnLeft(); 
   bot1.turnLeft();
   bot1.move();
   bot1.turnLeft(); 
   bot1.turnLeft();
    }
}
