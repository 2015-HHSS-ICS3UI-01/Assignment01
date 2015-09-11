
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
 * @author mitrm7692
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make a City
        City Town= new City();
        //Make walls
        new Wall(Town, 2,1,Direction.SOUTH);
        new Wall(Town, 2,1,Direction.WEST);
        new Wall(Town, 1,1,Direction.WEST);
        new Wall(Town, 1,1,Direction.NORTH);
        new Wall(Town, 1,2,Direction.NORTH);
        new Wall(Town, 1,2,Direction.SOUTH);
        new Wall(Town, 1,2,Direction.EAST);
        //Make a Thing
        new Thing(Town,2,2);
        //Make a Robot
        Robot Don = new Robot(Town,1, 2, Direction.SOUTH);
        Don.turnLeft();
        Don.turnLeft();
        Don.turnLeft();
        Don.move();
        Don.turnLeft();
        Don.move();
        Don.turnLeft();
        Don.move();
        Don.pickThing();
        Don.turnLeft();
        Don.turnLeft();
        Don.move();
        Don.turnLeft();
        Don.turnLeft();
        Don.turnLeft();
        Don.move();
        Don.turnLeft();
        Don.turnLeft();
        Don.turnLeft();
        Don.move();
        Don.turnLeft();
        Don.turnLeft();
        Don.turnLeft();
    }
}
