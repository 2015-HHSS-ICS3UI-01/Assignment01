
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
 * @author dhila4674
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Ajay = new City();
        new Wall (Ajay, 1, 2, Direction.WEST);
        new Wall (Ajay, 2, 2, Direction.WEST);
        new Wall (Ajay, 1, 2, Direction.NORTH);
        new Wall (Ajay, 1, 3, Direction.NORTH);
        new Wall (Ajay, 1, 3, Direction.EAST);
        new Wall (Ajay, 1, 3, Direction.SOUTH);
        new Wall (Ajay, 2, 2, Direction.SOUTH);
        new Thing (Ajay, 2, 3); 
        
        Robot Jack = new Robot(Ajay, 1, 3, Direction.SOUTH); 
        Jack.turnLeft();
        Jack.turnLeft();
        Jack.turnLeft();
        Jack.move();
        Jack.turnLeft();
        Jack.move();
        Jack.turnLeft();
        Jack.move();
        Jack.pickThing();
        Jack.turnLeft();
        Jack.turnLeft();
        Jack.move();
        Jack.turnLeft();
        Jack.turnLeft();
        Jack.turnLeft();
        Jack.move();
        Jack.turnLeft();
        Jack.turnLeft();
        Jack.turnLeft();
        Jack.move();
        Jack.turnLeft();
        Jack.turnLeft();
        Jack.turnLeft();

    }
}
