
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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        
        new Wall (kw, 0,1, Direction.WEST);
        new Wall (kw, 1,1, Direction.WEST);
        new Wall (kw, 1,1, Direction.SOUTH);
        
        Robot matt = new Robot(kw, 0,0, Direction.SOUTH);
        Robot dave = new Robot (kw, 0,1, Direction.SOUTH);
        
        matt.move();
        dave.move();
        matt.move();
        dave.turnLeft();
        dave.move();
        dave.turnLeft();
        dave.turnLeft();
        dave.turnLeft();
        dave.move();
        dave.turnLeft();
        dave.turnLeft();
        dave.turnLeft();
        matt.turnLeft();
        matt.move();
        dave.move();
        
        
        
        
        
                
        
        
        
        
    }
    
}
