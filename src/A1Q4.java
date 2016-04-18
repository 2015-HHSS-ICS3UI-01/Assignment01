/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author singk4158
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   City kw = new City ();
    
     Robot tina=
                new Robot (kw, 0, 0, Direction.SOUTH);
     
     Robot kharak=
                 
                 new Robot (kw,0,1, Direction.SOUTH);
    
     
     new Wall(kw,0,1,Direction.WEST);
     new Wall(kw,1,1,Direction.WEST);
     new Wall(kw,1,1,Direction.SOUTH);
    
     tina.move();
     kharak.move(); 
     tina.move();
     kharak.turnLeft();
     tina.turnLeft();
     kharak.move();
     kharak.turnLeft();
     kharak.turnLeft();
     kharak.turnLeft();
     kharak.move();
     kharak.turnLeft();
     kharak.turnLeft();
     kharak.turnLeft();
     kharak.move();
     tina.move();
  
  
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
