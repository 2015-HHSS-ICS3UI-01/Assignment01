
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
public class A1Q1 {

        public static void main(String[] args) {
    
        //Make a city for the robot to live in
        City kw = new City ();
    
        //Make Walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
    
        //Make a robot
        Robot sam = new Robot(kw, 0, 2, Direction.WEST);
        
        //Make Robot move
        sam.move();
        sam.move();
        sam.turnLeft();
        sam.move();
        sam.move();
        sam.move();
        sam.turnLeft();
        sam.move();
        sam.move();
        sam.move();
        sam.turnLeft();
        sam.move();
        sam.move();
        sam.move();
        sam.turnLeft();
        sam.move();
        
        }
 }

