/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Assignment02;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author coulh9904
 */
public class A2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
    Robot defaultsteve = new Robot (Kitchener, 1, 1, Direction.EAST);
    new Wall(Kitchener, 1,2, Direction.SOUTH);
    new Wall(Kitchener, 1,3, Direction.SOUTH);
    new Wall(Kitchener, 1,4, Direction.SOUTH);
    new Wall(Kitchener, 1,5, Direction.SOUTH);
    new Wall(Kitchener, 1,6, Direction.SOUTH);
    new Wall(Kitchener, 1,7, Direction.SOUTH);
    new Wall(Kitchener, 1,8, Direction.SOUTH);
    new Wall(Kitchener, 1,9, Direction.SOUTH);
    new Wall(Kitchener, 1,10, Direction.SOUTH);
    new Wall(Kitchener, 1,2, Direction.EAST);
    new Wall(Kitchener, 1,3, Direction.EAST);
    new Wall(Kitchener, 1,5, Direction.EAST);
    new Wall(Kitchener, 1,8, Direction.EAST);
    new Thing(Kitchener, 1,10);
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
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.turnLeft();
        defaultsteve.move();
        defaultsteve.turnLeft();
    }              
    if(defaultsteve.canPickThing()){
        break;        
            }        
        }        
    }
}

