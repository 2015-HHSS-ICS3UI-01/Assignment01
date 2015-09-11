
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
public class a1q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Build the things
        City town = new City();
        Robot jarvis = new Robot(town,0,1,Direction.WEST);
        Robot ultron = new Robot(town,3,3,Direction.EAST);
        new Thing(town,0,0);
        new Thing(town,1,0);
        new Thing(town,1,1);
        new Thing(town,1,2);
        new Thing(town,2,2);
        new Wall(town,3,3,Direction.SOUTH);
        new Wall(town,3,3,Direction.EAST);
        new Wall(town,2,3,Direction.WEST);
        new Wall(town,2,3,Direction.NORTH);
        new Wall(town,2,3,Direction.EAST);
        jarvis.setLabel("M");
        ultron.setLabel("K");
        //move robots
        ultron.turnLeft();
        ultron.turnLeft();
        ultron.move();
        jarvis.move();
        jarvis.pickThing();
        ultron.turnLeft();
        ultron.turnLeft();
        ultron.turnLeft();
        ultron.move();
        ultron.pickThing();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.pickThing();
        ultron.move();
        ultron.pickThing();
        jarvis.turnLeft();
        jarvis.move();
        jarvis.pickThing();
        ultron.turnLeft();
    }
    
}
