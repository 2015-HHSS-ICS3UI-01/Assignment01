
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
 * @author prevw5940
 */
public class RobotExersize4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karle = new Robot (kw, 0, 0, Direction.SOUTH);
        Robot steve = new Robot (kw, 0, 1, Direction.SOUTH);
        new Wall(kw, 0, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.SOUTH);
        karle.move();
        karle.move();
        karle.turnLeft();
        karle.move();
        steve.move();
        steve.turnLeft();
        steve.move();
        steve.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        steve.move();
        steve.turnLeft();
        steve.turnLeft();
        steve.turnLeft();
        steve.move();
    }
}
