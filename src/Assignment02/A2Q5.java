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
public class A2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot defaultsteve = new Robot(Kitchener, 1, 3, Direction.SOUTH);
        Robot defaultandrea = new Robot(Kitchener, 1, 3, Direction.SOUTH);
        defaultandrea.setcolour(blue);
        new Wall(Kitchener, 1, 1, Direction.WEST);
        new Wall(Kitchener, 2, 1, Direction.WEST);
        new Wall(Kitchener, 3, 1, Direction.WEST);
        new Wall(Kitchener, 4, 1, Direction.WEST);
        new Wall(Kitchener, 5, 1, Direction.WEST);
        new Wall(Kitchener, 6, 1, Direction.WEST);
        new Wall(Kitchener, 7, 1, Direction.WEST);
        new Wall(Kitchener, 8, 1, Direction.WEST);
        new Wall(Kitchener, 9, 1, Direction.WEST);
        new Wall(Kitchener, 10, 1, Direction.WEST);
        new Wall(Kitchener, 1, 2, Direction.EAST);
        new Wall(Kitchener, 2, 2, Direction.EAST);
        new Wall(Kitchener, 3, 2, Direction.EAST);
        new Wall(Kitchener, 3, 2, Direction.EAST);
        new Wall(Kitchener, 4, 2, Direction.EAST);
        new Wall(Kitchener, 5, 2, Direction.EAST);
        new Wall(Kitchener, 6, 2, Direction.EAST);
        new Wall(Kitchener, 7, 2, Direction.EAST);
        new Wall(Kitchener, 8, 2, Direction.EAST);
        new Wall(Kitchener, 2, 7, Direction.EAST);
        new Wall(Kitchener, 3, 7, Direction.EAST);
        new Wall(Kitchener, 9, 2, Direction.EAST);
        new Wall(Kitchener, 10, 3, Direction.EAST);
        new Wall(Kitchener, 10, 2, Direction.EAST);
        new Wall(Kitchener, 10, 3, Direction.SOUTH);
        new Wall(Kitchener, 6, 3, Direction.EAST);
        new Wall(Kitchener, 7, 3, Direction.EAST);
        new Wall(Kitchener, 4, 3, Direction.EAST);
        new Wall(Kitchener, 9, 8, Direction.EAST);
        new Wall(Kitchener, 8, 8, Direction.EAST);
        new Wall(Kitchener, 1, 3, Direction.EAST);
        new Wall(Kitchener, 2, 4, Direction.NORTH);
        new Wall(Kitchener, 2, 5, Direction.NORTH);
        new Wall(Kitchener, 2, 6, Direction.NORTH);
        new Wall(Kitchener, 2, 7, Direction.NORTH);
        new Wall(Kitchener, 2, 4, Direction.NORTH);
        new Wall(Kitchener, 3, 4, Direction.SOUTH);
        new Wall(Kitchener, 3, 5, Direction.SOUTH);
        new Wall(Kitchener, 3, 6, Direction.SOUTH);
        new Wall(Kitchener, 3, 7, Direction.SOUTH);
        new Wall(Kitchener, 3, 4, Direction.SOUTH);
        new Wall(Kitchener, 5, 4, Direction.SOUTH);
        new Wall(Kitchener, 5, 5, Direction.SOUTH);
        new Wall(Kitchener, 5, 6, Direction.SOUTH);
        new Wall(Kitchener, 5, 4, Direction.NORTH);
        new Wall(Kitchener, 5, 5, Direction.NORTH);
        new Wall(Kitchener, 5, 6, Direction.NORTH);
        new Wall(Kitchener, 5, 6, Direction.EAST);
        new Wall(Kitchener, 8, 4, Direction.NORTH);
        new Wall(Kitchener, 8, 5, Direction.NORTH);
        new Wall(Kitchener, 8, 6, Direction.NORTH);
        new Wall(Kitchener, 8, 7, Direction.NORTH);
        new Wall(Kitchener, 8, 8, Direction.NORTH);
        new Wall(Kitchener, 9, 4, Direction.SOUTH);
        new Wall(Kitchener, 9, 5, Direction.SOUTH);
        new Wall(Kitchener, 9, 6, Direction.SOUTH);
        new Wall(Kitchener, 9, 7, Direction.SOUTH);
        new Wall(Kitchener, 9, 8, Direction.SOUTH);;
        new Thing(Kitchener, 1, 5);
        new Thing(Kitchener, 1, 4);
        new Thing(Kitchener, 1, 7);
        new Thing(Kitchener, 2, 5);
        new Thing(Kitchener, 2, 4);
        new Thing(Kitchener, 2, 3);
        new Thing(Kitchener, 2, 6);
        new Thing(Kitchener, 2, 8);
        new Thing(Kitchener, 2, 1);
        new Thing(Kitchener, 1, 2);
        new Thing(Kitchener, 3, 1);
        new Thing(Kitchener, 4, 1);
        new Thing(Kitchener, 5, 1);
        new Thing(Kitchener, 8, 1);
        new Thing(Kitchener, 10, 1);
        new Thing(Kitchener, 4, 2);
        new Thing(Kitchener, 6, 2);
        new Thing(Kitchener, 8, 2);
        new Thing(Kitchener, 9, 2);
        new Thing(Kitchener, 10, 2);
        new Thing(Kitchener, 3, 3);
        new Thing(Kitchener, 3, 5);
        new Thing(Kitchener, 3, 7);
        new Thing(Kitchener, 4, 5);
        new Thing(Kitchener, 4, 7);
        new Thing(Kitchener, 5, 3);
        new Thing(Kitchener, 5, 4);
        new Thing(Kitchener, 5, 5);
        new Thing(Kitchener, 5, 7);
        new Thing(Kitchener, 5, 8);
        new Thing(Kitchener, 6, 6);
        new Thing(Kitchener, 6, 8);
        new Thing(Kitchener, 7, 5);
        new Thing(Kitchener, 7, 7);
        new Thing(Kitchener, 8, 8);
        new Thing(Kitchener, 8, 3);
        new Thing(Kitchener, 8, 4);
        new Thing(Kitchener, 9, 5);
        new Thing(Kitchener, 9, 4);
        new Thing(Kitchener, 9, 7);
        new Thing(Kitchener, 10, 5);
        new Thing(Kitchener, 10, 4);
        new Thing(Kitchener, 10, 7);

        while (defaultsteve.getAvenue() == 3) {
            if (defaultsteve.frontIsClear()) {
                defaultsteve.move();
                defaultsteve.turnLeft();
            }
            if (!defaultsteve.frontIsClear()) {
                defaultsteve.turnLeft();
                defaultsteve.turnLeft();
            }
            if (defaultsteve.can()) {
                defaultsteve.pickThing();
            }
            // found a driveway
            if (defaultsteve.frontIsClear()) {
                defaultsteve.move();
                //clean it out
                while (defaultsteve.getAvenue() != 3) {

                    if (defaultsteve.canPickThing()) {
                        defaultsteve.pickThing();
                    }
                    if (defaultsteve.frontIsClear()) {
                        defaultsteve.move();
                    } else {
                        defaultsteve.turnLeft();
                        defaultsteve.turnLeft();
                    }
                }
            }
            if (!defaultsteve.frontIsClear()) {
                defaultsteve.turnLeft();
            }
            if (defaultsteve.getStreet() == 10) {
                defaultsteve.putThing();
                break;
            }
        }
    }
}
