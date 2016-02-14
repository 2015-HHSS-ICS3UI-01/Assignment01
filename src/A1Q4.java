
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Denis
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot denis = new Robot(Kitchener, 0, 0, Direction.WEST);
        Robot fineas = new Robot(Kitchener, 0, 1, Direction.EAST);
        
        new Wall (Kitchener, 0, 1, Direction.WEST);
        new Wall (Kitchener, 1, 1, Direction.WEST);
        new Wall (Kitchener, 1, 1, Direction.SOUTH);
        
        denis.move();
        denis.move();
        fineas.move();
        fineas.move();
        fineas.turnLeft();
        denis.turnLeft();
        fineas.move();
        fineas.turnLeft();
        fineas.turnLeft();
        fineas.turnLeft();
        fineas.move();
        fineas.turnLeft();
        fineas.turnLeft();
        denis.move();
        fineas.turnLeft();
        fineas.move();
    }  
}
