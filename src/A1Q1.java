
import becker.robots.City;
import becker.robots.Direction;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author iorgs3184
 */
public class A1Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //Make new City 
       City kw = new City ();
       
       //Make Walls
       new Walls (kw, 1, 1, Direction.NORTH);
       new Walls (kw, 1, 2, Direction.NORTH);      
       new Walls (kw, 2, 1, Direction.WEST);
       new Walls (kw, 3, 1, Direction.WEST);
       new Walls (kw, 2, 1, Direction.SOUTH);      
       new Walls (kw, 2, 2, Direction.SOUTH); 
       new Walls (kw, 2, 2, Direction.EAST);
       new Walls (kw, 2, 1, Direction.EAST);      
        
        
    }
}
