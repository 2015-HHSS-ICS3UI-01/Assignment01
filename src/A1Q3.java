
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City kw = new City();
    
    new Wall(kw, 3,2, Direction.WEST);
    new Wall(kw, 3,2, Direction.NORTH);
    new Wall(kw, 2,3, Direction.WEST);
    new Wall(kw, 1,3, Direction.WEST);
    new Wall(kw, 1,3, Direction.NORTH);
    new Wall(kw, 1,3, Direction.EAST);
    new Wall(kw, 2,4, Direction.NORTH);
    new Wall(kw, 2,4, Direction.EAST);
    new Wall(kw, 3,4, Direction.EAST);
    
    Robot B = new Robot(kw, 3,0, Direction.EAST);
    new Thing (kw, 3,1);
    
    B.move();
    B.pickThing();
    B.turnLeft();
    B.move();
    B.turnLeft();
    B.turnLeft();
    B.turnLeft();
    B.move();
    B.turnLeft();
    B.move();
    B.move();
    B.turnLeft();
    B.turnLeft();
    B.turnLeft();
    B.move();
    B.putThing();
    B.move();
    B.turnLeft();
    B.turnLeft();
    B.turnLeft();
    B.move();
    B.turnLeft();
    B.move();
    B.turnLeft();
    B.turnLeft();
    B.turnLeft();
    B.move();
    B.move();
    B.turnLeft();
   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
