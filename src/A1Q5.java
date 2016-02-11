
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Ayr = new City();
        
        Robot dag = new Robot(Ayr, 0, 1, Direction.WEST);
        dag.setLabel("M");
        Robot dog = new Robot(Ayr, 3, 3, Direction.EAST);
        dog.setLabel("K");
        new Wall(Ayr, 2, 3, Direction.WEST);
        new Wall(Ayr, 2, 3, Direction.NORTH);
        new Wall(Ayr, 2, 3, Direction.EAST);
        new Wall(Ayr, 3, 3, Direction.EAST);
        new Wall(Ayr, 3, 3, Direction.SOUTH);
        
        new Thing(Ayr, 0, 0);
        new Thing(Ayr, 1, 0);
        new Thing(Ayr, 1, 1);
        new Thing(Ayr, 1, 2);
        new Thing(Ayr, 2, 2);
        
        dag.move();
        dog.turnLeft();
        dog.turnLeft();
        dag.pickThing();
        dog.move();
        dag.turnLeft();
        dog.turnLeft();
        dog.turnLeft();
        dog.turnLeft();
        dag.move();
        dog.move();
        dog.pickThing();
        dog.move();
        dag.pickThing();
        dog.pickThing();
        dog.turnLeft();
        dag.turnLeft();
        dag.move();
        dag.pickThing(); 
    }
}
