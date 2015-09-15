
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
 * @author pircn0556
 */
public class A1Q5 {
    private static String K;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Make City for Robots
        City kw = new City();
        
        //Make Walls for City
        new Wall(kw,2,3,Direction.NORTH);
        new Wall(kw,2,3,Direction.WEST);
        new Wall(kw,2,3,Direction.EAST);
        new Wall(kw,3,3,Direction.EAST);
        new Wall(kw,3,3,Direction.SOUTH);
        
        //Make Things
        new Thing(kw,0,0,Direction.EAST);
        new Thing(kw,1,0,Direction.EAST);
        new Thing(kw,1,1,Direction.EAST);
        new Thing(kw,1,2,Direction.EAST);
        new Thing(kw,2,2,Direction.EAST);
        
        //Make Robots for City
        Robot maria = new Robot(kw,0,1,Direction.WEST);
        Robot karel = new Robot(kw,3,3,Direction.EAST);
        karel.setLabel("k");
        maria.setLabel("m");
        
        karel.turnLeft();
        karel.turnLeft();
        maria.move();
        karel.move();
        maria.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        maria.pickThing();
        maria.move();
        karel.move();
        karel.pickThing();
        maria.pickThing();
        maria.turnLeft();
        karel.move();
        karel.pickThing();
        maria.move();
        maria.pickThing();
        karel.turnLeft(); 
       
    }
}
