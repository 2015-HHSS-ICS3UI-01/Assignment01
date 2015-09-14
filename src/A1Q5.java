
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        City kw = new City();
        
        new Thing(kw, 2, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 0);
        new Thing(kw, 0, 0);
        
        new Wall(kw, 3, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.WEST);
        new Wall(kw, 3, 3, Direction.SOUTH);
        
        
        
        Robot commando = new Robot(kw, 3, 3, Direction.EAST);
        Robot weathers = new Robot(kw, 0, 1, Direction.WEST);
        
        commando.turnLeft();
        commando.turnLeft();
        weathers.move();
        weathers.pickThing();
        commando.move();
        commando.turnLeft();
        commando.turnLeft();
        commando.turnLeft();
        weathers.turnLeft();
        commando.move();
        commando.pickThing();
        weathers.move();
        weathers.pickThing();
        commando.move();
        commando.pickThing();
        weathers.turnLeft();
        weathers.move();
        weathers.pickThing();
        commando.turnLeft();

        // TODO code application logic here
    }
}
