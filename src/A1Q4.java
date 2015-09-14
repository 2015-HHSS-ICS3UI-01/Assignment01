
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author malcr1272
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //make city
    City kw= new City();
    
    //make robots
    Robot karel = new Robot (kw, 0, 0, Direction.SOUTH);
    Robot carl = new Robot (kw, 0, 1, Direction.SOUTH);
    
    //make mountain
    new Wall (kw, 0, 1, Direction.WEST);
    new Wall (kw,1,1,Direction.WEST);
    new Wall (kw,1,1,Direction.SOUTH);
    
    //move robots
    karel.move();
    carl.move();
    karel.move();
    carl.turnLeft();
    carl.move();
    karel.turnLeft();
    carl.turnLeft();
    carl.turnLeft();
    carl.turnLeft();
    carl.move();
    karel.move();
    carl.turnLeft();
    carl.turnLeft();
    carl.turnLeft();
    carl.move();
    
    
   
   
    
    
    }
}
