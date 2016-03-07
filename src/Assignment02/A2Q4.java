/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment02;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author coulh9904
 */
public class A2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        City Kitchener = new City();
        Robot defaultsteve = new Robot (Kitchener, 1, 2, Direction.EAST);
        new Wall(Kitchener, 1, 1, Direction.WEST);
        new Wall(Kitchener, 1, 1, Direction.EAST);
        new Wall(Kitchener, 1, 1, Direction.NORTH);
        new Wall(Kitchener, 1, 1, Direction.SOUTH);
        new Wall(Kitchener, 1, 4, Direction.WEST);
        new Wall(Kitchener, 1, 4, Direction.SOUTH);
        new Wall(Kitchener, 1, 4, Direction.NORTH);
        new Wall(Kitchener, 1, 4, Direction.EAST);
        new Wall(Kitchener, 4, 4, Direction.EAST);
        new Wall(Kitchener, 4, 4, Direction.WEST);
        new Wall(Kitchener, 4, 4, Direction.NORTH);
        new Wall(Kitchener, 4, 4, Direction.SOUTH);
        new Wall(Kitchener, 4, 1, Direction.WEST);
        new Wall(Kitchener, 4, 1, Direction.NORTH);
        new Wall(Kitchener, 4, 1, Direction.SOUTH);
        new Wall(Kitchener, 4, 1, Direction.EAST);
        new Wall(Kitchener, 2, 3, Direction.EAST);
        new Wall(Kitchener, 2, 3, Direction.NORTH);
        new Wall(Kitchener, 3, 3, Direction.EAST);
        new Wall(Kitchener, 3, 3, Direction.SOUTH);
        new Wall(Kitchener, 2, 2, Direction.NORTH);
        new Wall(Kitchener, 2, 2, Direction.WEST);
        new Wall(Kitchener, 3, 2, Direction.WEST);
        new Wall(Kitchener, 3, 2, Direction.SOUTH);
        while(true){
    if(defaultsteve.frontIsClear()){
        defaultsteve.move();
    }      
    if( !defaultsteve.frontIsClear()){
        defaultsteve.turnLeft();
        defaultsteve.move();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.move();
        defaultsteve.move();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.move();
        defaultsteve.move();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.move();
        defaultsteve.turnLeft(); 
            }              
        }        
    }
}

    

