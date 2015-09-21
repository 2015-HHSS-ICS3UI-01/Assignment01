
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author butlj9437
 */
public class a1q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make the things
        //City
        City coolLand = new City();
        //Robot
        Robot jarvis = new Robot(coolLand, 0, 2, Direction.WEST);
        //walls
        new Wall(coolLand, 1, 1, Direction.NORTH);
        new Wall(coolLand, 1, 1, Direction.WEST);
        new Wall(coolLand, 2, 1, Direction.WEST);
        new Wall(coolLand, 2, 1, Direction.SOUTH);
        new Wall(coolLand, 2, 2, Direction.SOUTH);
        new Wall(coolLand, 2, 2, Direction.EAST);
        new Wall(coolLand, 1, 2, Direction.EAST);
        new Wall(coolLand, 1, 2, Direction.NORTH);
        //move the robot
        jarvis.move();
        jarvis.move();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.move();
        jarvis.move();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.move();
        jarvis.move();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.move();
        jarvis.move();
        jarvis.turnLeft();
        jarvis.move();
    }
}
