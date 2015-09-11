
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alled7036
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //City For Robot to live in
        City kw = new City();
        
        //Make Walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        
        //Make Robot to live in City
        Robot josh = new Robot(kw, 1, 2, Direction.NORTH);
        josh.turnLeft();
        josh.move();
        josh.turnLeft();
        josh.move();
        josh.turnLeft();
        josh.move();
        josh.move();
        
      
        
      
    }
}
