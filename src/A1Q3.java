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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
   City kw = new City ();
    
     Robot tina=
                new Robot (kw, 3, 1, Direction.EAST);
        
     new Thing(kw,3,2);
  
     new Wall(kw,3,3, Direction.WEST);
     new Wall(kw,3,3, Direction.NORTH);
     new Wall(kw,2,4, Direction.WEST);
     new Wall(kw,1,4, Direction.WEST);
     new Wall(kw,1,4, Direction.NORTH);
     new Wall(kw,1,4, Direction.EAST);
     new Wall(kw,2,5, Direction.NORTH);
     new Wall(kw,2,5, Direction.EAST);
     new Wall(kw,3,5, Direction.EAST);
     
     
     tina.move();
     tina.pickThing();
     tina.turnLeft();
     tina.move();
     tina.turnLeft();
     tina.turnLeft();
     tina.turnLeft();
     tina.move();
     tina.turnLeft();
     tina.move();
     tina.move();
     tina.turnLeft();
     tina.turnLeft();
     tina.turnLeft();
     tina.move();
     tina.putThing();
     tina.move();
     tina.turnLeft();
     tina.turnLeft();
     tina.turnLeft();
     tina.move();
     tina.turnLeft();
     tina.move();
     tina.turnLeft();
     tina.turnLeft();
     tina.turnLeft();
     tina.move();
     tina.move();
    
    
    }
}
