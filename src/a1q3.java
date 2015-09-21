
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Josh
 */
public class a1q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Build the things
        //City
        City town = new City();
        //Robot
        Robot jarvis = new Robot(town,3,0,Direction.EAST);
        //Thing
        new Thing(town,3,1);
        //Wall
        new Wall(town,3,2,Direction.WEST);
        new Wall(town,3,2,Direction.NORTH);
        new Wall(town,2,3,Direction.WEST);
        new Wall(town,1,3,Direction.WEST);
        new Wall(town,1,3,Direction.NORTH);
        new Wall(town,1,3,Direction.EAST);
        new Wall(town,2,4,Direction.NORTH);
        new Wall(town,2,4,Direction.EAST);
        new Wall(town,3,4,Direction.EAST);
        //move robot
        jarvis.move();
        jarvis.pickThing();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.move();
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.putThing();
        jarvis.move();
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.move();
        jarvis.turnLeft();
    }
    
}
