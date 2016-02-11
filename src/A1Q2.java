
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
 * @author howen2217
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City cambridge = new City();
        
        Robot dag
                = new Robot(cambridge, 1, 2, Direction.SOUTH);
        
        new Thing(cambridge, 2, 2);
        
        new Wall(cambridge, 1, 1, Direction.NORTH);
        new Wall(cambridge, 1, 1, Direction.WEST);
        new Wall(cambridge, 1, 2, Direction.NORTH);
        new Wall(cambridge, 1, 2, Direction.EAST);
        new Wall(cambridge, 2, 1, Direction.WEST);
        new Wall(cambridge, 2, 1, Direction.SOUTH);
        new Wall(cambridge, 1, 2, Direction.SOUTH);
        
        dag.turnLeft();
        dag.turnLeft();
        dag.turnLeft();
        dag.move();
        dag.turnLeft();
        dag.move();
        dag.turnLeft();
        dag.move();
        dag.pickThing();
        dag.turnLeft();
        dag.turnLeft();
        dag.move();
        dag.turnLeft();
        dag.turnLeft();
        dag.turnLeft();
        dag.move();
        dag.turnLeft();
        dag.turnLeft();
        dag.turnLeft();
        dag.move();
        dag.turnLeft();
        dag.turnLeft();
        dag.turnLeft();
        
    }
}
