
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
 * @author eadil1765
 */
public class A1Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City L = new City ();
    new Wall (L, 3, 3, Direction.SOUTH);
    new Wall (L, 3, 3, Direction.EAST );
    new Wall (L, 2, 3, Direction.EAST);
    new Wall (L, 2, 3, Direction.NORTH);
    new Wall (L, 2, 3, Direction.WEST);
    
    Robot Liam = new Robot (L, 0, 1, Direction.WEST);
    Robot Jamez = new Robot (L, 3, 3, Direction.EAST);
    Liam.setLabel("YungBink");
    Liam.setColor(Color.pink);
    Jamez.setColor(Color.yellow);
    Jamez.setLabel("NetBeansAndChill");
   
   
    new Thing (L, 0, 0);
     new Thing (L, 1, 0);
      new Thing (L, 1, 1);
       new Thing (L, 1, 2);
        new Thing (L, 2, 2);
        
        Liam.move();
        Liam.pickThing();
        Liam.turnLeft();
        Liam.move();
        Liam.turnLeft();
        Liam.pickThing();
        Liam.move();
        Liam.pickThing();
       
        Jamez.turnLeft();
        Jamez.turnLeft();
      Jamez.move();
      Jamez.turnLeft();
      Jamez.turnLeft();
      Jamez.turnLeft();
      Jamez.move();
      Jamez.pickThing();
      Jamez.move();
     Jamez.pickThing();
     Jamez.turnLeft();

     
            
    
    }

    }

