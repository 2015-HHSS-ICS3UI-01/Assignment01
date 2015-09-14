
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
 * @author mitrm7692
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Make a City
    City kw=new City();
    //Make walls
    new Wall(kw,1,3,Direction.NORTH);
    new Wall(kw,1,3,Direction.WEST);
    new Wall(kw,1,3,Direction.EAST);
    new Wall(kw,2,4,Direction.NORTH);
    new Wall(kw,2,3,Direction.WEST);
    new Wall(kw,3,2,Direction.NORTH);
    new Wall(kw,3,2,Direction.WEST);
    new Wall(kw,2,4,Direction.EAST);
    new Wall(kw,3,4,Direction.EAST);
    //Make a Thing
    new Thing(kw,3,1);
    //Make a Robot
    Robot Don=new Robot(kw,3,0,Direction.EAST);
    Don.move();
    Don.pickThing();
    Don.turnLeft();
    Don.move();
    Don.turnLeft();
    Don.turnLeft();
    Don.turnLeft();
    Don.move();
    Don.turnLeft();
    Don.move();
    Don.move();
    Don.turnLeft();
    Don.turnLeft();
    Don.turnLeft();
    Don.move();
    Don.putThing();
    Don.move();
    Don.turnLeft();
    Don.turnLeft();
    Don.turnLeft();
    Don.move();
    Don.turnLeft();
    Don.move();
    Don.turnLeft();
    Don.turnLeft();
    Don.turnLeft();
    Don.move();
    Don.move();
    Don.turnLeft();
    }
}
