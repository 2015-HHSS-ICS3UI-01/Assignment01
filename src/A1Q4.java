
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
 * @author moore3607
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        
        new Wall(kw,0,1,Direction.WEST);
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,1,1,Direction.SOUTH);
        
        Robot MetalGuy = new Robot(kw,0,0,Direction.SOUTH);
        Robot Kyler = new Robot(kw,0,1,Direction.SOUTH);
        
        MetalGuy.move();
        MetalGuy.move();
        MetalGuy.turnLeft();
        MetalGuy.move();
        
        Kyler.move();
        Kyler.turnLeft();
        Kyler.move();
        Kyler.turnLeft();
        Kyler.turnLeft();
        Kyler.turnLeft();
        Kyler.move();
        Kyler.turnLeft();
        Kyler.turnLeft();
        Kyler.turnLeft();
        Kyler.move();
        
    }
}
