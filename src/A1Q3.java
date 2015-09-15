
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City ();
        
        new Wall (kw, 1,3, Direction.NORTH);
        new Wall (kw, 1,3, Direction.WEST);
        new Wall (kw, 2,3, Direction.WEST);
        new Wall (kw, 3,2, Direction.NORTH);
        new Wall (kw, 3,2, Direction.WEST);
        new Wall (kw, 1,3, Direction.EAST);
        new Wall (kw, 2,4, Direction.NORTH);
        new Wall (kw, 2,4, Direction.EAST);
        new Wall (kw, 3,4, Direction.EAST);
        
        new Thing (kw, 3,1);
        
        Robot sara = new Robot (kw, 3,0, Direction.EAST);
        
        sara.move();
        sara.pickThing();
        sara.turnLeft();
        sara.move();
        sara.turnLeft();
        sara.turnLeft();
        sara.turnLeft();
        sara.move();
        sara.turnLeft();
        sara.move();
        sara.move();
        sara.turnLeft();
        sara.turnLeft();
        sara.turnLeft();
        sara.move();
        sara.putThing();
        sara.move();
        sara.turnLeft();
        sara.turnLeft();
        sara.turnLeft();
        sara.move();
        sara.turnLeft();
        sara.move();
        sara.turnLeft();
        sara.turnLeft();
        sara.turnLeft();
        sara.move();
        sara.move();
        sara.turnLeft();
        
        
        
        
        
                
               
        
        
        
        
        
    }
    
}
