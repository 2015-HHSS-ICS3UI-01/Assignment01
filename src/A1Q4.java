
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
 * @author howen2217
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City Brantford = new City();
        
        Robot Zoran = new Robot(Brantford, 0, 0, Direction.SOUTH);
        Robot Nick = new Robot(Brantford, 0, 1, Direction.SOUTH);
        new Wall(Brantford, 0, 1, Direction.WEST);
        new Wall(Brantford, 1, 1, Direction.WEST);
        new Wall(Brantford, 1, 1, Direction.SOUTH);
        Nick.move();
        Zoran.move();
        Nick.turnLeft();
        Nick.move();
        Zoran.move();
        Nick.turnLeft();
        Nick.turnLeft();
        Nick.turnLeft();
        Nick.move();
        Zoran.turnLeft();
        Nick.turnLeft();
        Nick.turnLeft();
        Nick.turnLeft();
        Zoran.move();
        Nick.move();
    }
}
