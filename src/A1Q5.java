
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
 * @author maxia2242
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City AM = new City();
        Robot Carl = new Robot(AM,3,3,Direction.EAST);
        Robot Maria = new Robot(AM,0,1,Direction.WEST);
        Maria.setLabel("M");
        Carl.setLabel("K");
        
        new Wall(AM,2,3,Direction.EAST);
        new Wall(AM,3,3,Direction.EAST);
        new Wall(AM,3,3,Direction.SOUTH);
        new Wall(AM,2,3,Direction.NORTH);
        new Wall(AM,2,3,Direction.WEST);
        new Thing(AM,0,0);
        new Thing(AM,1,0);
        new Thing(AM,1,1);
        new Thing(AM,1,2);
        new Thing(AM,2,2);
        
        Maria.move();
        Carl.turnLeft();
        Carl.turnLeft();
        Maria.pickThing();
        Carl.move();
        Carl.turnLeft();
        Carl.turnLeft();
        Carl.turnLeft();
        Maria.turnLeft();
        Maria.move();
        Carl.move();
        Maria.pickThing();
        Carl.pickThing();
        Maria.turnLeft();
        Maria.move();
        Carl.move();
        Maria.pickThing();
        Carl.turnLeft();
        Carl.pickThing();
        
        
        
        
        
        
        
        
        
    }
}
