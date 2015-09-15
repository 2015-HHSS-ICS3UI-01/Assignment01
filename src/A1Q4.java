
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
 * @author Alex
 */
public class A1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Make City for Robot
        City kw = new City();
        
        //Make Walls in City
        new Wall(kw,1,1,Direction.WEST);
        new Wall(kw,0,1,Direction.WEST);
        new Wall(kw,1,1,Direction.SOUTH);
        
        //Make Robots
        
        Robot Ori = new Robot(kw,0,0,Direction.SOUTH);
        Robot Anna = new Robot(kw,0,1,Direction.SOUTH);
        
        Anna.move();
        Ori.move();
        Anna.turnLeft();
        Anna.move();
        Ori.move();
        Anna.turnLeft();
        Anna.turnLeft();
        Anna.turnLeft();Anna.move();
        Ori.turnLeft();
        Anna.turnLeft();
        Anna.turnLeft();
        Anna.turnLeft();
        Anna.move();
        Ori.move();
        
    }
    
}
