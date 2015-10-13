
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agott2059
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City thomas = new City() ;
        
        
        new Wall (thomas,1,1 , Direction.WEST);
        new Wall (thomas,1,1 , Direction.NORTH);
        new Wall (thomas,1,2 , Direction.NORTH);
        new Wall (thomas,1,2 , Direction.EAST);
        new Wall (thomas,2,2 , Direction.EAST);
        new Wall (thomas,2,2 , Direction.SOUTH);
        new Wall (thomas,2,1 , Direction.SOUTH);
        new Wall (thomas,2,1 , Direction.WEST);
        
        Robot john = new Robot (thomas, 0,2, Direction.WEST);
                
        john.move();
        john.move();
        john.turnLeft();
        john.move();
        john.move();
        john.move();
        john.turnLeft();
        john.move();
        john.move();
        john.move();
        john.turnLeft();
        john.move();
        john.move();
        john.move();
        john.turnLeft();
        john.move();
    }
}
