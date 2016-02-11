
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
 * @author coulh9904
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
    Robot defaultsteve = new Robot (Kitchener, 0, 1, Direction.SOUTH);
    Robot defaultandrea = new Robot (Kitchener, 0, 0, Direction.SOUTH);
        new Wall(Kitchener, 1, 1, Direction.WEST);
    new Wall(Kitchener, 1, 1, Direction.SOUTH);
    new Wall(Kitchener, 0, 1, Direction.WEST);
    defaultsteve.move();
    defaultandrea.move();
    defaultsteve.turnLeft();
    defaultsteve.move();
    defaultsteve.turnLeft();
    defaultsteve.turnLeft();
    defaultandrea.move();
    defaultsteve.turnLeft();
    defaultsteve.move();
    defaultsteve.turnLeft();
    defaultsteve.turnLeft();
    defaultandrea.turnLeft();
    defaultsteve.turnLeft();
    defaultsteve.move();
    defaultandrea.move();
    
    
    }
}
