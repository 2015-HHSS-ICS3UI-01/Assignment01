
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
 * @author DAESUN
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City a = new City ();
        
        Robot A = new Robot (a, 0, 0, Direction.SOUTH);
        Robot B = new Robot (a, 0, 1, Direction.SOUTH);
        
        new Wall (a, 0, 1, Direction. WEST);
        new Wall (a, 1, 1, Direction. WEST);
        new Wall (a, 1, 1, Direction. SOUTH);
        
        A.move();
        B.move();
        A.move();
        B.turnLeft();
        B.move();
        A.turnLeft();
        B.turnLeft();
        B.turnLeft();
        B.turnLeft();
        B.move();
        A.move();
        B.turnLeft();
        B.turnLeft();
        B.turnLeft();
        B.move();
        
    }
    
}
