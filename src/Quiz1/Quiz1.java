/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Quiz1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author coulh9904
 */
public class Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot defaultsteve = new Robot (Kitchener, 4, 0, Direction.EAST);
        new Wall(Kitchener, 4, 2, Direction.WEST);
        new Wall(Kitchener, 4, 2, Direction.NORTH);
        new Wall(Kitchener, 3, 3, Direction.NORTH);
        new Wall(Kitchener, 3, 3, Direction.WEST);
        new Wall(Kitchener, 2, 4, Direction.NORTH);
        new Wall(Kitchener, 2, 4, Direction.WEST);
        new Wall(Kitchener, 2, 5, Direction.NORTH);
        new Wall(Kitchener, 2, 5, Direction.EAST);
        new Wall(Kitchener, 3, 6, Direction.NORTH);
        new Wall(Kitchener, 3, 6, Direction.EAST);
        new Wall(Kitchener, 4, 7, Direction.NORTH);
        new Wall(Kitchener, 4, 7, Direction.EAST);
        new Thing(Kitchener, 4, 1);
        new Thing(Kitchener, 3, 2);
        new Thing(Kitchener, 2, 3);
        new Thing(Kitchener, 1, 4);
        
        defaultsteve.move();
        defaultsteve.pickThing();
        defaultsteve.turnLeft();
        defaultsteve.move();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        
        defaultsteve.move();
        defaultsteve.pickThing();
        defaultsteve.turnLeft();
        defaultsteve.move();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        
        defaultsteve.move();
        defaultsteve.pickThing();
        defaultsteve.turnLeft();
        defaultsteve.move();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        
        defaultsteve.move();
        defaultsteve.pickThing();
        defaultsteve.move();
        defaultsteve.putThing();
        
        defaultsteve.move();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.move();
        defaultsteve.putThing();
        
        defaultsteve.turnLeft();
        defaultsteve.move();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.move();
        defaultsteve.putThing();
        
        defaultsteve.turnLeft();
        defaultsteve.move();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.move();
        defaultsteve.putThing();
        
        defaultsteve.turnLeft();
        defaultsteve.move();
        
        
    }
}
