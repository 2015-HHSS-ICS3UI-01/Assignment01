
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
 * @author agott2059
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City thomas = new City() ;
        
        new Wall (thomas,2,1 , Direction.SOUTH);
        new Wall (thomas,2,1 , Direction.WEST) ;
        new Wall (thomas,1,1 , Direction.WEST);
        new Wall (thomas,2,1 , Direction.WEST);
        new Wall (thomas,1,1 , Direction.NORTH);
        new Wall (thomas,1,2 , Direction.NORTH);
        new Wall (thomas,1,2 , Direction.EAST);
        new Wall (thomas,1,2 , Direction.SOUTH);
        
        new Thing (thomas, 2,2 );
        
        Robot jack = new Robot (thomas, 1,2, Direction.SOUTH);
        
        jack.turnLeft();
        jack.turnLeft();
        jack.turnLeft();
        jack.move();
        jack.turnLeft();
        jack.move();
        jack.turnLeft();
        jack.move();
        jack.pickThing();
        jack.turnLeft();
        jack.turnLeft();
        jack.move();
        jack.turnLeft();
        jack.turnLeft();
        jack.turnLeft();
        jack.move();
        jack.turnLeft();
        jack.turnLeft();
        jack.turnLeft();
        jack.move();
        jack.turnLeft();
        jack.turnLeft();
        jack.turnLeft();
        
        
    }
}       
        
