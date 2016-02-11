import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;/*
 /* To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot maria = new Robot(kw,0,1, Direction. WEST);
        Robot karel = new Robot(kw,3,3, Direction.EAST);
        maria.setLabel("M");
        karel.setLabel("K");
        new Wall(kw,3,3, Direction. SOUTH);
        new Wall(kw,3,3, Direction. EAST);
        new Wall(kw,2,3,Direction. EAST);
        new Wall(kw,2,3,Direction. NORTH);
        new Wall(kw,2,3,Direction. WEST);
        new Thing(kw,0,0);
        new Thing(kw,1,0);     
        new Thing(kw,1,1);  
        new Thing(kw,1,2);
        new Thing(kw,2,2);  
        maria.move();
        maria.pickThing();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        karel.move();
        karel.pickThing();
        maria.turnLeft();
        maria.move();
        maria.pickThing();
        karel.turnLeft();
        
    }
}
