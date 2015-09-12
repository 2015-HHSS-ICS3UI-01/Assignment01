
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadida Family
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        new Thing(kw,0,0);
        new Thing(kw,1,0);
        new Thing(kw,1,1);
        new Thing(kw,1,2);
        new Thing(kw,2,2);
        new Wall(kw,2,3, Direction.WEST);
        new Wall(kw,2,3, Direction.NORTH);
        new Wall(kw,2,3, Direction.EAST);
        new Wall(kw,3,3, Direction.EAST);
        new Wall(kw,3,3, Direction.SOUTH);
        Robot maria = new Robot(kw, 0,1, Direction.WEST);
        Robot karel = new Robot(kw, 3,3, Direction.EAST);
        karel.setLabel("K");
        
        
        maria.setLabel("M");
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        maria.move();
        karel.move();
        maria.pickThing();
        karel.pickThing();
        maria.turnLeft();
        karel.move();
        maria.move();
        karel.pickThing();
        maria.pickThing();
        maria.turnLeft();
        maria.move();
        karel.turnLeft();
        maria.pickThing();
        
        
        
        
        
        
        
        
        
    }
    
}
