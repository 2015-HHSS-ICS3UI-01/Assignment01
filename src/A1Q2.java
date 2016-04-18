/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author singk4158
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     City kw = new City ();
    
     Robot tina=
                new Robot (kw, 2, 3, Direction.SOUTH);
     
     new Wall(kw,2,3, Direction.EAST);
     new Wall(kw,2,3, Direction.NORTH);
     new Wall(kw,2,2, Direction.NORTH);
     new Wall(kw,2,2, Direction.WEST);
     new Wall(kw,3,2, Direction.WEST);
     new Wall(kw,3,2, Direction.SOUTH);
     new Wall(kw,2,3, Direction.SOUTH);
    
     new Thing(kw,3,3);
     
     tina.turnLeft();
     tina.turnLeft();
     tina.turnLeft();
     tina.move();
     tina.turnLeft();
     tina.move();
     tina.turnLeft();
     tina.move();
     tina.pickThing();
     tina.turnLeft();
     tina.turnLeft();
     tina.move();
     tina.turnLeft();
     tina.turnLeft();
     tina.turnLeft();
     tina.move();
     tina.turnLeft();
     tina.turnLeft();
     tina.turnLeft();
     tina.move();
     tina.turnLeft();
     tina.turnLeft();
     tina.turnLeft();
     
     
    
    
    }
    
  
}
