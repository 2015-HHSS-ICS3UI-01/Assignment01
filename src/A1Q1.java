
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
 * @author howen2217
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City waterloo = new City();
        new Wall(waterloo, 1, 1, Direction.NORTH);
        new Wall(waterloo, 1, 1, Direction.WEST);
        new Wall(waterloo, 1, 2, Direction.NORTH);
        new Wall(waterloo, 1, 2, Direction.EAST);
        new Wall(waterloo, 2, 1, Direction.WEST);
        new Wall(waterloo, 2, 1, Direction.SOUTH);
        new Wall(waterloo, 2, 2, Direction.SOUTH);
        new Wall(waterloo, 2, 2, Direction.EAST);
        
        Robot dave
                = new Robot(waterloo, 0, 2, Direction.WEST);
        
        dave.move();
        dave.move();
        dave.turnLeft();
        dave.move();
        dave.move();
        dave.move();
        dave.turnLeft();
        dave.move();
        dave.move();
        dave.move();
        dave.turnLeft();
        dave.move();
        dave.move();
        dave.move();
        dave.turnLeft();
        dave.move();
        
        
        int count = 0;
        while(count < 3){
            dave.turnLeft();
            count = count + 1;
        }
    }
}
