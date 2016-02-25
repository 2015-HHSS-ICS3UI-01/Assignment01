/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment02;

import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author coulh9904
 */
public class A2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
 
becker.robots.City kw = new becker.robots.City(); 
        Robot defaultsteve = new Robot(kw, 100, 150, Direction.SOUTH);
        if(defaultsteve.getDirection() == Direction.NORTH){
         defaultsteve.turnLeft();
        }
        
         if(defaultsteve.getDirection() == Direction.SOUTH){ 
          defaultsteve.turnLeft();
          defaultsteve.turnLeft();
          defaultsteve.turnLeft();
         }
        
         if(defaultsteve.getDirection() == Direction.EAST){
          defaultsteve.turnLeft();
          defaultsteve.turnLeft();
         }
          
         do{
                defaultsteve.move();
         }
         
         while(defaultsteve.getAvenue()>0);
          defaultsteve.turnLeft();
          defaultsteve.turnLeft();
          defaultsteve.turnLeft();
          
         do{
                defaultsteve.move();
         }
          
         while(defaultsteve.getStreet()>0);

    }
}
