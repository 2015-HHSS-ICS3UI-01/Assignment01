
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
 * @author bettk6516
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City jw=new City();
        new Wall(jw,0,1,Direction.WEST);
        new Wall(jw,1,1,Direction.WEST);
        new Wall(jw,1,1,Direction.SOUTH);
        Robot rob =new Robot(jw,0,1,Direction.SOUTH);
        Robot rob2=new Robot(jw,0,0,Direction.SOUTH);
        
        rob.move();
        rob.turnLeft();
        
        rob.move();
        rob.turnLeft();
rob.turnLeft();
rob.turnLeft();
rob.move();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        
        rob.move();
        
        rob2.move();
        rob2.move();
        rob2.turnLeft();
        rob2.move();
        
        
        
    }
}
