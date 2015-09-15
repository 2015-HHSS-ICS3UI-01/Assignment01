

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
 * @author Matt
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        
        new Wall (kw, 2,3, Direction.NORTH);
        new Wall (kw, 2,3, Direction.WEST);
        new Wall (kw, 2,3, Direction.EAST);
        new Wall (kw, 3,3, Direction.EAST);
        new Wall (kw,3,3,Direction.SOUTH);
        
        Robot matt = new Robot (kw, 3,3,Direction.EAST);
        Robot maria = new Robot (kw,0,1,Direction.WEST);
        matt.setLabel("M");
        maria.setLabel("Ma");
        
        
        new Thing (kw, 0,0);
        new Thing (kw,1,0);
        new Thing (kw,1,1);
        new Thing (kw,1,2);
        new Thing (kw,2,2);
        
        maria.move();
        matt.turnLeft();
        matt.turnLeft();
        matt.move();
        matt.turnLeft();
        matt.turnLeft();
        matt.turnLeft();
        maria.turnLeft();
        maria.pickThing();
        maria.move();
        matt.move();
        matt.pickThing();
        maria.pickThing();
        matt.move();
        maria.turnLeft();
        matt.pickThing();
        matt.turnLeft();
        maria.move();
        maria.pickThing();
        

        
        
        
        
        
                
        
    }
    
}
