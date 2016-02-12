
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      City kw=new City ();
       new Thing (kw,0,0);
       new Thing (kw,1,0);
       new Thing (kw,1,2);
        new Thing (kw,1,1);
         new Thing (kw,2,2);
         Robot maria= new Robot(kw,0,1,Direction.WEST);
         maria.setLabel("M");
         new Wall (kw,2,3,Direction.WEST);
           new Wall (kw,2,3,Direction.NORTH);
             new Wall (kw,2,3,Direction.EAST);
               new Wall (kw,3,3,Direction.EAST);
                 new Wall (kw,3,3,Direction.SOUTH);
                Robot karel= new Robot(kw,3,3,Direction.EAST);
                karel.setLabel("K");
                maria.move();
                maria.pickThing();
                maria.turnLeft();
                maria.move();
                maria.pickThing();
                karel.turnLeft();
                karel.turnLeft();
                karel.move();
               maria.turnLeft();
            
               karel.turnLeft();
               karel.turnLeft();
               karel.turnLeft();
               karel.move();
               karel.pickThing();
               karel.move();
               karel.pickThing();
               karel.turnLeft();
                  maria.move();
               maria.pickThing();
                
               
         
         
        
    }
}
