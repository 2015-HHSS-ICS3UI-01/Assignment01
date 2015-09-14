
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hadida Family
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot majed = new Robot(kw, 0,0, Direction.SOUTH);
        Robot khaled = new Robot(kw, 0,1, Direction.SOUTH);
        new Wall(kw,0,1, Direction.WEST);
        new Wall(kw,1,1, Direction.WEST);
        new Wall(kw,1,1, Direction.SOUTH);
        khaled.move();
        majed.move();
        khaled.turnLeft();
        majed.move();
        khaled.move();
        khaled.turnLeft();
        khaled.turnLeft();
        khaled.turnLeft();
        khaled.move();
        majed.turnLeft();
        khaled.turnLeft();
        khaled.turnLeft();
        khaled.turnLeft();
        
        majed.move();
        khaled.move();
        
        
        
        
    }
    
}
