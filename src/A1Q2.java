
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City AM = new City();
        Robot Andrew = new Robot(AM,1,2,Direction.SOUTH);
        new Wall(AM,1,1,Direction.WEST);
        new Wall(AM,2,1,Direction.WEST);
        new Wall(AM,2,1,Direction.SOUTH);
        new Wall(AM,1,1,Direction.NORTH);
        new Wall(AM,1,2,Direction.NORTH);
        new Wall(AM,1,2,Direction.EAST);
        new Wall(AM,1,2,Direction.SOUTH);
        new Thing(AM,2,2);
        
       //Andrew.move();
        Andrew.turnLeft();
        Andrew.turnLeft();
        Andrew.turnLeft();
        Andrew.move();
        Andrew.turnLeft();
        Andrew.move();
        Andrew.turnLeft();
        Andrew.move();
        Andrew.pickThing();
        Andrew.turnLeft();
        Andrew.turnLeft();
        Andrew.move();
        Andrew.turnLeft();
        Andrew.turnLeft();
        Andrew.turnLeft();
        Andrew.move();
        Andrew.turnLeft();
        Andrew.turnLeft();
        Andrew.turnLeft();
        Andrew.move();
        Andrew.turnLeft();
        Andrew.turnLeft();
        Andrew.turnLeft();
        
    }
}
