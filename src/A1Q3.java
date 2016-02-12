
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
 * @author godie2014
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   City kw= new City();
   new Wall (kw,3,2,Direction.WEST);
   new Wall (kw,3,2,Direction.NORTH);
   new Wall (kw,2,3,Direction.WEST);
   new Wall (kw,1,3,Direction.WEST);
   new Wall (kw,1,3,Direction.NORTH);
   new Wall (kw,1,3,Direction.EAST);
   new Wall (kw,2,4,Direction.NORTH);
   new Wall (kw,2,4,Direction.EAST);
   new Wall (kw,3,4,Direction.EAST);
   Robot karel=new Robot (kw,3,0,Direction.EAST);
   new Thing (kw,3,1);
  karel.move();
  karel.pickThing();
  karel.turnLeft();
  karel.move();
  karel.turnLeft();
  karel.turnLeft();
  karel.turnLeft();
  karel.move();
  karel.turnLeft();
  karel.move();
  karel.move();
  karel.turnLeft();
  karel.turnLeft();
  karel.turnLeft();
  karel.move();
  karel.putThing();
  karel.move();
  karel.turnLeft();
  karel.turnLeft();
  karel.turnLeft();
  karel.move();
  karel.turnLeft();
  karel.move();
  karel.turnLeft();
  karel.turnLeft();
  karel.turnLeft();
  karel.move();
  karel.move();
  karel.turnLeft();
  
   
  
  
  
   
   
    }
}
