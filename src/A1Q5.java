
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City jw=new City();
        Robot rob =new Robot(jw,3,3,Direction.EAST);
        Robot may=new Robot(jw,0,1,Direction.WEST);
        rob.setLabel("r");
        may.setLabel("m");
        
        new Wall(jw,2,3,Direction.WEST);
        new Wall(jw,2,3,Direction.NORTH);
        new Wall(jw,2,3,Direction.EAST);
        new Wall(jw,3,3,Direction.EAST);
        new Wall(jw,3,3,Direction.SOUTH);
        
        new Thing(jw,2,2);
        new Thing(jw,1,2);
        new Thing(jw,1,1);
        new Thing(jw,1,0);
        new Thing (jw,0,0);
        
        may.move();
        may.pickThing();
        may.turnLeft();
        may.move();
        may.pickThing();
        may.turnLeft();
        may.move();
        may.pickThing();
        
        rob.turnLeft();
        rob.turnLeft();
        rob.move();
        rob.turnLeft();
        rob.turnLeft();
        rob.turnLeft();
        rob.move();
        rob.pickThing();
        rob.move();
        rob.pickThing();
        rob.turnLeft();
       
        
        
        
        
        
        
        
        
        
    }
}
