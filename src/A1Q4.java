
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
 * @author godie2014
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       City kw = new City () ;
        new Wall (kw,0,1,Direction.WEST);
        new Wall (kw,1,1,Direction.WEST);
        new Wall (kw,1,1,Direction.SOUTH);
        Robot karel=new Robot (kw,0,0,Direction.SOUTH);
        Robot tina=new Robot (kw,0,1,Direction.SOUTH);
        karel.move();
        tina.move();
        tina.turnLeft();
        tina.move();
        tina.turnLeft();
        tina.turnLeft();
        tina.turnLeft();
        karel.move();
        tina.move();
        tina.turnLeft();
        tina.turnLeft();
        tina.turnLeft();
        karel.turnLeft();
        tina.move();
        karel.move();
       
       
    }
}
