
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
 * @author fitws6356
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();

// make a robot to live in the city   
        Robot man = new Robot(kw, 3, 3, Direction.WEST);
         new Wall (kw, 2, 3, Direction.NORTH);
        new Wall (kw, 2, 3, Direction.EAST);
        new Wall (kw, 2, 3, Direction.WEST);
        new Wall (kw, 3, 3, Direction.EAST);
        new Wall (kw, 3, 3, Direction.SOUTH);
        new Thing (kw, 2, 2);
        new Thing (kw, 1, 2);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 0);
        new Thing (kw, 0, 0);
        Robot gza = new Robot (kw, 0, 1, Direction.WEST);
        man.move();
        gza.move();
        man.turnLeft();
        gza.pickThing();
        man.turnLeft();
        gza.turnLeft();
        man.turnLeft();
        gza.move();
        man.move();
        gza.pickThing();
        gza.turnLeft();
        man.pickThing();
        man.move();
        man.turnLeft();
        gza.move();
        man.pickThing();
        gza.pickThing();
    }
}
        
        

        
        