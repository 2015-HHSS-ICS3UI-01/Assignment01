
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
 * @author pawar5658
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City Gotham = new City();
        Robot Batman = new Robot (Gotham, 0, 1, Direction.WEST);
        Robot Wayne = new Robot (Gotham, 3, 3, Direction.EAST);
        
        new Wall (Gotham, 2, 3, Direction.WEST);
        new Wall (Gotham, 2, 3, Direction.NORTH);
        new Wall (Gotham, 2, 3, Direction.EAST);
        new Wall (Gotham, 3, 3, Direction.EAST);
        new Wall (Gotham, 3, 3, Direction.SOUTH);
        
        new Thing (Gotham, 0, 0);
        new Thing (Gotham, 1, 0);
        new Thing (Gotham, 1, 1);
        new Thing (Gotham, 1, 2);
        new Thing (Gotham, 2, 2);
        
        Batman.move();
        Batman.pickThing();
        Batman.turnLeft();
        Batman.move();
        Batman.pickThing();
        Batman.turnLeft();
        Batman.move();
        Batman.pickThing();
        Wayne.turnLeft();
        Wayne.turnLeft();
        Wayne.move();
        Wayne.turnLeft();
        Wayne.turnLeft();
        Wayne.turnLeft();
        Wayne.move();
        Wayne.pickThing();
        Wayne.move();
        Wayne.pickThing();
        Wayne.turnLeft();
        
        
        
    }
}
