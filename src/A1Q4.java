
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
 * @author ramli8368
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City kw = new City();
        
        new Wall(kw, 0, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.SOUTH);
        
        
        
        Robot commando = new Robot(kw, 0, 0, Direction.SOUTH);
        Robot weathers = new Robot(kw, 0, 1, Direction.SOUTH);
        
        commando.move();
        weathers.move();
        commando.move();
        weathers.turnLeft();
        weathers.move();
        commando.turnLeft();
        weathers.turnLeft();
        weathers.turnLeft();
        weathers.turnLeft();
        weathers.move();
        weathers.turnLeft();
        weathers.turnLeft();
        weathers.turnLeft();
        commando.move();
        weathers.move();



        
        // TODO code application logic here
    }
}
