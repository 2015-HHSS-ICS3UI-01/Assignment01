
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
 * @author malcr1272
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make City
        City kw = new City();
        
        //make robot
        Robot Karel = new Robot( kw, 1, 2, Direction.SOUTH);
        
        // Make Walls
        new Wall(kw,1,1,Direction.NORTH);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,1,2,Direction.NORTH);
        new Wall(kw,1,2,Direction.EAST);
        new Wall(kw,1,2,Direction.SOUTH);
        new Wall(kw,2,1,Direction.WEST);
        new Wall(kw,2,1,Direction.SOUTH);
        
        //Make new thing
        new Thing(kw,2,2);
                
        //make robot pick thing
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.move();
        Karel.pickThing();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.putThing();
        
    }
}
