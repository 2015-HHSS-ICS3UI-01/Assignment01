
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
 * @author moraj0721
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make a City for the Robot
        City Lob= new City();
        
         //Make a Robot to live in the City
         Robot karel = new Robot(Lob, 0, 1, Direction.WEST);
         Robot maria = new Robot(Lob, 3, 3, Direction.EAST);
         
         //Make a Wall
         new Wall (Lob, 3, 3, Direction.SOUTH);
         new Wall (Lob, 3, 3, Direction.EAST);
         new Wall (Lob, 2, 3, Direction.EAST);
         new Wall (Lob, 2, 3, Direction.NORTH);
         new Wall (Lob, 2, 3, Direction.WEST);
         
         //Make a Thing
         new Thing (Lob, 0, 0);
         new Thing (Lob, 1, 0);
         new Thing (Lob, 1, 1);
         new Thing (Lob, 1, 2);
         new Thing (Lob, 2, 2);
         
         karel.setLabel("k");
         maria.setLabel("m");
         
         karel.move();
         karel.pickThing();
         maria.turnLeft();
         maria.turnLeft();
         maria.move();
         karel.turnLeft();
         maria.turnLeft();
         maria.turnLeft();
         maria.turnLeft();
         karel.move();
         maria.move();
         karel.pickThing();
         maria.pickThing();
         maria.move();
         maria.pickThing();
         karel.turnLeft();
         maria.turnLeft();
         karel.move();
         karel.pickThing();
         
         
         
         
                 
    }
}
