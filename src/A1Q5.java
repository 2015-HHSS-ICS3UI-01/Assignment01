
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
 * @author kulla6503
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Make a City for the Robot to live in
        City NYC = new City();
        
        Robot maria = new Robot(NYC, 0, 1, Direction.WEST);
        Robot karel = new Robot(NYC, 3, 3, Direction.EAST); 
       
        karel.setLabel("k"); 
        maria.setLabel("m"); 
        
        new Thing(NYC, 0, 0); 
        new Thing(NYC, 1, 0); 
        new Thing(NYC, 1, 1); 
        new Thing(NYC, 1, 2); 
        new Thing(NYC, 2, 2); 
        
        new Wall(NYC, 2, 3, Direction.WEST); 
        new Wall(NYC, 2, 3, Direction.NORTH); 
        new Wall(NYC, 2, 3, Direction.EAST); 
        new Wall(NYC, 3, 3, Direction.EAST); 
        new Wall(NYC, 3, 3, Direction.SOUTH); 
        
        maria.move(); 
        maria.pickThing(); 
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        maria.turnLeft();
        maria.move(); 
        maria.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        karel.move();
        maria.turnLeft();
        karel.pickThing();
        karel.turnLeft();
        maria.move(); 
        maria.pickThing();
        
        
    }
}
