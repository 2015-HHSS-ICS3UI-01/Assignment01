
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
 * @author DAESUN
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City a = new City ();
        
        Robot A = new Robot (a, 0, 1, Direction.WEST);
        Robot B = new Robot (a, 3, 3, Direction.EAST);
        
        new Wall (a, 2, 3, Direction.WEST);
        new Wall (a, 2, 3, Direction.NORTH);
        new Wall (a, 2, 3, Direction.EAST);
        new Wall (a, 3, 3, Direction.EAST);
        new Wall (a, 3, 3, Direction.SOUTH);
        new Thing (a, 0, 0);
        new Thing (a, 1, 0);
        new Thing (a, 1, 1);
        new Thing (a, 1, 2);
        new Thing (a, 2, 2);
        
        A.move();
        B.turnLeft();
        B.turnLeft();
        B.move();
        A.pickThing();
        A.turnLeft();
        A.move();
        B.turnLeft();
        B.turnLeft();
        B.turnLeft();
        B.move();
        A.pickThing();
        B.pickThing();
        A.turnLeft();
        A.move();
        B.move();
        A.pickThing();
        B.turnLeft();
        B.pickThing();
       
        
        
    }
    
}
