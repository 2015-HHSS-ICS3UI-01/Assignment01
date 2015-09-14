
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bettk6516
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City jw=new City();
        new Wall(jw,3,2,Direction.WEST);
        new Wall(jw,2,2,Direction.SOUTH);
        new Wall(jw,2,3,Direction.WEST);
        new Wall(jw,1,3,Direction.NORTH);
        new Wall(jw,1,3,Direction.WEST);
        new Wall(jw,1,3,Direction.EAST);
        new Wall(jw,2,4,Direction.NORTH);
        new Wall(jw,2,4,Direction.EAST);
        new Wall (jw,3,4,Direction.EAST);
        new Thing(jw,3,1);
        Robot rob=new Robot(jw,3,0,Direction.EAST);
        
        rob.move();
        rob.pickThing();
        rob.turnLeft();
        
        rob.move();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.move();
        rob.move();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        rob.move();
        rob.putThing();
        rob.move();
        
        rob.turnLeft();
       rob.turnLeft();
       rob.turnLeft();
       rob.move();
        rob.turnLeft();
    
     
        rob.move();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        rob.move();
        rob.move();
        rob.turnLeft();
        
        
        
        
        
    }
}
