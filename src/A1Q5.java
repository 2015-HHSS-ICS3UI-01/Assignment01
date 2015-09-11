
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
 * @author sevcm7279
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City prague = new City();
        
        new Wall (prague, 2, 3, Direction. WEST);
        new Wall (prague, 2, 3, Direction.NORTH);
        new Wall (prague, 2, 3, Direction. EAST);
        new Wall (prague, 3, 3, Direction. EAST);
        new Wall (prague, 3, 3, Direction. SOUTH);
        
        new Thing (prague, 0, 0);
        new Thing (prague, 1, 0);
        new Thing (prague, 1, 1);
        new Thing (prague, 1, 2);
        new Thing (prague, 2, 2);
        
        Robot m = new Robot (prague, 0, 1, Direction. WEST);
        
        Robot k = new Robot (prague, 3, 3, Direction. EAST);
        
        m.setLabel("M");
        
        k.setLabel ("K");
        
        k.turnLeft();
        k.turnLeft();
        m.move();
        k.move();
        m.pickThing();
        k.turnLeft();
        k.turnLeft();
        k.turnLeft();
        m.turnLeft();
        m.move();
        k.move();
        m.pickThing();
        k.pickThing();
        m.turnLeft();
        k.move();
        m.move();
        k.pickThing();
        m.pickThing();
        k.turnLeft();
                
                
    }
}
