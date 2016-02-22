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
 * @author pawar5658
 */
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Rajan = new City ();
        Robot Ranveer = new Robot (Rajan, 3, 0, Direction.EAST);
        
        new Wall(Rajan, 3, 2, Direction.WEST);
        new Wall(Rajan, 3, 2, Direction.NORTH);
        new Thing(Rajan, 3, 1);
        new Wall(Rajan, 2, 3, Direction.WEST);
        new Wall(Rajan, 1, 3, Direction.WEST);
        new Wall(Rajan, 1, 3, Direction.NORTH);
        new Wall(Rajan, 1, 3, Direction.EAST);
        new Wall(Rajan, 2, 4, Direction.NORTH);
        new Wall(Rajan, 2, 4, Direction.EAST);
        new Wall(Rajan, 3, 4, Direction.EAST);
        
        Ranveer.move();
        Ranveer.pickThing();
        Ranveer.turnLeft();
        Ranveer.move();
        Ranveer.turnLeft();
        Ranveer.turnLeft();
        Ranveer.turnLeft();
        Ranveer.move();
        Ranveer.turnLeft();
        Ranveer.move();
        Ranveer.move();
        Ranveer.turnLeft();
        Ranveer.turnLeft();
        Ranveer.turnLeft();
        Ranveer.move();
        Ranveer.putThing();
        Ranveer.move();
        Ranveer.turnLeft();
        Ranveer.turnLeft();
        Ranveer.turnLeft();
        Ranveer.move();
        Ranveer.turnLeft();
        Ranveer.move();
        Ranveer.turnLeft();
        Ranveer.turnLeft();
        Ranveer.turnLeft();
        Ranveer.move();
        Ranveer.move();
        Ranveer.turnLeft();
        
    }
}
