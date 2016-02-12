
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
 * @author maxia2242
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City AM = new City();
        Robot Andrew = new Robot(AM,3,0,Direction.EAST);
        new Wall(AM,3,2,Direction.WEST);
        new Wall(AM,3,2,Direction.NORTH);
        new Wall(AM,2,3,Direction.WEST);
        new Wall(AM,1,3,Direction.WEST);
        new Wall(AM,1,3,Direction.NORTH);
        new Wall(AM,1,3,Direction.EAST);
        new Wall(AM,2,4,Direction.NORTH);
        new Wall(AM,2,4,Direction.EAST);
        new Wall(AM,3,4,Direction.EAST);
        
        new Thing(AM,3,1);
        
        Andrew.move();
        Andrew.pickThing();
        Andrew.turnLeft();
        Andrew.move();
        Andrew.turnLeft();
        Andrew.turnLeft();
        Andrew.turnLeft();
        Andrew.move();
        Andrew.turnLeft();
        Andrew.move();
        Andrew.move();
        Andrew.turnLeft();
        Andrew.turnLeft();
        Andrew.turnLeft();
        Andrew.move();
        Andrew.putThing();
        Andrew.move();
        Andrew.turnLeft();
        Andrew.turnLeft();
        Andrew.turnLeft();
        Andrew.move();
        Andrew.turnLeft();
        Andrew.move();
        Andrew.turnLeft();
        Andrew.turnLeft();
        Andrew.turnLeft();
        Andrew.move();
        Andrew.move();
        Andrew.turnLeft();
        
        
        
        
        
        
    }
}
