
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
 * @author dhila4674
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Ajay = new City();
        Wall wall = new Wall (Ajay, 4, 4, Direction.SOUTH);
        
        new Wall (Ajay, 4, 3, Direction.SOUTH);
        new Wall (Ajay, 3, 4, Direction.EAST);
        new Wall (Ajay, 4, 4, Direction.EAST);
        new Wall (Ajay, 3, 3, Direction.WEST);
        new Wall (Ajay, 4, 3, Direction.WEST);
        new Wall (Ajay, 3, 3, Direction.NORTH);
        new Wall (Ajay, 3, 4, Direction.NORTH);
        
        Robot Joe = new Robot(Ajay, 2, 4, Direction.WEST);
        Joe.move();
        Joe.move();
        Joe.turnLeft();
        Joe.move();
        Joe.move();
        Joe.move();
        Joe.turnLeft();
        Joe.move();
        Joe.move();
        Joe.move();
        Joe.turnLeft();
        Joe.move();
        Joe.move();
        Joe.move();
        Joe.turnLeft();
        Joe.move();
             
        
        
        
        
                
    }
}
