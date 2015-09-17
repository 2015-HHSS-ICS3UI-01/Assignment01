
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
 * @author agott2059
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        City thomas = new City ();
        
        new Wall (thomas, 0,1 , Direction.WEST);
        new Wall (thomas, 1,1 , Direction.WEST);
        new Wall (thomas, 1,1 , Direction.SOUTH);
        
        
        
        Robot bean = new Robot (thomas, 0,0 , Direction.SOUTH);
        bean.setLabel("B");
        
        Robot pea = new Robot (thomas, 0,1 , Direction.SOUTH);
        pea.setLabel("P");
        
        bean.move();
        pea.move();
        bean.move();
        pea.turnLeft();
        pea.turnLeft();
        pea.turnLeft();
        pea.turnLeft();
        pea.turnLeft();
        pea.move();
        bean.turnLeft();
        bean.turnLeft();
        bean.turnLeft();
        bean.turnLeft();
        bean.turnLeft();
        pea.turnLeft();
        pea.turnLeft();
        pea.turnLeft();
        pea.move();
        pea.turnLeft();
        pea.turnLeft();
        pea.turnLeft();
        bean.move();
        pea.move();
        
        
    }
}
