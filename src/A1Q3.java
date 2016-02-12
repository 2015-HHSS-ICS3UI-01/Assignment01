
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
 * @author howen2217
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Guelph = new City();
        
        Robot zoran = new Robot(Guelph, 3, 0, Direction.EAST);
        
        new Thing(Guelph, 3, 1);
        
        new Wall(Guelph, 1, 3, Direction.NORTH); 
        new Wall(Guelph, 1, 3, Direction.WEST);
        new Wall(Guelph, 1, 3, Direction.EAST);
        new Wall(Guelph, 2, 3, Direction.WEST);
        new Wall(Guelph, 3, 2, Direction.NORTH);
        new Wall(Guelph, 1, 3, Direction.WEST);
        new Wall(Guelph, 3, 2, Direction.WEST);
        new Wall(Guelph, 2, 4, Direction.NORTH);
        new Wall(Guelph, 2, 4, Direction.EAST);
        new Wall(Guelph, 3, 4, Direction.EAST);
        
        zoran.move();
        zoran.pickThing();
        zoran.turnLeft();
        zoran.move();
        zoran.turnLeft();
        zoran.turnLeft();
        zoran.turnLeft();
        zoran.move();
        zoran.turnLeft();
        zoran.move();
        zoran.move();
        zoran.turnLeft();
        zoran.turnLeft();
        zoran.turnLeft();
        zoran.move();
        zoran.putThing();
        zoran.move();
        zoran.turnLeft();
        zoran.turnLeft();
        zoran.turnLeft();
        zoran.move();
        zoran.turnLeft();
        zoran.move();
        zoran.turnLeft();
        zoran.turnLeft();
        zoran.turnLeft();
        zoran.move();
        zoran.move();
        zoran.turnLeft();
    }
}
