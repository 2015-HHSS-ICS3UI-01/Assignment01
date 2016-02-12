
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
 * @author dhila4674
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Ajay = new City();
        new Wall(Ajay, 1, 3, Direction.WEST);
        new Wall(Ajay, 2, 3, Direction.WEST);
        new Wall(Ajay, 2, 3, Direction.SOUTH);
        Robot Jack = new Robot(Ajay, 1, 2, Direction.SOUTH);
        Robot Bob = new Robot(Ajay, 1, 3, Direction.SOUTH);
        Bob.move();
        Bob.turnLeft();
        Bob.move();
        Bob.turnLeft();
        Bob.turnLeft();
        Bob.turnLeft();
        Bob.move();
        Bob.turnLeft();
        Jack.move(); Bob.turnLeft();
        Jack.move(); Bob.turnLeft();
        Jack.turnLeft();
        Bob.move(); Jack.move();
        
        
        
    }
}
