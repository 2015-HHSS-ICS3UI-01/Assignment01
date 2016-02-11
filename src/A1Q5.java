
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
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
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   City Kitchener = new City(); 
    Robot bot1 = new Robot(Kitchener,3,3,Direction.EAST);
    Robot bot2 = new Robot(Kitchener,0,1,Direction.WEST);
    bot1.setColor(Color.white);
    bot2.setColor(Color.white);
    new Wall(Kitchener, 3, 3, Direction.SOUTH);
    new Wall(Kitchener, 3, 3, Direction.EAST);
    new Wall(Kitchener, 2, 3, Direction.EAST);
    new Wall(Kitchener, 2, 3, Direction.NORTH);
    new Wall(Kitchener, 2, 3, Direction.WEST);
    new Thing(Kitchener, 2, 2);
    new Thing(Kitchener, 1, 2);
    new Thing(Kitchener, 1, 1);
    new Thing(Kitchener, 1, 0);
    new Thing(Kitchener, 0, 0);
    bot1.setLabel("K");
    bot2.setLabel("M");
    bot1.turnLeft();
    bot1.turnLeft();
    bot1.move();
    bot1.turnLeft();
    bot1.turnLeft();
    bot1.turnLeft();
    bot2.move();
    bot2.turnLeft();
    bot2.pickThing();
    bot2.move();
    bot2.pickThing();
    bot1.move();
    bot1.pickThing();
    bot2.turnLeft();
    bot1.move();
    bot1.pickThing();
    bot1.turnLeft();
    bot2.move();
    bot2.pickThing();
    
    
    
    
    
    
    
    
    
    
    }
}
