
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
public class A1Q5 {
    
        public static void main(String[] args) {

    City kw = new City();
    
    new Wall(kw, 2, 3, Direction.WEST);
    new Wall(kw, 2, 3, Direction.NORTH);
    new Wall(kw, 2, 3, Direction.EAST);
    new Wall(kw, 3, 3, Direction.EAST);
    new Wall(kw, 3, 3, Direction.SOUTH);
    
    new Thing(kw, 0, 0);
    new Thing(kw, 1, 0);
    new Thing(kw, 1, 1);
    new Thing(kw, 1, 2);
    new Thing(kw, 2, 2);
    
    Robot maria = new Robot(kw, 0, 1, Direction.WEST);
    Robot karel = new Robot(kw, 3, 3, Direction.EAST);        
    
    maria.setLabel("M");
    karel.setLabel("K");
   
    karel.turnLeft();
    karel.turnLeft();
    karel.move();
    maria.move();
    maria.pickThing();
    karel.turnLeft();
    karel.turnLeft();
    karel.turnLeft();
    maria.turnLeft();
    maria.move();
    maria.pickThing();
    karel.move();
    karel.pickThing();
    maria.turnLeft();
    maria.move();
    maria.pickThing();
    karel.move();
    karel.pickThing();
    karel.turnLeft();
   
    }
}


