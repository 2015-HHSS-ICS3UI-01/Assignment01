
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
 * @author mitrm7692
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Make a City
    City kw=new City();
    //Make a wall
    new Wall(kw,0,1,Direction.WEST);
    new Wall(kw,1,1,Direction.WEST);
    new Wall(kw,1,1,Direction.SOUTH);
    //Make a Robot
    Robot Don=new Robot(kw,0,0,Direction.SOUTH);
    Robot Joe=new Robot(kw,0,1,Direction.SOUTH);
    Don.move();
    Don.move();
    Don.turnLeft();
    Don.move();
    Joe.move();
    Joe.turnLeft();
    Joe.move();
    Joe.turnLeft();
    Joe.turnLeft();
    Joe.turnLeft();
    Joe.move();
    Joe.turnLeft();
    Joe.turnLeft();
    Joe.turnLeft();
    Joe.move();
    }
}
