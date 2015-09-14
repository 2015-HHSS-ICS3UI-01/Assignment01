
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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         City jw = new City();
        new Wall(jw,1,2,Direction.SOUTH);
        new Wall(jw,1,2,Direction.EAST);
        new Wall(jw,1,2,Direction.NORTH);
        new Wall(jw,1,1,Direction.NORTH);
        new Wall(jw,1,1,Direction.WEST);
        new Wall(jw,2,1,Direction.WEST);
        new Wall(jw,2,1,Direction.SOUTH);
        new Thing(jw,2,2);
        Robot rob=new Robot(jw,1,2,Direction.SOUTH);
        
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
       
        rob.move();
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.move();
        rob.pickThing();
        rob.turnLeft();
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
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        
    }
}
