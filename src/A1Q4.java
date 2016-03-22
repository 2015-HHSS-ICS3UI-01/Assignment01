
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
 * @author skibe1366
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            City kw = new City();
        
        Robot karel = new Robot(kw,0,0, Direction.SOUTH);
        
        Robot Steve = new Robot(kw,0,1, Direction.SOUTH);
        
        new Wall(kw,0,1, Direction.WEST);
        new Wall(kw,1,1, Direction.WEST);
        new Wall(kw,1,1, Direction.SOUTH);

        
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        
        Steve.move();
        Steve.turnLeft();
        Steve.move();
        Steve.turnLeft();
        Steve.turnLeft();
        Steve.turnLeft();
        Steve.move();
        Steve.turnLeft();
        Steve.turnLeft();
        Steve.turnLeft();
        Steve.move();

        
        
    }
}
