
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        
        new Wall (kw, 1,1, Direction.NORTH);
        new Wall (kw,1,2, Direction.NORTH);
        new Wall (kw, 1,2, Direction.EAST);
        new Wall (kw, 1,2, Direction.SOUTH);
        new Wall (kw, 1,1, Direction.WEST);
        new Wall (kw, 2,1, Direction.WEST);
        new Wall (kw, 2,1, Direction.SOUTH);
        
        new Thing (kw, 2,2);
        
        Robot sara = new Robot (kw, 1,2, Direction.SOUTH);
        
        sara.turnLeft();
        sara.turnLeft();
        sara.turnLeft();
        sara.move();
        sara.turnLeft();
        sara.move();
        sara.turnLeft();
        sara.move();
        sara.pickThing();
        sara.turnLeft();
        sara.turnLeft();
        sara.move();
        sara.turnLeft();
        sara.turnLeft();
        sara.turnLeft();
        sara.move();
        sara.turnLeft();
        sara.turnLeft();
        sara.turnLeft();
        sara.move();
        sara.turnLeft();
        sara.turnLeft();
        sara.turnLeft();
        
        
        
        
        
        
        
        
      
        
        
        
                
                

    }
    
}
