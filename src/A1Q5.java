/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author singk4158
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    City kw = new City ();
    
     Robot tina=
                new Robot (kw, 0, 1, Direction.WEST);
     
     Robot kharak=
                 
                 new Robot (kw,3,3, Direction.EAST);
     
                 new Wall(kw,3,3, Direction.SOUTH);
                 new Wall(kw,3,3, Direction.EAST);
                 new Wall(kw,2,3, Direction.EAST);
                 new Wall(kw,2,3, Direction.NORTH);
                 new Wall(kw,2,3, Direction.WEST);
    
    
                 kharak.setLabel("K");
                 tina.setLabel("M");
                 
                 new Thing(kw,0,0);
                 new Thing(kw,1,0);
                 new Thing(kw,1,1);
                 new Thing(kw,1,2);
                 new Thing(kw,2,2);
                 
                 
                 
                 kharak.turnLeft();
                 kharak.turnLeft();
                 kharak.move();
                 kharak.turnLeft();
                 kharak.turnLeft();
                 kharak.turnLeft();
                 kharak.move();
                 tina.move();
                 kharak.pickThing();
                 tina.pickThing();
                 kharak.move();
                 tina.turnLeft();
                 kharak.pickThing();
                 tina.move();
                 tina.pickThing();
                 tina.turnLeft();
                 kharak.turnLeft();
                 kharak.move();
                 kharak.pickThing();
                 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
