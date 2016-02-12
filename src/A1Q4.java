
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
 * @author rares
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
       City kw = new City ();
    
    new Wall(kw, 0,1, Direction.WEST);
    new Wall(kw, 1,1, Direction.WEST);
    new Wall(kw, 1,1, Direction.SOUTH);
    
    Robot C = new Robot(kw, 0,0, Direction.SOUTH);
    Robot D = new Robot(kw, 0,1, Direction.SOUTH);
    
    C.move();
    D.move();
    D.turnLeft();
    D.move();
    D.turnLeft();
    D.turnLeft();
    D.turnLeft();
    C.move();
    D.move();
    C.turnLeft();
    D.turnLeft();
    D.turnLeft();
    D.turnLeft();
    D.move();
    C.move();
    
    
    
    
    
    }
   }
