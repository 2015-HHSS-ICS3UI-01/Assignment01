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
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Rajan = new City();
        Robot Ranveer = new Robot(Rajan, 1, 2, Direction.SOUTH);
        new Wall(Rajan, 1, 2, Direction.SOUTH);
        new Wall(Rajan, 1, 2, Direction.EAST);
        new Wall(Rajan, 1, 2, Direction.NORTH);
        new Wall(Rajan, 1, 1, Direction.NORTH);
        new Wall(Rajan, 1, 1, Direction.WEST);
        new Wall(Rajan, 2, 1, Direction.WEST);
        new Wall(Rajan, 2, 1, Direction.SOUTH);
        new Thing(Rajan, 2, 2);
        
        Ranveer.turnLeft();
        Ranveer.turnLeft();
        Ranveer.turnLeft();
        Ranveer.move();
        Ranveer.turnLeft();
        Ranveer.move();
        Ranveer.turnLeft();
        Ranveer.move();
        Ranveer.pickThing();
        Ranveer.turnLeft();
        Ranveer.turnLeft();
        Ranveer.move();
        Ranveer.turnLeft();
        Ranveer.turnLeft();
        Ranveer.turnLeft();
        Ranveer.move();
        Ranveer.turnLeft();
        Ranveer.turnLeft();
        Ranveer.turnLeft();
        Ranveer.move();
        Ranveer.turnLeft();
        Ranveer.turnLeft();
        Ranveer.turnLeft();
    }
}
