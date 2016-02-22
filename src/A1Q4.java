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
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Tim = new City();
        Robot Rat = new Robot(Tim, 0, 0, Direction.SOUTH);
        Robot Bally = new Robot(Tim, 0, 1, Direction.SOUTH);
        new Wall(Tim, 0, 1, Direction.WEST);
        new Wall(Tim, 1, 1, Direction.WEST);
        new Wall(Tim, 1, 1, Direction.SOUTH);
        Rat.move();
        Rat.move();
        Rat.turnLeft();
        Rat.move();
        Bally.move();
        Bally.turnLeft();
        Bally.move();
        Bally.turnLeft();
        Bally.turnLeft();
        Bally.turnLeft();
        Bally.move();
        Bally.turnLeft();
        Bally.turnLeft();
        Bally.turnLeft();
        Bally.move();
    }
}
