
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
 * @author moraj0721
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Make a City for the Robot
        City Lob= new City();
        
        //Make a Robot to live in the City
        Robot greg = new Robot(Lob, 0, 0, Direction.SOUTH);
        Robot bea = new Robot(Lob, 0, 1, Direction.SOUTH);
        
        //Make a Wall
        new Wall (Lob, 0, 1, Direction.WEST);
        new Wall (Lob, 1, 1, Direction.WEST);
        new Wall (Lob, 1, 1, Direction.SOUTH);
        
        greg.move();
        bea.move();
        greg.move();
        bea.turnLeft();
        greg.turnLeft();
        bea.move();
        bea.turnLeft();
        bea.turnLeft();
        bea.turnLeft();
        bea.move();
        bea.turnLeft();
        bea.turnLeft();
        bea.turnLeft();
        bea.move();
        greg.move();
        
        
        
    }
}
