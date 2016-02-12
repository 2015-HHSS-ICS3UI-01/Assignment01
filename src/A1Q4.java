
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
 * @author pearr2740
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City qw = new City();
    Robot ryan = new Robot(qw,0,0,Direction.SOUTH);
    Robot cary = new Robot(qw,0,1,Direction.SOUTH);
    
     new Wall(qw, 0, 1, Direction.WEST);
     new Wall(qw, 1, 1, Direction.WEST);
     new Wall(qw, 1, 1, Direction.SOUTH);
     
     ryan.move();
     ryan.move();
     ryan.turnLeft();
     ryan.move();
     cary.move();
     cary.turnLeft();
     cary.move();
     cary.turnLeft();
     cary.turnLeft();
     cary.turnLeft();
     cary.move();
     cary.turnLeft();
     cary.turnLeft();
     cary.turnLeft();
     cary.move();
     
             
     
     
    }
}
