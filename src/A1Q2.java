
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Matt
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City kw = new City();
        
        new Wall (kw, 1,1, Direction.NORTH);
        new Wall (kw,1,2, Direction.NORTH);
        new Wall (kw, 1,2, Direction.EAST);
        
        
                
                

    }
    
}
