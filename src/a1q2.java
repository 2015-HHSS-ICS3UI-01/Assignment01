
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
public class a1q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Build the stuff
            //City
        City town = new City();
            //Robot
        Robot jarvis = new Robot(town,1,2,Direction.SOUTH);
            //Walls
        new Wall(town,1,1,Direction.NORTH);
        new Wall(town,1,1,Direction.NORTH);
        new Wall(town,1,1,Direction.WEST);
        new Wall(town,1,2,Direction.EAST);
        new Wall(town,1,2,Direction.NORTH);
        new Wall(town,1,2,Direction.SOUTH);
        new Wall(town,2,1,Direction.WEST);
        new Wall(town,2,1,Direction.SOUTH);
        new Thing(town,2,2);
        //move robot
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.pickThing();
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.turnLeft();
        jarvis.putThing();
    }
    
}
