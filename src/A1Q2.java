
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Samiorga
 */
public class A1Q2 {

        public static void main(String[] args) {
    
    City kw = new City ();
    
    new Wall(kw, 2, 1, Direction.SOUTH);
    new Wall(kw, 2, 1, Direction.WEST);
    new Wall(kw, 1, 1, Direction.WEST);
    new Wall(kw, 1, 1, Direction.NORTH);
    new Wall(kw, 1, 2, Direction.NORTH);
    new Wall(kw, 1, 2, Direction.EAST);
    new Wall(kw, 1, 2, Direction.SOUTH);
    
    new Thing(kw, 2, 2);
    
    Robot sam = new Robot(kw, 1, 2, Direction.SOUTH);
    
    sam.turnLeft();
    sam.turnLeft();
    sam.turnLeft();
    sam.move();
    sam.turnLeft();
    sam.move();
    sam.turnLeft();
    sam.move();
    sam.pickThing();
    sam.turnLeft();
    sam.turnLeft();
    sam.move();
    sam.turnLeft();
    sam.turnLeft();
    sam.turnLeft();
    sam.move();
    sam.turnLeft();
    sam.turnLeft();
    sam.turnLeft();
    sam.move();
    sam.turnLeft();
    sam.turnLeft();
    sam.turnLeft();
        }
}


