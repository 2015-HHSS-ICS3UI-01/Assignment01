
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lalim9800
 */
public class a1q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         City a1q5= new City();
         Robot jeff= new Robot(a1q5,0,1,Direction.WEST);
         Robot lali= new Robot(a1q5,3,3,Direction.EAST);
         new Thing(a1q5,0,0);
    }
}
