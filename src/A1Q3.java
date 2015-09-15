
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        //Make a City for the Robot 
        City Lob= new City();
        
        //Make a Robot to live in the City
        Robot greg = new Robot(Lob, 3, 0, Direction.EAST);
         
        //Make a Thing
        new Thing (Lob, 3, 1);
       
        //Make a Wall
        new Wall (Lob, 3, 2, Direction.WEST);
        new Wall (Lob, 3, 2, Direction.NORTH);
        new Wall (Lob, 2, 3, Direction.WEST);
        new Wall (Lob, 1, 3, Direction.EAST);     
        new Wall (Lob, 1, 3, Direction.NORTH);
        new Wall (Lob, 1, 3, Direction.WEST);
        new Wall (Lob, 2, 4, Direction.NORTH);
        new Wall (Lob, 2, 4, Direction.EAST) ; 
        new Wall (Lob, 3, 4, Direction.EAST) ;
        
        greg.move();
        greg.pickThing();
        greg.turnLeft();
        greg.move();
        greg.turnLeft();
        greg.turnLeft();
        greg.turnLeft();
        greg.move();
        greg.turnLeft();
        greg.move();
        greg.move();
        greg.turnLeft();
        greg.turnLeft();
        greg.turnLeft();
        greg.move();
        greg.move();
        greg.turnLeft();
        greg.turnLeft();
        greg.turnLeft();
        greg.move();
        greg.turnLeft();
        greg.move();
        greg.turnLeft();
        greg.turnLeft();
        greg.turnLeft();
        greg.move();
        greg.move();
        greg.turnLeft();
        
        
        
        
        
     ;
    }
}
