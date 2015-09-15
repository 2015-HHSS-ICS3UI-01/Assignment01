
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
 * @author duttr4019
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a city for the robots to live in.
        City gotham = new City();
     
        //Make robots to live in the city.
        
        Robot karel = new Robot (gotham, 3, 3, Direction.EAST);
        Robot maria = new Robot (gotham, 0, 1, Direction.WEST);
        
       //Label the robots.
       karel.setLabel("K");
       maria.setLabel("M");
       
       //Make karel's home.
       new Wall (gotham, 2, 3, Direction.EAST);
       new Wall (gotham, 2, 3, Direction.NORTH);  
       new Wall (gotham, 2, 3, Direction.WEST);
       new Wall (gotham, 3, 3, Direction.EAST);
       new Wall (gotham, 3, 3, Direction.SOUTH);
       
       //Put items Karl has dropped.
       new Thing (gotham, 0, 0);
       new Thing (gotham, 1, 0);
       new Thing (gotham, 1, 1);
       new Thing (gotham, 1, 2);
       new Thing (gotham, 2, 2);
       
       //Have maria and karel pick up the dropped items.
       maria.move();
       maria.pickThing();
       karel.turnLeft();
       karel.turnLeft();
       maria.turnLeft();
       karel.move();
       maria.move();
       maria.pickThing();
       karel.turnLeft();
       karel.turnLeft();
       karel.turnLeft();
       maria.turnLeft();
       karel.move();
       karel.pickThing();
       karel.move();
       karel.pickThing();
       maria.move();
       maria.pickThing();
       karel.turnLeft();
       
               
     
       
    }
}
