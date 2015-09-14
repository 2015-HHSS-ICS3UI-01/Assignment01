
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //make city
    City kw = new City();
    
    //Make walls
    new Wall (kw, 2,3,Direction.NORTH);
    new Wall (kw, 2,3,Direction.WEST);
    new Wall (kw, 2,3,Direction.EAST);
    new Wall (kw, 3,3,Direction.SOUTH);
    new Wall (kw, 3,3,Direction.EAST);
    
    //make robots
    Robot karel = new Robot(kw, 0,1, Direction.WEST);
    Robot carl =  new Robot(kw,3,3, Direction.EAST); 
    
    //make things
    new Thing (kw,0,0);
    new Thing (kw,1,0);
    new Thing (kw,1,1);
    new Thing (kw,1,2);
    new Thing (kw,2,2);
    
    //make labels
    karel.setLabel("M");
    carl.setLabel("K");
    
    //make robots move
    karel.move();
    karel.pickThing();
    carl.turnLeft();
    carl.turnLeft();    
    carl.move();
    karel.turnLeft();
    karel.move();
    karel.pickThing();
    carl.turnLeft();
    carl.turnLeft();
    carl.turnLeft();
    carl.move();
    carl.pickThing();
    karel.turnLeft();
    karel.move();
    karel.pickThing();
    carl.move();
    carl.pickThing();
    carl.turnLeft();
    }
}
