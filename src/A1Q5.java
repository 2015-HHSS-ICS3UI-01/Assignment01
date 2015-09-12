
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Peter
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //make city
        City kw = new City();
        
        //make walls
        new Wall(kw, 2,3, Direction.WEST);
        new Wall(kw, 2,3, Direction.NORTH);
        new Wall(kw, 2,3, Direction.EAST);
        new Wall(kw, 3,3, Direction.EAST);
        new Wall(kw, 3,3, Direction.SOUTH);
        
        //make things
        new Thing(kw, 2,2);
        new Thing(kw, 1,2);
        new Thing(kw, 1,1);
        new Thing(kw, 1,0);
        new Thing(kw, 0,0);
        
        //make robots
        Robot karel = new Robot(kw, 3,3, Direction.EAST);
        karel.setLabel("K");
        Robot maria = new Robot(kw, 0,1, Direction.WEST);
        maria.setLabel("M");
        
        //move robots
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        maria.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        karel.move();
        maria.turnLeft();
        maria.move();
        maria.turnLeft();
        karel.move();
        karel.turnLeft();
        maria.move();
        
        
        
    }
    
}
