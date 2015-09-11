
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
 * @author pircn0556
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city for Robot
        City kw = new City();
        
        //Make walls for city
        new Wall(kw,1,1, Direction.NORTH);
        new Wall(kw,1,2, Direction.NORTH);
        new Wall(kw,1,2, Direction.EAST);
        new Wall(kw,1,2, Direction.SOUTH);
        new Wall(kw,1,1, Direction.WEST);
        new Wall(kw,2,1, Direction.WEST);
        new Wall(kw,2,1, Direction.SOUTH);
        
        //Make a thing
        new Thing(kw,2,2, Direction.EAST);
        
        //Make robot for city
        Robot MrRoboto = new Robot(kw,1,2, Direction.WEST);
        MrRoboto.move();
        MrRoboto.turnLeft();
        MrRoboto.move();
        MrRoboto.turnLeft();
        MrRoboto.move();
        MrRoboto.pickThing();
        MrRoboto.turnLeft();
        MrRoboto.turnLeft();
        MrRoboto.move();
        MrRoboto.turnLeft();
        MrRoboto.turnLeft();
        MrRoboto.turnLeft();
        MrRoboto.move();
        MrRoboto.turnLeft();
        MrRoboto.turnLeft();
        MrRoboto.turnLeft();
        MrRoboto.move();
        MrRoboto.turnLeft();
        MrRoboto.turnLeft();
        MrRoboto.putThing();
        
        
        
        
    }
}
