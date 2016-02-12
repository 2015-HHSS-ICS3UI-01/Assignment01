
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
 * @author rares
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    City kw = new City();
    
    new Wall(kw, 1,2, Direction.NORTH);
    new Wall(kw, 1,1, Direction.NORTH);
    new Wall(kw, 1,1, Direction.WEST);
    new Wall(kw, 2,1, Direction.WEST);
    new Wall(kw, 2,1, Direction.SOUTH);
    new Wall(kw, 1,2, Direction.SOUTH);
    new Wall(kw, 1,2, Direction.EAST);
    
    Robot Karel = new Robot (kw, 1,2, Direction.SOUTH);
    
    new Thing (kw, 2,2);
    
    Karel.turnLeft();
    Karel.turnLeft();
    Karel.turnLeft();
    Karel.move();
    Karel.turnLeft();
    Karel.move();
    Karel.turnLeft();
    Karel.move();
    Karel.pickThing();
    Karel.turnLeft();
    Karel.turnLeft();
    Karel.move();
    Karel.turnLeft();
    Karel.turnLeft();
    Karel.turnLeft();
    Karel.move();
    Karel.turnLeft();
    Karel.turnLeft();
    Karel.turnLeft();
    Karel.move();
    Karel.turnLeft();
    Karel.turnLeft();
    Karel.turnLeft();
    
    
    
    
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
         
    
    
    
        






}
