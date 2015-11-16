
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
 * @author ramli8368
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        new Wall(kw, 1, 2, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        
        new Thing(kw, 2, 2);
      
        Robot commando = new Robot(kw, 1, 2, Direction.SOUTH);
        
        commando.turnLeft();
        commando.turnLeft();
        commando.turnLeft();
        commando.move();
        commando.turnLeft();
        commando.move();
        commando.turnLeft();
        commando.move();
        commando.pickThing();
    }
}
