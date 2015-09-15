
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
 * @author alled7036
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make City
        City kw = new City();
        
       // Make Wall
         new Wall(kw, 2, 3, Direction.EAST);
         new Wall(kw, 3, 3, Direction.EAST);
         new Wall(kw, 2, 3, Direction.WEST);
         new Wall(kw, 2, 3, Direction.NORTH);
         new Wall(kw, 3, 3, Direction.SOUTH);
         
         //Make Thing
         new Thing(kw, 1, 2);
         new Thing(kw, 0, 0);
         new Thing(kw, 1, 0);
         new Thing(kw, 1, 1);
         new Thing(kw, 2, 2);
         
        //Make Robots
       Robot josh = new Robot(kw, 3, 3, Direction.WEST);
       josh.setLabel("k");
       Robot jake = new Robot(kw, 0, 1, Direction.WEST);
       jake.setLabel("m");
       
       jake.move();
       jake.pickThing();
       jake.turnLeft();
       jake.move();
       jake.pickThing();
       jake.turnLeft();
       jake.move();
       jake.pickThing();
       josh.move();
       josh.turnLeft();
       josh.turnLeft();
       josh.turnLeft();
       josh.move();
       josh.pickThing();
       josh.move();
       josh.pickThing();
       josh.turnLeft();
       
       
              
       
    }        
 }