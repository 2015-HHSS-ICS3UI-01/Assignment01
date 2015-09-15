
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
 * @author Samiorga
 */
public class A1Q4 {
   
        public static void main (String[] args){
    
    City kw = new City ();
    
    new Wall(kw, 0, 1, Direction.WEST);
    new Wall(kw, 1, 1, Direction.WEST);
    new Wall(kw, 1, 1, Direction.SOUTH);
    
    Robot sam = new Robot(kw, 0, 0, Direction.SOUTH);
    Robot john  = new Robot(kw, 0, 1, Direction.SOUTH);
    
    sam.move();
    john.move();
    john.turnLeft();
    john.move();
    john.turnLeft();
    john.turnLeft();
    john.turnLeft();
    sam.move();
    john.move();
    sam.turnLeft();
    john.turnLeft();
    john.turnLeft();
    john.turnLeft();
    john.move(); 
    sam.move();
    
    
    
    
    }
}


