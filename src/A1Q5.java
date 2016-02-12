
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Ajay = new City();
        new Wall(Ajay, 2, 3, Direction.WEST);
        new Wall(Ajay, 2, 3, Direction.NORTH);
        new Wall(Ajay, 2, 3, Direction.EAST);
        new Wall(Ajay, 3, 3, Direction.EAST);
        new Wall(Ajay, 3, 3, Direction.SOUTH);
        Robot Karel = new Robot (Ajay, 3, 3, Direction.EAST);
        Robot Maria = new Robot (Ajay, 0, 1, Direction.WEST);
        new Thing (Ajay, 0, 0);
        new Thing (Ajay, 1, 0);
        new Thing (Ajay, 1, 1);
        new Thing (Ajay, 1, 2);
        new Thing (Ajay, 2, 2);
        Maria.move();
        Maria.pickThing();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.move();
        Karel.turnLeft();
        Karel.turnLeft();
        Karel.turnLeft(); 
        Karel.move();
        Karel.pickThing();
        Maria.turnLeft();
        Maria.move();
        Maria.pickThing();
        Karel.move();
        Karel.pickThing();
        Maria.turnLeft();
        Maria.move();
        Maria.pickThing();
        Karel.turnLeft();
    }
}
