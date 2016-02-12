
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
public class A1Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Ajay = new City();
        new Wall(Ajay, 4, 5, Direction.WEST); 
        new Wall(Ajay, 4, 5, Direction.NORTH);
        new Wall(Ajay, 3, 6, Direction.WEST);
        new Wall(Ajay, 2, 6, Direction.WEST);
        new Wall(Ajay, 2, 6, Direction.NORTH);
        new Wall(Ajay, 2, 6, Direction.EAST);
        new Wall(Ajay, 3, 7, Direction.NORTH);
        new Wall(Ajay, 3, 7, Direction.EAST);
        new Wall(Ajay, 4, 7, Direction.EAST);
        Robot Jack = new Robot(Ajay, 4, 3, Direction.EAST);
        new Thing (Ajay, 4, 4); 
        Jack.move();
        Jack.pickThing();
        Jack.turnLeft();
        Jack.move();
        Jack.turnLeft();
        Jack.turnLeft();
        Jack.turnLeft();
        Jack.move();
        Jack.turnLeft();
        Jack.move();
        Jack.move();
        Jack.turnLeft();
        Jack.turnLeft();
        Jack.turnLeft();
        Jack.move();
        Jack.putThing(); 
        Jack.move();
        Jack.turnLeft();
        Jack.turnLeft();
        Jack.turnLeft();
        Jack.move();
        Jack.turnLeft();
        Jack.move();
        Jack.turnLeft();
        Jack.turnLeft();
        Jack.turnLeft();
        Jack.move();
        Jack.move();
        Jack.turnLeft();
        
        
        
    }
}
