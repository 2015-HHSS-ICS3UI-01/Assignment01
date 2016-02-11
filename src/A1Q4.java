
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   City Kitchener = new City(); 
    Robot bot1 = new Robot(Kitchener,0,0,Direction.SOUTH);
    Robot bot2 = new Robot(Kitchener,0,1,Direction.SOUTH);
    bot2.setColor(Color.green);
    new Wall(Kitchener, 0, 1, Direction.WEST);
    new Wall(Kitchener, 1, 1, Direction.WEST);
    new Wall(Kitchener, 1, 1, Direction.SOUTH);
    bot1.move();
    bot2.move();
    bot1.move();
    bot2.turnLeft();
    bot2.move();
    bot2.turnLeft();
    bot2.turnLeft();
    bot2.turnLeft();
    bot2.move();
    bot1.turnLeft();
    bot1.move();
    bot2.turnLeft();
    bot2.turnLeft();
    bot2.turnLeft();
    bot2.move();
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
