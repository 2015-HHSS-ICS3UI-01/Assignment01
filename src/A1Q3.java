
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a city
        City kw = new City();
        
        //Make walls in city
        new Wall(kw,3,2,Direction.WEST);
        new Wall(kw,3,2,Direction.NORTH);
        new Wall(kw,2,3,Direction.WEST);
        new Wall(kw,1,3,Direction.NORTH);
        new Wall(kw,1,3,Direction.WEST);
        new Wall(kw,1,3,Direction.EAST);
        new Wall(kw,2,4,Direction.NORTH);
        new Wall(kw,2,4,Direction.EAST);
        new Wall(kw,3,4,Direction.EAST);
        
        //Make 'flag'(Thing)
        new Thing(kw,3,1,Direction.NORTH);
        
        //Make Robot
        Robot Viktor = new Robot(kw,3,0,Direction.EAST);
        Viktor.move();
        Viktor.pickThing();
        Viktor.turnLeft();
        Viktor.move();
        Viktor.turnLeft();
        Viktor.turnLeft();
        Viktor.turnLeft();
        Viktor.move();
        Viktor.turnLeft();
        Viktor.move();
        Viktor.move();
        Viktor.turnLeft();
        Viktor.turnLeft();
        Viktor.turnLeft();
        Viktor.move();
        Viktor.putThing();
        Viktor.move();
        Viktor.turnLeft();
        Viktor.turnLeft();
        Viktor.turnLeft();
        Viktor.move();
        Viktor.turnLeft();
        Viktor.move();
        Viktor.turnLeft();
        Viktor.turnLeft();
        Viktor.turnLeft();
        Viktor.move();
        Viktor.move();
        Viktor.turnLeft();
        
    }
}
