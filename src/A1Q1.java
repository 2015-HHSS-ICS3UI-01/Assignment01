/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author pawar5658
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City Rajan = new City ();
        Robot Ranveer = new Robot (Rajan, 0, 2, Direction.WEST);
        
        new Wall(Rajan, 1, 1, Direction.NORTH);
        new Wall(Rajan, 1, 2, Direction.NORTH);
        new Wall(Rajan, 1, 1, Direction.WEST);
        new Wall(Rajan, 2, 1, Direction.WEST);
        new Wall(Rajan, 1, 2, Direction.EAST);
        new Wall(Rajan, 2, 2, Direction.EAST);
        new Wall(Rajan, 2, 1, Direction.SOUTH);
        new Wall(Rajan, 2, 2, Direction.SOUTH);
        
        Ranveer.move();
        Ranveer.move();
        Ranveer.turnLeft();
        Ranveer.move();
        Ranveer.move();
        Ranveer.move();
        Ranveer.turnLeft();
        Ranveer.move();
        Ranveer.move();
        Ranveer.move();
        Ranveer.turnLeft();
        Ranveer.move();
        Ranveer.move();
        Ranveer.move();
        Ranveer.turnLeft();
        Ranveer.move();
        
    }
}
