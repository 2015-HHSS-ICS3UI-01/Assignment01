
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City a = new City();
        
        Robot A =  new Robot (a, 1, 2, Direction.SOUTH);
        
        new Wall (a, 1, 2, Direction.SOUTH);
        new Wall (a, 1, 2, Direction.EAST);
        new Wall (a, 1, 2, Direction.NORTH);
        new Wall (a, 1, 1, Direction.NORTH);
        new Wall (a, 1, 1, Direction.WEST);
        new Wall (a, 2, 1, Direction.WEST);
        new Wall (a, 2, 1, Direction.SOUTH);
        new Thing (a, 2, 2);
        
        A.turnLeft();
        A.turnLeft();
        A.turnLeft();
        A.move();
        A.turnLeft();
        A.move();
        A.turnLeft();
        A.move();
        A.pickThing();
        A.turnLeft();
        A.turnLeft();
        A.move();
        A.turnLeft();
        A.turnLeft();
        A.turnLeft();
        A.move();
        A.turnLeft();
        A.turnLeft();
        A.turnLeft();
        A.move();
        A.turnLeft();
        A.turnLeft();
        A.turnLeft();
    }
    
}
