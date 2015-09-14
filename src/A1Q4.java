
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
 * @author whitb0039
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //make new city
        City kw = new City();
        
        //make new robot karel
        Robot karel = new Robot(kw, 0, 0, Direction.SOUTH);
        
        //make new robot steve
        Robot steve = new Robot(kw, 0, 1, Direction.SOUTH);
        
        new Wall (kw, 0, 1, Direction.WEST);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 1, 1, Direction.SOUTH);
        
        karel.move();
        steve.move();
        steve.turnLeft();
        karel.move();
        karel.turnLeft();
        steve.move();
        steve.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        steve.move();
        steve.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        steve.move();
        karel.move();
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
