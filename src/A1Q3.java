
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make City for Robot to live in
        City kw = new City();
        
        //Make Walls
        new Wall(kw, 1, 3, Direction.WEST);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 2, 3, Direction.WEST);
        new Wall(kw, 3, 2, Direction.NORTH);
        new Wall(kw, 3, 2, Direction.WEST);
        
        //new Thing
        new Thing(kw, 3, 1);
        
        //Make a robot
        Robot josh = new Robot(kw, 3, 0, Direction.NORTH);
        josh.turnLeft();
        josh.turnLeft();
        josh.turnLeft();
        
        josh.move();
        josh.pickThing();
        josh.turnLeft();
     
        josh.move();
        josh.turnLeft();
        josh.turnLeft();
        josh.turnLeft();
        josh.move();
        josh.turnLeft();
        josh.move();
        josh.move();
        josh.turnLeft();
        josh.turnLeft();
        josh.turnLeft();
        josh.move();
        josh.putThing();
        josh.move();
        josh.turnLeft();
        josh.turnLeft();
        josh.turnLeft();
        josh.move();
        josh.turnLeft();
        josh.move();
        josh.turnLeft();
        josh.turnLeft();
        josh.turnLeft();
        josh.move();
        josh.move();
        
        
    }
}
